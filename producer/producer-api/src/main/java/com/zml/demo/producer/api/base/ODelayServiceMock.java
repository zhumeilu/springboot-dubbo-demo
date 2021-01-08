package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.ODelayMapper;
import com.zml.demo.producer.dao.model.ODelay;
import com.zml.demo.producer.dao.model.ODelayExample;

/**
* 降级实现ODelayService接口
* Created by Charles on 2021/1/8.
*/
public class ODelayServiceMock extends BaseServiceMock<ODelayMapper, ODelay, ODelayExample> implements ODelayService {

}
