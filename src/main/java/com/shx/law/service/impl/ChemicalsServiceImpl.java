package com.shx.law.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shx.law.entity.Chemicals;
import com.shx.law.entity.Law;
import com.shx.law.mapper.ChemicalsMapper;
import com.shx.law.service.ChemicalsService;
import com.shx.law.vo.request.KnownRequest;
import com.shx.law.vo.response.ChemicalsDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuan on 2017/12/24.
 */
@Service("ChemicalsService")
public class ChemicalsServiceImpl implements ChemicalsService {
    @Autowired
    private ChemicalsMapper chemicalsMapper;

    public PageInfo<Chemicals> getKnownChemicals(KnownRequest request) {
        PageHelper.startPage(request.getPage(), request.getPageSize());
        List<Chemicals> list = chemicalsMapper.selectByParams(request);
        PageInfo<Chemicals> PageInfo = new PageInfo<Chemicals>(list);

        return PageInfo;
    }

    public PageInfo<Chemicals> getUnKnownChemicals() {
        return null;
    }

    public List<Map<String,Object>> getChemicalsDetails(String id) {
        Map<String, Object> map = chemicalsMapper.selectDetails(id);
        List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
        Map<String, Object> lhtxMap = new HashMap<String, Object>();
        lhtxMap.put("title","理化特性");
        List<ChemicalsDetails> lhtxList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> wxxmsMap = new HashMap<String, Object>();
        wxxmsMap.put("title","危险性描述");
        List<ChemicalsDetails> wxxmsList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> jjcuosMap = new HashMap<String, Object>();
        jjcuosMap.put("title","急救措施");
        List<ChemicalsDetails> jjcuosList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> xfcsMap = new HashMap<String, Object>();
        xfcsMap.put("title","消防措施");
        List<ChemicalsDetails> xfcsList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> xlyjclMap = new HashMap<String, Object>();
        xlyjclMap.put("title","泄漏应急处理");
        List<ChemicalsDetails> xlyjclList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> czszMap = new HashMap<String, Object>();
        czszMap.put("title","操作设置");
        List<ChemicalsDetails> czszlList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> jckzMap = new HashMap<String, Object>();
        jckzMap.put("title","接触控制");
        List<ChemicalsDetails> jckzList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> wdxfyhxMap = new HashMap<String, Object>();
        wdxfyhxMap.put("title","稳定性和反应活性");
        List<ChemicalsDetails> wdxfyhxlList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> dlxzlMap = new HashMap<String, Object>();
        dlxzlMap.put("title","毒理学资料");
        List<ChemicalsDetails> dlxzllList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> ysxxMap = new HashMap<String, Object>();
        ysxxMap.put("title","运输信息");
        List<ChemicalsDetails> ysxxList=new ArrayList<ChemicalsDetails>();

        Map<String, Object> clfaMap = new HashMap<String, Object>();
        clfaMap.put("title","处理方案");
        List<ChemicalsDetails> clfaList=new ArrayList<ChemicalsDetails>();

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            ChemicalsDetails chemicalsDetails=new ChemicalsDetails();
            chemicalsDetails.setKey(key);
            chemicalsDetails.setValue(value);
//            wxxmsList.add(chemicalsDetails);
            if (key.startsWith("01")) {
                lhtxList.add(chemicalsDetails);
            } else if (key.startsWith("02")) {
                wxxmsList.add(chemicalsDetails);
            } else if (key.startsWith("03")) {
                jjcuosList.add(chemicalsDetails);
            } else if (key.startsWith("04")) {
                xfcsList.add(chemicalsDetails);
            } else if (key.startsWith("05")) {
                xlyjclList.add(chemicalsDetails);
            } else if (key.startsWith("06")) {
                czszlList.add(chemicalsDetails);
            } else if (key.startsWith("07")) {
                jckzList.add(chemicalsDetails);
            } else if (key.startsWith("08")) {
                wdxfyhxlList.add(chemicalsDetails);
            } else if (key.startsWith("09")) {
                dlxzllList.add(chemicalsDetails);
            } else if (key.startsWith("10")) {
                ysxxList.add(chemicalsDetails);
            } else if (key.startsWith("11")) {
                clfaList.add(chemicalsDetails);
            }

        }
        lhtxMap.put("list",lhtxList);
        resultList.add(lhtxMap);

        wxxmsMap.put("list",wxxmsList);
        resultList.add(wxxmsMap);

        jjcuosMap.put("list",jjcuosList);
        resultList.add(jjcuosMap);

        xfcsMap.put("list",xfcsList);
        resultList.add(xfcsMap);

        xlyjclMap.put("list",xlyjclList);
        resultList.add(xlyjclMap);

        jckzMap.put("list",jckzList);
        resultList.add(jckzMap);

        wdxfyhxMap.put("list",wdxfyhxlList);
        resultList.add(wdxfyhxMap);

        dlxzlMap.put("list",dlxzllList);
        resultList.add(dlxzlMap);

        ysxxMap.put("list",ysxxList);
        resultList.add(ysxxMap);

        clfaMap.put("list",clfaList);
        resultList.add(clfaMap);
        return resultList;
    }

}
