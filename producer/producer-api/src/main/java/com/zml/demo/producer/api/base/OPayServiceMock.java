package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OPayMapper;
import com.zml.demo.producer.dao.model.OPay;
import com.zml.demo.producer.dao.model.OPayExample;

/**
* 降级实现OPayService接口
* Created by Charles on 2021/1/8.
*/
public class OPayServiceMock extends BaseServiceMock<OPayMapper, OPay, OPayExample> implements OPayService {

}
