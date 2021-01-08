package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OLendDetailMapper;
import com.zml.demo.producer.dao.model.OLendDetail;
import com.zml.demo.producer.dao.model.OLendDetailExample;
import com.zml.demo.producer.api.base.OLendDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OLendDetailService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OLendDetailService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OLendDetailServiceImpl extends BaseServiceImpl<OLendDetailMapper, OLendDetail, OLendDetailExample> implements OLendDetailService {

    private static Logger _log = LoggerFactory.getLogger(OLendDetailServiceImpl.class);

    @Autowired
    OLendDetailMapper oLendDetailMapper;

}