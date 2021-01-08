package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OSupplementItem;
import com.zml.demo.producer.dao.model.OSupplementItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSupplementItemMapper {
    long countByExample(OSupplementItemExample example);

    int deleteByExample(OSupplementItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OSupplementItem record);

    int insertSelective(OSupplementItem record);

    List<OSupplementItem> selectByExampleWithBLOBs(OSupplementItemExample example);

    List<OSupplementItem> selectByExample(OSupplementItemExample example);

    OSupplementItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OSupplementItem record, @Param("example") OSupplementItemExample example);

    int updateByExampleWithBLOBs(@Param("record") OSupplementItem record, @Param("example") OSupplementItemExample example);

    int updateByExample(@Param("record") OSupplementItem record, @Param("example") OSupplementItemExample example);

    int updateByPrimaryKeySelective(OSupplementItem record);

    int updateByPrimaryKeyWithBLOBs(OSupplementItem record);

    int updateByPrimaryKey(OSupplementItem record);
}