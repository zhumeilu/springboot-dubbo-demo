package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OSupplementInfoMapper;
import com.zml.demo.producer.dao.model.OSupplementInfo;
import com.zml.demo.producer.dao.model.OSupplementInfoExample;
import com.zml.demo.producer.api.base.OSupplementInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OSupplementInfoService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OSupplementInfoService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OSupplementInfoServiceImpl extends BaseServiceImpl<OSupplementInfoMapper, OSupplementInfo, OSupplementInfoExample> implements OSupplementInfoService {

    private static Logger _log = LoggerFactory.getLogger(OSupplementInfoServiceImpl.class);

    @Autowired
    OSupplementInfoMapper oSupplementInfoMapper;

}