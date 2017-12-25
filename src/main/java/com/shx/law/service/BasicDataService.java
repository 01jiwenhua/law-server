package com.shx.law.service;

import java.util.Map;

/**
 * Created by xuan on 2017/12/25.
 */
public interface BasicDataService {
    Map<String, Object> getAllParams();
    void getParamsDetails(String code);
}
