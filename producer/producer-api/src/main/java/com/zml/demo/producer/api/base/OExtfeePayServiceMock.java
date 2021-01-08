package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OExtfeePayMapper;
import com.zml.demo.producer.dao.model.OExtfeePay;
import com.zml.demo.producer.dao.model.OExtfeePayExample;

/**
* 降级实现OExtfeePayService接口
* Created by Charles on 2021/1/8.
*/
public class OExtfeePayServiceMock extends BaseServiceMock<OExtfeePayMapper, OExtfeePay, OExtfeePayExample> implements OExtfeePayService {

}
