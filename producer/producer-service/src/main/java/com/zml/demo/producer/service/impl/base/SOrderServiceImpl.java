package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.SOrderMapper;
import com.zml.demo.producer.dao.model.SOrder;
import com.zml.demo.producer.dao.model.SOrderExample;
import com.zml.demo.producer.api.base.SOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* SOrderService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = SOrderService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class SOrderServiceImpl extends BaseServiceImpl<SOrderMapper, SOrder, SOrderExample> implements SOrderService {

    private static Logger _log = LoggerFactory.getLogger(SOrderServiceImpl.class);

    @Autowired
    SOrderMapper sOrderMapper;

}