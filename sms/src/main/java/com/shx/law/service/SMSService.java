package com.shx.law.service;

import com.shx.law.constant.Constant;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

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
	/**
	 * @param extend
	 *            用户识别号 建议使用用户id
	 * @param SignName
	 *            短信签名
	 * @param templateCode
	 *            模板编号
	 * @param recNumber
	 *            手机号
	 * @param code 验证码
	 * @param product 产品名称
	 * @return
	 * @throws ApiException
	 */
	public String sendSMS(String extend, String SignName, String templateCode,
			String recNumber, String code, String product) throws ApiException {
		String smsParam = String.format("{code:'%s',product:'%s'}", code, product);
		TaobaoClient client = new DefaultTaobaoClient(serverUrl, appkey,
				appSecret);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend(extend);
		req.setSmsType("normal");
		req.setSmsFreeSignName(SignName);
		req.setSmsParamString(smsParam);
		req.setRecNum(recNumber);
		req.setSmsTemplateCode(templateCode);
		AlibabaAliqinFcSmsNumSendResponse rsp;
		rsp = client.execute(req);
		return rsp.getBody();

	}
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
	public String sendSMS(String extend, String SignName, String templateCode,
			String recNumber, String smsParam) throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient(serverUrl, appkey,
				appSecret);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend(extend);
		req.setSmsType("normal");
		req.setSmsFreeSignName(SignName);
		req.setSmsParamString(smsParam);
		req.setRecNum(recNumber);
		req.setSmsTemplateCode(templateCode);
		AlibabaAliqinFcSmsNumSendResponse rsp;
		rsp = client.execute(req);
		return rsp.getBody();

	}
	
	
}
