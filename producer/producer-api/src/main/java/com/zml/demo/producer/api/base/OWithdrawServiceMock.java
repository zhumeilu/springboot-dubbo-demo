package com.zml.demo.producer.api.base;

import com.lmhd.common.base.BaseServiceMock;
import com.zml.demo.producer.dao.mapper.OWithdrawMapper;
import com.zml.demo.producer.dao.model.OWithdraw;
import com.zml.demo.producer.dao.model.OWithdrawExample;

/**
* 降级实现OWithdrawService接口
* Created by Charles on 2021/1/8.
*/
public class OWithdrawServiceMock extends BaseServiceMock<OWithdrawMapper, OWithdraw, OWithdrawExample> implements OWithdrawService {

}
