package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OReviewLogMapper;
import com.zml.demo.producer.dao.model.OReviewLog;
import com.zml.demo.producer.dao.model.OReviewLogExample;

/**
* 降级实现OReviewLogService接口
* Created by Charles on 2021/1/8.
*/
public class OReviewLogServiceMock extends BaseServiceMock<OReviewLogMapper, OReviewLog, OReviewLogExample> implements OReviewLogService {

}
