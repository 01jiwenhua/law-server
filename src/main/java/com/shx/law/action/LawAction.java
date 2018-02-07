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
import java.util.Map;

/**
 * Created by xuan on 2017/12/23.
 */
@Controller
@RequestMapping("/law")
public class LawAction {
    @Autowired
    private LawService lawService;

    /**
     * 法律法规等三个功能获取列表（搜索功能也是这个接口）
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/list")
    public @ResponseBody Response list(HttpServletRequest httpServletRequest) {
        String request=httpServletRequest.getParameter("data");
        LawRequest lawRequest=JSON.parseObject(request,LawRequest.class);
        PageInfo<Map<String, Object>> pageInfo= lawService.getLawList(lawRequest);
        HashMap result=new HashMap();
        String json = JSON.toJSONString(pageInfo.getList());
        result.put("lawList",json);
        return ResultUtil.buidSuccess(pageInfo.getPageNum(),pageInfo.getPageSize(),result);
    }

    /**
     * 获取法律法规级别列表
     * @param httpServletRequest
     * @return
     */
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

    /**
     * 添加到收藏
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/addFavorite")
    public @ResponseBody Response addFavorite(HttpServletRequest httpServletRequest) {
        String request=httpServletRequest.getParameter("data");
        JSONObject jsonObject=JSON.parseObject(request);
        String lawType=jsonObject.getString("typeCode");
        String lawId=jsonObject.getString("lawId");
        String userId=jsonObject.getString("userId");
        lawService.addFavorite(lawType,lawId,userId);
        HashMap result=new HashMap();
        return ResultUtil.buidSuccess(result);
    }

    /**
     * 取消收藏
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/cancelFavorite")
    public @ResponseBody Response cancelFavorite(HttpServletRequest httpServletRequest) {
        String request=httpServletRequest.getParameter("data");
        JSONObject jsonObject=JSON.parseObject(request);
        String lawType=jsonObject.getString("typeCode");
        String lawId=jsonObject.getString("lawId");
        String userId=jsonObject.getString("userId");
        lawService.cancelFavorite(lawType,lawId,userId);
        HashMap result=new HashMap();
        return ResultUtil.buidSuccess(result);
    }

    /**
     * 获取收藏列表
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getFavoriteList")
    public @ResponseBody Response getFavoriteList(HttpServletRequest httpServletRequest) {
        String request=httpServletRequest.getParameter("data");
        JSONObject jsonObject=JSON.parseObject(request);
        String typeCode=jsonObject.getString("typeCode");
        String userId=jsonObject.getString("userId");
        List<Law> lawList = lawService.getFavoriteList(typeCode,userId);
        HashMap result=new HashMap();
        String json = JSON.toJSONString(lawList);
        result.put("favoriteList",json);
        return ResultUtil.buidSuccess(result);

    }

    /**
     * 获取最近查询列表
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getNewLawList")
    public @ResponseBody Response getNewLawList(HttpServletRequest httpServletRequest) {
        String request=httpServletRequest.getParameter("data");
        JSONObject jsonObject=JSON.parseObject(request);
        String userId=jsonObject.getString("userId");
        List<Law> lawList = lawService.getNewLawList(userId);
        HashMap result=new HashMap();
        String json = JSON.toJSONString(lawList);
        result.put("newList",json);
        return ResultUtil.buidSuccess(result);

    }

}
