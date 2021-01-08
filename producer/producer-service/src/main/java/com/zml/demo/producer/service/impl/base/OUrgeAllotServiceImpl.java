package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OUrgeAllotMapper;
import com.zml.demo.producer.dao.model.OUrgeAllot;
import com.zml.demo.producer.dao.model.OUrgeAllotExample;
import com.zml.demo.producer.api.base.OUrgeAllotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OUrgeAllotService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OUrgeAllotService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OUrgeAllotServiceImpl extends BaseServiceImpl<OUrgeAllotMapper, OUrgeAllot, OUrgeAllotExample> implements OUrgeAllotService {

    private static Logger _log = LoggerFactory.getLogger(OUrgeAllotServiceImpl.class);

    @Autowired
    OUrgeAllotMapper oUrgeAllotMapper;

}