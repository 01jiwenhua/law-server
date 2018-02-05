package com.shx.law.mapper;

import com.shx.law.entity.Structure;
import com.shx.law.entity.StructureExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StructureMapper {
    long countByExample(StructureExample example);

    int deleteByExample(StructureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Structure record);

    int insertSelective(Structure record);

    List<Structure> selectByExample(StructureExample example);

    Structure selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Structure record, @Param("example") StructureExample example);

    int updateByExample(@Param("record") Structure record, @Param("example") StructureExample example);

    int updateByPrimaryKeySelective(Structure record);

    int updateByPrimaryKey(Structure record);

    /**
     * 通过一级分类查询
     * @param name
     * @return
     */
    List<Map<String, Object>> selectByClassLevelOne(@Param("name") String name);

    /**
     * 通过二级分类查询
     * @param name
     * @return
     */
    List<Map<String, Object>> selectByClassLevelTwo(@Param("name") String name);

    /**
     * 通过三级父建筑物名称查询
     * @param name
     * @return
     */
    List<Map<String, Object>> selectByPreNameLevelThree(@Param("name") String name);

    /**
     * 通过二级父建筑物名称查询
     * @param name
     * @return
     */
    List<Map<String, Object>> selectByPreNameLevelTwo(@Param("name") String name);

    /**
     * 通过一级父建筑物名称查询
     * @param name
     * @return
     */
    List<Map<String, Object>> selectByPreNameLevelOne(@Param("name") String name);


}