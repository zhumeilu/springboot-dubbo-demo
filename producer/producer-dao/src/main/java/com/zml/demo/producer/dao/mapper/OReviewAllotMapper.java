package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OReviewAllot;
import com.zml.demo.producer.dao.model.OReviewAllotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OReviewAllotMapper {
    long countByExample(OReviewAllotExample example);

    int deleteByExample(OReviewAllotExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OReviewAllot record);

    int insertSelective(OReviewAllot record);

    List<OReviewAllot> selectByExample(OReviewAllotExample example);

    OReviewAllot selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OReviewAllot record, @Param("example") OReviewAllotExample example);

    int updateByExample(@Param("record") OReviewAllot record, @Param("example") OReviewAllotExample example);

    int updateByPrimaryKeySelective(OReviewAllot record);

    int updateByPrimaryKey(OReviewAllot record);
}