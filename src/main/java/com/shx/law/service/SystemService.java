package com.shx.law.service;

import com.shx.law.entity.Region;

import java.util.List;

/**
 * 系统相关
 *
 * @author zmh
 * @create 2018-02-07 21:54
 **/
public interface SystemService {
    List<Region> getRegionList(String parentCode);
}
