package com.shx.law.service;

import java.util.List;
import java.util.Map;

/**
 * ϵͳ���
 *
 * @author zmh
 * @create 2018-02-07 15:24
 **/
public interface SystemService {
    /**
     * ��ȡ�����б�
     *
     * @param parentCode
     * @return
     */
    List<Map<String, Object>> getRegionList(String parentCode);
}


