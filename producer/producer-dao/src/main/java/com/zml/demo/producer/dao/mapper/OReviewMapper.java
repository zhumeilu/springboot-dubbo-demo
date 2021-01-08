package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OReview;
import com.zml.demo.producer.dao.model.OReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OReviewMapper {
    long countByExample(OReviewExample example);

    int deleteByExample(OReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OReview record);

    int insertSelective(OReview record);

    List<OReview> selectByExample(OReviewExample example);

    OReview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OReview record, @Param("example") OReviewExample example);

    int updateByExample(@Param("record") OReview record, @Param("example") OReviewExample example);

    int updateByPrimaryKeySelective(OReview record);

    int updateByPrimaryKey(OReview record);
}