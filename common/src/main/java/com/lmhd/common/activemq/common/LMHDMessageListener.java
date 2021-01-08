package com.lmhd.common.activemq.common;

import com.lmhd.common.activemq.GroupQueueMessageListenerContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.ArrayList;
import java.util.List;

/**
 * 队列消费者监听,继承此抽象类,必须注入必要参数urls groupName subQueCfg
 */
public abstract class LMHDMessageListener implements MessageListener, ApplicationListener<ContextRefreshedEvent> {

    private static Logger logger = LoggerFactory.getLogger(LMHDMessageListener.class);

    public abstract void onMessage(Message message);

    private static List<String> urls = new ArrayList<String>();
    private String groupName;
    private String subQueCfg;
    private String sysId;

    @Value("${diy.rec.brokers}")
    public void setBrokers(String brokers) {
        String[] brokersStr = brokers.split(",");
        for (String broker : brokersStr) {
            LMHDMessageListener.urls.add(broker);
        }
    }

    @Value("${diy.rec.sysId}")
    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setSubQueCfg(String subQueCfg) {
        this.subQueCfg = subQueCfg;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        GroupQueueMessageListenerContainer container = new GroupQueueMessageListenerContainer();
        container.setGroupQueueName(sysId + groupName);
        container.setBrokerURLs(urls);
        container.setConcurrentConsumers(1);
        container.setSubQueueConsumerCfg(subQueCfg);
        container.setMessageListener(this);
        container.start();
    }
}
