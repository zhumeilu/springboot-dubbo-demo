package com.zml.demo.service.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能：
 * Charles on 2017/9/28.
 */
@Configuration
@ConditionalOnProperty(name = "redis.ipPorts")
public class CacheConfiguration {

	@Bean("cacheClient")
	@ConfigurationProperties(prefix = "redis")
	public RedisClient cacheClient() {
		return new RedisClient();
	}
}
