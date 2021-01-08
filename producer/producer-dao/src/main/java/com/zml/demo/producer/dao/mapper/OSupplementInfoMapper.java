package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OSupplementInfo;
import com.zml.demo.producer.dao.model.OSupplementInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSupplementInfoMapper {
    long countByExample(OSupplementInfoExample example);

    int deleteByExample(OSupplementInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OSupplementInfo record);

    int insertSelective(OSupplementInfo record);

    List<OSupplementInfo> selectByExample(OSupplementInfoExample example);

    OSupplementInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OSupplementInfo record, @Param("example") OSupplementInfoExample example);

    int updateByExample(@Param("record") OSupplementInfo record, @Param("example") OSupplementInfoExample example);

    int updateByPrimaryKeySelective(OSupplementInfo record);

    int updateByPrimaryKey(OSupplementInfo record);
}