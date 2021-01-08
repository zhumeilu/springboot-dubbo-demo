package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OExtfeeMapper;
import com.zml.demo.producer.dao.model.OExtfee;
import com.zml.demo.producer.dao.model.OExtfeeExample;
import com.zml.demo.producer.api.base.OExtfeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OExtfeeService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OExtfeeService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OExtfeeServiceImpl extends BaseServiceImpl<OExtfeeMapper, OExtfee, OExtfeeExample> implements OExtfeeService {

    private static Logger _log = LoggerFactory.getLogger(OExtfeeServiceImpl.class);

    @Autowired
    OExtfeeMapper oExtfeeMapper;

}