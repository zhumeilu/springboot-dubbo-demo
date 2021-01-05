package com.zml.demo.service.demo;

import com.zml.demo.common.config.DubboConfig;
import com.zml.demo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerApplication {

	private final Logger      logger = LoggerFactory.getLogger(getClass());
	@DubboReference(version = DubboConfig.version)
	private       DemoService demoService;

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner() {
		return args -> {
			logger.info(demoService.sayHello("mercyblitz"));
		};
	}
}
