package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OContactCallRecordsMapper;
import com.zml.demo.producer.dao.model.OContactCallRecords;
import com.zml.demo.producer.dao.model.OContactCallRecordsExample;

/**
* 降级实现OContactCallRecordsService接口
* Created by Charles on 2021/1/8.
*/
public class OContactCallRecordsServiceMock extends BaseServiceMock<OContactCallRecordsMapper, OContactCallRecords, OContactCallRecordsExample> implements OContactCallRecordsService {

}
