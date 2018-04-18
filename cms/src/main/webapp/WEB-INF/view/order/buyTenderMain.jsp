<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">
<title>标段购买</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/order/buyTenderMain.css" />
<script type="text/javascript" src="js/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/order/buyTenderMain.js"></script>
</head>
<body>
	<div class="container-fluid">
		<form class="form-horizontal">
			<div class="form-group">
				<label for="tbdwname" class="col-sm-2 control-label">投标单位全称</label>
				<div class="col-sm-10">
					<input id="tbdwname" type="text" class="form-control" placeholder="投标单位全称">
				</div>
			</div>
			<div class="form-group">
				<label for="tblxr" class="col-sm-2 control-label">投标联系人</label>
				<div class="col-sm-10">
					<input id="tblxr" type="text" class="form-control" placeholder="投标联系人">
				</div>
			</div>
			<div class="form-group">
				<label for="paymentamount" class="col-sm-2 control-label">金额（元）</label>
				<div class="col-sm-10">
					<input id="paymentamount" type="text" class="form-control" placeholder="金额（元）" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label for="mobile" class="col-sm-2 control-label">电话</label>
				<div class="col-sm-10">
					<input id="mobile" type="text" class="form-control" placeholder="电话">
				</div>
			</div>
			<div class="form-group">
				<label for="remarks" class="col-sm-2 control-label">备注信息</label>
				<div class="col-sm-10">
					<input id="remarks" type="text" class="form-control" placeholder="备注信息">
				</div>
			</div>
			<div class="form-group">
				<label for="fkfs" class="col-sm-2 control-label">支付方式</label>
				<div class="col-sm-10">
					<select id="fkfs" class="form-control">
						<option value="请选择">请选择</option>
						<option value="线下付款">线下付款</option>
						<option value="支付宝">支付宝</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="button" class="btn btn-default" onclick="payOrder()">下订单</button>
				</div>
			</div>
		</form>
		<div class="table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<td>选择标段</td>
						<td>标书款</td>
						<td>标段名称</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${tZbggBdList}" var="tzbggbd">
						<tr>
							<td>
								<label>
									<input type="checkbox" name="tzbggbd_group" value="${tzbggbd.bdcode }" onclick="sumMoney()">
								</label>
							</td>
							<td>${tzbggbd.extzbwjsj }</td>
							<td>${tzbggbd.bdname }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<input id="orderscode_hidden" type="hidden">
</body>
</html>