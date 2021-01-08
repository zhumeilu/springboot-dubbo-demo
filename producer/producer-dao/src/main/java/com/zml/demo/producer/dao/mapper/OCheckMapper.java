package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OCheck;
import com.zml.demo.producer.dao.model.OCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OCheckMapper {
    long countByExample(OCheckExample example);

    int deleteByExample(OCheckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OCheck record);

    int insertSelective(OCheck record);

    List<OCheck> selectByExample(OCheckExample example);

    OCheck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OCheck record, @Param("example") OCheckExample example);

    int updateByExample(@Param("record") OCheck record, @Param("example") OCheckExample example);

    int updateByPrimaryKeySelective(OCheck record);

    int updateByPrimaryKey(OCheck record);
}