package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OLendDetailMapper;
import com.zml.demo.producer.dao.model.OLendDetail;
import com.zml.demo.producer.dao.model.OLendDetailExample;

/**
* 降级实现OLendDetailService接口
* Created by Charles on 2021/1/8.
*/
public class OLendDetailServiceMock extends BaseServiceMock<OLendDetailMapper, OLendDetail, OLendDetailExample> implements OLendDetailService {

}
