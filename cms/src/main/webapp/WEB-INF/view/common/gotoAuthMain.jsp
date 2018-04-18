<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		var url = $('#weixin_serverno_authorize_url').val();
		var weixin_serverno_appid = $('#weixin_serverno_appid').val();
		var weixin_serverno_redirect_uri = $('#weixin_serverno_redirect_uri').val().replace(':', encodeURIComponent(':')).replace(/\//g, encodeURIComponent('/'));
		var response_type = 'code';
		var weixin_serverno_scope = $('#weixin_serverno_scope').val();
	location.href = url
	+'appid='+weixin_serverno_appid
	+'&redirect_uri='+weixin_serverno_redirect_uri
	+'&response_type='+response_type
	+'&scope='+weixin_serverno_scope
	+'&state=wx#wechat_redirect'
	});
</script>
</head>
<body>
	<input id="weixin_serverno_authorize_url" type="hidden" value="${weixin_serverno_authorize_url }">
	<input id="weixin_serverno_appid" type="hidden" value="${weixin_serverno_appid }">
	<input id="weixin_serverno_redirect_uri" type="hidden" value="${weixin_serverno_redirect_uri }">
	<input id="weixin_serverno_scope" type="hidden" value="${weixin_serverno_scope }">
</body>
</html>