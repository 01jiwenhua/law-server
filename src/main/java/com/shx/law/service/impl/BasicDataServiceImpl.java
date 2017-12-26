package com.shx.law.service.impl;

import com.shx.law.entity.BasicData;
import com.shx.law.entity.BasicDataExample;
import com.shx.law.mapper.BasicDataMapper;
import com.shx.law.service.BasicDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuan on 2017/12/25.
 */
@Service("BasicDataService")
public class BasicDataServiceImpl implements BasicDataService {
    @Autowired
    private BasicDataMapper basicDataMapper;
    public Map<String, Object> getAllParams() {
        List<BasicData> lhList=basicDataMapper.selectLH();
        List<BasicData> jkwhList=basicDataMapper.selectJkWH();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("lhList",lhList);
        map.put("jkwhList",jkwhList);
        return map;
    }

    public List<BasicData> getParamsDetails(String code) {
//        BasicDataExample example=new BasicDataExample();
//        BasicDataExample.Criteria criteria=example.createCriteria();
//        criteria.andCategoryCodeEqualTo(code);
        List<BasicData> list=basicDataMapper.selectDetails(code);
        return list;
    }
}
