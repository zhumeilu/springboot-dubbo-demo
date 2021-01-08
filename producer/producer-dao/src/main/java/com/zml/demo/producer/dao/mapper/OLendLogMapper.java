package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OLendLog;
import com.zml.demo.producer.dao.model.OLendLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OLendLogMapper {
    long countByExample(OLendLogExample example);

    int deleteByExample(OLendLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OLendLog record);

    int insertSelective(OLendLog record);

    List<OLendLog> selectByExample(OLendLogExample example);

    OLendLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OLendLog record, @Param("example") OLendLogExample example);

    int updateByExample(@Param("record") OLendLog record, @Param("example") OLendLogExample example);

    int updateByPrimaryKeySelective(OLendLog record);

    int updateByPrimaryKey(OLendLog record);
}