package com.zml.demo.service.service;

import com.zml.demo.common.config.DubboConfig;
import com.zml.demo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: maylor
 * @date: 2021/1/5 15:44
 * @description:
 */
@DubboService(version = DubboConfig.version)
public class DefaultDemoService implements DemoService {

	/**
	 * The default value of ${dubbo.application.name} is ${spring.application.name}
	 */
	@Value("${dubbo.application.name}")
	private String serviceName;

	@Override public String sayHello(String name) {
		return String.format("[%s] : Hello, %s", serviceName, name);
	}
}
