package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OPageStayMapper;
import com.zml.demo.producer.dao.model.OPageStay;
import com.zml.demo.producer.dao.model.OPageStayExample;
import com.zml.demo.producer.api.base.OPageStayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OPageStayService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OPageStayService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OPageStayServiceImpl extends BaseServiceImpl<OPageStayMapper, OPageStay, OPageStayExample> implements OPageStayService {

    private static Logger _log = LoggerFactory.getLogger(OPageStayServiceImpl.class);

    @Autowired
    OPageStayMapper oPageStayMapper;

}