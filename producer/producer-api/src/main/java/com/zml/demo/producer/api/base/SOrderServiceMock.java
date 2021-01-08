package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.SOrderMapper;
import com.zml.demo.producer.dao.model.SOrder;
import com.zml.demo.producer.dao.model.SOrderExample;

/**
* 降级实现SOrderService接口
* Created by Charles on 2021/1/8.
*/
public class SOrderServiceMock extends BaseServiceMock<SOrderMapper, SOrder, SOrderExample> implements SOrderService {

}
