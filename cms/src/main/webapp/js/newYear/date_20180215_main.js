$(function() {
	/*图片*/
	for (var i = 1; i <= 9; i++) {
		$("#box div.squ-con").eq(i - 1).append("<img src='images/squ-icon-" + i + ".png'>");
	}
	/*抽奖*/
	$('.squ-con').height($('.squ-con').width() + 'px');
	$(window).resize(function() {
		$('.squ-con').height($('.squ-con').width() + 'px')
	});

	//		在旋转的时候不能再次被点击
	var t = true
	$('#awardButton').click(function() {
		if (t == true) {
			t = false;
			$.ajax({
				type : "POST",
				dataType : "json",
				url : "festival/getFestivalAwardResult",
				data : {
					userId : $('#userId').val()
				},
				success : function(response) {
//					console.log(response);
					if (response.respStatus == true) {
						//产生随机数
						var prize = Math.ceil(Math.random() * ($('.squ-con').length - 1));
						//默认先转3圈
						prize += 32;
						for (var i = 1; i <= prize; i++) {
							setTimeout(time(i), 6 * i * i);
						}
						setTimeout(function() {
							t = true;
							if (response.respObj.awardType == 1) {
								$('#awardContent').html(response.respObj.awardContent + '元现金红包');
								$('#awardTips').fadeIn();
								$('.gray').fadeIn();
							} else if (response.respObj.awardType == 2) {
								$('#awardId').val(response.respObj.id);
								$('#awardToken').val(response.respObj.awardToken);
								$('#registContent').html(response.respObj.awardContent + '元陪你金豆');
								$('#registTips').fadeIn();
								$('.gray').fadeIn();
							}
						}, 6 * prize * prize + 500);
					} else {
						t = true;
						$('#failContent').html(response.respDesc);
						$('#failContent').fadeIn();
						setTimeout(function() {
							$('#failContent').fadeOut();
						}, 6000);
					}
				}
			});
		}


	});
	/*关闭按钮*/
	$(".close-btn").click(function() {
		$(this).parent("div").parent().fadeOut();
		$(".gray").fadeOut();
		$('#remainPhone').val('');
		$('#anthCode').val('');
	});
	//领奖按钮
	$('#receiveGold').click(function() {

		$.ajax({
			type : "POST",
			dataType : "json",
			url : "festival/addToAwardProvideQueue",
			data : {
				awardId : $('#awardId').val(),
				remainPhone : $.trim($('#remainPhone').val()),
				anthCode : $.trim($('#anthCode').val()),
				awardToken:$.trim($('#awardToken').val())
			},
			success : function(response) {
//				console.log(response);
				if (response.respStatus == true) {
					$('#registTips').fadeOut();
					$(".gray").fadeOut();
					$('#remainPhone').val('');
					$('#anthCode').val('');
					location.href='http://apk.91peini.com/pnservice/invite/index?userPhone=15131188551';
				}
			}
		});
	});
	//获取验证码
	$('#getAuth').click(function() {
		$.ajax({
			type : "POST",
			dataType : "json",
			url : "main/smsSendForRegister",
			data : {
				userName : $('#remainPhone').val()
			},
			success : function(response) {
//				console.log(response);
				if (response.respStatus == true) {
//					$('#anthCode').val(response.respObj);
				} else {
					$('#failContent').html(response.respDesc);
					$('#failContent').fadeIn();
					setTimeout(function() {
						$('#failContent').fadeOut();
					}, 3000);
				}

			}
		});
	});
	wx.config({
		debug : false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
		appId : $('#weixin_serverno_appid').val(), // 必填，公众号的唯一标识
		timestamp : $('#timestamp').val(), // 必填，生成签名的时间戳
		nonceStr : $('#nonceStr').val(), // 必填，生成签名的随机串
		signature : $('#signature').val(), // 必填，签名
		jsApiList : [
			'checkJsApi', //检查js接口是否有权限使用
			'showAllNonBaseMenuItem', //展示全部菜单
			'hideMenuItems', //要显示的菜单接口
			'onMenuShareTimeline', //分享到朋友圈权限
			'onMenuShareAppMessage', //分享给朋友
			'playVoice',
			'startRecord',
			'stopRecord'
		] // 必填，需要使用的JS接口列表
	});
	wx.ready(function() { // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
		wx.checkJsApi({
			jsApiList : [
				'playVoice'
			], // 需要检测的JS接口列表
			success : function(res) {
			// 以键值对的形式返回，可用的api值true，不可用为false
			// 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
			}
		});
		wx.showAllNonBaseMenuItem({
			success : function(res) {
				wx.hideMenuItems({
					// 要隐藏的菜单项，只能隐藏“传播类”和“保护类”按钮
					menuList : [
						'menuItem:share:qq',
						'menuItem:share:weiboApp',
						'menuItem:share:QZone',
						'menuItem:openWithQQBrowser',
						'menuItem:openWithSafari'
					],
					success : function(res) {
					}
				});
			}
		});
		wx.onMenuShareTimeline({
			//title : $('title').html(), // 分享标题 金手指贺新春
			title : '金手指贺新春 | 百万现金大放送', // 分享标题 金手指贺新春
			link : 'http://wx.app.91peini.com', // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
			imgUrl : 'http://wx.app.91peini.com/wx/images/share.jpg', // 分享图标
			success : function(res) {
//				console.log(res);
//				alert('分享了');
				// 用户确认分享后执行的回调函数
				$.ajax({
					type : "POST",
					dataType : "json",
					url : "festival/shareToCircleOfFriends",
					data : {
						userId : $('#userId').val()
					},
					success : function(response) {
//						console.log(response);
					}
				});
			},
			fail : function(res) { //接口调用失败时执行的回调函数。
//				console.log(res);
			},
			cancel : function(res) {
//				console.log(res);
			// 用户取消分享后执行的回调函数
			}
		});
		wx.onMenuShareAppMessage({
			title :'金手指贺新春 | 百万现金大放送', // 分享标题
			desc : '现金红包大转盘', // 分享描述
			link : 'http://wx.app.91peini.com', // 分享链接，该链接域名或路径必须与当前页面对应的公众号JS安全域名一致
			imgUrl : 'http://wx.app.91peini.com/wx/images/share.jpg', // 分享图标
			type : 'link', // 分享类型,music、video或link，不填默认为link
			dataUrl : '', // 如果type是music或video，则要提供数据链接，默认为空
			success : function(res) {
//				console.log(res);
			// 用户确认分享后执行的回调函数
			},
			fail : function(res) { //接口调用失败时执行的回调函数。
//				console.log(res);
			},
			cancel : function(res) {
//				console.log(res);
			// 用户取消分享后执行的回调函数
			}
		});


	});
	wx.error(function(res) {
//		console.log(res);
	// config信息验证失败会执行error函数，如签名过期导致验证失败，具体错误信息可以打开config的debug模式查看，也可以在返回的res参数中查看，对于SPA可以在这里更新签名。
	});

});
function time(a) {
	return function() {
		if (a > 8) {
			a = parseInt(a % 8)
			if (a == 0) {
				a = 8
			}
		}
		$('.squ-con').removeClass('active');
		$('.squ-con-' + a).addClass('active');
	}
}