package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OReviewAllotMapper;
import com.zml.demo.producer.dao.model.OReviewAllot;
import com.zml.demo.producer.dao.model.OReviewAllotExample;

/**
* 降级实现OReviewAllotService接口
* Created by Charles on 2021/1/8.
*/
public class OReviewAllotServiceMock extends BaseServiceMock<OReviewAllotMapper, OReviewAllot, OReviewAllotExample> implements OReviewAllotService {

}
