package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OLendAppLogMapper;
import com.zml.demo.producer.dao.model.OLendAppLog;
import com.zml.demo.producer.dao.model.OLendAppLogExample;
import com.zml.demo.producer.api.base.OLendAppLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OLendAppLogService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OLendAppLogService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OLendAppLogServiceImpl extends BaseServiceImpl<OLendAppLogMapper, OLendAppLog, OLendAppLogExample> implements OLendAppLogService {

    private static Logger _log = LoggerFactory.getLogger(OLendAppLogServiceImpl.class);

    @Autowired
    OLendAppLogMapper oLendAppLogMapper;

}