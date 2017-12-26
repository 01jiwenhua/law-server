package com.shx.law.service;

import com.github.pagehelper.PageInfo;
import com.shx.law.entity.Law;
import com.shx.law.vo.request.LawRequest;

/**
 * Created by xuan on 2017/12/23.
 */
public interface LawService {
    PageInfo<Law> getLawList(LawRequest request);
}
