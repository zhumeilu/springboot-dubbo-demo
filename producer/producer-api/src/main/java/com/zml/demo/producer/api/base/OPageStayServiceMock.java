package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OPageStayMapper;
import com.zml.demo.producer.dao.model.OPageStay;
import com.zml.demo.producer.dao.model.OPageStayExample;

/**
* 降级实现OPageStayService接口
* Created by Charles on 2021/1/8.
*/
public class OPageStayServiceMock extends BaseServiceMock<OPageStayMapper, OPageStay, OPageStayExample> implements OPageStayService {

}
