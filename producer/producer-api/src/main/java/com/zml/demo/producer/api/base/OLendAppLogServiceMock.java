package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OLendAppLogMapper;
import com.zml.demo.producer.dao.model.OLendAppLog;
import com.zml.demo.producer.dao.model.OLendAppLogExample;

/**
* 降级实现OLendAppLogService接口
* Created by Charles on 2021/1/8.
*/
public class OLendAppLogServiceMock extends BaseServiceMock<OLendAppLogMapper, OLendAppLog, OLendAppLogExample> implements OLendAppLogService {

}
