package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OBankFlowMapper;
import com.zml.demo.producer.dao.model.OBankFlow;
import com.zml.demo.producer.dao.model.OBankFlowExample;

/**
* 降级实现OBankFlowService接口
* Created by Charles on 2021/1/8.
*/
public class OBankFlowServiceMock extends BaseServiceMock<OBankFlowMapper, OBankFlow, OBankFlowExample> implements OBankFlowService {

}
