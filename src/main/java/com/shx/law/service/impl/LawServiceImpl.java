package com.shx.law.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shx.law.entity.Law;
import com.shx.law.mapper.LawMapper;
import com.shx.law.service.LawService;
import com.shx.law.vo.request.LawRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        List<String> levelList = new ArrayList<String>();
        if ("law".equals(request.getLevel())) {
            levelList.add("国家标准");

        } else if ("regulation".equals(request.getLevel())) {
            levelList.add("法规性文件");
            levelList.add("行政法规");
            levelList.add("规范性文件");
            levelList.add("部门规章");
        }else if("standard".equals(request.getLevel())){
            levelList.add("国家标准");
            levelList.add("安全标准");
            levelList.add("行业标准");

        }
        List<Law> lawList = lawMapper.selectByParams(request, levelList);
        PageInfo<Law> PageInfo = new PageInfo<Law>(lawList);

        return PageInfo;
    }
}
