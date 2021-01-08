package com.zml.demo.producer.dao.mapper;

import com.zml.demo.producer.dao.model.OWithdraw;
import com.zml.demo.producer.dao.model.OWithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OWithdrawMapper {
    long countByExample(OWithdrawExample example);

    int deleteByExample(OWithdrawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OWithdraw record);

    int insertSelective(OWithdraw record);

    List<OWithdraw> selectByExample(OWithdrawExample example);

    OWithdraw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OWithdraw record, @Param("example") OWithdrawExample example);

    int updateByExample(@Param("record") OWithdraw record, @Param("example") OWithdrawExample example);

    int updateByPrimaryKeySelective(OWithdraw record);

    int updateByPrimaryKey(OWithdraw record);
}