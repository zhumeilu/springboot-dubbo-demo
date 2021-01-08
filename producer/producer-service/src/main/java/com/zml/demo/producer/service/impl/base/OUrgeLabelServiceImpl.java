package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OUrgeLabelMapper;
import com.zml.demo.producer.dao.model.OUrgeLabel;
import com.zml.demo.producer.dao.model.OUrgeLabelExample;
import com.zml.demo.producer.api.base.OUrgeLabelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OUrgeLabelService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OUrgeLabelService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OUrgeLabelServiceImpl extends BaseServiceImpl<OUrgeLabelMapper, OUrgeLabel, OUrgeLabelExample> implements OUrgeLabelService {

    private static Logger _log = LoggerFactory.getLogger(OUrgeLabelServiceImpl.class);

    @Autowired
    OUrgeLabelMapper oUrgeLabelMapper;

}