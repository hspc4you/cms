<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>开年刮好礼</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="viewport" content="initial-scale=1, width=device-width, maximum-scale=1, user-scalable=no">
<meta name="format-detection" content="telphone=no, email=no" />
<meta name="msapplication-tap-highlight" content="no">
<link rel="stylesheet" type="text/css" href="css/index.css">
<link rel="stylesheet" type="text/css" href="css/Scratch.css">
<script type="text/javascript" src="js/jquery/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="js/jquery/jquery.eraser.js"></script>
<script type="text/javascript" src="js/my.js"></script>
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.2.0.js"></script>
<script type="text/javascript" src="js/newYear/date_20180216_main.js"></script>
</head>
<body>
	<img id="shareImg" src="images/logo.png" alt="" class="logo">
	<button class="rule"></button>
	<div class="bannr">
		<div class="ban-inner">
			已有
			<span>${total+999}</span>
			人参与
		</div>
	</div>
	<seciton>
	<div class="box">
		<div class="hint-num"></div>
		<div class="content">
			<div id="mask_img_bg">
				<img src="images/scr-smile.png" alt="">
				<span id="awardResult" class="cont-span"></span>
				<!--<img/>-->
			</div>
			<img id="redux" src="images/src-box-bg-no.png" />
		</div>
	</div>
	</seciton>
	<!-- 中奖弹窗 -->
	<section id="awardTips" class="prize">
		<div class="hint-show">
			<button class="close-btn"></button>
			<div class="prize-cont">
				<img class="colour-img" src="images/bomb-winer.png">
				<span id="awardContent" class="prize-span"></span>
			</div>
		</div>
	</section>
	<!-- 提示弹框-->
	<div id="failContent" class="beyond">将活动转发至朋友圈可获得1次机会哦~</div>
	<!-- 注册弹窗 -->
	<section id="registTips" class="enroll">
		<div class="hint-show">
			<button class="close-btn"></button>
			<div class="prize-cont">
				<img class="colour-img" src="images/bomb-winer.png">
				<span id="registContent" class="prize-span"></span>
				<div class="txt">
					<input id="remainPhone" type="text" placeholder="请输入手机号">
				</div>
				<div class="code">
					<input id="anthCode" type="text" placeholder="请输入验证码">
					<button id="getAuth" class="code-btn"></button>
				</div>
				<p>此奖励用于陪你APP,登陆后可查看</p>
				<a href="">登陆陪你APP</a>
				<button id="receiveGold" class="receive"></button>
			</div>
		</div>
	</section>
	<!-- 规则弹窗 -->
	<section class="drom">
		<div>
			<button class="close-btn"></button>
			<h5></h5>
			<div class="drom-cont">
				<p>【金手指集团】带您开年刮好礼,新春有礼刮刮乐.</p>
				<p>【活动奖品】随机现金红包,陪你金豆.</p>
				<p>【活动时间】2018年2月16日6:00-9:00 ;11:00-14:00;18:00-21:00</p>
				<p>【活动说明】每人每天一次抽奖机会,轻轻刮开奖券将显示您所中的奖品.转发朋友圈即可多得一次抽奖机会哦~</p>
			</div>
		</div>
	</section>
	<div class="gray"></div>
	<input id="weixin_serverno_appid" type="hidden" value="${weixin_serverno_appid }">
	<input id="timestamp" type="hidden" value="${timestamp }">
	<input id="nonceStr" type="hidden" value="${noncestr }">
	<input id="signature" type="hidden" value="${signature }">
	<input id="userId" type="hidden" value="${userId }">
	<input id="awardId" type="hidden">
	<input id="awardToken" type="hidden">
</body>
</html>