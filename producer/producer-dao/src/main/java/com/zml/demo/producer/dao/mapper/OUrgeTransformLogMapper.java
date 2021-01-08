package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OUrgeTransformLog;
import com.zml.demo.producer.dao.model.OUrgeTransformLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OUrgeTransformLogMapper {
    long countByExample(OUrgeTransformLogExample example);

    int deleteByExample(OUrgeTransformLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OUrgeTransformLog record);

    int insertSelective(OUrgeTransformLog record);

    List<OUrgeTransformLog> selectByExample(OUrgeTransformLogExample example);

    OUrgeTransformLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OUrgeTransformLog record, @Param("example") OUrgeTransformLogExample example);

    int updateByExample(@Param("record") OUrgeTransformLog record, @Param("example") OUrgeTransformLogExample example);

    int updateByPrimaryKeySelective(OUrgeTransformLog record);

    int updateByPrimaryKey(OUrgeTransformLog record);
}