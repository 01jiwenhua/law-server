package com.shx.law.service.impl;

import com.shx.law.Exception.SystemException;
import com.shx.law.mongo.dao.UserSessionDao;
import com.shx.law.mongo.entity.AuthCode;
import com.shx.law.service.SMSService;
import com.shx.law.service.SmsMessageService;
import com.taobao.api.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.Index;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service("smsMessageService")
public class SmsMessageServiceImpl implements SmsMessageService {
	private static final int CODE_EXP = 100;
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private UserSessionDao userSessionDao;
	public void sendAuthCode(String phone, String sign_name, String template_code, String product) throws SystemException {
		SMSService smsService = new SMSService();
		String smsCode = getPhoneCode();
		try {
			smsService.sendSMS(phone, sign_name, template_code, phone, smsCode, product);
		} catch (ApiException e) {
			throw new SystemException("短信服务商异常", "10013");
		}
		AuthCode authCode = new AuthCode();
		authCode.setPhone(phone);
		authCode.setAuthCode(smsCode);
		authCode.setCreateDate(new Date());
		if (!mongoTemplate.collectionExists(AuthCode.class)) {
			mongoTemplate.createCollection(AuthCode.class);
			mongoTemplate.indexOps(AuthCode.class).ensureIndex(new Index().on("createDate", Sort.Direction.DESC).expire(CODE_EXP));
		}
		mongoTemplate.save(authCode);
	}

	public void checkVerifyCode(String phone, String verifycode) throws SystemException {
//		String authCode = userSessionDao.getVerifyCode(phone);
//		if (!authCode.equals(verifycode)) {
//			throw new SystemException("验证码错误", "10012");
//		}
	}

	public static String getPhoneCode() {
		String[] beforeShuffle = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		List<String> list = Arrays.asList(beforeShuffle);
		Collections.shuffle(list);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		String afterShuffle = sb.toString();
		String result = afterShuffle.substring(5, 9);
		// System.out .print(result) ;
		return result;
	}

}