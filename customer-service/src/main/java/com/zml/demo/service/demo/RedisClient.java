package com.zml.demo.service.demo;

import com.lmhd.common.cache.CacheCombineRedis;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * redis初始化配置
 */
public final class RedisClient extends CacheCombineRedis {

	private              String prefix;
	private static final Logger _log = LoggerFactory.getLogger(RedisClient.class);

	public RedisClient() {
		_log.info("CommonRedis初始化");
	}

	public RedisClient(String ipPorts,
			String password,
			Integer maxTotal,
			Integer maxIdle,
			Integer maxWait,
			Integer timeout) {
		super.ipPorts = ipPorts;
		super.password = password;
		super.maxTotal = maxTotal;
		super.maxIdle = maxIdle;
		super.maxWait = maxWait;
		super.timeout = timeout;
		_log.info("CommonRedis初始化");
	}

	@Override
	protected String getPrefixKey() {
		if (StringUtils.isEmpty(prefix)) {
			prefix = "GATEWAY:app_";
		} else {
			prefix = "GATEWAY:" + prefix;
		}
		return prefix;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
}
