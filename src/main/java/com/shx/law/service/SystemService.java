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
    /**
     * 获取城市列表
     * @param parentCode
     * @return
     */
    List<Region> getRegionList(String parentCode);

    /**
     * 保存意见建议
     * @param userId
     * @param content
     */
    void saveAdvice(Integer userId, String content);
}
