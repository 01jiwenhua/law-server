package com.shx.law.service.impl;

import com.shx.law.entity.Distance;
import com.shx.law.entity.DistanceExample;
import com.shx.law.entity.StructureExample;
import com.shx.law.mapper.DistanceMapper;
import com.shx.law.mapper.StructureMapper;
import com.shx.law.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 防火间距
 *
 * @author zmh
 * @create 2018-02-03 13:53
 **/
@Service("distanceService")
public class DistanceServiceImpl implements DistanceService {

    @Autowired
    private StructureMapper structureMapper;
    @Autowired
    private DistanceMapper distanceMapper;

    private static final Map<String, String> structureMap;

    static {
        structureMap = new HashMap<String, String>();
        //一级分类
        structureMap.put("站址选择", "class_level-one");
        structureMap.put("站内平面布置", "class_level-one");
        //二级分类
        structureMap.put("站内设备", "class_level-two");
        structureMap.put("站外建（构）筑物", "class_level-twoe");
        structureMap.put("站内设施", "class_level-two");
    }

    //一级分类
    private static final String CLASS_LEVEL_ONE = "class_level_one";
    //二级分类
    private static final String CLASS_LEVEL_TWO = "class_level_two";
    //三级父建筑物名称
    private static final String PRE_NAME_LEVEL_THREE = "pre_name_level_three";
    //二级父建筑物名称
    private static final String PRE_NAME_LEVEL_TWO = "pre_name_level_two";
    //一级父建筑物名称
    private static final String PRE_NAME_LEVEL_ONE = "pre_name_level_one";

    /**
     * 选择建筑物
     *
     * @param type
     * @return
     */
    public List<Map<String, Object>> getStructure(String type, String name) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        if (CLASS_LEVEL_ONE.equals(type)) {
            result = structureMapper.selectByClassLevelOne(name);
        }
        if (CLASS_LEVEL_TWO.equals(type)) {
            result = structureMapper.selectByClassLevelTwo(name);
        }
        if (PRE_NAME_LEVEL_THREE.equals(type)) {
            result = structureMapper.selectByPreNameLevelThree(name);
        }
        if (PRE_NAME_LEVEL_TWO.equals(type)) {
            result = structureMapper.selectByPreNameLevelTwo(name);
        }
        if (PRE_NAME_LEVEL_ONE.equals(type)) {
            result = structureMapper.selectByPreNameLevelOne(name);
        }

        return result;
    }

    /**
     * 获取安全距离
     *
     * @param deviceInId
     * @param structureOutId
     * @return
     */
    public Distance getDistance(Integer deviceInId, Integer structureOutId) {
        DistanceExample distanceExample = new DistanceExample();
        distanceExample.createCriteria().andDeviceInIdEqualTo(deviceInId).andStructureOutIdEqualTo(structureOutId);
        List<Distance> distanceList = distanceMapper.selectByExample(distanceExample);
        if (!CollectionUtils.isEmpty(distanceList)) {
            return distanceList.get(0);
        }
        return null;
    }

    /**
     * 模糊查询类型列表
     *
     * @param deviceInName
     * @param structureOutName
     * @return
     */
    public List<Map<String, Object>> getFuzzySearchTypeList(String deviceInName, String structureOutName) {
        return distanceMapper.selectDistanceByFuzzy(deviceInName, structureOutName);
    }

    /**
     * 模糊查询详情列表
     *
     * @param deviceInName
     * @param structureOutName
     * @return
     */
    public List<Map<String, Object>> getFuzzySearchDetailList(String deviceInName, String structureOutName, String type) {
        return distanceMapper.selectDistanceByType(deviceInName, structureOutName, type);
    }
}
