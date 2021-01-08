package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.SOrder;
import com.zml.demo.producer.dao.model.SOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SOrderMapper {
    long countByExample(SOrderExample example);

    int deleteByExample(SOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SOrder record);

    int insertSelective(SOrder record);

    List<SOrder> selectByExample(SOrderExample example);

    SOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SOrder record, @Param("example") SOrderExample example);

    int updateByExample(@Param("record") SOrder record, @Param("example") SOrderExample example);

    int updateByPrimaryKeySelective(SOrder record);

    int updateByPrimaryKey(SOrder record);
}