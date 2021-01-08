package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OUrgeMapper;
import com.zml.demo.producer.dao.model.OUrge;
import com.zml.demo.producer.dao.model.OUrgeExample;

/**
* 降级实现OUrgeService接口
* Created by Charles on 2021/1/8.
*/
public class OUrgeServiceMock extends BaseServiceMock<OUrgeMapper, OUrge, OUrgeExample> implements OUrgeService {

}
