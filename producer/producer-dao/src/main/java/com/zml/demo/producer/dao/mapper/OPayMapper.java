package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OPay;
import com.zml.demo.producer.dao.model.OPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OPayMapper {
    long countByExample(OPayExample example);

    int deleteByExample(OPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OPay record);

    int insertSelective(OPay record);

    List<OPay> selectByExample(OPayExample example);

    OPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OPay record, @Param("example") OPayExample example);

    int updateByExample(@Param("record") OPay record, @Param("example") OPayExample example);

    int updateByPrimaryKeySelective(OPay record);

    int updateByPrimaryKey(OPay record);
}