package com.shx.law.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.shx.law.entity.Distance;
import com.shx.law.entity.Law;
import com.shx.law.service.DistanceService;
import com.shx.law.utils.ResultUtil;
import com.shx.law.vo.request.LawRequest;
import com.shx.law.vo.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 防火间距
 *
 * @author zmh
 * @create 2018-02-03 13:40
 **/
@Controller
@RequestMapping("/distance")
public class DistanceAction {
    @Autowired
    private DistanceService distanceService;

    /**
     * 获取建筑物名称
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getStructure")
    public @ResponseBody
    Response getStructure(HttpServletRequest httpServletRequest) {
        String request = httpServletRequest.getParameter("data");
        JSONObject requestJson = JSON.parseObject(request);
        String type = requestJson.getString("type");
        String name = requestJson.getString("name");
        List<Map<String, Object>> resultList = distanceService.getStructure(type, name);
        HashMap result = new HashMap();
        String json = JSON.toJSONString(resultList);
        result.put("structure", json);
        return ResultUtil.buidSuccess(result);
    }

    /**
     * 获取安全距离
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getDistance")
    public @ResponseBody
    Response getDistance(HttpServletRequest httpServletRequest) {
        String request = httpServletRequest.getParameter("data");
        JSONObject requestJson = JSON.parseObject(request);
        Integer deviceInId = requestJson.getInteger("deviceInId");
        Integer structureOutId = requestJson.getInteger("structureOutId");
        Distance distance = distanceService.getDistance(deviceInId, structureOutId);
        HashMap result = new HashMap();
        String json = JSON.toJSONString(distance);
        result.put("distance", json);
        return ResultUtil.buidSuccess(result);
    }

    /**
     * 模糊查询类型列表
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/fuzzySearchTypeList")
    public @ResponseBody
    Response fuzzySearchTypeList(HttpServletRequest httpServletRequest) {
        String request = httpServletRequest.getParameter("data");
        JSONObject requestJson = JSON.parseObject(request);
        String deviceInName = requestJson.getString("deviceInName");
        String structureOutName = requestJson.getString("structureOutName");
        List<Map<String, Object>> typeList = distanceService.getFuzzySearchTypeList(deviceInName, structureOutName);
        Map result = new HashMap();
        String json = JSON.toJSONString(typeList);
        result.put("typeList", json);
        return ResultUtil.buidSuccess(result);
    }

    /**
     * 模糊查询详情列表
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/fuzzySearchDetailList")
    public @ResponseBody
    Response fuzzySearchDetailList(HttpServletRequest httpServletRequest) {
        String request = httpServletRequest.getParameter("data");
        JSONObject requestJson = JSON.parseObject(request);
        String deviceInName = requestJson.getString("deviceInName");
        String structureOutName = requestJson.getString("structureOutName");
        String type = requestJson.getString("type");
        List<Map<String, Object>> typeList = distanceService.getFuzzySearchDetailList(deviceInName, structureOutName, type);
        Map result = new HashMap();
        String json = JSON.toJSONString(typeList);
        result.put("DetailList", json);
        return ResultUtil.buidSuccess(result);
    }
}
