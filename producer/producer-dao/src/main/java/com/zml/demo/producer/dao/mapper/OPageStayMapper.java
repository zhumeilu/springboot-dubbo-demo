package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OPageStay;
import com.zml.demo.producer.dao.model.OPageStayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OPageStayMapper {
    long countByExample(OPageStayExample example);

    int deleteByExample(OPageStayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OPageStay record);

    int insertSelective(OPageStay record);

    List<OPageStay> selectByExample(OPageStayExample example);

    OPageStay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OPageStay record, @Param("example") OPageStayExample example);

    int updateByExample(@Param("record") OPageStay record, @Param("example") OPageStayExample example);

    int updateByPrimaryKeySelective(OPageStay record);

    int updateByPrimaryKey(OPageStay record);
}