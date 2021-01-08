package com.lmhd.common.activemq.common;

import com.lmhd.common.activemq.GroupQueueSender;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能：
 * Charles on 2017/9/28.
 */
@Configuration
@Component
@ConditionalOnProperty(name = "diy.send.brokers")
public class JMSSenderUtil {

	private static Logger       logger         = LoggerFactory.getLogger(JMSSenderUtil.class);
	private static List<String> brokers        = new ArrayList<String>();
	private static Integer      maxConnections = 1;
	private static String       sysId;

	@Value("${diy.send.brokers}")
	public void setBrokers(String brokers) {
		String[] brokersStr = brokers.split(",");
		for (String broker : brokersStr) {
			JMSSenderUtil.brokers.add(broker);
		}
	}

	public void setMaxConnections(Integer maxConnections) {
		JMSSenderUtil.maxConnections = maxConnections;
	}

	@Value("${diy.send.sysId}")
	public void setSysId(String sysId) {
		JMSSenderUtil.sysId = sysId;
	}

	public void send(String groupName, String subName, String m) {
		if (StringUtils.isNotBlank(subName)) {
			GroupQueueSender sender = new GroupQueueSender();
			try {
				sender.setGroupQueueName(sysId + groupName);
				sender.setMaxConnections(maxConnections);
				sender.setBrokerURLs(brokers);
				sender.start();
				sender.sendMsg(m, subName, sysId);
				sender.stop();
			} catch (Exception e) {
				throw new RuntimeException();
			}
		}
	}
}
