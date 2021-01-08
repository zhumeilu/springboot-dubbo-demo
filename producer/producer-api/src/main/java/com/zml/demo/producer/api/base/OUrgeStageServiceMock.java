package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OUrgeStageMapper;
import com.zml.demo.producer.dao.model.OUrgeStage;
import com.zml.demo.producer.dao.model.OUrgeStageExample;

/**
* 降级实现OUrgeStageService接口
* Created by Charles on 2021/1/8.
*/
public class OUrgeStageServiceMock extends BaseServiceMock<OUrgeStageMapper, OUrgeStage, OUrgeStageExample> implements OUrgeStageService {

}
