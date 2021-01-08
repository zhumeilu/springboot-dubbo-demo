package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.SFinancialMapper;
import com.zml.demo.producer.dao.model.SFinancial;
import com.zml.demo.producer.dao.model.SFinancialExample;

/**
* 降级实现SFinancialService接口
* Created by Charles on 2021/1/8.
*/
public class SFinancialServiceMock extends BaseServiceMock<SFinancialMapper, SFinancial, SFinancialExample> implements SFinancialService {

}
