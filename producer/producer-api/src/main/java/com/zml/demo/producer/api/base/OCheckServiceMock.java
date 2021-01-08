package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OCheckMapper;
import com.zml.demo.producer.dao.model.OCheck;
import com.zml.demo.producer.dao.model.OCheckExample;

/**
* 降级实现OCheckService接口
* Created by Charles on 2021/1/8.
*/
public class OCheckServiceMock extends BaseServiceMock<OCheckMapper, OCheck, OCheckExample> implements OCheckService {

}
