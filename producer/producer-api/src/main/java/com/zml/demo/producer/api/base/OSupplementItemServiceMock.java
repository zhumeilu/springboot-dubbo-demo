package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OSupplementItemMapper;
import com.zml.demo.producer.dao.model.OSupplementItem;
import com.zml.demo.producer.dao.model.OSupplementItemExample;

/**
* 降级实现OSupplementItemService接口
* Created by Charles on 2021/1/8.
*/
public class OSupplementItemServiceMock extends BaseServiceMock<OSupplementItemMapper, OSupplementItem, OSupplementItemExample> implements OSupplementItemService {

}
