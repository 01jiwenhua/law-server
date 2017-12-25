package com.shx.law.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.shx.law.entity.BasicData;
import com.shx.law.entity.Chemicals;
import com.shx.law.entity.Law;
import com.shx.law.service.BasicDataService;
import com.shx.law.service.ChemicalsService;
import com.shx.law.service.LawService;
import com.shx.law.utils.ResultUtil;
import com.shx.law.vo.request.KnownRequest;
import com.shx.law.vo.request.LawRequest;
import com.shx.law.vo.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuan on 2017/12/24.
 */
@Controller
@RequestMapping("/chemicals")
public class ChemicalsAction {
    @Autowired
    private ChemicalsService chemicalsService;
    @Autowired
    private BasicDataService basicDataService;

    @RequestMapping("/getKnownList")
    public @ResponseBody
    Response knownlist(HttpServletRequest httpServletRequest) {
        String request = httpServletRequest.getParameter("data");
        KnownRequest knownRequest = JSON.parseObject(request, KnownRequest.class);
        PageInfo<Chemicals> pageInfo = chemicalsService.getKnownChemicals(knownRequest);
        HashMap result = new HashMap();
        String json = JSON.toJSONString(pageInfo.getList());
        result.put("chemicalsList", json);
        return ResultUtil.buidSuccess(pageInfo.getPageNum(), pageInfo.getPageSize(), result);
    }

    @RequestMapping("/getChemicalsDetails")
    public @ResponseBody
    Response ChemicalsDetails(HttpServletRequest httpServletRequest) {
        String request = httpServletRequest.getParameter("data");
        JSONObject object = JSON.parseObject(request);
        List<Map<String, Object>> list = chemicalsService.getChemicalsDetails(object.getString("id"));
        HashMap result = new HashMap();
        String json = JSON.toJSONString(list);
        result.put("chemicalsDetails", json);
        return ResultUtil.buidSuccess(result);
    }

    @RequestMapping("/getUnknowParams")
    public @ResponseBody
    Response params(HttpServletRequest httpServletRequest) {
        Map<String,Object> map=basicDataService.getAllParams();
        HashMap result = new HashMap();
        result.putAll(map);

        return ResultUtil.buidSuccess(result);
    }
}
