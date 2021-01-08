package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OLendDetail;
import com.zml.demo.producer.dao.model.OLendDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OLendDetailMapper {
    long countByExample(OLendDetailExample example);

    int deleteByExample(OLendDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OLendDetail record);

    int insertSelective(OLendDetail record);

    List<OLendDetail> selectByExample(OLendDetailExample example);

    OLendDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OLendDetail record, @Param("example") OLendDetailExample example);

    int updateByExample(@Param("record") OLendDetail record, @Param("example") OLendDetailExample example);

    int updateByPrimaryKeySelective(OLendDetail record);

    int updateByPrimaryKey(OLendDetail record);
}