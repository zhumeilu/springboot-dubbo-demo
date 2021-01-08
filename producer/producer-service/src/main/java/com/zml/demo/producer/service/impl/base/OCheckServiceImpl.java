package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OCheckMapper;
import com.zml.demo.producer.dao.model.OCheck;
import com.zml.demo.producer.dao.model.OCheckExample;
import com.zml.demo.producer.api.base.OCheckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OCheckService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OCheckService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OCheckServiceImpl extends BaseServiceImpl<OCheckMapper, OCheck, OCheckExample> implements OCheckService {

    private static Logger _log = LoggerFactory.getLogger(OCheckServiceImpl.class);

    @Autowired
    OCheckMapper oCheckMapper;

}