package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OLendMapper;
import com.zml.demo.producer.dao.model.OLend;
import com.zml.demo.producer.dao.model.OLendExample;
import com.zml.demo.producer.api.base.OLendService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OLendService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OLendService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OLendServiceImpl extends BaseServiceImpl<OLendMapper, OLend, OLendExample> implements OLendService {

    private static Logger _log = LoggerFactory.getLogger(OLendServiceImpl.class);

    @Autowired
    OLendMapper oLendMapper;

}