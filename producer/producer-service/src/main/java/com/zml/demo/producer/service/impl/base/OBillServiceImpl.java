package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OBillMapper;
import com.zml.demo.producer.dao.model.OBill;
import com.zml.demo.producer.dao.model.OBillExample;
import com.zml.demo.producer.api.base.OBillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OBillService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OBillService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OBillServiceImpl extends BaseServiceImpl<OBillMapper, OBill, OBillExample> implements OBillService {

    private static Logger _log = LoggerFactory.getLogger(OBillServiceImpl.class);

    @Autowired
    OBillMapper oBillMapper;

}