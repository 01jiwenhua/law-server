package com.shx.law.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shx.law.entity.BasicData;
import com.shx.law.entity.BasicDataExample;
import com.shx.law.entity.Law;
import com.shx.law.mapper.BasicDataMapper;
import com.shx.law.mapper.LawMapper;
import com.shx.law.service.LawService;
import com.shx.law.vo.request.LawRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuan on 2017/12/23.
 */
@Service("lawService")
public class LawServiceImpl implements LawService {
    @Autowired
    private LawMapper lawMapper;
    @Autowired
    private BasicDataMapper basicDataMapper;

    public PageInfo<Law> getLawList(LawRequest request) {
        PageHelper.startPage(request.getPage(), request.getPageSize());
//        List<String> levelList = new ArrayList<String>();
//        if ("law".equals(request.getLevel())) {
//            levelList.add("国家标准");
//
//        } else if ("regulation".equals(request.getLevel())) {
//            levelList.add("法规性文件");
//            levelList.add("行政法规");
//            levelList.add("规范性文件");
//            levelList.add("部门规章");
//        }else if("standard".equals(request.getLevel())){
//            levelList.add("国家标准");
//            levelList.add("安全标准");
//            levelList.add("行业标准");
//
//        }else{
//            if(request.getLevel().equals("全部")){
//                request.setLevel(null);
//            }else{
//                levelList.add(request.getLevel());
//            }
//        }

        List<Law> lawList = lawMapper.selectByParams(request);
        PageInfo<Law> PageInfo = new PageInfo<Law>(lawList);

        return PageInfo;
    }

    public List<BasicData> getLawLevel(String typeCode) {
        BasicDataExample example = new BasicDataExample();
        BasicDataExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryCodeEqualTo(typeCode);
        List<BasicData> basicDataList = basicDataMapper.selectByExample(example);
        return basicDataList;
    }
}
