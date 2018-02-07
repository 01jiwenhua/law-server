package com.shx.law.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shx.law.entity.Architecture;
import com.shx.law.entity.Distance;
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
     * 获取城市列表
     *
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getRegion")
    public @ResponseBody
    Response getRegion(HttpServletRequest httpServletRequest) {
        String request = httpServletRequest.getParameter("data");
        JSONObject requestJson = JSON.parseObject(request);
        String parentCode = requestJson.getString("parentCode");
        List<Map<String, Object>> regionList = systemService.getRegionList(parentCode);
        HashMap result = new HashMap();
        String json = JSON.toJSONString(regionList);
        result.put("region", json);
        return ResultUtil.buidSuccess(result);
    }


}
