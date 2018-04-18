package com.jsz.peini.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.jsz.peini.bean.TOrders;
import com.jsz.peini.bean.TOrdersdetail;
import com.jsz.peini.bean.TZbggBd;
import com.jsz.peini.mapper.TOrdersMapper;
import com.jsz.peini.mapper.TOrdersdetailMapper;
import com.jsz.peini.mapper.TZbggBdMapper;
import com.jsz.peini.service.TOrdersService;
import com.jsz.peini.util.common.ResponseBean;
import com.jsz.peini.util.constant.Config;
import com.jsz.peini.util.constant.ResponseDesc;

@Controller
@RequestMapping("alipay")
public class AlipayController {

	private Logger logger = LogManager.getLogger(AlipayController.class);
	@Autowired
	private TOrdersService tOrdersService;
	@Autowired
	private TZbggBdMapper tZbggBdMapper;
	@Autowired
	private TOrdersMapper tOrdersMapper;
	@Autowired
	private TOrdersdetailMapper tOrdersdetailMapper;

	@RequestMapping("buyTenderMain")
	public ModelAndView buyTenderMain(String ggcode) {
		ModelAndView modelAndView = new ModelAndView("order/buyTenderMain");
		List<TZbggBd> tZbggBdList = tZbggBdMapper.selectZbbdByGgcode(ggcode);
		logger.debug(ggcode);
		modelAndView.addObject("tZbggBdList", tZbggBdList);
		return modelAndView;
	}
	@ResponseBody
	@RequestMapping("checkPrepay")
	public Object checkPrepay(String tbdwname){
		ResponseBean<TOrders> responseBean = new ResponseBean<TOrders>();
		TOrders tOrders = tOrdersMapper.selectTOrdersByTbdwname(tbdwname);
		if (tOrders==null) {
			responseBean.setRespStatus(false);
			return responseBean;
		}
		List<TOrdersdetail> tOrdersdetaillList = tOrdersdetailMapper.selectTOrdersdetailListByOrderscode(tOrders.getOrderscode());
		tOrders.settOrdersdetaillList(tOrdersdetaillList);
		responseBean.setRespStatus(true);
		responseBean.setRespObj(tOrders);
		return responseBean;
		
	}
	@ResponseBody
	@RequestMapping("checkPayBD")
	public Object checkPayBD(String tbdwname){
		ResponseBean<TOrdersdetail> responseBean = new ResponseBean<TOrdersdetail>();
		List<TOrdersdetail> tOrdersdetailList = tOrdersdetailMapper.selectPayBDByTbdwname(tbdwname);
		if (tOrdersdetailList.size() == 0) {
			responseBean.setRespStatus(false);
			return responseBean;
		}
		responseBean.setRespStatus(true);
		responseBean.setRespList(tOrdersdetailList);
		return responseBean;
		
	}
	@ResponseBody
	@RequestMapping("payOrder")
	public Object payOrder(@RequestBody TOrders tOrders) {
		ResponseBean<String> responseBean = new ResponseBean<String>();
		try {
			
			if (tOrders.getOrderscode()!=null) {
				tOrdersService.rePayOrder(tOrders);
				responseBean.setRespStatus(true);
				responseBean.setRespObj(tOrders.getOrderscode());
				return responseBean;
			}
			String orderscode = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			tOrders.setOrderscode(orderscode);
			tOrders.setPaymentstatus(0);
			tOrdersService.payOrder(tOrders);
			responseBean.setRespStatus(true);
			responseBean.setRespObj(orderscode);
			return responseBean;
		} catch (Exception e) {
			logger.error(e.getMessage());
			responseBean.setRespStatus(false);
			responseBean.setRespDesc(ResponseDesc.submit_fail);;
			return responseBean;
		}
		
	}
	
	@RequestMapping("gotoPay")
	public ModelAndView gotoPay(String outTradeNo) {
		ModelAndView modelAndView = new ModelAndView("pay/gotoPayMain");
		AlipayClient alipayClient = new DefaultAlipayClient(Config.alipay_url, Config.alipay_app_id, Config.alipay_private_key, Config.alipay_format, Config.alipay_charset, Config.alipay_public_key, Config.alipay_sign_type);
		AlipayTradeWapPayRequest alipayTradeWapPayRequest = new AlipayTradeWapPayRequest();
		AlipayTradeWapPayModel alipayTradeWapPayModel = new AlipayTradeWapPayModel();
		alipayTradeWapPayModel.setSubject("投标");
		alipayTradeWapPayModel.setOutTradeNo(outTradeNo);
		alipayTradeWapPayModel.setTotalAmount("0.01");
		alipayTradeWapPayModel.setProductCode(Config.alipay_product_code);
		alipayTradeWapPayRequest.setBizModel(alipayTradeWapPayModel);
		alipayTradeWapPayRequest.setNotifyUrl("http://222.38.146.74:8180/cms/alipay/zfb_web_notify");
		try {
			String form = alipayClient.pageExecute(alipayTradeWapPayRequest).getBody();
			logger.debug("form=>>>>>>>" + form);
			modelAndView.addObject("form", form);
			return modelAndView;
		} catch (AlipayApiException e) {
			logger.error(e.getMessage());
			return modelAndView;
		}
	}
	@RequestMapping(value="/zfb_web_notify")
	public void zfb_web_notify(HttpServletRequest request,HttpServletResponse response) {
		
		try {
						logger.debug("---------------------收到支付宝异步回调通知--------------------------");
						// 获取支付宝POST过来反馈信息
						// 商户订单号
						String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
						// 支付宝交易号
//						String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");
						// 交易状态
						String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "UTF-8");
						//支付金额
//						String total_fee = new String(request.getParameter("total_fee").getBytes("ISO-8859-1"), "UTF-8");
						//买家付款时间
//						String gmt_payment = new String(request.getParameter("gmt_payment").getBytes("ISO-8859-1"), "UTF-8");
						// ////////////////////////////////////////////////////////////////////////////////////////
						// 请在这里加上商户的业务逻辑程序代码

						// ——请根据您的业务逻辑来编写程序（以下代码仅作参考）——

						if (trade_status.equals("TRADE_FINISHED")) {
							System.out.println("-------------TRADE_FINISHED--------------");
							
						
							response.getWriter().println("success");
						} else if (trade_status.equals("TRADE_SUCCESS")) {
							System.out.println("-------------TRADE_SUCCESS--------------");
							TOrders tOrders = new TOrders();
							tOrders.setOrderscode(out_trade_no);
							tOrders.setPaymentstatus(1);
							tOrdersMapper.updateByPrimaryKeySelective(tOrders);
								response.getWriter().println("success");
						}
			
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
	}

}
