package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.ORepayReviewLog;
import com.zml.demo.producer.dao.model.ORepayReviewLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ORepayReviewLogMapper {
    long countByExample(ORepayReviewLogExample example);

    int deleteByExample(ORepayReviewLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ORepayReviewLog record);

    int insertSelective(ORepayReviewLog record);

    List<ORepayReviewLog> selectByExample(ORepayReviewLogExample example);

    ORepayReviewLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ORepayReviewLog record, @Param("example") ORepayReviewLogExample example);

    int updateByExample(@Param("record") ORepayReviewLog record, @Param("example") ORepayReviewLogExample example);

    int updateByPrimaryKeySelective(ORepayReviewLog record);

    int updateByPrimaryKey(ORepayReviewLog record);
}