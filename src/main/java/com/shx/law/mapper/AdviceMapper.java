package com.shx.law.mapper;

import com.shx.law.entity.Advice;
import com.shx.law.entity.AdviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdviceMapper {
    long countByExample(AdviceExample example);

    int deleteByExample(AdviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Advice record);

    int insertSelective(Advice record);

    List<Advice> selectByExample(AdviceExample example);

    Advice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Advice record, @Param("example") AdviceExample example);

    int updateByExample(@Param("record") Advice record, @Param("example") AdviceExample example);

    int updateByPrimaryKeySelective(Advice record);

    int updateByPrimaryKey(Advice record);
}