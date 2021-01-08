package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.ORepayMapper;
import com.zml.demo.producer.dao.model.ORepay;
import com.zml.demo.producer.dao.model.ORepayExample;
import com.zml.demo.producer.api.base.ORepayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* ORepayService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = ORepayService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class ORepayServiceImpl extends BaseServiceImpl<ORepayMapper, ORepay, ORepayExample> implements ORepayService {

    private static Logger _log = LoggerFactory.getLogger(ORepayServiceImpl.class);

    @Autowired
    ORepayMapper oRepayMapper;

}