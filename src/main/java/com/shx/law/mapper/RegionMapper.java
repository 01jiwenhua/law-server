package com.shx.law.mapper;

import com.shx.law.entity.Region;
import com.shx.law.entity.RegionExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RegionMapper {
    long countByExample(RegionExample example);

    int deleteByExample(RegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Region record);

    int insertSelective(Region record);

    List<Region> selectByExample(RegionExample example);

    Region selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByExample(@Param("record") Region record, @Param("example") RegionExample example);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKey(Region record);

    /**
     * 查询城市列表
     * @param parentCode
     * @return
     */
    List<Map<String, Object>> selectByParentCode(@Param("parentCode") String parentCode);
}