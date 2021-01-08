package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OUrgeLabel;
import com.zml.demo.producer.dao.model.OUrgeLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OUrgeLabelMapper {
    long countByExample(OUrgeLabelExample example);

    int deleteByExample(OUrgeLabelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OUrgeLabel record);

    int insertSelective(OUrgeLabel record);

    List<OUrgeLabel> selectByExample(OUrgeLabelExample example);

    OUrgeLabel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OUrgeLabel record, @Param("example") OUrgeLabelExample example);

    int updateByExample(@Param("record") OUrgeLabel record, @Param("example") OUrgeLabelExample example);

    int updateByPrimaryKeySelective(OUrgeLabel record);

    int updateByPrimaryKey(OUrgeLabel record);
}