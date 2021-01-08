package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OReviewMapper;
import com.zml.demo.producer.dao.model.OReview;
import com.zml.demo.producer.dao.model.OReviewExample;

/**
* 降级实现OReviewService接口
* Created by Charles on 2021/1/8.
*/
public class OReviewServiceMock extends BaseServiceMock<OReviewMapper, OReview, OReviewExample> implements OReviewService {

}
