package com.shx.law.service;

import com.shx.law.Exception.SystemException;
import com.shx.law.entity.Company;
import com.shx.law.entity.Department;
import com.shx.law.entity.Job;
import com.shx.law.entity.VersionManager;
import com.shx.law.vo.request.UserRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 获取公司列表
     *
     * @return
     */
    List<Company> getCompanyList();

    /**
     * 获取部门列表
     *
     * @param companyId
     * @return
     */
    List<Department> getDepartmentList(String companyId);

    /**
     * 获取职位列表
     *
     * @return
     */
    List<Job> getJobList();

    /**
     * 登录
     *
     * @param phone
     * @param verifyCode
     */
    Map login(String phone, String verifyCode) throws SystemException;

    /**
     * 注册
     *
     * @param userRequest
     */
    void regist(UserRequest userRequest);

    /**
     * 获取验证码
     *
     * @param phone
     */
    void getVerifyCode(String phone);

    /**
     * 验证注册验证码是否正确
     *
     * @param phone
     * @param verifyCode
     */
    void checkRegist(String phone, String verifyCode) throws SystemException;

    /**
     * 获取用户信息
     *
     * @param userId
     * @return
     */
    Map getUserInfo(Integer userId);

    VersionManager getNewVersion(String versionCode);

    /**
     * 更换手机号
     *
     * @param phone
     * @param verifyCode
     */
    void changePhone(String phone, String verifyCode);

    /**
     * 上传头像
     * @param userId
     * @param request
     * @return
     */
    String uploadAvatar(Integer userId, HttpServletRequest request);
}
