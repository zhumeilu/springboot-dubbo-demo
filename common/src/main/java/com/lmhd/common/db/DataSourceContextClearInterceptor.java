package com.lmhd.common.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: zhumeilu
 * @Date: 2020/7/7 13:52
 * @Description:
 */
@Component
public class DataSourceContextClearInterceptor extends HandlerInterceptorAdapter {

	protected static final Logger _log = LoggerFactory.getLogger(DataSourceContextClearInterceptor.class);

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		_log.info("清除DataSourceContextHolder线程变量......");
		DataSourceContextHolder.clearDataSource();
	}
}
