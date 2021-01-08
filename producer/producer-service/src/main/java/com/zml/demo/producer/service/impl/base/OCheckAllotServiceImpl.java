package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OCheckAllotMapper;
import com.zml.demo.producer.dao.model.OCheckAllot;
import com.zml.demo.producer.dao.model.OCheckAllotExample;
import com.zml.demo.producer.api.base.OCheckAllotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OCheckAllotService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OCheckAllotService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OCheckAllotServiceImpl extends BaseServiceImpl<OCheckAllotMapper, OCheckAllot, OCheckAllotExample> implements OCheckAllotService {

    private static Logger _log = LoggerFactory.getLogger(OCheckAllotServiceImpl.class);

    @Autowired
    OCheckAllotMapper oCheckAllotMapper;

}