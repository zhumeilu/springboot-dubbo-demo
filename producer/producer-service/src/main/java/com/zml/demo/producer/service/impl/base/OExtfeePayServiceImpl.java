package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OExtfeePayMapper;
import com.zml.demo.producer.dao.model.OExtfeePay;
import com.zml.demo.producer.dao.model.OExtfeePayExample;
import com.zml.demo.producer.api.base.OExtfeePayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OExtfeePayService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OExtfeePayService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OExtfeePayServiceImpl extends BaseServiceImpl<OExtfeePayMapper, OExtfeePay, OExtfeePayExample> implements OExtfeePayService {

    private static Logger _log = LoggerFactory.getLogger(OExtfeePayServiceImpl.class);

    @Autowired
    OExtfeePayMapper oExtfeePayMapper;

}