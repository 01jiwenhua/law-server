package com.shx.law.mapper;

import com.shx.law.entity.Distance;
import com.shx.law.entity.DistanceExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DistanceMapper {
    long countByExample(DistanceExample example);

    int deleteByExample(DistanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Distance record);

    int insertSelective(Distance record);

    List<Distance> selectByExample(DistanceExample example);

    Distance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Distance record, @Param("example") DistanceExample example);

    int updateByExample(@Param("record") Distance record, @Param("example") DistanceExample example);

    int updateByPrimaryKeySelective(Distance record);

    int updateByPrimaryKey(Distance record);

    /**
     * 模糊类型列表查询
     * @param deviceInName
     * @param structureOutName
     * @return
     */
    List<Map<String, Object>> selectDistanceByFuzzy(@Param("deviceInName") String deviceInName, @Param("structureOutName")
            String structureOutName);

    /**
     * 模糊查询详情列表
     * @param deviceInName
     * @param structureOutName
     * @return
     */
    List<Map<String, Object>> selectDistanceByType(@Param("deviceInName") String deviceInName, @Param("structureOutName")
            String structureOutName, @Param("type") String type);
   Map<String, Object>  selectDistance(@Param("structureOutId")String structureOutId,@Param("deviceInId") String deviceInId);
}