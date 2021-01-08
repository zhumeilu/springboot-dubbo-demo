package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.ORepay;
import com.zml.demo.producer.dao.model.ORepayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ORepayMapper {
    long countByExample(ORepayExample example);

    int deleteByExample(ORepayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ORepay record);

    int insertSelective(ORepay record);

    List<ORepay> selectByExampleWithBLOBs(ORepayExample example);

    List<ORepay> selectByExample(ORepayExample example);

    ORepay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ORepay record, @Param("example") ORepayExample example);

    int updateByExampleWithBLOBs(@Param("record") ORepay record, @Param("example") ORepayExample example);

    int updateByExample(@Param("record") ORepay record, @Param("example") ORepayExample example);

    int updateByPrimaryKeySelective(ORepay record);

    int updateByPrimaryKeyWithBLOBs(ORepay record);

    int updateByPrimaryKey(ORepay record);
}