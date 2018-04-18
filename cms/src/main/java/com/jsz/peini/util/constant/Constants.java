package com.jsz.peini.util.constant;

import java.util.ResourceBundle;


public class Constants {
	public static ResourceBundle properties = ResourceBundle.getBundle("config");
	
	//方法调取返回值
	public static final int SUCCESS = 1;//成功
	public static final String SUCCESS_DESC = "成功";
	public static final int FAIL = 0;//失败
	public static final int EXCEPTION = 99;//异常
	public static final String EXCEPTION_DESC = "网络请求异常，请稍后再试";
	public static final int INVALID = 9;//身份失效
	public static final int NOPAYPASS = 8;//没有支付密码
	public static final int FAILPAYPASS = 10;//没有支付密码
	public static final int LOCKPAYPASS = 11;//没有支付密码
	public static final int PASSWORDERROR = 12;//支付密码错误
	public static final int GOLDISLIT = 13;//金豆不足
	
	public static final int BE_CONCERNED = 14;  // 关注
	public static final int INFO_INVALIDATE = 7;//未完善资料
	
	public static final int SUCCESS_SHOP = 101;//优惠买单未评价
	public static final int SUCCESS_TASK = 104;//任务买单未评价
	public static final int FAIL_REG_EMAIL = 110;//认证的邮箱是非企业邮箱
	public static final int FAIL_VALID_VO = 111;//bean校验未通过
	
	//短信类型
	public static final int SMS_YZM = 1;//验证码
	public static final int SMS_ORDER = 2;//订单提醒
	
	public static final int PN_PASSWORD = 3;//初始密码
	
	//商家搜索展示结果类型
	public static final int SELLER_SEARCH_SELLER = 1;//商家
	public static final int SELLER_SEARCH_WORD = 2;//关键字列表
	
	//交易类型
	public static final int PAYMENT_IN=1;//收入
	public static final int PAYMENT_OUT=2;//支出
	
	//交易方式
	public static final int PAY_GOLD=1;//金豆
	public static final int PAY_SCORE=2;//积分
	public static final int PAY_ZFB=3;//支付宝
	public static final int PAY_WX=4;//微信

	//订单状态
	public static final int ORDER_YFB = 1;//已发布
	public static final int ORDER_DFK = 2;//待付款
	public static final int ORDER_DPJ = 3;//待评价
	public static final int ORDER_YWC = 4;//已完成
	public static final int ORDER_YGB = 5;//已关闭
	
	//优惠券领取
	public static final int COUPON_GET_HD = 1;//活动领取
	public static final int COUPON_GET_JF = 2;//积分领取
	public static final int COUPON_GET_JB = 3;//金豆领取
	public static final int COUPON_GET_XF = 4;//消费领取
	public static final int COUPON_GET_RW = 5;//任务领取
	public static final int COUPON_GET_LSXF = 6;//临时赠送消费领取
	public static final int COUPON_GET_LSRW = 7;//临时赠送任务领取
	public static final int COUPON_GET_LSZD = 8;//临时赠送指定领取
	
	//优惠券使用规则
	public static final int COUPON_RULE_MJ = 1;//满减
	public static final int COUPON_RULE_FW = 2;//优惠范围不参与积分赠送
	public static final int COUPON_RULE_YHJ = 3;//使用优惠券不参与积分赠送
	public static final int COUPON_RULE_JB = 4;//优惠券与金豆折扣不能同时存在
	
	//优惠券范围
	public static final int COUPON_RANGE_DY = 1;//根据地域
	public static final int COUPON_RANGE_LX = 2;//根据类型
	public static final int COUPON_RANGE_DP = 3;//根据店铺
	
	//禁言提示
	public static final int GAG_CODE = 902;
	public static final String GAG_MSG = "由于违反平台规定，您的账号已被禁言，除商家买单外，其他功能暂时停用，如有疑问可拨打客服电话或通过APP问题反馈联系我们";

	//停用提示
	public static final int STOP_CODE = 900;
	public static final String STOP_MSG = "由于违反平台规定，您的账号已被停用，如有疑问可拨打客服电话或通过APP问题反馈联系我们";
	
