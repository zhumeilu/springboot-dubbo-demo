package com.lmhd.common.enums;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能：解密properties属性枚举类
 * Charles on 2017/9/20.
 */
public enum EncryptField {
	ALL("ALL"),
	M_JDBC_PASS("master.jdbc.password"),
	S_JDBC_PASS("slave.jdbc.password"),
	G_JDBC_PASS("generator.jdbc.password"),
	REDIS_PASS("redis.password");
	private String key;

	EncryptField(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	private static       Logger                   _log  = LoggerFactory.getLogger(EncryptField.class);
	private static final Object                   _LOCK = new Object();
	private static       Map<String,EncryptField> _MAP;
	private static       List<EncryptField>       _LIST;
	private static       List<EncryptField>       _ALL_LIST;

	static {
		synchronized (_LOCK) {
			Map<String,EncryptField> map = new HashMap<>();
			List<EncryptField> list = new ArrayList<>();
			List<EncryptField> listAll = new ArrayList<>();
			for (EncryptField e : EncryptField.values()) {
				map.put(e.getKey(), e);
				listAll.add(e);
				if (!e.equals(ALL)) {
					list.add(e);
				}
			}
			_MAP = ImmutableBiMap.copyOf(map);
			_LIST = ImmutableList.copyOf(list);
			_ALL_LIST = ImmutableList.copyOf(listAll);
		}
	}

	public static EncryptField get(String key) {
		try {
			return _MAP.get(key);
		} catch (Exception e) {
			_log.error(e.getMessage(), e);
			return null;
		}
	}

	public static List<EncryptField> list() {
		return _LIST;
	}

	public static List<EncryptField> listAll() {
		return _ALL_LIST;
	}
}
