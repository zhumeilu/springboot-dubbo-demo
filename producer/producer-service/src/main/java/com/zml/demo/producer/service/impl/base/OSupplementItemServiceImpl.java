package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OSupplementItemMapper;
import com.zml.demo.producer.dao.model.OSupplementItem;
import com.zml.demo.producer.dao.model.OSupplementItemExample;
import com.zml.demo.producer.api.base.OSupplementItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OSupplementItemService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OSupplementItemService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OSupplementItemServiceImpl extends BaseServiceImpl<OSupplementItemMapper, OSupplementItem, OSupplementItemExample> implements OSupplementItemService {

    private static Logger _log = LoggerFactory.getLogger(OSupplementItemServiceImpl.class);

    @Autowired
    OSupplementItemMapper oSupplementItemMapper;

}