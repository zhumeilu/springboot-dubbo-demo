package com.lmhd.common.db;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @DESCRIPTION：
 * @author：DDCAO
 * @createDate：2018-05-30 10:25
 **/
@Configuration
public class DruidConfiguration {

	/**
	 * 配置监控服务器
	 *
	 * @return 返回监控注册的servlet对象
	 */
	@Bean
	public ServletRegistrationBean statViewServlet() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
		// 是否能够重置数据
		servletRegistrationBean.addInitParameter("resetEnable", "false");
		servletRegistrationBean.addInitParameter("allow", "");
		return servletRegistrationBean;
	}

	/**
	 * 配置服务过滤器
	 *
	 * @return 返回过滤器配置对象
	 */
	@Bean
	public FilterRegistrationBean statFilter() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
		// 添加过滤规则
		filterRegistrationBean.addUrlPatterns("/*");
		// 忽略过滤格式
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*,*.html");
//		DelegatingFilterProxy proxy = new DelegatingFilterProxy();
//		proxy.setTargetFilterLifecycle(true);
//		proxy.setTargetBeanName("shiroFilter");
//		filterRegistrationBean.setFilter(proxy);
		return filterRegistrationBean;
	}
}