	//黑名单
	public static final String BLACK_UID_PRE="BLACK_UID_";
	public static final int BLACK_CODE = 911;
	public static final String BLACK_MSG_USER = "抱歉的通知您~您已拉黑对方，无法进行互动！";
	public static final String BLACK_MSG_OTHER = "抱歉的通知您~您已进入对方黑名单，无法进行互动！";

	
	//举报类型
	public static final int REPORT_QUESTION = 1;//问题反馈
	public static final int REPORT_PEOPLE = 2;//举报人
	public static final int REPORT_SELLER = 3;//举报商家
	public static final int REPORT_TASK = 4;//举报任务
	public static final int REPORT_IMAGE = 5;//举报照片
	
	//举报原因
	public static final int REPORT_NOGOLD = 1;//商家不允许使用金豆支付
	public static final int REPORT_PAYCASH = 2;//商家说可用优惠价支付现金
	public static final int REPORT_WRONGHEAD = 3;//头像/资料作假
	public static final int REPORT_SRGG = 4;//骚扰广告
	public static final int REPORT_ZP = 5;//诈骗/托
	public static final int REPORT_SQDS = 6;//色情低俗
	public static final int REPORT_EYSR = 7;//恶意骚扰/语言不文明
	
	public static final long MONTH_MIL_SECONDS = 30L*24L*3600L*1000L;   //一个月的毫秒数
	public static final int MONTH_SECONDS = 30*24*3600;   //一个月的秒数
	public static final int WEEK_SECONDS = 7*24*3600;   //一周的秒数
	public static final int WEB_TOKEN_TIME = 2*3600;  //官网登录的时间控制
	public static final int WX_AWARD_TOKEN_TIME = 2*3600;  //官网登录的时间控制
	//图片服务域名
	public static final String IMAGE_HOST = properties.getString("imgHost");
	

	//经验值
	public static final int EXPERIENCE_RELEASE_TASK = 1; //发布任务 +1
	public static final int EXPERIENCE_RECEIVE_TASK = 2; //发布任务 +1
	public static final int EXPERIENCE_CANCEL_TASK = 3; //取消任务 -1
	public static final int EXPERIENCE_FINISH_TASK = 4; //完成任务+3
	public static final int EXPERIENCE_5_EVALUATE = 5; //五星评分+2
	public static final int EXPERIENCE_4_EVALUATE = 6; //4星评分+1
	public static final int EXPERIENCE_3_EVALUATE = 7;	//3星评分+0
	public static final int EXPERIENCE_2_EVALUATE = 8;//2星评分-1
	public static final int EXPERIENCE_1_EVALUATE = 9;//1星评分-2
	public static final int EXPERIENCE_PRIVILEGE_PAY = 10;//优惠买单+1
	public static final int EXPERIENCE_PARTY_PAY = 11;//聚会付费+1
	public static final int EXPERIENCE_PAY_GOLD_100 = 12;//充值 0-100元+2
	public static final int EXPERIENCE_PAY_GOLD_500 = 13;//充值 101-500元+3
	public static final int EXPERIENCE_PAY_GOLD_1000 = 14;//充值 501-1000元+6
	public static final int EXPERIENCE_PAY_GOLD_GT_1000 = 15;//充值1000元以上+10
	public static final int EXPERIENCE_RELEASE_SQUARE = 16;//发布广场动态+1
	public static final int EXPERIENCE_LIKE_SQUARE = 17;//广场点赞+1
	public static final int EXPERIENCE_COMMENT_SQUARE = 18;//广场评论+1
	public static final int EXPERIENCE_REPORT_TASK = 19;//举报任务-3
	public static final int EXPERIENCE_REPORT_PARTY = 20;//举报聚会-3
	public static final int EXPERIENCE_REPORT_USER = 21;//举报用户-3
	public static final int EXPERIENCE_REPORT_SPITE = 22;//恶意举报-6
	
	
	
	
	public static final int CUSTOMGOLDRULEMINID = 11111;//金豆充值自定义金额min id
	public static final int CUSTOMGOLDRULEMAXID = 22222;//金豆充值自定义金额max id
	
	public static final String ALIPAY_GATEWAY_URL = properties.getString("alipay_gateway_url");
	public static final String ALIPAY_APP_ID = properties.getString("app_id");
	public static final String ALIPAY_PRIVATEKEY = properties.getString("alipay_privatekey");
	public static final String ALIPAY_PUBLICKEY = properties.getString("alipay_publickey");
	public static final String ALIPAY_RETURN_URL = properties.getString("alipay_return_url");
	public static final String ALIPAY_NOTIFY_URL = properties.getString("alipay_notify_url");
	
}
