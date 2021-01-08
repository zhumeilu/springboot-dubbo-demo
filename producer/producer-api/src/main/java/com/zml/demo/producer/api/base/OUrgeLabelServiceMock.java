package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OUrgeLabelMapper;
import com.zml.demo.producer.dao.model.OUrgeLabel;
import com.zml.demo.producer.dao.model.OUrgeLabelExample;

/**
* 降级实现OUrgeLabelService接口
* Created by Charles on 2021/1/8.
*/
public class OUrgeLabelServiceMock extends BaseServiceMock<OUrgeLabelMapper, OUrgeLabel, OUrgeLabelExample> implements OUrgeLabelService {

}
