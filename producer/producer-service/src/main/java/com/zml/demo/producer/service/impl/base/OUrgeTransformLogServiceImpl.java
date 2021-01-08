package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OUrgeTransformLogMapper;
import com.zml.demo.producer.dao.model.OUrgeTransformLog;
import com.zml.demo.producer.dao.model.OUrgeTransformLogExample;
import com.zml.demo.producer.api.base.OUrgeTransformLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OUrgeTransformLogService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OUrgeTransformLogService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OUrgeTransformLogServiceImpl extends BaseServiceImpl<OUrgeTransformLogMapper, OUrgeTransformLog, OUrgeTransformLogExample> implements OUrgeTransformLogService {

    private static Logger _log = LoggerFactory.getLogger(OUrgeTransformLogServiceImpl.class);

    @Autowired
    OUrgeTransformLogMapper oUrgeTransformLogMapper;

}