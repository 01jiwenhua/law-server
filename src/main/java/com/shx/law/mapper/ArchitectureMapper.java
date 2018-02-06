package com.shx.law.mapper;

import com.shx.law.entity.Architecture;
import com.shx.law.entity.ArchitectureExample;
import java.util.List;

import com.shx.law.vo.request.ArchitectureRequest;
import org.apache.ibatis.annotations.Param;

public interface ArchitectureMapper {
    long countByExample(ArchitectureExample example);

    int deleteByExample(ArchitectureExample example);

    int deleteByPrimaryKey(Short id);

    int insert(Architecture record);

    int insertSelective(Architecture record);

    List<Architecture> selectByExample(ArchitectureExample example);

    Architecture selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") Architecture record, @Param("example") ArchitectureExample example);

    int updateByExample(@Param("record") Architecture record, @Param("example") ArchitectureExample example);

    int updateByPrimaryKeySelective(Architecture record);

    int updateByPrimaryKey(Architecture record);

    /**
     * 查询建筑物
     * @param architectureRequest
     * @return
     */
    List<Architecture> selectByRequest(ArchitectureRequest architectureRequest);
}