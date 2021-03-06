package com.lmhd.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 资源文件读取工具
 *
 * @author shuzheng
 * @date 2016年10月15日
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {

	private static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	/**
	 * 根据名称获取bean
	 *
	 * @param beanName
	 * @return
	 */
	public static <T> T getBean(String beanName) {
		return (T) context.getBean(beanName);
	}

	/**
	 * 根据bean名称获取指定类型bean
	 *
	 * @param beanName bean名称
	 * @param clazz    返回的bean类型,若类型不匹配,将抛出异常
	 */
	public static <T> T getBean(String beanName, Class<T> clazz) {
		return context.getBean(beanName, clazz);
	}

	/**
	 * 根据类型获取bean
	 *
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(Class<T> clazz) {
		T t = null;
		Map<String,T> map = context.getBeansOfType(clazz);
		for (Map.Entry<String,T> entry : map.entrySet()) {
			t = entry.getValue();
		}
		return t;
	}

	/**
	 * 是否包含bean
	 *
	 * @param beanName
	 * @return
	 */
	public static boolean containsBean(String beanName) {
		return context.containsBean(beanName);
	}

	/**
	 * 是否是单例
	 *
	 * @param beanName
	 * @return
	 */
	public static boolean isSingleton(String beanName) {
		return context.isSingleton(beanName);
	}

	/**
	 * bean的类型
	 *
	 * @param beanName
	 * @return
	 */
	public static Class getType(String beanName) {
		return context.getType(beanName);
	}

	/// 获取当前环境
	public static String getActiveProfile() {
		return context.getEnvironment().getActiveProfiles()[0];
	}

}
