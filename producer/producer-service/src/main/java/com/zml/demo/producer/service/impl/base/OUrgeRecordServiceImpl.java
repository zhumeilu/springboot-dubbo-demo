package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OUrgeRecordMapper;
import com.zml.demo.producer.dao.model.OUrgeRecord;
import com.zml.demo.producer.dao.model.OUrgeRecordExample;
import com.zml.demo.producer.api.base.OUrgeRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OUrgeRecordService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OUrgeRecordService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OUrgeRecordServiceImpl extends BaseServiceImpl<OUrgeRecordMapper, OUrgeRecord, OUrgeRecordExample> implements OUrgeRecordService {

    private static Logger _log = LoggerFactory.getLogger(OUrgeRecordServiceImpl.class);

    @Autowired
    OUrgeRecordMapper oUrgeRecordMapper;

}