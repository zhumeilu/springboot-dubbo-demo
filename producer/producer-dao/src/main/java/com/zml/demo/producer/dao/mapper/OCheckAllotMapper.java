package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OCheckAllot;
import com.zml.demo.producer.dao.model.OCheckAllotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OCheckAllotMapper {
    long countByExample(OCheckAllotExample example);

    int deleteByExample(OCheckAllotExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OCheckAllot record);

    int insertSelective(OCheckAllot record);

    List<OCheckAllot> selectByExample(OCheckAllotExample example);

    OCheckAllot selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OCheckAllot record, @Param("example") OCheckAllotExample example);

    int updateByExample(@Param("record") OCheckAllot record, @Param("example") OCheckAllotExample example);

    int updateByPrimaryKeySelective(OCheckAllot record);

    int updateByPrimaryKey(OCheckAllot record);
}