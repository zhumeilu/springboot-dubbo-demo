package com.zml.demo.producer.service.impl.base;

import com.lmhd.common.annotation.BaseService;
import com.lmhd.common.base.BaseServiceImpl;
import com.zml.demo.producer.dao.mapper.OUrgeReportMapper;
import com.zml.demo.producer.dao.model.OUrgeReport;
import com.zml.demo.producer.dao.model.OUrgeReportExample;
import com.zml.demo.producer.api.base.OUrgeReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.lmhd.common.constant.DubboRpcConstant;

/**
* OUrgeReportService实现
* Created by LMHD.TEC on 2021/1/8.
*/
@BaseService
@Service(interfaceClass = OUrgeReportService.class,version = DubboRpcConstant.DEFAULT_RPC_VERSION, timeout = DubboRpcConstant.DEFAULT_RPC_TIMEOUT)
public class OUrgeReportServiceImpl extends BaseServiceImpl<OUrgeReportMapper, OUrgeReport, OUrgeReportExample> implements OUrgeReportService {

    private static Logger _log = LoggerFactory.getLogger(OUrgeReportServiceImpl.class);

    @Autowired
    OUrgeReportMapper oUrgeReportMapper;

}