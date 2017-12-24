package com.shx.law.mapper;

import com.shx.law.entity.BasicData;
import com.shx.law.entity.BasicDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasicDataMapper {
    long countByExample(BasicDataExample example);

    int deleteByExample(BasicDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BasicData record);

    int insertSelective(BasicData record);

    List<BasicData> selectByExample(BasicDataExample example);

    BasicData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BasicData record, @Param("example") BasicDataExample example);

    int updateByExample(@Param("record") BasicData record, @Param("example") BasicDataExample example);

    int updateByPrimaryKeySelective(BasicData record);

    int updateByPrimaryKey(BasicData record);
}