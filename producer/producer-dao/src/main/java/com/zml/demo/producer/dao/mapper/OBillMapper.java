package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OBill;
import com.zml.demo.producer.dao.model.OBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OBillMapper {
    long countByExample(OBillExample example);

    int deleteByExample(OBillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OBill record);

    int insertSelective(OBill record);

    List<OBill> selectByExample(OBillExample example);

    OBill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OBill record, @Param("example") OBillExample example);

    int updateByExample(@Param("record") OBill record, @Param("example") OBillExample example);

    int updateByPrimaryKeySelective(OBill record);

    int updateByPrimaryKey(OBill record);
}