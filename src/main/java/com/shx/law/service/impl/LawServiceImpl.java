package com.shx.law.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shx.law.entity.*;
import com.shx.law.mapper.BasicDataMapper;
import com.shx.law.mapper.ChemicalsMapper;
import com.shx.law.mapper.FavoriteMapper;
import com.shx.law.mapper.LawMapper;
import com.shx.law.service.LawService;
import com.shx.law.vo.request.LawRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuan on 2017/12/23.
 */
@Service("lawService")
public class LawServiceImpl implements LawService {
    @Autowired
    private LawMapper lawMapper;
    @Autowired
    private ChemicalsMapper chemicalsMapper;
    @Autowired
    private BasicDataMapper basicDataMapper;
    @Autowired
    private FavoriteMapper favoriteMapper;

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

    public void addFavorite(String typeCode, String lawId, String userId) {
        FavoriteExample example = new FavoriteExample();
        FavoriteExample.Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo(typeCode).andLawIdEqualTo(Integer.valueOf(lawId)).andUserIdEqualTo(Integer.valueOf(userId));
        List<Favorite> list = favoriteMapper.selectByExample(example);
        if (list != null && list.size() > 0) {
            Favorite favorite = list.get(0);
            if (favorite.getStatus() == -1) {
                favorite.setStatus(1);
                favoriteMapper.updateByPrimaryKeySelective(favorite);
                return;
            }
        } else {
            Favorite favorite = new Favorite();
            favorite.setStatus(1);
            favorite.setLawId(Integer.valueOf(lawId));
            favorite.setType(typeCode);
            favoriteMapper.insertSelective(favorite);
        }
    }

    /**
     * 取消收藏
     * @param typeCode
     * @param lawId
     * @param userId
     */
    public void cancelFavorite(String typeCode, String lawId, String userId) {
        FavoriteExample example = new FavoriteExample();
        FavoriteExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(Integer.parseInt(userId)).andTypeEqualTo(typeCode).andLawIdEqualTo(Integer.parseInt(lawId));
        Favorite favorite = new Favorite();
        favorite.setStatus(0);
        favoriteMapper.updateByExampleSelective(favorite, example);
    }

    /**
     * 获取收藏列表
     *
     * @param typeCode
     * @param userId
     * @return
     */
    public List getFavoriteList(String typeCode, String userId) {
        List resultList = new ArrayList();
        FavoriteExample favoriteExample = new FavoriteExample();
        favoriteExample.createCriteria().andTypeEqualTo(typeCode).andUserIdEqualTo(Integer.parseInt(userId));
        List<Favorite> favorites = favoriteMapper.selectByExample(favoriteExample);
        List<Integer> lawIdList = new ArrayList<Integer>();
        for (Favorite favorite : favorites) {
            lawIdList.add(favorite.getLawId());
        }
        if(lawIdList==null||lawIdList.size()<=0){
            return resultList;
        }
        if (typeCode.equals("wxhxp")) {
            ChemicalsExample chemicalsExample = new ChemicalsExample();
            chemicalsExample.createCriteria().andIdIn(lawIdList);
            resultList = chemicalsMapper.selectByExample(chemicalsExample);
        } else {
            LawExample lawExample = new LawExample();
            lawExample.createCriteria().andIdIn(lawIdList);
            resultList = lawMapper.selectByExample(lawExample);
        }
        return resultList;
    }
}
