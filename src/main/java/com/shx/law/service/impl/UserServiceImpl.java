package com.shx.law.service.impl;

import com.shx.law.Exception.SystemException;
import com.shx.law.entity.*;
import com.shx.law.mapper.CompanyMapper;
import com.shx.law.mapper.DepartmentMapper;
import com.shx.law.mapper.JobMapper;
import com.shx.law.mapper.UserMapper;
import com.shx.law.service.SmsMessageService;
import com.shx.law.service.UserService;
import com.shx.law.vo.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private JobMapper jobMapper;
    @Autowired
    private SmsMessageService smsMessageService;

    public List<Company> getCompanyList() {
        CompanyExample example = new CompanyExample();
        CompanyExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        List<Company> companyList = companyMapper.selectByExample(example);
        return companyList;
    }

    public List<Department> getDepartmentList(String companyId) {
        DepartmentExample example = new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(Integer.valueOf(companyId));
        criteria.andStatusEqualTo(1);
        List<Department> departMentList = departmentMapper.selectByExample(example);
        return departMentList;
    }

    public List<Job> getJobList() {
        JobExample jobExample = new JobExample();
        JobExample.Criteria criteria = jobExample.createCriteria();
        criteria.andStatusEqualTo(1);
        List<Job> jobList = jobMapper.selectByExample(jobExample);
        return jobList;
    }

    public void login(String phone, String verifyCode) {
        //验证码校验
        smsMessageService.checkVerifyCode(phone,verifyCode);
        //验证用户是否存在
        User user=checkUser(phone);
        if(user==null){
            throw new SystemException("该用户尚未注册","10011");
        }
        //返回用户信息


    }

    private User checkUser(String phone) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andLoginNameEqualTo(phone);
        List<User> userList = userMapper.selectByExample(userExample);
        if(userList==null||userList.size()<=0){
            return null;
        }
        return userList.get(0);
    }

    public void regist(UserRequest userRequest) {
        User newUser=new User();
        newUser.setLoginName(userRequest.getLoginName());
        newUser.setLoginPassword("123456");
        newUser.setNickName(userRequest.getNickName()==null?userRequest.getNickName():userRequest.getRealName());
        newUser.setRealName(userRequest.getRealName());
        newUser.setDepartmentId(Integer.valueOf(userRequest.getDepartmentId()));
        newUser.setRegionId(Integer.valueOf(userRequest.getRegionId()));
        newUser.setUpdateTime(new Date());
        newUser.setCreateTime(new Date());
        newUser.setCreateUser(1);
        newUser.setUpdateUser(1);
        newUser.setStatus(0);
        newUser.setEmail(userRequest.getEmail());
        newUser.setIdNo(userRequest.getIdNo());
        newUser.setJobId(Integer.valueOf(userRequest.getJobId()));
        newUser.setPhone(userRequest.getPhone());
        newUser.setSex(Integer.valueOf(userRequest.getSex()));
        newUser.setUserType(userRequest.getUserType());
        userMapper.insertSelective(newUser);
    }

    public void getVerifyCode(String phone) {
        smsMessageService.sendAuthCode(phone, "中车互联运力", "SMS_16580048",
                "互联运力派商城");
    }

    public void checkRegist(String phone, String verifyCode) {
        User user=checkUser(phone);
        if(user!=null){
            throw new SystemException("该用户已注册请直接登录","10014");
        }
        smsMessageService.checkVerifyCode(phone,verifyCode);
    }

}
