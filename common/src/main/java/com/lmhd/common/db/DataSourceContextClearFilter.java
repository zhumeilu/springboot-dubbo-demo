package com.lmhd.common.db;

import com.alibaba.dubbo.common.Constants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: zhumeilu
 * @Date: 2020/7/7 13:52
 * @Description:用于dubbo服务提供者在调用完成之后，清理当前线程DataSourceContextHolder的变量
 */
@Activate(group = { Constants.PROVIDER})
public class DataSourceContextClearFilter implements Filter {

    protected static final Logger _log = LoggerFactory.getLogger(DataSourceContextClearFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Result invoke = invoker.invoke(invocation);
        _log.info("清除DataSourceContextHolder线程变量......");
        DataSourceContextHolder.clearDataSource();
        return invoke;
    }
}
