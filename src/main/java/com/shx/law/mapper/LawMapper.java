package com.shx.law.mapper;

import com.shx.law.entity.Law;
import com.shx.law.entity.LawExample;
import java.util.List;
import java.util.Map;

import com.shx.law.vo.request.LawRequest;
import org.apache.ibatis.annotations.Param;

public interface LawMapper {
    long countByExample(LawExample example);

    int deleteByExample(LawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Law record);

    int insertSelective(Law record);

    List<Law> selectByExampleWithBLOBs(LawExample example);

    List<Law> selectByExample(LawExample example);

    Law selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Law record, @Param("example") LawExample example);

    int updateByExampleWithBLOBs(@Param("record") Law record, @Param("example") LawExample example);

    int updateByExample(@Param("record") Law record, @Param("example") LawExample example);

    int updateByPrimaryKeySelective(Law record);

    int updateByPrimaryKeyWithBLOBs(Law record);

    int updateByPrimaryKey(Law record);

    List<Map<String, Object>> selectByParams(@Param("lawRequest") LawRequest lawRequest);
}