package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OReviewMapper;
import com.zml.demo.producer.dao.model.OReview;
import com.zml.demo.producer.dao.model.OReviewExample;
import com.zml.demo.producer.api.base.OReviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OReviewService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OReviewService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OReviewServiceImpl extends BaseServiceImpl<OReviewMapper, OReview, OReviewExample> implements OReviewService {

    private static Logger _log = LoggerFactory.getLogger(OReviewServiceImpl.class);

    @Autowired
    OReviewMapper oReviewMapper;

}