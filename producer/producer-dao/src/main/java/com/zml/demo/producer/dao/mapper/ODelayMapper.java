package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.ODelay;
import com.zml.demo.producer.dao.model.ODelayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ODelayMapper {
    long countByExample(ODelayExample example);

    int deleteByExample(ODelayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ODelay record);

    int insertSelective(ODelay record);

    List<ODelay> selectByExampleWithBLOBs(ODelayExample example);

    List<ODelay> selectByExample(ODelayExample example);

    ODelay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ODelay record, @Param("example") ODelayExample example);

    int updateByExampleWithBLOBs(@Param("record") ODelay record, @Param("example") ODelayExample example);

    int updateByExample(@Param("record") ODelay record, @Param("example") ODelayExample example);

    int updateByPrimaryKeySelective(ODelay record);

    int updateByPrimaryKeyWithBLOBs(ODelay record);

    int updateByPrimaryKey(ODelay record);
}