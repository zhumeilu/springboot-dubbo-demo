package com.zml.demo.producer.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement(order = 2) //开启事务，并设置order值，默认是Integer的最大值
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, MongoDataAutoConfiguration.class, MongoAutoConfiguration.class})
@ComponentScan(basePackages = {"com.lmhd","com.zml"})
@MapperScan(basePackages = {"com.zml.demo.producer.dao.mapper"})
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
}
