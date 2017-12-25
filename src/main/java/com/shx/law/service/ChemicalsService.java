package com.shx.law.service;

import com.github.pagehelper.PageInfo;
import com.shx.law.entity.Chemicals;
import com.shx.law.entity.Law;
import com.shx.law.vo.request.KnownRequest;

import java.util.List;
import java.util.Map;

/**
 * Created by xuan on 2017/12/24.
 */
public interface ChemicalsService {
    PageInfo<Chemicals> getKnownChemicals(KnownRequest request);
    PageInfo<Chemicals> getUnKnownChemicals();
    List<Map<String,Object>> getChemicalsDetails(String id);
}
