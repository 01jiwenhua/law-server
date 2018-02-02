package com.shx.law.mapper;

import com.shx.law.entity.Chemicals;
import com.shx.law.entity.ChemicalsExample;
import com.shx.law.entity.ChemicalsWithBLOBs;
import java.util.List;
import java.util.Map;

import com.shx.law.vo.request.KnownRequest;
import org.apache.ibatis.annotations.Param;

public interface ChemicalsMapper {
    long countByExample(ChemicalsExample example);

    int deleteByExample(ChemicalsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChemicalsWithBLOBs record);

    int insertSelective(ChemicalsWithBLOBs record);

    List<ChemicalsWithBLOBs> selectByExampleWithBLOBs(ChemicalsExample example);

    List<Chemicals> selectByExample(ChemicalsExample example);

    ChemicalsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChemicalsWithBLOBs record, @Param("example") ChemicalsExample example);

    int updateByExampleWithBLOBs(@Param("record") ChemicalsWithBLOBs record, @Param("example") ChemicalsExample example);

    int updateByExample(@Param("record") Chemicals record, @Param("example") ChemicalsExample example);

    int updateByPrimaryKeySelective(ChemicalsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ChemicalsWithBLOBs record);

    int updateByPrimaryKey(Chemicals record);


    List<Chemicals> selectByParams(@Param("request") KnownRequest request);
    Map<String,Object> selectDetails(@Param("id") String id);
}