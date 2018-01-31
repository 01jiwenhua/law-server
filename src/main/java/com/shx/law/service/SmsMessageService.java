package com.shx.law.service;

import com.shx.law.Exception.SystemException;

public interface SmsMessageService {
    /**
     * 发送短信验证码适用于所有验证码发送，只需配置不同的模板和签名就可以
     *
     * @param phone
     *            手机号
     * @param sign_name
     *            签名
     * @param template_code
     *            模板号
     * @param product
     *            产品名称
     */
    public void sendAuthCode(String phone, String sign_name, String template_code, String product) throws SystemException;
    void checkVerifyCode(String phone, String verifycode) throws SystemException;
}
