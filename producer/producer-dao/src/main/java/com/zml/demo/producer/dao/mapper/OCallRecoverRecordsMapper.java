package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OCallRecoverRecords;
import com.zml.demo.producer.dao.model.OCallRecoverRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OCallRecoverRecordsMapper {
    long countByExample(OCallRecoverRecordsExample example);

    int deleteByExample(OCallRecoverRecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OCallRecoverRecords record);

    int insertSelective(OCallRecoverRecords record);

    List<OCallRecoverRecords> selectByExample(OCallRecoverRecordsExample example);

    OCallRecoverRecords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OCallRecoverRecords record, @Param("example") OCallRecoverRecordsExample example);

    int updateByExample(@Param("record") OCallRecoverRecords record, @Param("example") OCallRecoverRecordsExample example);

    int updateByPrimaryKeySelective(OCallRecoverRecords record);

    int updateByPrimaryKey(OCallRecoverRecords record);
}