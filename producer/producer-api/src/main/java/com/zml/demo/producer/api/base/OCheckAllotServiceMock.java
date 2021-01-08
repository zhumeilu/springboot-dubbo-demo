package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OCheckAllotMapper;
import com.zml.demo.producer.dao.model.OCheckAllot;
import com.zml.demo.producer.dao.model.OCheckAllotExample;

/**
* 降级实现OCheckAllotService接口
* Created by Charles on 2021/1/8.
*/
public class OCheckAllotServiceMock extends BaseServiceMock<OCheckAllotMapper, OCheckAllot, OCheckAllotExample> implements OCheckAllotService {

}
