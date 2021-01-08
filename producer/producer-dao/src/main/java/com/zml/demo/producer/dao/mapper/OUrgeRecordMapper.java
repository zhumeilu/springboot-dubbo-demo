package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OUrgeRecord;
import com.zml.demo.producer.dao.model.OUrgeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OUrgeRecordMapper {
    long countByExample(OUrgeRecordExample example);

    int deleteByExample(OUrgeRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OUrgeRecord record);

    int insertSelective(OUrgeRecord record);

    List<OUrgeRecord> selectByExample(OUrgeRecordExample example);

    OUrgeRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OUrgeRecord record, @Param("example") OUrgeRecordExample example);

    int updateByExample(@Param("record") OUrgeRecord record, @Param("example") OUrgeRecordExample example);

    int updateByPrimaryKeySelective(OUrgeRecord record);

    int updateByPrimaryKey(OUrgeRecord record);
}