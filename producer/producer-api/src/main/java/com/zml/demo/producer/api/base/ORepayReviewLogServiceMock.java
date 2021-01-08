package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.ORepayReviewLogMapper;
import com.zml.demo.producer.dao.model.ORepayReviewLog;
import com.zml.demo.producer.dao.model.ORepayReviewLogExample;

/**
* 降级实现ORepayReviewLogService接口
* Created by Charles on 2021/1/8.
*/
public class ORepayReviewLogServiceMock extends BaseServiceMock<ORepayReviewLogMapper, ORepayReviewLog, ORepayReviewLogExample> implements ORepayReviewLogService {

}
