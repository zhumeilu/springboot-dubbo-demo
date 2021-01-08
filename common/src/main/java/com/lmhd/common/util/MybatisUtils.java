package com.lmhd.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @DESCRIPTION：
 * @author：DDCAO
 * @createDate：2019-03-14 16:31
 **/
public class MybatisUtils {

	private static Logger _log = LoggerFactory.getLogger(MybatisUtils.class);

	/**
	 * mybatis 添加自定义条件 sql
	 *
	 * @param criteria
	 * @param sql
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void addDiyConditions(Object criteria, String sql) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		_log.info("criteria.getClass():" + criteria.getClass());
		Class<?> criteriaCls = criteria.getClass();
		Class<?> generatedCriteriaCls = criteriaCls.getSuperclass();
		Method addCriterion = generatedCriteriaCls.getDeclaredMethod("addCriterion", String.class);
		addCriterion.setAccessible(true);
		addCriterion.invoke(criteria, sql);
	}
}
