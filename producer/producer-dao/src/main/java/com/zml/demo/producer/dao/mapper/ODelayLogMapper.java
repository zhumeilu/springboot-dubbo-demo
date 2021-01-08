package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.ODelayLog;
import com.zml.demo.producer.dao.model.ODelayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ODelayLogMapper {
    long countByExample(ODelayLogExample example);

    int deleteByExample(ODelayLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ODelayLog record);

    int insertSelective(ODelayLog record);

    List<ODelayLog> selectByExample(ODelayLogExample example);

    ODelayLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ODelayLog record, @Param("example") ODelayLogExample example);

    int updateByExample(@Param("record") ODelayLog record, @Param("example") ODelayLogExample example);

    int updateByPrimaryKeySelective(ODelayLog record);

    int updateByPrimaryKey(ODelayLog record);
}