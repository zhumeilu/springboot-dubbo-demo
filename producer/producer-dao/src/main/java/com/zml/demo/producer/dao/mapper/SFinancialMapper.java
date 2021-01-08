package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.SFinancial;
import com.zml.demo.producer.dao.model.SFinancialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SFinancialMapper {
    long countByExample(SFinancialExample example);

    int deleteByExample(SFinancialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SFinancial record);

    int insertSelective(SFinancial record);

    List<SFinancial> selectByExample(SFinancialExample example);

    SFinancial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SFinancial record, @Param("example") SFinancialExample example);

    int updateByExample(@Param("record") SFinancial record, @Param("example") SFinancialExample example);

    int updateByPrimaryKeySelective(SFinancial record);

    int updateByPrimaryKey(SFinancial record);
}