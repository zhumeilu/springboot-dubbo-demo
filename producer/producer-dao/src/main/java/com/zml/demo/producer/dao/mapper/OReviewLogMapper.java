package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OReviewLog;
import com.zml.demo.producer.dao.model.OReviewLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OReviewLogMapper {
    long countByExample(OReviewLogExample example);

    int deleteByExample(OReviewLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OReviewLog record);

    int insertSelective(OReviewLog record);

    List<OReviewLog> selectByExample(OReviewLogExample example);

    OReviewLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OReviewLog record, @Param("example") OReviewLogExample example);

    int updateByExample(@Param("record") OReviewLog record, @Param("example") OReviewLogExample example);

    int updateByPrimaryKeySelective(OReviewLog record);

    int updateByPrimaryKey(OReviewLog record);
}