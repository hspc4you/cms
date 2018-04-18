

$(function() {
	$('#tbdwname').blur(function() {
		var tbdwname = $.trim($('#tbdwname').val());
		if (tbdwname != '') {
			$.ajax({
				type : "POST",
				dataType : "json",
				url : "alipay/checkPrepay",
				data : {
					tbdwname : tbdwname
				},
				success : function(responseBean) {
					if (responseBean.respStatus == true) {
						var tOrders = responseBean.respObj;
						$('#orderscode_hidden').val(tOrders.orderscode);
						$('#tbdwname').val(tOrders.tbdwname);
						$('#tblxr').val(tOrders.tblxr);
						$('#paymentamount').val(tOrders.paymentamount);
						$('#mobile').val(tOrders.mobile);
						$('#remarks').val(tOrders.remarks);
						$('#fkfs').find('option[value="' + tOrders.fkfs + '"]').prop('selected', true);
						$('input[name="tzbggbd_group"]').removeAttr('id');
						var tOrdersdetaillList = tOrders.tOrdersdetaillList
						for (var i = 0; i < tOrdersdetaillList.length; i++) {
							$('input[name="tzbggbd_group"][value = "' + tOrdersdetaillList[i].fycode + '"]').prop('checked', true);
//							$('input[name="tzbggbd_group"][value = "' + tOrdersdetaillList[i].fycode + '"]').attr('id', tOrdersdetaillList[i].id);
						}
						$.ajax({
							type : "POST",
							dataType : "json",
							url : "alipay/checkPayBD",
							data : {
								tbdwname : tbdwname
							},
							success : function(responseBean) {
								if (responseBean.respStatus == true) {
									var respList = responseBean.respList;
									console.log(respList);
									for (var i = 0; i < respList.length; i++) {
										$('input[name="tzbggbd_group"][value = "' + tOrdersdetaillList[i].fycode + '"]').parent().parent().html('已购买');
									}
									
								}
							}
						});
					}
				}
			});

		}
	});
});
function payOrder() {
	var requestBean = {};
	requestBean.orderscode = $('#orderscode_hidden').val() == '' ? null : $('#orderscode_hidden').val();
	requestBean.tbdwname = $.trim($('#tbdwname').val());
	requestBean.tblxr = $.trim($('#tblxr').val());
	requestBean.paymentamount = $.trim($('#paymentamount').val());
	requestBean.mobile = $.trim($('#mobile').val());
	requestBean.remarks = $.trim($('#remarks').val());
	requestBean.fkfs = $('#fkfs').val();
	var tOrdersdetaillList = [];
	var tOrdersdetaillArr = $('input[name="tzbggbd_group"]:checked');
	for (var i = 0; i < tOrdersdetaillArr.length; i++) {
		var tOrdersdetail = {}
		tOrdersdetail.fycode = $(tOrdersdetaillArr[i]).val();
		tOrdersdetail.fyname = $(tOrdersdetaillArr[i]).parent().parent().next().next().html();
		tOrdersdetail.fyje = $(tOrdersdetaillArr[i]).parent().parent().next().html();
		tOrdersdetaillList.push(tOrdersdetail);
	}
	requestBean.tOrdersdetaillList = tOrdersdetaillList;
	
	
	$.ajax({
		type : "POST",
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		url : "alipay/payOrder",
		data : JSON.stringify(requestBean),
		success : function(responseBean) {
			if (responseBean.respStatus == true) {
				location.href = 'alipay/gotoPay?outTradeNo=' + responseBean.respObj;
			} else {
				alert('提交失败');
			}

		}
	});
}
function sumMoney() {
	var groupList = $('input[name="tzbggbd_group"]:checked');
	var totalMoney = 0;
	for (var i = 0; i < groupList.length; i++) {
		totalMoney += $(groupList[i]).parent().parent().next().html() * 1;
	}
	$('#paymentamount').val(totalMoney);
}