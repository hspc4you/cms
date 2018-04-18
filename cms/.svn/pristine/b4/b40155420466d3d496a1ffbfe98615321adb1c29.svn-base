/**
 * @author Glan.duanyj
 * @date 2014-05-12
 * @project rest_demo
 */
package com.jsz.peini.util.sms;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jsz.peini.util.sms.ucpaas.restDemo.client.JsonReqClient;

public class SmsSend {

	// 账户id
	private static final String accountSid = "1f76aa10c631e4fae498a0d18e24118a";
	// 账户token
	private static final String authToken = "756eb8a5662c140d96e1c9097a4b7385";
	// 应用id
	private static final String appId = "f790ef239fb9435da45aa5357e96863e";
	// 短信模板id
	private static final String templateId = "33749";
	// 陪你结款通知模版id
	private static final String FinancialId = "39781";

	// 陪你短信密码id
	private static final String passwordId = "283400";

	/**
	 * @param userName
	 *            用户手机号
	 * @param param
	 *            验证码参数
	 */
	public static String sendTemplateSMS(String userName, String param) {
		String result = null;
		try {
			JsonReqClient josnreq = new JsonReqClient();
			result = josnreq.templateSMS(accountSid, authToken, appId, templateId, userName, param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static String sendFinancial(String userName, String param) {
		String result = null;
		try {
			JsonReqClient josnreq = new JsonReqClient();
			result = josnreq.templateSMS(accountSid, authToken, appId, FinancialId, userName, param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static String sendPNPassword(String userName, String param) {
		String result = null;
		try {
			JsonReqClient josnreq = new JsonReqClient();
			result = josnreq.templateSMS(accountSid, authToken, appId, passwordId, userName, param);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// public static boolean sendMessage(String userName,String param,int smstype){
	// boolean isSend = false;
	// String result = SmsSend.sendTemplateSMS(userName, param);
	// System.out.println("短信返回结果:"+result);
	// JSONObject object = JSON.parseObject(result);
	// JSONObject data = (JSONObject) object.get("resp");
	// String respCode = data.getString("respCode");
	// //发送成功
	// if(respCode.equals("000000")){
	// isSend = true;
	// }
	// return isSend;
	// }

	public static String sendFinancialrest(String userName, String param) {
		String result = SmsSend.sendFinancial(userName, param);
		JSONObject object = JSON.parseObject(result);
		JSONObject data = (JSONObject) object.get("resp");
		String respCode = data.getString("respCode");
		return respCode;
	}

	public static String sendMessage(String userName, String param, int smstype) {
		String result = SmsSend.sendTemplateSMS(userName, param);
		System.out.println("短信返回结果:" + result);
		JSONObject object = JSON.parseObject(result);
		JSONObject data = (JSONObject) object.get("resp");
		String respCode = data.getString("respCode");
		return respCode;
	}
	public static String sendPassword(String userName, String param, int smstype) {
		String result = SmsSend.sendPNPassword(userName, param);
		System.out.println("短信返回结果:" + result);
		JSONObject object = JSON.parseObject(result);
		JSONObject data = (JSONObject) object.get("resp");
		String respCode = data.getString("respCode");
		return respCode;
	}
	
	/**
	 * 测试说明 参数顺序，请参照各具体方法参数名称 参数名称含义，请参考rest api 文档
	 * 
	 * @author Glan.duanyj
	 * @date 2014-06-30
	 * @param params[]
	 * @return void
	 * @throws IOException
	 * @method main
	 */
	// public String smsSend(String userName,String smsCode){
	// String accountSid="1f76aa10c631e4fae498a0d18e24118a";
	// String token="756eb8a5662c140d96e1c9097a4b7385";
	// String appId="f790ef239fb9435da45aa5357e96863e";
	// String templateId="33749";
	// String to=userName;
	// String para=smsCode;
	// String smsSendReturn = sendTemplateSMS(accountSid,token,appId, templateId,to,para);
	// System.out.println(smsSendReturn);
	// return smsSendReturn;
	// }

	// public static void main(String[] args) throws IOException {
	// SmsSend re=new SmsSend();
	// re.smsSend("13633293531", "123456");
	// }
	// public static void main(String[] args){
	// String ss = "{\"resp\":{\"respCode\":\"000000\",\"templateSMS\":{\"createDate\":\"20161209182011\",\"smsId\":\"ee7677284b5eca2fd6a4f69dcc511609\"}}}";
	// System.out.println("短信返回结果:"+ss);
	// JSONObject object = JSON.parseObject(ss);
	// JSONObject data = (JSONObject) object.get("resp");
	// String dd = data.getString("respCode");
	// System.out.println("短信返回结果:"+dd);
	// }
}
