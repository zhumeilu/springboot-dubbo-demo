package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.ODelayLogMapper;
import com.zml.demo.producer.dao.model.ODelayLog;
import com.zml.demo.producer.dao.model.ODelayLogExample;
import com.zml.demo.producer.api.base.ODelayLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* ODelayLogService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = ODelayLogService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class ODelayLogServiceImpl extends BaseServiceImpl<ODelayLogMapper, ODelayLog, ODelayLogExample> implements ODelayLogService {

    private static Logger _log = LoggerFactory.getLogger(ODelayLogServiceImpl.class);

    @Autowired
    ODelayLogMapper oDelayLogMapper;

}