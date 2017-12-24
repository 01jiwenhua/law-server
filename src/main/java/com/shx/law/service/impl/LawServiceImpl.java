package com.shx.law.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shx.law.entity.Law;
import com.shx.law.mapper.LawMapper;
import com.shx.law.service.LawService;
import com.shx.law.vo.request.LawRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuan on 2017/12/23.
 */
@Service("lawService")
public class LawServiceImpl implements LawService {
    @Autowired
    private LawMapper lawMapper;
    public PageInfo<Law> getLawList(LawRequest request) {
        PageHelper.startPage(request.getPage(), request.getPageSize());
        List<Law> lawList=lawMapper.selectByParams(request);
        PageInfo<Law> PageInfo=new PageInfo<Law>(lawList);

        return PageInfo;
    }
}
