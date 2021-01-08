package com.zml.demo.service;

/**
 * @author: maylor
 * @date: 2021/1/5 15:42
 * @description:
 */
public class DemoServiceMock implements DemoService {

	@Override public String sayHello(String name) {
		return "hello mock";
	}
}
