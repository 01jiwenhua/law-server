package com.shx.law.service;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.shx.law.constant.Constant;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
/**
 * 类说明
 * 
 * @author zmh
 * @date 创建时间：2016年10月11日 下午4:56:27
 * @Version 2.0
 */
public class SMSService {

	private String serverUrl = Constant.SERVER_URL;
	private String appkey = Constant.APP_KEY;
	private String appSecret = Constant.APP_SECRET;
//	/**
//	 * @param extend
//	 *            用户识别号 建议使用用户id
//	 * @param SignName
//	 *            短信签名
//	 * @param templateCode
//	 *            模板编号
//	 * @param recNumber
//	 *            手机号
//	 * @param code 验证码
//	 * @param product 产品名称
//	 * @return
//	 * @throws ApiException
//	 */
//	public String sendSMS(String extend, String SignName, String templateCode,
//			String recNumber, String code, String product) throws ApiException {
////		String smsParam = String.format("{code:'%s',product:'%s'}", code, product);
//
//
//
//		String smsParam = String.format("{code:'%s'}", code);
//		TaobaoClient client = new DefaultTaobaoClient(serverUrl, appkey,
//				appSecret);
//		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
//		req.setExtend(extend);
//		req.setSmsType("normal");
//		req.setSmsFreeSignName(SignName);
//		req.setSmsParamString(smsParam);
//		req.setRecNum(recNumber);
//		req.setSmsTemplateCode(templateCode);
//		AlibabaAliqinFcSmsNumSendResponse rsp;
//		rsp = client.execute(req);
//		return rsp.getBody();
//
//	}
	/**
	 * 
	 * @param extend 用户识别号 建议使用用户id
	 * @param SignName 短信签名
	 * @param templateCode 模板编号
	 * @param recNumber  手机号
	 * @param smsParam 短信内容
	 * @return
	 * @throws ApiException
	 */
	public SendSmsResponse sendSMS(String extend, String SignName, String templateCode,
			String recNumber, String smsParam)    {
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
		}



	}

	//产品名称:云通信短信API产品,开发者无需替换
	static final String product = "Dysmsapi";
	//产品域名,开发者无需替换
	static final String domain = "dysmsapi.aliyuncs.com";

	// TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
	static final String accessKeyId = "LTAIkMWQEAZqniK2";
	static final String accessKeySecret = "sKHjhYy0VBWEuqQYVHU3tPRMhn0r92";


}
