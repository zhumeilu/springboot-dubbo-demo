package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OExtfeePay;
import com.zml.demo.producer.dao.model.OExtfeePayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OExtfeePayMapper {
    long countByExample(OExtfeePayExample example);

    int deleteByExample(OExtfeePayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OExtfeePay record);

    int insertSelective(OExtfeePay record);

    List<OExtfeePay> selectByExampleWithBLOBs(OExtfeePayExample example);

    List<OExtfeePay> selectByExample(OExtfeePayExample example);

    OExtfeePay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OExtfeePay record, @Param("example") OExtfeePayExample example);

    int updateByExampleWithBLOBs(@Param("record") OExtfeePay record, @Param("example") OExtfeePayExample example);

    int updateByExample(@Param("record") OExtfeePay record, @Param("example") OExtfeePayExample example);

    int updateByPrimaryKeySelective(OExtfeePay record);

    int updateByPrimaryKeyWithBLOBs(OExtfeePay record);

    int updateByPrimaryKey(OExtfeePay record);
}