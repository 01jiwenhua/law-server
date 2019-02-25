package com.shx.law.service.impl;

import com.shx.law.Exception.SystemException;
import com.shx.law.entity.*;
import com.shx.law.mapper.*;
import com.shx.law.service.SmsMessageService;
import com.shx.law.service.UserService;
import com.shx.law.utils.ImageUtil;
import com.shx.law.vo.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private VersionManagerMapper versionManagerMapper;
    @Override
    public List<Company> getCompanyList() {
        CompanyExample example = new CompanyExample();
        CompanyExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(1);
        List<Company> companyList = companyMapper.selectByExample(example);
        return companyList;
    }
    @Override
    public List<Department> getDepartmentList(String companyId) {
        DepartmentExample example = new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(Integer.valueOf(companyId));
        criteria.andStatusEqualTo(1);
        List<Department> departMentList = departmentMapper.selectByExample(example);
        return departMentList;
    }
    @Override
    public List<Job> getJobList() {
        JobExample jobExample = new JobExample();
        JobExample.Criteria criteria = jobExample.createCriteria();
        criteria.andStatusEqualTo(1);
        List<Job> jobList = jobMapper.selectByExample(jobExample);
        return jobList;
    }
    @Override
    public Map login(String phone, String verifyCode) throws SystemException {
        try {
            //验证码校验,15901237919为苹果测试账号，不在校验
            if(!phone.equals("15901237919")){
                smsMessageService.checkVerifyCode(phone, verifyCode);
            }

            //验证用户是否存在
            User user = checkUser(phone);
            if (user == null) {
                throw new SystemException("该用户尚未注册", "10011");
            }
            return getUserInfo(user.getId());
        } catch (SystemException e) {
            e.printStackTrace();
            throw e;
        }
    }
    private User checkUser(String phone) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andPhoneEqualTo(phone);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList == null || userList.size() <= 0) {
            return null;
        }
        return userList.get(0);
    }
    @Override
    public void regist(UserRequest userRequest) {
        String phone = userRequest.getPhone();
        User oldUser = checkUser(phone);
        boolean isInsert = null == oldUser;
        User newUser = new User();
        newUser.setLoginName(userRequest.getLoginName());
        newUser.setNickName(userRequest.getNickName() == null ? userRequest.getNickName() : userRequest.getRealName());
        newUser.setRealName(userRequest.getRealName());
        newUser.setDepartmentId(Integer.valueOf(userRequest.getDepartmentId()));
        newUser.setRegionId(Integer.valueOf(userRequest.getRegionId()));
        newUser.setUpdateTime(new Date());
        newUser.setEmail(userRequest.getEmail());
        newUser.setIdNo(userRequest.getIdNo());
        newUser.setJobId(Integer.valueOf(userRequest.getJobId()));
        newUser.setSex(Integer.valueOf(userRequest.getSex()));
        newUser.setUserType(userRequest.getUserType());
        newUser.setLicenseType(Integer.valueOf(userRequest.getLicenseType()));
        if (isInsert) {
            newUser.setPhone(phone);
            newUser.setLoginPassword("123456");
            newUser.setCreateUser(1);
            newUser.setUpdateUser(1);
            newUser.setStatus(0);
            newUser.setCreateTime(new Date());
            userMapper.insertSelective(newUser);
        } else {
            newUser.setId(oldUser.getId());
            userMapper.updateByPrimaryKeySelective(newUser);
        }
    }
    @Override
    public void getVerifyCode(String phone) {
        smsMessageService.sendAuthCode(phone, "安全检查智能查询系统", "SMS_123799105", "危化监管综合查询系统");
    }
    @Override
    public void checkRegist(String phone, String verifyCode) {
        User user = checkUser(phone);
        if (user != null) {
            throw new SystemException("该用户已注册请直接登录", "10014");
        }
        smsMessageService.checkVerifyCode(phone, verifyCode);
    }
    @Override
    public Map getUserInfo(Integer userId) {
        //返回用户信息
        Map userInfo = userMapper.selectUserInfo(userId);
        return userInfo;
    }
    @Override
    public VersionManager getNewVersion(String versionCode) {
        VersionManagerExample example = new VersionManagerExample();
        VersionManagerExample.Criteria criteria = example.createCriteria();
        List<VersionManager> versionManagers = versionManagerMapper.selectByExample(example);
        if (versionManagers.size() <= 0) {
            return null;
        }
        VersionManager versionManager = versionManagers.get(versionManagers.size() - 1);
        if (versionManager.getVersionCode() > Integer.valueOf(versionCode)) {
            return versionManager;
        } else {
            return null;
        }
    }

    /**
     * 更换手机号
     *
     * @param phone
     * @param verifyCode
     * @throws SystemException
     */
    @Override
    public void changePhone(String userId, String phone, String verifyCode)  throws SystemException {
        smsMessageService.checkVerifyCode(phone, verifyCode);
        User user = checkUser(phone);
        if (user != null) {
            throw new SystemException("该手机号不可用", "10015");
        }
        User newUser=userMapper.selectByPrimaryKey(Integer.valueOf(userId));
        newUser.setPhone(phone);
        userMapper.updateByPrimaryKeySelective(newUser);
    }

    @Override
    public void uploadAppId(String userId, String appId) {
        User user=userMapper.selectByPrimaryKey(Integer.valueOf(userId));
        if(user==null){
            return;
        }
        user.setAppId(appId);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public String uploadAvatar(Integer userId, HttpServletRequest request) {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile multipartFile = multipartRequest.getFile("avatar");
        String avatarPath = ImageUtil.GenerateImage(multipartFile, request ,String.valueOf(userId));

//        UserExample userExample = new UserExample();
//        userExample.createCriteria().andIdEqualTo(userId);
        User user = userMapper.selectByPrimaryKey(userId);
        user.setHeadIcon(avatarPath);
        userMapper.updateByPrimaryKeySelective(user);
        return avatarPath;
    }
}
