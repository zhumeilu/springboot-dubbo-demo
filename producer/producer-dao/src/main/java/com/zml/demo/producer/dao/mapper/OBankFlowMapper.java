package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OBankFlow;
import com.zml.demo.producer.dao.model.OBankFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OBankFlowMapper {
    long countByExample(OBankFlowExample example);

    int deleteByExample(OBankFlowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OBankFlow record);

    int insertSelective(OBankFlow record);

    List<OBankFlow> selectByExample(OBankFlowExample example);

    OBankFlow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OBankFlow record, @Param("example") OBankFlowExample example);

    int updateByExample(@Param("record") OBankFlow record, @Param("example") OBankFlowExample example);

    int updateByPrimaryKeySelective(OBankFlow record);

    int updateByPrimaryKey(OBankFlow record);
}