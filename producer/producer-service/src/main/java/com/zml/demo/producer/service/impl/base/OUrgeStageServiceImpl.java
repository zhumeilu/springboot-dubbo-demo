package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OUrgeStageMapper;
import com.zml.demo.producer.dao.model.OUrgeStage;
import com.zml.demo.producer.dao.model.OUrgeStageExample;
import com.zml.demo.producer.api.base.OUrgeStageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OUrgeStageService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OUrgeStageService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OUrgeStageServiceImpl extends BaseServiceImpl<OUrgeStageMapper, OUrgeStage, OUrgeStageExample> implements OUrgeStageService {

    private static Logger _log = LoggerFactory.getLogger(OUrgeStageServiceImpl.class);

    @Autowired
    OUrgeStageMapper oUrgeStageMapper;

}