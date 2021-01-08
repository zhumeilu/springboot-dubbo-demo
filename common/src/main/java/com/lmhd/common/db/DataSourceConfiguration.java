package com.lmhd.common.db;

import com.lmhd.common.aspect.DataSourceAopInService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 数据库源配置
 *
 * @author Jfei
 */
@Configuration
@ConditionalOnProperty(prefix = "ds", value = "type")
public class DataSourceConfiguration {

	protected static final Logger                      log = LoggerFactory.getLogger(DataSourceAopInService.class);
	@Value("${ds.type}")
	private                Class<? extends DataSource> dataSourceType;

	/**
	 * 写库 数据源配置
	 *
	 * @return
	 */
	@Primary
	@Bean(name = "masterDataSource")
	@ConfigurationProperties(prefix = "ds.master")
	public DataSource writeDataSource() {
		log.info("-------------------- masterDataSource init ---------------------");
		//		DruidDataSource build = (DruidDataSource) DataSourceBuilder.create().type(dataSourceType).build();
		//		List<Filter> proxyFilters = build.getProxyFilters();
		//		boolean isExist = false;
		//		for (Filter filter :
		//				proxyFilters) {
		//			if (filter instanceof WallFilter){
		//				((WallFilter) filter).setConfig(new WallConfig());
		//				isExist = true;
		//			}
		//		}
		//		if(!isExist){
		//			proxyFilters.add(wallFilter());
		//		}
		//		return build;
		return DataSourceBuilder.create().type(dataSourceType).build();
	}
	//	@Bean
	//	public WallFilter wallFilter(){
	//		WallFilter wallFilter =new WallFilter();
	//		wallFilter.setConfig(wallConfig());
	//		wallFilter.setDbType("mysql");
	//		return wallFilter;
	//	}
	//
	//	@Bean
	//	public WallConfig wallConfig(){
	//		WallConfig wallConfig = new WallConfig();
	//		wallConfig.setMultiStatementAllow(true);
	//		return wallConfig;
	//	}

	/**
	 * 有多少个从库就要配置多少个
	 *
	 * @return
	 */
	@Bean(name = "slaveDataSource01")
	@ConfigurationProperties(prefix = "ds.slave01")
	public DataSource slaveDataSourceOne() {
		log.info("-------------------- slave01 slaveDataSourceOne init ---------------------");
		return DataSourceBuilder.create().type(dataSourceType).build();
	}

	@Bean(name = "slaveDataSource02")
	@ConfigurationProperties(prefix = "ds.slave02")
	public DataSource slaveDataSourceTwo() {
		log.info("-------------------- slave02 slaveDataSourceTwo init ---------------------");
		return DataSourceBuilder.create().type(dataSourceType).build();
	}
}
