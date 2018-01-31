package com.shx.law.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.shx.law.entity.*;
import com.shx.law.service.UserService;
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

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;

    /**
     * 获取公司列表
     * @return
     */
    @RequestMapping("/getCompanyList")
    public @ResponseBody
    Response getCompanyList() {
        List<Company> companyList= userService.getCompanyList();
        HashMap result=new HashMap();
        String json = JSON.toJSONString(companyList);
        result.put("companyList",json);
        return ResultUtil.buidSuccess(result);
    }

    /**
     * 获取部门列表
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getDepartmentList")
    public @ResponseBody Response getDepartmentList(HttpServletRequest httpServletRequest) {
        String request=httpServletRequest.getParameter("data");
        JSONObject requestObject=JSON.parseObject(request);
        String companyId=requestObject.getString("companyId");
        List<Department> departMentList= userService.getDepartmentList(companyId);
        HashMap result=new HashMap();
        String json = JSON.toJSONString(departMentList);
        result.put("departmentList",json);
        return ResultUtil.buidSuccess(result);
    }

    /**
     * 获取职位列表
     * @return
     */
    @RequestMapping("/getJobList")
    public @ResponseBody
    Response getJobList() {
        List<Job> jobList= userService.getJobList();
        HashMap result=new HashMap();
        String json = JSON.toJSONString(jobList);
        result.put("jobList",json);
        return ResultUtil.buidSuccess(result);
    }

    /**
     * 获取验证码
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getVerifyCode")
    public @ResponseBody Response getVerifyCode(HttpServletRequest httpServletRequest) {
        String request=httpServletRequest.getParameter("data");
        JSONObject requestObject=JSON.parseObject(request);
        String phone=requestObject.getString("phone");
        userService.getVerifyCode(phone);
        HashMap result=new HashMap();
        return ResultUtil.buidSuccess(result);
    }
}
