package com.lmhd.common.db;

import com.github.pagehelper.PageInterceptor;
import com.lmhd.common.enums.DataSourceEnum;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;
//import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
//import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;

@Configuration
@AutoConfigureAfter(DataSourceConfiguration.class)
@ConditionalOnProperty(prefix = "ds", value = "type")
public class MybatisConfiguration {

	protected static final Logger     log = LoggerFactory.getLogger(MybatisConfiguration.class);
	@Value("${ds.size}")
	private                String     readDataSourceSize;
	//XxxMapper.xml文件所在路径
	@Value("${mybatis.model.location}")
	private                String     modelLocation;
	@Value("${mybatis.xmlmapper.location}")
	private                String     mapperLocations;
	@Autowired
	@Qualifier("masterDataSource")
	private                DataSource masterDataSource;
	@Autowired
	@Qualifier("slaveDataSource01")
	private                DataSource slaveDataSource01;
	@Autowired
	@Qualifier("slaveDataSource02")
	private                DataSource slaveDataSource02;

	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactorys() {
		log.info("--------------------  sqlSessionFactory init ---------------------");
		try {
			SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
			//     sessionFactoryBean.setDataSource(roundRobinDataSouce);
			sessionFactoryBean.setDataSource(roundRobinDataSouceProxy());
			//读取配置
			sessionFactoryBean.setTypeAliasesPackage(modelLocation);
			Resource[] resources = new PathMatchingResourcePatternResolver().getResources(mapperLocations);
			sessionFactoryBean.setMapperLocations(resources);
			//添加分页插件、打印sql插件
			Interceptor[] plugins = new Interceptor[] { pageInterceptor(), new SqlPrintInterceptor() };
			sessionFactoryBean.setPlugins(plugins);
			return sessionFactoryBean.getObject();
		} catch (IOException e) {
			log.error("mybatis resolver mapper*xml is error", e);
			return null;
		} catch (Exception e) {
			log.error("mybatis sqlSessionFactoryBean create error", e);
			System.out.println("-----------异常");
			return null;
		}
	}

	/**
	 * 分页插件
	 *
	 * @return
	 */
	public PageInterceptor pageInterceptor() {
		PageInterceptor pi = new PageInterceptor();
		Properties p = new Properties();
		//分页插件会自动检测当前的数据库链接，自动选择合适的分页方式。 你可以配置helperDialect属性来指定分页插件使用哪种方言。配置时，可以使用下面的缩写值：
		//oracle,mysql,mariadb,sqlite,hsqldb,postgresql,db2,sqlserver,informix,h2,sqlserver2012,derby
		//特别注意：使用 SqlServer2012 数据库时，需要手动指定为 sqlserver2012，否则会使用 SqlServer2005 的方式进行分页
		p.setProperty("helperDialect", "mysql");
		//默认值为 false，该参数对使用 RowBounds 作为分页参数时有效。
		//当该参数设置为 true 时，会将 RowBounds 中的 offset 参数当成 pageNum 使用，可以用页码和页面大小两个参数进行分页。
		p.setProperty("offsetAsPageNum", "false");
		//默认值为false，该参数对使用 RowBounds 作为分页参数时有效。 当该参数设置为true时，使用 RowBounds 分页会进行 count 查询。
		p.setProperty("rowBoundsWithCount", "true");
		//默认值为 false，当该参数设置为 true 时，如果 pageSize=0 或者 RowBounds.limit = 0 就会查询出全部的结果（相当于没有执行分页查询，但是返回结果仍然是 Page 类型）。
		p.setProperty("pageSizeZero", "false");
		//分页合理化参数，默认值为false。当该参数设置为 true 时，pageNum<=0 时会查询第一页， pageNum>pages（超过总数时），会查询最后一页。默认false 时，直接根据参数进行查询。
		p.setProperty("reasonable", "true");
		//为了支持startPage(Object params)方法，增加了该参数来配置参数映射，用于从对象中根据属性名取值， 可以配置 pageNum,pageSize,count,pageSizeZero,reasonable，不配置映射的用默认值
		//默认值为pageNum=pageNum;pageSize=pageSize;count=countSql;reasonable=reasonable;pageSizeZero=pageSizeZero。
		p.setProperty("params", "pageNum=pageNum;pageSize=pageSize;count=countSql;reasonable=reasonable;pageSizeZero=pageSizeZero");
		//支持通过 Mapper 接口参数来传递分页参数，默认值false，分页插件会从查询方法的参数值中，自动根据上面 params 配置的字段中取值，查找到合适的值时就会自动分页。
		//使用方法可以参考测试代码中的 com.github.pagehelper.test.basic 包下的 ArgumentsMapTest 和 ArgumentsObjTest。
		p.setProperty("supportMethodsArguments", "false");
		//默认值为 false。设置为 true 时，允许在运行时根据多数据源自动识别对应方言的分页 （不支持自动选择sqlserver2012，只能使用sqlserver）
		p.setProperty("autoRuntimeDialect", "true");
		//默认值为 true。当使用运行时动态数据源或没有设置 helperDialect 属性自动获取数据库类型时，会自动获取一个数据库连接， 通过该属性来设置是否关闭获取的这个连接
		//默认true关闭，设置为 false 后，不会关闭获取的连接，这个参数的设置要根据自己选择的数据源来决定。
		p.setProperty("closeConn", "true");
		p.setProperty("returnPageInfo", "check");
		pi.setProperties(p);
		return pi;
	}

