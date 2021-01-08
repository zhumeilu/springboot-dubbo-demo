package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OUrgeRecordMapper;
import com.zml.demo.producer.dao.model.OUrgeRecord;
import com.zml.demo.producer.dao.model.OUrgeRecordExample;

/**
* 降级实现OUrgeRecordService接口
* Created by Charles on 2021/1/8.
*/
public class OUrgeRecordServiceMock extends BaseServiceMock<OUrgeRecordMapper, OUrgeRecord, OUrgeRecordExample> implements OUrgeRecordService {

}
