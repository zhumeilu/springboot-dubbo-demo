package com.lmhd.common.constant;

import com.lmhd.common.util.DataUtil;
import com.lmhd.common.util.PropertiesFileUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.redis.core.RedisHash;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class DiyCacheKey {

	private String value;
	private int    timeToLive;

	public DiyCacheKey(String value, int timeToLive) {
		this.value = value;
		this.timeToLive = timeToLive;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getTimeToLive() {
		return timeToLive;
	}

	public void setTimeToLive(int timeToLive) {
		this.timeToLive = timeToLive;
	}

	public static DiyCacheKey getInstance(Class<?> cls) {
		DiyCacheKey cackKey = BaseConstants.cacheKeyMap.get(cls);
		if (DataUtil.isEmpty(cackKey)) {
			String cacheName;
			RedisHash redisHash = null;
			Long timeToLive = PropertiesFileUtil.getInstance().getLong("redis.expiration", 600L);
			ParameterizedType parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
			if (parameterizedType != null) {
				Type[] actualTypes = parameterizedType.getActualTypeArguments();
				if (actualTypes != null && actualTypes.length > 0) {
					// 实体注解@RedisHash
					redisHash = actualTypes[0].getClass().getAnnotation(RedisHash.class);
				}
			}
			if (redisHash != null) {
				cacheName = redisHash.value();
				timeToLive = redisHash.timeToLive();
			} else {
				// Service注解CacheConfig
				CacheConfig cacheConfig = cls.getAnnotation(CacheConfig.class);
				if (cacheConfig != null && ArrayUtils.isNotEmpty(cacheConfig.cacheNames())) {
					cacheName = cacheConfig.cacheNames()[0];
				} else {
					return null;
				}
			}
			cackKey = new DiyCacheKey(BaseConstants.CACHE_NAMESPACE + cacheName, timeToLive.intValue());
			BaseConstants.cacheKeyMap.put(cls, cackKey);
		}
		return cackKey;
	}
}
