<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  	<head>
    	<base href="<%=basePath%>">    
    	<title>请稍后</title>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
  		<meta http-equiv="pragma" content="no-cache">
  		<meta http-equiv="cache-control" content="no-cache">
  		<meta http-equiv="expires" content="0">    
  		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  		<meta http-equiv="description" content="This is my page">
  		<!-- 
	  		<link rel="stylesheet" type="text/css" href="theme.css" />
	  		<script type="text/javascript" src="a.js"></script> 
  		-->
 	</head>
 	<body>
 	${msg==null?'连接超时,正在请求网络...': msg}
 	</body>
</html>