package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OUrgeAllotMapper;
import com.zml.demo.producer.dao.model.OUrgeAllot;
import com.zml.demo.producer.dao.model.OUrgeAllotExample;

/**
* 降级实现OUrgeAllotService接口
* Created by Charles on 2021/1/8.
*/
public class OUrgeAllotServiceMock extends BaseServiceMock<OUrgeAllotMapper, OUrgeAllot, OUrgeAllotExample> implements OUrgeAllotService {

}
