package com.shx.law.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shx.law.Exception.SystemException;
import com.shx.law.entity.*;
import com.shx.law.service.MessageService;
import com.shx.law.service.UserService;
import com.shx.law.utils.ResultUtil;
import com.shx.law.vo.request.UserRequest;
import com.shx.law.vo.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;
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

    /**
     * 验证用户是否已注册以及验证码是否正确
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/checkRegist")
    public @ResponseBody Response checkRegist(HttpServletRequest httpServletRequest) {
        try {
            String request=httpServletRequest.getParameter("data");
            JSONObject requestObject=JSON.parseObject(request);
            String phone=requestObject.getString("phone");
            String verifyCode=requestObject.getString("verifyCode");
            userService.checkRegist(phone,verifyCode);
            HashMap result=new HashMap();
            return ResultUtil.buidSuccess(result);
        } catch (SystemException e) {
            e.printStackTrace();
            return ResultUtil.buidFail(e.getMessage(),e.getCode());
        }

    }

    @RequestMapping("/regist")
    public @ResponseBody Response list(HttpServletRequest httpServletRequest) {
        try {
            String request=httpServletRequest.getParameter("data");
            UserRequest userRequest=JSON.parseObject(request,UserRequest.class);
            userService.regist(userRequest);
            HashMap result=new HashMap();
            return ResultUtil.buidSuccess(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.buidFail(e.getMessage(),"10010");
        }
    }
    /**
     * 登录
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/login")
    public @ResponseBody Response login(HttpServletRequest httpServletRequest) {
        try {
            String request=httpServletRequest.getParameter("data");
            JSONObject requestObject=JSON.parseObject(request);
            String phone=requestObject.getString("phone");
            String verifyCode=requestObject.getString("verifyCode");
            Map userInfo=userService.login(phone,verifyCode);
            HashMap result=new HashMap();
            String json = JSON.toJSONString(userInfo);
            result.put("userInfo",json);
            return ResultUtil.buidSuccess(result);
        } catch (SystemException e) {
            e.printStackTrace();
            return ResultUtil.buidFail(e.getMessage(),e.getCode());
        }

    }

    /**
     * 获取用户信息
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getUserInfo")
    public @ResponseBody Response getUserInfo(HttpServletRequest httpServletRequest) {
        try {
            String request=httpServletRequest.getParameter("data");
            JSONObject requestObject=JSON.parseObject(request);
            Integer userId=requestObject.getInteger("userId");

            Map userInfo=userService.getUserInfo(userId);
            HashMap result=new HashMap();
            String json = JSON.toJSONString(userInfo);
            result.put("userInfo",json);
            return ResultUtil.buidSuccess(result);
        } catch (SystemException e) {
            e.printStackTrace();
            return ResultUtil.buidFail(e.getMessage(),e.getCode());
        }

    }


    /**
     * 获取消息列表
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getMessage")
    public @ResponseBody Response getMessage(HttpServletRequest httpServletRequest) {
        try {
            String request=httpServletRequest.getParameter("data");
            JSONObject requestObject=JSON.parseObject(request);
            String type=requestObject.getString("type");

            List<Message> messageList=messageService.getMessage(type);
            HashMap result=new HashMap();
            String json = JSON.toJSONString(messageList);
            result.put("messageList",json);
            return ResultUtil.buidSuccess(result);
        } catch (SystemException e) {
            e.printStackTrace();
            return ResultUtil.buidFail(e.getMessage(),e.getCode());
        }

    }
    /**
     * 获取
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/getNewVersion")
    public @ResponseBody Response getNewVersion(HttpServletRequest httpServletRequest) {
        try {
            String request=httpServletRequest.getParameter("data");
            JSONObject requestObject=JSON.parseObject(request);
            String code=requestObject.getString("versionCode");

            VersionManager versionManager=userService.getNewVersion(code);
            if(versionManager==null){
                return ResultUtil.buidFail("当前已经是最新版本","10005");
            }
            HashMap result=new HashMap();
            String json = JSON.toJSONString(versionManager);
            result.put("versionInfo",json);
            return ResultUtil.buidSuccess(result);
        } catch (SystemException e) {
            e.printStackTrace();
            return ResultUtil.buidFail(e.getMessage(),e.getCode());
        }

    }
}
