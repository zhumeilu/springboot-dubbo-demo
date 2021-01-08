package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OLendLogMapper;
import com.zml.demo.producer.dao.model.OLendLog;
import com.zml.demo.producer.dao.model.OLendLogExample;
import com.zml.demo.producer.api.base.OLendLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OLendLogService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OLendLogService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OLendLogServiceImpl extends BaseServiceImpl<OLendLogMapper, OLendLog, OLendLogExample> implements OLendLogService {

    private static Logger _log = LoggerFactory.getLogger(OLendLogServiceImpl.class);

    @Autowired
    OLendLogMapper oLendLogMapper;

}