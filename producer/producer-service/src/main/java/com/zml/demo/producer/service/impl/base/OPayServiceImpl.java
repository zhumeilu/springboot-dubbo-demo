package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OPayMapper;
import com.zml.demo.producer.dao.model.OPay;
import com.zml.demo.producer.dao.model.OPayExample;
import com.zml.demo.producer.api.base.OPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OPayService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OPayService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OPayServiceImpl extends BaseServiceImpl<OPayMapper, OPay, OPayExample> implements OPayService {

    private static Logger _log = LoggerFactory.getLogger(OPayServiceImpl.class);

    @Autowired
    OPayMapper oPayMapper;

}