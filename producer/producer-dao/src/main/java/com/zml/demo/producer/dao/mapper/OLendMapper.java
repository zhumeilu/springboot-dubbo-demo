package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OLend;
import com.zml.demo.producer.dao.model.OLendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OLendMapper {
    long countByExample(OLendExample example);

    int deleteByExample(OLendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OLend record);

    int insertSelective(OLend record);

    List<OLend> selectByExample(OLendExample example);

    OLend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OLend record, @Param("example") OLendExample example);

    int updateByExample(@Param("record") OLend record, @Param("example") OLendExample example);

    int updateByPrimaryKeySelective(OLend record);

    int updateByPrimaryKey(OLend record);
}