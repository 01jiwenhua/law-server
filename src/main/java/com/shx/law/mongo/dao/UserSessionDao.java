package com.shx.law.mongo.dao;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;


public interface UserSessionDao {


	/**
	 * 根据手机号查询最新的验证码
	 * @param phone
	 * @return
	 */
	String getVerifyCode(String phone);

}
