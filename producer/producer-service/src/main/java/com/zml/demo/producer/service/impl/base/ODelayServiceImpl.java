package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.ODelayMapper;
import com.zml.demo.producer.dao.model.ODelay;
import com.zml.demo.producer.dao.model.ODelayExample;
import com.zml.demo.producer.api.base.ODelayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* ODelayService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = ODelayService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class ODelayServiceImpl extends BaseServiceImpl<ODelayMapper, ODelay, ODelayExample> implements ODelayService {

    private static Logger _log = LoggerFactory.getLogger(ODelayServiceImpl.class);

    @Autowired
    ODelayMapper oDelayMapper;

}