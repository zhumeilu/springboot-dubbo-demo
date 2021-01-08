package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OLendAppLog;
import com.zml.demo.producer.dao.model.OLendAppLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OLendAppLogMapper {
    long countByExample(OLendAppLogExample example);

    int deleteByExample(OLendAppLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OLendAppLog record);

    int insertSelective(OLendAppLog record);

    List<OLendAppLog> selectByExample(OLendAppLogExample example);

    OLendAppLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OLendAppLog record, @Param("example") OLendAppLogExample example);

    int updateByExample(@Param("record") OLendAppLog record, @Param("example") OLendAppLogExample example);

    int updateByPrimaryKeySelective(OLendAppLog record);

    int updateByPrimaryKey(OLendAppLog record);
}