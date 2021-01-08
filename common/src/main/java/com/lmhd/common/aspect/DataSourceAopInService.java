package com.lmhd.common.aspect;

import com.lmhd.common.db.DataSourceContextHolder;
import com.lmhd.common.enums.DataSourceEnum;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 在service层觉得数据源
 * 必须在事务AOP之前执行，所以实现Ordered,order的值越小，越先执行
 * 如果一旦开始切换到写库，则之后的读都会走写库
 *
 * @author Jfei
 */
@Aspect
//@EnableAspectJAutoProxy(exposeProxy = true, proxyTargetClass = true)
@Component
@Order(-5)
public class DataSourceAopInService {

	private static Logger log = LoggerFactory.getLogger(DataSourceAopInService.class);

	@Before("@annotation(com.lmhd.common.annotation.SlaveDB) ")
	public void setReadDataSourceType() {
		//如果已经开启写事务了，那之后的所有读都从写库读
		if (!DataSourceEnum.MASTER.getName().equals(DataSourceContextHolder.getDataSource())) {
			log.info("已设置:" + DataSourceContextHolder.getDataSource());
			log.info("service层切换从库");
			DataSourceContextHolder.setSlave();
		}
	}

	@Before("@annotation(com.lmhd.common.annotation.MasterDB) ")
	public void setWriteDataSourceType() {
		log.info("service层切换主库");
		DataSourceContextHolder.setMaster();
	}
}
