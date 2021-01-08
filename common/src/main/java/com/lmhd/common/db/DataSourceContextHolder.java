package com.lmhd.common.db;

import com.lmhd.common.enums.DataSourceEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本地线程，数据源上下文
 *
 * @author Jfei
 */
public class DataSourceContextHolder {

	protected static final Logger              _log          = LoggerFactory.getLogger(DataSourceContextHolder.class);
	private static final   ThreadLocal<String> contextHolder = new ThreadLocal<>();

	/**
	 * 设置数据源
	 *
	 * @param dataSource
	 */
	public static void setDataSource(String dataSource) {
		_log.info("setDataSource()：" + dataSource);
		contextHolder.set(dataSource);
	}

	public static void setMaster() {
		contextHolder.set(DataSourceEnum.MASTER.getDefault());
		_log.info("数据库切换到主库...");
	}

	public static void setSlave() {
		contextHolder.set(DataSourceEnum.SLAVE.getName());
		_log.info("数据库切换到从库...");
	}

	/**
	 * 获取数据源
	 *
	 * @return
	 */
	public static String getDataSource() {
		//		String dataSource = contextHolder.get();
		//		// 如果没有指定数据源，使用默认数据源
		//		if (null == dataSource) {
		//			DataSourceContextHolder.setDataSource(DataSourceEnum.MASTER.getDefault());
		//		}
		return contextHolder.get();
	}

	/**
	 * 清除数据源
	 */
	public static void clearDataSource() {
		contextHolder.remove();
	}
}
