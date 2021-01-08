package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OCallRecoverRecordsMapper;
import com.zml.demo.producer.dao.model.OCallRecoverRecords;
import com.zml.demo.producer.dao.model.OCallRecoverRecordsExample;
import com.zml.demo.producer.api.base.OCallRecoverRecordsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OCallRecoverRecordsService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OCallRecoverRecordsService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OCallRecoverRecordsServiceImpl extends BaseServiceImpl<OCallRecoverRecordsMapper, OCallRecoverRecords, OCallRecoverRecordsExample> implements OCallRecoverRecordsService {

    private static Logger _log = LoggerFactory.getLogger(OCallRecoverRecordsServiceImpl.class);

    @Autowired
    OCallRecoverRecordsMapper oCallRecoverRecordsMapper;

}