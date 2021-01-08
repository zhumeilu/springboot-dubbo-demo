package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OBillMapper;
import com.zml.demo.producer.dao.model.OBill;
import com.zml.demo.producer.dao.model.OBillExample;

/**
* 降级实现OBillService接口
* Created by Charles on 2021/1/8.
*/
public class OBillServiceMock extends BaseServiceMock<OBillMapper, OBill, OBillExample> implements OBillService {

}
