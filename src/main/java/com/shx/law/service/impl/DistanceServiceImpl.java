package com.shx.law.service.impl;

import com.shx.law.entity.Architecture;
import com.shx.law.entity.ArchitectureExample;
import com.shx.law.entity.Distance;
import com.shx.law.entity.DistanceExample;
import com.shx.law.mapper.ArchitectureMapper;
import com.shx.law.mapper.DistanceMapper;
import com.shx.law.mapper.StructureMapper;
import com.shx.law.service.DistanceService;
import com.shx.law.vo.request.ArchitectureRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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

//    @Autowired
//    private StructureMapper structureMapper;
    @Autowired
    private DistanceMapper distanceMapper;
    @Autowired
    private ArchitectureMapper architectureMapper;

    public List<Architecture> getArchitecture(ArchitectureRequest architectureRequest) {
        ArchitectureExample architectureExample = new ArchitectureExample();
        ArchitectureExample.Criteria criteria = architectureExample.createCriteria();
        String architectureName = architectureRequest.getName();
        if (StringUtils.isNoneBlank(architectureName)) {
            criteria.andNameEqualTo(architectureName).andParentCodeEqualTo("0");
            List<Architecture> architectureList = architectureMapper.selectByExample(architectureExample);
            String parentCode = architectureList.get(0).getCode();
            architectureExample.clear();
            criteria = architectureExample.createCriteria();
            criteria.andParentCodeEqualTo(parentCode);
        }
        String architectureStandard = architectureRequest.getStandard();
        if (StringUtils.isNoneBlank(architectureStandard)) {
            criteria.andStandardEqualTo(architectureStandard);
        }
        String architectureParentCode = architectureRequest.getParentCode();
        if (StringUtils.isNotBlank(architectureParentCode)) {
            criteria.andParentCodeEqualTo(architectureParentCode);
        }
        List<Architecture> architectureList = architectureMapper.selectByExample(architectureExample);
        return architectureList;
//        return architectureMapper.selectByRequest(architectureRequest);
    }

    /**
     * /**
     * 获取安全距离
     *
     * @param deviceInId
     * @param structureOutId
     * @return
     */
    public Map<String,Object> getDistance(Integer deviceInId, Integer structureOutId) {
//        DistanceExample distanceExample = new DistanceExample();
//        distanceExample.createCriteria().andDeviceInIdEqualTo(deviceInId).andStructureOutIdEqualTo(structureOutId);
//        distanceExample.or().andDeviceInIdEqualTo(structureOutId).andStructureOutIdEqualTo(deviceInId);
//        List<Distance> distanceList = distanceMapper.selectByExample(distanceExample);
//        if (!CollectionUtils.isEmpty(distanceList)) {
//            return distanceList.get(0);
//        }
//        return null;
        return distanceMapper.selectDistance(String.valueOf(structureOutId),String.valueOf(deviceInId));
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
