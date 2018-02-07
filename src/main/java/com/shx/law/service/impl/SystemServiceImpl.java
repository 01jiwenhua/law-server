package com.shx.law.service.impl;

import com.shx.law.entity.Region;
import com.shx.law.entity.RegionExample;
import com.shx.law.mapper.RegionMapper;
import com.shx.law.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统相关
 *
 * @author zmh
 * @create 2018-02-07 21:55
 **/
@Service("systemService")
public class SystemServiceImpl implements SystemService {
    @Autowired
    private RegionMapper regionMapper;

    public List<Region> getRegionList(String parentCode) {
        RegionExample regionExample = new RegionExample();
        regionExample.createCriteria().andParentCodeEqualTo(parentCode);
        return regionMapper.selectByExample(regionExample);
    }
}
