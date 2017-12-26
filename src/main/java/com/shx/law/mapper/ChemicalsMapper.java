package com.shx.law.mapper;

import com.shx.law.entity.Chemicals;
import com.shx.law.entity.ChemicalsExample;
import java.util.List;
import java.util.Map;

import com.shx.law.vo.request.KnownRequest;
import com.shx.law.vo.request.LawRequest;
import org.apache.ibatis.annotations.Param;

public interface ChemicalsMapper {
    long countByExample(ChemicalsExample example);

    int deleteByExample(ChemicalsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chemicals record);

    int insertSelective(Chemicals record);

    List<Chemicals> selectByExample(ChemicalsExample example);

    Chemicals selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chemicals record, @Param("example") ChemicalsExample example);

    int updateByExample(@Param("record") Chemicals record, @Param("example") ChemicalsExample example);

    int updateByPrimaryKeySelective(Chemicals record);

    int updateByPrimaryKey(Chemicals record);
    List<Chemicals> selectByParams(@Param("request") KnownRequest request);
    Map<String,Object> selectDetails(@Param("id") String id);
}