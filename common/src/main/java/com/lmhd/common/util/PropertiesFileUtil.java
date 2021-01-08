package com.lmhd.common.util;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * 资源文件读取工具
 *
 * @author shuzheng
 * @date 2016年10月15日
 */
public class PropertiesFileUtil {

	protected static final Logger                             _log           = LoggerFactory.getLogger(PropertiesFileUtil.class);
	// 当打开多个资源文件时，缓存资源文件
	private static         HashMap<String,PropertiesFileUtil> configMap      = new HashMap<String,PropertiesFileUtil>();
	// 打开文件时间，判断超时使用
	private                Date                               loadTime       = null;
	// 资源文件
	private                ResourceBundle                     resourceBundle = null;
	// 默认资源文件名称
	private static final   String                             NAME           = "application";
	// 缓存时间
	private static final   Integer                            TIME_OUT       = 60 * 1000;

	// 私有构造方法，创建单例
	private PropertiesFileUtil(String name) {
		this.loadTime = new Date();
		this.resourceBundle = ResourceBundle.getBundle(name);
	}

	public static synchronized PropertiesFileUtil getInstance() {
		PropertiesFileUtil fileUtil = getInstance(NAME);
		String envStr = fileUtil.get("spring.profiles.active");
		return getInstance(NAME + "-" + envStr);
	}

	public static synchronized PropertiesFileUtil getInstance(String name) {
		PropertiesFileUtil conf = configMap.get(name);
		if (null == conf) {
			conf = new PropertiesFileUtil(name);
			configMap.put(name, conf);
		}
		// 判断是否打开的资源文件是否超时1分钟
		if ((new Date().getTime() - conf.getLoadTime().getTime()) > TIME_OUT) {
			conf = new PropertiesFileUtil(name);
			configMap.put(name, conf);
		}
		return conf;
	}

	/**
	 * 根据key读取value
	 *
	 * @param key properties的key
	 * @return
	 */
	public String get(String key) {
		try {
			String value = resourceBundle.getString(key);
			String defaultTunnelName = new String(value.getBytes("ISO-8859-1"), "UTF-8");
			return defaultTunnelName;
		} catch (Exception e) {
			return "";
		}
	}

	/**
	 * 根据key读取value,无值则返回defaultStr
	 *
	 * @param key        properties的key
	 * @param defaultVal 缺省值
	 * @return
	 */
	public String get(String key, String defaultVal) {
		try {
			String value = resourceBundle.getString(key);
			String defaultTunnelName = new String(value.getBytes("ISO-8859-1"), "UTF-8");
			if (StringUtils.isBlank(defaultTunnelName)) {
				return defaultVal;
			}
			return defaultTunnelName;
		} catch (MissingResourceException e) {
			return defaultVal;
		} catch (UnsupportedEncodingException e) {
			return defaultVal;
		}
	}

	/**
	 * 根据key读取value(整形)
	 *
	 * @param key properties的key
	 * @return
	 */
	public Integer getInt(String key) {
		try {
			String value = resourceBundle.getString(key).trim();
			return Integer.parseInt(value);
		} catch (MissingResourceException re) {
			return null;
		}
	}

	/**
	 * 根据key读取value(整形)
	 *
	 * @param key
	 * @param defaultVal
	 * @return
	 */
	public Integer getInt(String key, Integer defaultVal) {
		try {
			String value = resourceBundle.getString(key).trim();
			if (StringUtils.isBlank(value)) {
				return defaultVal;
			}
			return Integer.parseInt(value);
		} catch (MissingResourceException e) {
			return defaultVal;
		}
	}

	/**
	 * 根据key读取value(长整形)
	 *
	 * @param key properties的key
	 * @return
	 */
	public Long getLong(String key) {
		try {
			String value = resourceBundle.getString(key).trim();
			return Long.parseLong(value);
		} catch (MissingResourceException e) {
			return null;
		}
	}

	// 根据key读取value(布尔)
	public boolean getBool(String key) {
		try {
			String value = resourceBundle.getString(key).trim();
			return Boolean.parseBoolean(value);
		} catch (MissingResourceException e) {
			return false;
		}
	}

	// 根据key读取value(布尔)
	public boolean getBool(String key, boolean defaultVal) {
		try {
			String value = resourceBundle.getString(key).trim();
			if (StringUtils.isBlank(value)) {
				return defaultVal;
			}
			return Boolean.parseBoolean(value);
		} catch (MissingResourceException e) {
			return defaultVal;
		}
	}

	/**
	 * 从配置文件中取得 long 值，若无（或解析异常）则返回默认值
	 *
	 * @param keyName      属性名
	 * @param defaultValue 默认值
	 * @return 属性值
	 */
	public long getLong(String keyName, long defaultValue) {
		try {
			String value = get(keyName);
			if (DataUtil.isEmpty(value)) {
				return defaultValue;
			}
			return Long.parseLong(value.trim());
		} catch (Exception e) {
			return defaultValue;
		}
	}

	public Date getLoadTime() {
		return loadTime;
	}
}
