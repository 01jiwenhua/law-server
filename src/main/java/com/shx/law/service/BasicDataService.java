package com.shx.law.service;

import com.shx.law.entity.BasicData;

import java.util.List;
import java.util.Map;

/**
 * Created by xuan on 2017/12/25.
 */
public interface BasicDataService {
    Map<String, Object> getAllParams();
    List<BasicData> getParamsDetails(String code);
}
