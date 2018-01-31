package com.shx.law.service;

import com.github.pagehelper.PageInfo;
import com.shx.law.entity.Company;
import com.shx.law.entity.Department;
import com.shx.law.entity.Job;
import com.shx.law.entity.Law;
import com.shx.law.vo.request.LawRequest;
import com.shx.law.vo.request.UserRequest;

import java.util.List;

public interface UserService {
    /**
     * 获取公司列表
     * @return
     */
     List<Company> getCompanyList();

    /**
     * 获取部门列表
     * @param companyId
     * @return
     */
     List<Department> getDepartmentList(String companyId);

    /**
     * 获取职位列表
     * @return
     */
     List<Job> getJobList();

    /**
     * 登录
     * @param phone
     * @param verifyCode
     */
     void login(String phone,String verifyCode);

    /**
     * 注册
     * @param userRequest
     */
     void regist(UserRequest userRequest);

    /**
     * 获取验证码
     * @param phone
     */
     void getVerifyCode(String phone);

}
