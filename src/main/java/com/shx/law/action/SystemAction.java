package com.shx.law.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shx.law.entity.Architecture;
import com.shx.law.entity.Distance;
import com.shx.law.entity.Region;
import com.shx.law.service.DistanceService;
import com.shx.law.service.SystemService;
import com.shx.law.utils.ResultUtil;
import com.shx.law.vo.request.ArchitectureRequest;
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
 * 系统相关
 *
 * @author zmh
 * @create 2018-02-03 13:40
 **/
@Controller
@RequestMapping("/system")
public class SystemAction {
    @Autowired
    private SystemService systemService;

    /**
     * 保存意见建议
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/saveAdvice")
    public @ResponseBody
    Response saveAdvice(HttpServletRequest httpServletRequest) {
        String request = httpServletRequest.getParameter("data");
        JSONObject requestJson = JSON.parseObject(request);
        String content = requestJson.getString("content");
        Integer userId = requestJson.getInteger("userId");
        systemService.saveAdvice(userId, content);
        HashMap result=new HashMap();
        return ResultUtil.buidSuccess(result);
    }

    /**
     * 城市列表
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getRegionList")
    public @ResponseBody
    Response getRegionList(HttpServletRequest httpServletRequest) {
        String request = httpServletRequest.getParameter("data");
        JSONObject requestJson = JSON.parseObject(request);
        String parentCode = requestJson.getString("parentCode");
        List<Region> resultList = systemService.getRegionList(parentCode);
        HashMap result = new HashMap();
        String json = JSON.toJSONString(resultList);
        result.put("regiion", json);
        return ResultUtil.buidSuccess(result);
    }
}
