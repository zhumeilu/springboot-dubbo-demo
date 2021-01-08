package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.ORepayReviewLogMapper;
import com.zml.demo.producer.dao.model.ORepayReviewLog;
import com.zml.demo.producer.dao.model.ORepayReviewLogExample;
import com.zml.demo.producer.api.base.ORepayReviewLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* ORepayReviewLogService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = ORepayReviewLogService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class ORepayReviewLogServiceImpl extends BaseServiceImpl<ORepayReviewLogMapper, ORepayReviewLog, ORepayReviewLogExample> implements ORepayReviewLogService {

    private static Logger _log = LoggerFactory.getLogger(ORepayReviewLogServiceImpl.class);

    @Autowired
    ORepayReviewLogMapper oRepayReviewLogMapper;

}