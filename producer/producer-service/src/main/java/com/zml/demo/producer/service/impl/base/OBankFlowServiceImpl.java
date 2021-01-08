package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OBankFlowMapper;
import com.zml.demo.producer.dao.model.OBankFlow;
import com.zml.demo.producer.dao.model.OBankFlowExample;
import com.zml.demo.producer.api.base.OBankFlowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OBankFlowService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OBankFlowService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OBankFlowServiceImpl extends BaseServiceImpl<OBankFlowMapper, OBankFlow, OBankFlowExample> implements OBankFlowService {

    private static Logger _log = LoggerFactory.getLogger(OBankFlowServiceImpl.class);

    @Autowired
    OBankFlowMapper oBankFlowMapper;

}