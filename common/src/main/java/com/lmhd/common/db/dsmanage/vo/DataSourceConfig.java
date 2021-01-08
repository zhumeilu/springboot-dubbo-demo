package com.lmhd.common.db.dsmanage.vo;

import java.io.Serializable;

/**
 * 功能：
 * Charles on 2017/12/4.
 */
public class DataSourceConfig implements Serializable {

	private static final long serialVersionUID = 8659952051986110061L;
	private String  jdbcDriver;
	private String  jdbcUrl;
	private String  jdbcUser;
	private String  jdbcPassword;
	private Integer connectionPoolInitialSize;
	private Integer connectionPoolMinIdle;
	private Integer connectionPoolMaxActive;
	private Integer connectionPoolMaxWait;
	//连接池回收处理 参数
	private Integer timeBetweenEvictionRunsMillis             = 60000;
	private Integer minEvictableIdleTimeMillis                = 300000;
	private String  validationQuery                           = "SELECT 1 FROM DUAL";
	private Boolean testWhileIdle                             = true;
	private Boolean testOnBorrow                              = false;
	private Boolean testOnReturn                              = false;
	private Boolean poolPreparedStatements                    = true;
	private Integer maxPoolPreparedStatementPerConnectionSize = 20;
	private String  filters                                   = "stat,wall,log4j";
	private String  connectionProperties                      = "druid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000";

	public DataSourceConfig() {
	}

	public String getJdbcDriver() {
		return jdbcDriver;
	}

	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getJdbcUser() {
		return jdbcUser;
	}

	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}

	public String getJdbcPassword() {
		return jdbcPassword;
	}

	public void setJdbcPassword(String jdbcPassword) {
		this.jdbcPassword = jdbcPassword;
	}

	public Integer getConnectionPoolInitialSize() {
		return connectionPoolInitialSize;
	}

	public void setConnectionPoolInitialSize(Integer connectionPoolInitialSize) {
		this.connectionPoolInitialSize = connectionPoolInitialSize;
	}

	public Integer getConnectionPoolMinIdle() {
		return connectionPoolMinIdle;
	}

	public void setConnectionPoolMinIdle(Integer connectionPoolMinIdle) {
		this.connectionPoolMinIdle = connectionPoolMinIdle;
	}

	public Integer getConnectionPoolMaxActive() {
		return connectionPoolMaxActive;
	}

	public void setConnectionPoolMaxActive(Integer connectionPoolMaxActive) {
		this.connectionPoolMaxActive = connectionPoolMaxActive;
	}

	public Integer getConnectionPoolMaxWait() {
		return connectionPoolMaxWait;
	}

	public void setConnectionPoolMaxWait(Integer connectionPoolMaxWait) {
		this.connectionPoolMaxWait = connectionPoolMaxWait;
	}

	public Integer getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	public void setTimeBetweenEvictionRunsMillis(Integer timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	public Integer getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	public void setMinEvictableIdleTimeMillis(Integer minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	public String getValidationQuery() {
		return validationQuery;
	}

	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}

	public Boolean getTestWhileIdle() {
		return testWhileIdle;
	}

	public void setTestWhileIdle(Boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}

	public Boolean getTestOnBorrow() {
		return testOnBorrow;
	}

	public void setTestOnBorrow(Boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	public Boolean getTestOnReturn() {
		return testOnReturn;
	}

	public void setTestOnReturn(Boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}

	public Boolean getPoolPreparedStatements() {
		return poolPreparedStatements;
	}

	public void setPoolPreparedStatements(Boolean poolPreparedStatements) {
		this.poolPreparedStatements = poolPreparedStatements;
	}

	public Integer getMaxPoolPreparedStatementPerConnectionSize() {
		return maxPoolPreparedStatementPerConnectionSize;
	}

	public void setMaxPoolPreparedStatementPerConnectionSize(Integer maxPoolPreparedStatementPerConnectionSize) {
		this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
	}

	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	public String getConnectionProperties() {
		return connectionProperties;
	}

	public void setConnectionProperties(String connectionProperties) {
		this.connectionProperties = connectionProperties;
	}
}
