package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.ODelayLogMapper;
import com.zml.demo.producer.dao.model.ODelayLog;
import com.zml.demo.producer.dao.model.ODelayLogExample;

/**
* 降级实现ODelayLogService接口
* Created by Charles on 2021/1/8.
*/
public class ODelayLogServiceMock extends BaseServiceMock<ODelayLogMapper, ODelayLog, ODelayLogExample> implements ODelayLogService {

}
