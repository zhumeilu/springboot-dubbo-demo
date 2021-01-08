package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OReviewLogMapper;
import com.zml.demo.producer.dao.model.OReviewLog;
import com.zml.demo.producer.dao.model.OReviewLogExample;
import com.zml.demo.producer.api.base.OReviewLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OReviewLogService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OReviewLogService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OReviewLogServiceImpl extends BaseServiceImpl<OReviewLogMapper, OReviewLog, OReviewLogExample> implements OReviewLogService {

    private static Logger _log = LoggerFactory.getLogger(OReviewLogServiceImpl.class);

    @Autowired
    OReviewLogMapper oReviewLogMapper;

}