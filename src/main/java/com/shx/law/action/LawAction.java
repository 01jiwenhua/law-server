package com.shx.law.action;

import com.github.pagehelper.PageInfo;
import com.shx.law.entity.Law;
import com.shx.law.service.LawService;
import com.shx.law.utils.ResultUtil;
import com.shx.law.vo.request.LawRequest;
import com.shx.law.vo.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public @ResponseBody Response list() {
        LawRequest lawRequest=new LawRequest();
//        lawRequest.setName("交通");
        lawRequest.setPage(1);
        lawRequest.setPageSize(10);
        PageInfo<Law> pageInfo= lawService.getLawList(lawRequest);
        HashMap result=new HashMap();
        result.put("lawList",pageInfo.getList());
        return ResultUtil.buidSuccess(pageInfo.getPageNum(),pageInfo.getPageSize(),result);


    }
}
