package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OUrgeReportMapper;
import com.zml.demo.producer.dao.model.OUrgeReport;
import com.zml.demo.producer.dao.model.OUrgeReportExample;

/**
* 降级实现OUrgeReportService接口
* Created by Charles on 2021/1/8.
*/
public class OUrgeReportServiceMock extends BaseServiceMock<OUrgeReportMapper, OUrgeReport, OUrgeReportExample> implements OUrgeReportService {

}
