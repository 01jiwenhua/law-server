package com.shx.law.service;

import java.util.List;
import java.util.Map;

/**
 * 系统相关
 *
 * @author zmh
 * @create 2018-02-07 15:24
 **/
public interface SystemService {
    /**
     * 获取城市列表
     *
     * @param parentCode
     * @return
     */
    List<Map<String, Object>> getRegionList(String parentCode);
}


