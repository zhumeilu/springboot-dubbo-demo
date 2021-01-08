package com.zml.demo.service.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement(order = 2) //开启事务，并设置order值，默认是Integer的最大值
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, MongoDataAutoConfiguration.class, MongoAutoConfiguration.class })
@ComponentScan(basePackages = { "com.lmhd", "com.zml" })
public class CustomerApplication {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
}
