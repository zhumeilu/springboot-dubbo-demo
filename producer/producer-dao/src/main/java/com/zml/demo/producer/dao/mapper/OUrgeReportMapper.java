package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OUrgeReport;
import com.zml.demo.producer.dao.model.OUrgeReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OUrgeReportMapper {
    long countByExample(OUrgeReportExample example);

    int deleteByExample(OUrgeReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OUrgeReport record);

    int insertSelective(OUrgeReport record);

    List<OUrgeReport> selectByExample(OUrgeReportExample example);

    OUrgeReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OUrgeReport record, @Param("example") OUrgeReportExample example);

    int updateByExample(@Param("record") OUrgeReport record, @Param("example") OUrgeReportExample example);

    int updateByPrimaryKeySelective(OUrgeReport record);

    int updateByPrimaryKey(OUrgeReport record);
}