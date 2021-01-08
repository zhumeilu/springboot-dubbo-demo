package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OReviewAllotMapper;
import com.zml.demo.producer.dao.model.OReviewAllot;
import com.zml.demo.producer.dao.model.OReviewAllotExample;
import com.zml.demo.producer.api.base.OReviewAllotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OReviewAllotService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OReviewAllotService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OReviewAllotServiceImpl extends BaseServiceImpl<OReviewAllotMapper, OReviewAllot, OReviewAllotExample> implements OReviewAllotService {

    private static Logger _log = LoggerFactory.getLogger(OReviewAllotServiceImpl.class);

    @Autowired
    OReviewAllotMapper oReviewAllotMapper;

}