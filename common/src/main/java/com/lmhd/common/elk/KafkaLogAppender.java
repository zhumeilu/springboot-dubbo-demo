//package com.lmhd.common.elk;
//
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Appender;
//import org.apache.logging.log4j.core.Layout;
//import org.apache.logging.log4j.core.Logger;
//import org.apache.logging.log4j.core.LoggerContext;
//import org.apache.logging.log4j.core.appender.mom.kafka.KafkaAppender;
//import org.apache.logging.log4j.core.config.Configuration;
//import org.apache.logging.log4j.core.config.DefaultConfiguration;
//import org.apache.logging.log4j.core.config.Property;
//import org.apache.logging.log4j.core.layout.PatternLayout;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//
//import javax.annotation.PostConstruct;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * author: hanhuaiwei
// * description:kafka配置
// * date: Created in 11:41 2018/6/26
// */
//@org.springframework.context.annotation.Configuration
//@ConditionalOnProperty(name = "elk.kafka.urls")
//public class KafkaLogAppender {
//
//    /**
//     * kafka地址路径
//     */
//    private static String elkKafkaUrls;
//
//    /**
//     * kafka队列名称
//     */
//    private static String elkKafkaTopic;
//
//    /**
//     * elk日志路径
//     */
//    private static String elkScanPackage;
//
//    /**
//     * 应用名称
//     */
//    private static String appName;
//
//    @Value("${elk.kafka.urls:#{null}}")
//    public void setElkKafkaUrls(String elkKafkaUrls) {
//        KafkaLogAppender.elkKafkaUrls = elkKafkaUrls;
//    }
//
//    @Value("${elk.kafka.topic:#{null}}")
//    public void setElkKafkaTopic(String elkKafkaTopic) {
//        KafkaLogAppender.elkKafkaTopic = elkKafkaTopic;
//    }
//
//    @Value("${elk.scan.package:#{null}}")
//    public void setElkScanPackage(String elkScanPackage) {
//        KafkaLogAppender.elkScanPackage = elkScanPackage;
//    }
//
//    @Value("${elk.app.name:#{null}}")
//    public void setAppName(String appName) {
//        KafkaLogAppender.appName = appName;
//    }
//
//    @PostConstruct
//    public void init() {
//        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
//        final Configuration config = ctx.getConfiguration();
//        //基础参数配置
//        List<Property> list = new ArrayList<>();
//        list.add(Property.createProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, elkKafkaUrls));
//        list.add(Property.createProperty(ProducerConfig.ACKS_CONFIG, "1"));
//        list.add(Property.createProperty(ProducerConfig.RETRIES_CONFIG, "3"));
//        list.add(Property.createProperty(ProducerConfig.LINGER_MS_CONFIG, "10000"));
//        list.add(Property.createProperty(ProducerConfig.BUFFER_MEMORY_CONFIG, "10485760"));
//        list.add(Property.createProperty(ProducerConfig.REQUEST_TIMEOUT_MS_CONFIG, "1000"));
//        Property[] props = list.toArray(new Property[list.size()]);
//        Configuration configuration = new DefaultConfiguration();
//        //样式设置
//        Layout<String> layout = PatternLayout.createLayout(appName +
//                        " %d{yyyy-MM-dd HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n",
//                null, configuration, null, Charset.forName("UTF-8"), true,
//                false, null, null);
//        //初始化kafka appender
//        Appender appender = KafkaAppender.createAppender(layout, null, "KAFKA", true,
//                elkKafkaTopic, props, configuration);
//        config.addAppender(appender);
//        //配置包扫描路径
//        final Logger interLogger = ctx.getLogger(""); //需要写日志到数据库的包名
//        interLogger.addAppender(appender);
//        appender.start();
//        ctx.updateLoggers();
//    }
//
////    AppenderRef ref = AppenderRef.createAppenderRef("" + jobId, null, null);
////    AppenderRef[] refs = new AppenderRef[]{ref};
////    LoggerConfig loggerConfig = LoggerConfig.createLogger("false", Level.ALL, "" + jobId,
////            "true", refs, null, config, null);
////    loggerConfig.addAppender(appender, null, null);
////    config.addLogger("" + jobId, loggerConfig);
//}
