package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OWithdrawMapper;
import com.zml.demo.producer.dao.model.OWithdraw;
import com.zml.demo.producer.dao.model.OWithdrawExample;
import com.zml.demo.producer.api.base.OWithdrawService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OWithdrawService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OWithdrawService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OWithdrawServiceImpl extends BaseServiceImpl<OWithdrawMapper, OWithdraw, OWithdrawExample> implements OWithdrawService {

    private static Logger _log = LoggerFactory.getLogger(OWithdrawServiceImpl.class);

    @Autowired
    OWithdrawMapper oWithdrawMapper;

}