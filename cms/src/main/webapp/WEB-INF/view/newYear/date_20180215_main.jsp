<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>好运过大年</title>
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
<link rel="stylesheet" type="text/css" href="css/Square.css">
<script type="text/javascript" src="js/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/my.js"></script>
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.2.0.js"></script>
<script type="text/javascript" src="js/newYear/date_20180215_main.js"></script>
<!-- 
	  		<link rel="stylesheet" type="text/css" href="theme.css" />
	  		<script type="text/javascript" src="a.js"></script> 
  		-->
</head>
<body>
	<div class="bg"></div>
	<!-- 视频 -->
	<!-- <div class="vid">
		<video id="myvideo" controls="controls" autoplay="autoplay"preload="auto" >
                <source src="congratulate.mp4" type="video/mp4" />
                你的浏览器不支持H5播放器
            </video>
		<embed src="https://imgcache.qq.com/tencentvideo_v1/playerv3/TPout.swf?max_age=86400&v=20161117&vid=u0549t943y9&auto=0" autostart="true" allowFullScreen="true" quality="high" width="480" height="400" align="middle" allowScriptAccess="always" type="application/x-shockwave-flash"></embed>
	</div> -->
	<!-- 视频 -->
	<!-- <iframe frameborder="0" width="640" height="498" src="https://v.qq.com/iframe/player.html?vid=u0549t943y9&tiny=0&auto=0" allowfullscreen="true"></iframe> -->
	<img id="shareImg" src="images/logo.png" alt="" class="logo">
	<button class="rule"></button>
	<div class="bannr"></div>
	<seciton>
	<div class="squa-cont">
		<div id="box">
			<div class="squ-con squ-con-1">
				<i></i>
			</div>
			<div class="squ-con squ-con-2">
				<i></i>
			</div>
			<div class="squ-con squ-con-3">
				<i></i>
			</div>
			<div class="squ-con squ-con-8">
				<i></i>
			</div>
			<div id="awardButton" class="squ-con squ-con-click"></div>
			<div class="squ-con squ-con-4">
				<i></i>
			</div>
			<div class="squ-con squ-con-7">
				<i></i>
			</div>
			<div class="squ-con squ-con-6">
				<i></i>
			</div>
			<div class="squ-con squ-con-5">
				<i></i>
			</div>
		</div>
		<div class="notice">
			<p>
				已有
				<strong>${total+999}</strong>
				人参与
			</p>
			<p>转发分享即可获得一次额外抽奖机会</p>
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
	<!-- 提示弹窗 -->
	<div id="failContent" class="beyond"></div>
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
				<p>【金手指集团】带您好运过大年,点击立即抽奖,新春有礼滚滚来。</p>
				<p>【活动奖品】随机现金红包,陪你金豆,陪你通用代金券。</p>
				<p>【活动时间】2018年2月15日</p>
				<p>【活动说明】每人每天一次抽奖机会,点击“立即抽奖”,九宫格开始转动,最终光圈停留的位置为您所中的奖品。转发朋友圈即可多得一次抽奖机会哦~</p>
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
