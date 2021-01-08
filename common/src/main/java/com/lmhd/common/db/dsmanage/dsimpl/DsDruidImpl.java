package com.lmhd.common.db.dsmanage.dsimpl;

import com.alibaba.druid.pool.DruidDataSource;
import com.lmhd.common.db.dsmanage.IDataSource;
import com.lmhd.common.db.dsmanage.vo.DataSourceConfig;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Properties;

/**
 * 功能：
 * Charles on 2017/12/4.
 */
public class DsDruidImpl implements IDataSource {

	private static final Logger           _log       = LoggerFactory.getLogger(DsDruidImpl.class);
	private              DataSourceConfig config;
	private              DataSource       dataSource = null;
	private              String           name;

	@Override
	public boolean setUp(DataSourceConfig config) {
		this.config = config;
		String result = this.validate(config);
		if (StringUtils.isNotBlank(result)) {
			_log.info("创建数据库连接池时参数提供不足：" + result);
			return false;
		}
		//		DataSource ds = DataSourceBuilder.create().type(DruidDataSource.class).build();
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName(config.getJdbcDriver());
		ds.setUrl(config.getJdbcUrl());
		ds.setUsername(config.getJdbcUser());
		ds.setPassword(config.getJdbcPassword());
		ds.setInitialSize(config.getConnectionPoolInitialSize());
		ds.setMinIdle(config.getConnectionPoolMinIdle());
		ds.setMaxActive(config.getConnectionPoolMaxActive());
		ds.setMaxWait(Long.valueOf(config.getConnectionPoolMaxWait()));
		try {
			ds.setTimeBetweenEvictionRunsMillis(config.getTimeBetweenEvictionRunsMillis());
			ds.setMinEvictableIdleTimeMillis(config.getMinEvictableIdleTimeMillis());
			ds.setValidationQuery(config.getValidationQuery());
			ds.setTestWhileIdle(config.getTestWhileIdle());
			ds.setTestOnBorrow(config.getTestOnBorrow());
			ds.setTestOnReturn(config.getTestOnReturn());
			ds.setPoolPreparedStatements(config.getPoolPreparedStatements());
			ds.setMaxPoolPreparedStatementPerConnectionSize(config.getMaxPoolPreparedStatementPerConnectionSize());
			ds.setFilters(config.getFilters());
			String cprop = config.getConnectionProperties();
			Properties pp = new Properties();
			if (StringUtils.isNotBlank(cprop)) {
				String[] prop = cprop.split(";");
				Arrays.asList(prop).parallelStream().forEach(e -> {
					String[] sprop = e.split("=");
					pp.setProperty(sprop[0], sprop[1]);
				});
			}
			ds.setConnectProperties(pp);
		} catch (Exception e) {
			_log.error("初始化jdbc数据源异常", e);
		}
		this.dataSource = ds;
		return true;
	}

	@Override
	public DataSource getDataSource() {
		return dataSource;
	}

	@Override
	public String validate(DataSourceConfig config) {
		if (config != null && StringUtils.isNotBlank(config.getJdbcUrl()) && StringUtils.isNotBlank(config.getJdbcUser())
				&& StringUtils.isNotBlank(config.getJdbcPassword()) && StringUtils.isNotBlank(config.getJdbcDriver())) {
			return null;
		}
		return "need some param.";
	}

	public DataSourceConfig getConfig() {
		return config;
	}

	public void setConfig(DataSourceConfig config) {
		this.config = config;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
