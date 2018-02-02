package com.shx.law.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.shx.law.entity.BasicData;
import com.shx.law.entity.Law;
import com.shx.law.service.LawService;
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

/**
 * Created by xuan on 2017/12/23.
 */
@Controller
@RequestMapping("/law")
public class LawAction {
    @Autowired
    private LawService lawService;
    @RequestMapping("/list")
    public @ResponseBody Response list(HttpServletRequest httpServletRequest) {
        String request=httpServletRequest.getParameter("data");
        LawRequest lawRequest=JSON.parseObject(request,LawRequest.class);
        PageInfo<Law> pageInfo= lawService.getLawList(lawRequest);
        HashMap result=new HashMap();
        String json = JSON.toJSONString(pageInfo.getList());
        result.put("lawList",json);
        return ResultUtil.buidSuccess(pageInfo.getPageNum(),pageInfo.getPageSize(),result);
    }
    @RequestMapping("/getLevelList")
    public @ResponseBody Response getLevelList(HttpServletRequest httpServletRequest) {
        String request=httpServletRequest.getParameter("data");
        JSONObject jsonObject=JSON.parseObject(request);
        String lawType=jsonObject.getString("typeCode");
        List<BasicData> levelList= lawService.getLawLevel(lawType);
        HashMap result=new HashMap();
        String json = JSON.toJSONString(levelList);
        result.put("levelList",json);
        return ResultUtil.buidSuccess(result);
    }
}
