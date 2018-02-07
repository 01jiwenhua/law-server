package com.shx.law.service.impl;

import com.shx.law.mapper.RegionMapper;
import com.shx.law.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 系统相关
 *
 * @author zmh
 * @create 2018-02-07 15:25
 **/
@Service("systemService")
public class SystemServiceImpl implements SystemService {
    @Autowired
    private RegionMapper regionMapper;

    /**
     * 查询城市列表
     * @param parentCode
     * @return
     */
    public List<Map<String, Object>> getRegionList(String parentCode) {
        return regionMapper.selectByParentCode(parentCode);
    }
}

