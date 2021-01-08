package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OLendLogMapper;
import com.zml.demo.producer.dao.model.OLendLog;
import com.zml.demo.producer.dao.model.OLendLogExample;

/**
* 降级实现OLendLogService接口
* Created by Charles on 2021/1/8.
*/
public class OLendLogServiceMock extends BaseServiceMock<OLendLogMapper, OLendLog, OLendLogExample> implements OLendLogService {

}
