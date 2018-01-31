package com.shx.law.Exception;

import java.util.HashMap;

public class ExceptionManager extends HashMap{
    public ExceptionManager(){
        this.put("10011","该用户尚未注册");
        this.put("10012","验证码错误");
        this.put("10013","短信服务商异常");
        this.put("10014","该用户已注册请直接登录");
    }
}
