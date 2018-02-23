package com.shx.law.service;

import com.shx.law.entity.Architecture;
import com.shx.law.entity.Distance;
import com.shx.law.vo.request.ArchitectureRequest;

import java.util.List;
import java.util.Map;

/**
 * 防火间距
 *
 * @author zmh
 * @create 2018-02-03 13:52
 **/
public interface DistanceService {

    /**
     * 获取建筑物
     *
     * @param architectureRequest
     * @return
     */
    List<Architecture> getArchitecture(ArchitectureRequest architectureRequest);

    /**
     * 获取带下级列表的数据
     * @param architectureRequest
     * @return
     */
    List<Map<String,Object>> getArchitectureByParentCode(ArchitectureRequest architectureRequest);
    /**
     * 查询安全距离
     *
     * @param deviceInId
     * @param structureOutId
     * @return
     */
    Map<String,Object> getDistance(Integer deviceInId, Integer structureOutId);

    /**
     * 模糊查询类型列表
     *
     * @param deviceInName
     * @param structureOutName
     * @return
     */
    List<Map<String, Object>> getFuzzySearchTypeList(String deviceInName, String structureOutName);

    /**
     * 模糊查询详情列表
     *
     * @param deviceInName
     * @param structureOutName
     * @param type
     * @return
     */
    List<Map<String, Object>> getFuzzySearchDetailList(String deviceInName, String structureOutName, String type);
}
