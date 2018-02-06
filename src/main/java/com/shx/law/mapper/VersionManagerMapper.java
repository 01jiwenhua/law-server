package com.shx.law.mapper;

import com.shx.law.entity.VersionManager;
import com.shx.law.entity.VersionManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VersionManagerMapper {
    long countByExample(VersionManagerExample example);

    int deleteByExample(VersionManagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VersionManager record);

    int insertSelective(VersionManager record);

    List<VersionManager> selectByExample(VersionManagerExample example);

    VersionManager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VersionManager record, @Param("example") VersionManagerExample example);

    int updateByExample(@Param("record") VersionManager record, @Param("example") VersionManagerExample example);

    int updateByPrimaryKeySelective(VersionManager record);

    int updateByPrimaryKey(VersionManager record);
}