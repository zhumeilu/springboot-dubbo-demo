package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OExtfee;
import com.zml.demo.producer.dao.model.OExtfeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OExtfeeMapper {
    long countByExample(OExtfeeExample example);

    int deleteByExample(OExtfeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OExtfee record);

    int insertSelective(OExtfee record);

    List<OExtfee> selectByExample(OExtfeeExample example);

    OExtfee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OExtfee record, @Param("example") OExtfeeExample example);

    int updateByExample(@Param("record") OExtfee record, @Param("example") OExtfeeExample example);

    int updateByPrimaryKeySelective(OExtfee record);

    int updateByPrimaryKey(OExtfee record);
}