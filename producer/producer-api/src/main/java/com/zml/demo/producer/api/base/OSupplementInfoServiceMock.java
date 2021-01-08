package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OSupplementInfoMapper;
import com.zml.demo.producer.dao.model.OSupplementInfo;
import com.zml.demo.producer.dao.model.OSupplementInfoExample;

/**
* 降级实现OSupplementInfoService接口
* Created by Charles on 2021/1/8.
*/
public class OSupplementInfoServiceMock extends BaseServiceMock<OSupplementInfoMapper, OSupplementInfo, OSupplementInfoExample> implements OSupplementInfoService {

}
