package com.lmhd.common.db.dsmanage;

import com.lmhd.common.db.dsmanage.vo.DataSourceConfig;

import javax.sql.DataSource;

/**
 * 功能：
 * Charles on 2017/12/4.
 */
public interface IDataSource {

	/**
	 * 根据提供的配置文件创建数据库连接池。
	 *
	 * @param dataSourceConfig
	 * @return
	 */
	boolean setUp(DataSourceConfig dataSourceConfig);

	/**
	 * 获取一个数据库连接。
	 *
	 * @return
	 */
	DataSource getDataSource();

	/**
	 * 检验传入的配置文件中提供的信息。
	 *
	 * @param configJson
	 * @return
	 */
	String validate(DataSourceConfig configJson);
}
