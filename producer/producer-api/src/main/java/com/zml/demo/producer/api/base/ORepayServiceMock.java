package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.ORepayMapper;
import com.zml.demo.producer.dao.model.ORepay;
import com.zml.demo.producer.dao.model.ORepayExample;

/**
* 降级实现ORepayService接口
* Created by Charles on 2021/1/8.
*/
public class ORepayServiceMock extends BaseServiceMock<ORepayMapper, ORepay, ORepayExample> implements ORepayService {

}
