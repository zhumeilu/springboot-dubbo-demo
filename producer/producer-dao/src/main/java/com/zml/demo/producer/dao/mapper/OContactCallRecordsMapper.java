package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OContactCallRecords;
import com.zml.demo.producer.dao.model.OContactCallRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OContactCallRecordsMapper {
    long countByExample(OContactCallRecordsExample example);

    int deleteByExample(OContactCallRecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OContactCallRecords record);

    int insertSelective(OContactCallRecords record);

    List<OContactCallRecords> selectByExample(OContactCallRecordsExample example);

    OContactCallRecords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OContactCallRecords record, @Param("example") OContactCallRecordsExample example);

    int updateByExample(@Param("record") OContactCallRecords record, @Param("example") OContactCallRecordsExample example);

    int updateByPrimaryKeySelective(OContactCallRecords record);

    int updateByPrimaryKey(OContactCallRecords record);
}