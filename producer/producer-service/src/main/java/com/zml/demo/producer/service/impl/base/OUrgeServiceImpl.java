package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OUrgeMapper;
import com.zml.demo.producer.dao.model.OUrge;
import com.zml.demo.producer.dao.model.OUrgeExample;
import com.zml.demo.producer.api.base.OUrgeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OUrgeService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OUrgeService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OUrgeServiceImpl extends BaseServiceImpl<OUrgeMapper, OUrge, OUrgeExample> implements OUrgeService {

    private static Logger _log = LoggerFactory.getLogger(OUrgeServiceImpl.class);

    @Autowired
    OUrgeMapper oUrgeMapper;

}