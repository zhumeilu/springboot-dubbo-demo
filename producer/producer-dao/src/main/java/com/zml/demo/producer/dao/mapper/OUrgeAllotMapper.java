package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OUrgeAllot;
import com.zml.demo.producer.dao.model.OUrgeAllotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OUrgeAllotMapper {
    long countByExample(OUrgeAllotExample example);

    int deleteByExample(OUrgeAllotExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OUrgeAllot record);

    int insertSelective(OUrgeAllot record);

    List<OUrgeAllot> selectByExample(OUrgeAllotExample example);

    OUrgeAllot selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OUrgeAllot record, @Param("example") OUrgeAllotExample example);

    int updateByExample(@Param("record") OUrgeAllot record, @Param("example") OUrgeAllotExample example);

    int updateByPrimaryKeySelective(OUrgeAllot record);

    int updateByPrimaryKey(OUrgeAllot record);
}