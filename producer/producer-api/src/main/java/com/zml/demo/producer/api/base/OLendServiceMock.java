package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OLendMapper;
import com.zml.demo.producer.dao.model.OLend;
import com.zml.demo.producer.dao.model.OLendExample;

/**
* 降级实现OLendService接口
* Created by Charles on 2021/1/8.
*/
public class OLendServiceMock extends BaseServiceMock<OLendMapper, OLend, OLendExample> implements OLendService {

}
