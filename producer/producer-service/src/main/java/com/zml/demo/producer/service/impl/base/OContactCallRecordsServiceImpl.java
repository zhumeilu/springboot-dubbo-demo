package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OContactCallRecordsMapper;
import com.zml.demo.producer.dao.model.OContactCallRecords;
import com.zml.demo.producer.dao.model.OContactCallRecordsExample;
import com.zml.demo.producer.api.base.OContactCallRecordsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OContactCallRecordsService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OContactCallRecordsService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OContactCallRecordsServiceImpl extends BaseServiceImpl<OContactCallRecordsMapper, OContactCallRecords, OContactCallRecordsExample> implements OContactCallRecordsService {

    private static Logger _log = LoggerFactory.getLogger(OContactCallRecordsServiceImpl.class);

    @Autowired
    OContactCallRecordsMapper oContactCallRecordsMapper;

}