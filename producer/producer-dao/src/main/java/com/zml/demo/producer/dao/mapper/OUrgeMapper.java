package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OUrge;
import com.zml.demo.producer.dao.model.OUrgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OUrgeMapper {
    long countByExample(OUrgeExample example);

    int deleteByExample(OUrgeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OUrge record);

    int insertSelective(OUrge record);

    List<OUrge> selectByExample(OUrgeExample example);

    OUrge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OUrge record, @Param("example") OUrgeExample example);

    int updateByExample(@Param("record") OUrge record, @Param("example") OUrgeExample example);

    int updateByPrimaryKeySelective(OUrge record);

    int updateByPrimaryKey(OUrge record);
}