	/**
	 * 把所有数据库都放在路由中
	 *
	 * @return
	 */
	@Bean(name = "roundRobinDataSouceProxy")
	public AbstractRoutingDataSource roundRobinDataSouceProxy() {
		Map<Object,Object> targetDataSources = new HashMap<>();
		//把所有数据库都放在targetDataSources中,注意key值要和determineCurrentLookupKey()中代码写的一至，
		//否则切换数据源时找不到正确的数据源
		targetDataSources.put(DataSourceEnum.MASTER.getName(), masterDataSource);
		targetDataSources.put(DataSourceEnum.SLAVE.getName() + "1", slaveDataSource01);
		targetDataSources.put(DataSourceEnum.SLAVE.getName() + "2", slaveDataSource02);
		final int readSize = Integer.parseInt(readDataSourceSize);
		//路由类，寻找对应的数据源
		AbstractRoutingDataSource proxy = new AbstractRoutingDataSource() {

			private AtomicInteger count = new AtomicInteger(0);

			/**
			 * 这是AbstractRoutingDataSource类中的一个抽象方法，
			 * 而它的返回值是你所要用的数据源dataSource的key值，有了这个key值，
			 * targetDataSources就从中取出对应的DataSource，如果找不到，就用配置默认的数据源。
			 */
			@Override
			protected Object determineCurrentLookupKey() {
				String typeKey = DataSourceContextHolder.getDataSource();
				if (typeKey == null) {
					//	System.err.println("使用数据库write.............");
					//    return DataSourceType.write.getType();
					log.info("没有数据源,默认使用使用数据库master.............");
					return DataSourceEnum.MASTER.getName();
					//					throw new NullPointerException("数据库路由时，决定使用哪个数据库源类型不能为空...");
				}
				if (typeKey.equals(DataSourceEnum.MASTER.getName())) {
					log.info("使用数据库master.............");
					return DataSourceEnum.MASTER.getName();
				}
				//读库， 简单负载均衡
				int number = count.getAndAdd(1);
				int lookupKey = number % readSize;
				log.info("使用数据库slave-" + (lookupKey + 1));
				return DataSourceEnum.SLAVE.getName() + (lookupKey + 1);
			}
		};
		proxy.setDefaultTargetDataSource(masterDataSource);//默认库
		proxy.setTargetDataSources(targetDataSources);
		return proxy;
	}

	@Bean
	public SqlSessionTemplate sqlSessionTemplate() {
		SqlSessionFactory sqlSessionFactory = sqlSessionFactorys();
		return new SqlSessionTemplate(sqlSessionFactory);
	}

	//事务管理
	@Bean
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		PlatformTransactionManager transactionManager = new DataSourceTransactionManager(roundRobinDataSouceProxy());
		return transactionManager;
	}
}
