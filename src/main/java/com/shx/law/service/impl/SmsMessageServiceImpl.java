package com.shx.law.service.impl;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.shx.law.Exception.SystemException;
import com.shx.law.mongo.dao.UserSessionDao;
import com.shx.law.mongo.entity.AuthCode;
import com.shx.law.service.SmsMessageService;
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
	private static final int CODE_EXP = 60;
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private UserSessionDao userSessionDao;

	//产品名称:云通信短信API产品,开发者无需替换
	 final String product = "Dysmsapi";
	//产品域名,开发者无需替换
	 final String domain = "dysmsapi.aliyuncs.com";

	// TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
	 final String accessKeyId = "LTAIkMWQEAZqniK2";
	 final String accessKeySecret = "sKHjhYy0VBWEuqQYVHU3tPRMhn0r92";
	public void sendAuthCode(String phone, String sign_name, String template_code, String product) throws SystemException {

		String smsCode = getPhoneCode();
		try {
			String smsParam = String.format("{code:'%s'}", smsCode);
			sendSMS("",sign_name,template_code,phone,smsParam);

		} catch (RuntimeException e) {
			e.printStackTrace();
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
	/**
	 *
	 * @param extend 用户识别号 建议使用用户id
	 * @param SignName 短信签名
	 * @param templateCode 模板编号
	 * @param recNumber  手机号
	 * @param smsParam 短信内容
	 * @return
	 * @throws RuntimeException
	 */
	public SendSmsResponse sendSMS(String extend, String SignName, String templateCode,
								   String recNumber, String smsParam)  throws RuntimeException  {
		IAcsClient acsClient = null;
		SendSmsRequest request = null;
		try {
			//可自助调整超时时间
			System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
			System.setProperty("sun.net.client.defaultReadTimeout", "10000");

			//初始化acsClient,暂不支持region化
			IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
			DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
			acsClient = new DefaultAcsClient(profile);

			//组装请求对象-具体描述见控制台-文档部分内容
			request = new SendSmsRequest();
			//必填:待发送手机号
			request.setPhoneNumbers(recNumber);
			//必填:短信签名-可在短信控制台中找到
			request.setSignName(SignName);
			//必填:短信模板-可在短信控制台中找到
			request.setTemplateCode(templateCode);
			//可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
			request.setTemplateParam(smsParam);
			//选填-上行短信扩展码(无特殊需求用户请忽略此字段)
			//request.setSmsUpExtendCode("90997");

			//可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
			request.setOutId("yourOutId");

			//hint 此处可能会抛出异常，注意catch
			SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);

			return sendSmsResponse;
		} catch (ClientException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}



	}

	public void checkVerifyCode(String phone, String verifycode) throws SystemException {
		String authCode = userSessionDao.getVerifyCode(phone);
		if (!authCode.equals(verifycode)) {
			throw new SystemException("验证码错误", "10012");
		}
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