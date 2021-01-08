package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OExtfeeMapper;
import com.zml.demo.producer.dao.model.OExtfee;
import com.zml.demo.producer.dao.model.OExtfeeExample;

/**
* 降级实现OExtfeeService接口
* Created by Charles on 2021/1/8.
*/
public class OExtfeeServiceMock extends BaseServiceMock<OExtfeeMapper, OExtfee, OExtfeeExample> implements OExtfeeService {

}
