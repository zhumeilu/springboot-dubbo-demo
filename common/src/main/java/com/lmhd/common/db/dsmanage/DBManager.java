package com.lmhd.common.db.dsmanage;

import com.lmhd.common.db.dsmanage.dsimpl.DsDruidImpl;
import com.lmhd.common.db.dsmanage.vo.DataSourceConfig;
import com.lmhd.common.util.PropertiesFileUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能：
 * Charles on 2017/12/4.
 */
public class DBManager {

	private static final Logger                  _log = LoggerFactory.getLogger(DBManager.class);
	private static       Map<String,IDataSource> map  = new HashMap<>();

	private static class DBManagerHolder {

		private static DBManager instance = new DBManager();
	}

	private DBManager() {
	}

	public static DBManager getInstance() {
		return DBManagerHolder.instance;
	}

	/**
	 * properties配置文件前缀信息
	 *
	 * @param prefix
	 * @return
	 */
	public IDataSource getDataSource(String prefix) {
		if (StringUtils.isBlank(prefix)) {
			_log.info("获取数据库连接池时传递了空的连接池前缀配置信息。");
			return null;
		}
		IDataSource ds = map.get(prefix);
		if (ds == null) {
			synchronized (DBManager.class) {
				if ((ds = map.get(prefix)) == null) {
					// 如果map中没有相应的值，从数据库读取信息
					// 根据配置文件中type指定的类型加载不同类型的数据库连接池。
					String ac = PropertiesFileUtil.getInstance().get("spring.profiles.active");
					String propFileName = "application-" + ac;
					String type = PropertiesFileUtil.getInstance(propFileName).get(prefix + ".type");
					if (StringUtils.isBlank(type)) {
						_log.error("加载的数据库连接池配置信息中缺乏连接池类型字段。名称：" + prefix + ".type");
						return null;
					}
					if ("druid".equalsIgnoreCase(type)) {
						ds = new DsDruidImpl();
					} else {
						_log.info("加载的数据库连接池配置文件中获取了非法的连接池类型名称。名称：" + type);
						return null;
					}
					//转换json字符串
					DataSourceConfig configJson = new DataSourceConfig();
					configJson.setJdbcDriver(PropertiesFileUtil.getInstance(propFileName).get(prefix + ".driverClassName"));
					configJson.setJdbcUrl(PropertiesFileUtil.getInstance(propFileName).get(prefix + ".url"));
					configJson.setJdbcUser(PropertiesFileUtil.getInstance(propFileName).get(prefix + ".username"));
					configJson.setJdbcPassword(PropertiesFileUtil.getInstance(propFileName).get(prefix + ".password"));
					configJson.setConnectionPoolInitialSize(PropertiesFileUtil.getInstance(propFileName).getInt(prefix + ".initialSize"));
					configJson.setConnectionPoolMaxActive(PropertiesFileUtil.getInstance(propFileName).getInt(prefix + ".maxActive"));
					configJson.setConnectionPoolMaxWait(PropertiesFileUtil.getInstance(propFileName).getInt(prefix + ".maxWait"));
					configJson.setConnectionPoolMinIdle(PropertiesFileUtil.getInstance(propFileName).getInt(prefix + ".minIdle"));
					String reason;
					if ((reason = ds.validate(configJson)) == null && ds.setUp(configJson)) {
						map.put(prefix, ds);
					} else {
						_log.error("加载的数据库连接池配置文件无法使用，原因：" + reason);
						// 避免返回个空的实现类。
						ds = null;
					}
				}
			}
		}
		return ds;
	}
}
