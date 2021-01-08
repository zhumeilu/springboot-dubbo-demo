package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OUrgeStage;
import com.zml.demo.producer.dao.model.OUrgeStageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OUrgeStageMapper {
    long countByExample(OUrgeStageExample example);

    int deleteByExample(OUrgeStageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OUrgeStage record);

    int insertSelective(OUrgeStage record);

    List<OUrgeStage> selectByExample(OUrgeStageExample example);

    OUrgeStage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OUrgeStage record, @Param("example") OUrgeStageExample example);

    int updateByExample(@Param("record") OUrgeStage record, @Param("example") OUrgeStageExample example);

    int updateByPrimaryKeySelective(OUrgeStage record);

    int updateByPrimaryKey(OUrgeStage record);
}