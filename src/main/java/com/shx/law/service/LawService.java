package com.shx.law.service;

import com.github.pagehelper.PageInfo;
import com.shx.law.entity.BasicData;
import com.shx.law.entity.Chemicals;
import com.shx.law.entity.Law;
import com.shx.law.vo.request.LawRequest;

import java.util.List;

/**
 * Created by xuan on 2017/12/23.
 */
public interface LawService {
    PageInfo<Law> getLawList(LawRequest request);
    List<BasicData> getLawLevel(String typeCode);
    void addFavorite(String typeCode,String lawId,String userId);

    /**
     * 获取收藏列表
     * @param typeCode
     * @param userId
     * @return
     */
    List getFavoriteList(String typeCode,String userId);

}
