package com.zml.demo.service.demo.controller;

import com.lmhd.common.constant.DubboRpcConstant;
import com.zml.demo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: maylor
 * @date: 2021/1/8 16:42
 * @description:
 */
@RestController
public class TestController {
	private final Logger      logger = LoggerFactory.getLogger(getClass());

	@DubboReference(version = DubboRpcConstant.DEFAULT_RPC_VERSION, check = false)
	private   DemoService demoService;

	@GetMapping("/test/hello")
	public Object testHello(){
		String mercyblitz = demoService.sayHello("mercyblitz");
		logger.info(mercyblitz);
		return mercyblitz;
	}

}
