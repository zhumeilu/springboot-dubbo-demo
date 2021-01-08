package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.SFinancialMapper;
import com.zml.demo.producer.dao.model.SFinancial;
import com.zml.demo.producer.dao.model.SFinancialExample;
import com.zml.demo.producer.api.base.SFinancialService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* SFinancialService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = SFinancialService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class SFinancialServiceImpl extends BaseServiceImpl<SFinancialMapper, SFinancial, SFinancialExample> implements SFinancialService {

    private static Logger _log = LoggerFactory.getLogger(SFinancialServiceImpl.class);

    @Autowired
    SFinancialMapper sFinancialMapper;

}