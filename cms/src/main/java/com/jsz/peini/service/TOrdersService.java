package com.jsz.peini.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsz.peini.bean.TOrders;
import com.jsz.peini.bean.TOrdersdetail;
import com.jsz.peini.mapper.TOrdersMapper;
import com.jsz.peini.mapper.TOrdersdetailMapper;

@Service
public class TOrdersService {

	 private Logger logger = LogManager.getLogger(TOrdersService.class);
	 @Autowired
	 private TOrdersMapper tOrdersMapper;
	 @Autowired
	 private TOrdersdetailMapper tOrdersdetailMapper;
	 @Transactional
	 public void payOrder(TOrders tOrders) throws Exception {
		tOrdersMapper.insertSelective(tOrders);
		List<TOrdersdetail> tOrdersdetailList = tOrders.gettOrdersdetaillList();
		for (TOrdersdetail tOrdersdetail : tOrdersdetailList) {
			tOrdersdetail.setId(Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())));
			tOrdersdetail.setOrderscode(tOrders.getOrderscode());
			tOrdersdetailMapper.insertSelective(tOrdersdetail);
			Thread.sleep(50);
		}
	 }
	 @Transactional
	 public void rePayOrder(TOrders tOrders) throws Exception{
		tOrdersMapper.updateByPrimaryKeySelective(tOrders);
		tOrdersdetailMapper.deleteByOrderscode(tOrders.getOrderscode());
		List<TOrdersdetail> tOrdersdetailList = tOrders.gettOrdersdetaillList();
		for (TOrdersdetail tOrdersdetail : tOrdersdetailList) {
			tOrdersdetail.setId(Long.valueOf(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())));
			tOrdersdetail.setOrderscode(tOrders.getOrderscode());
			tOrdersdetailMapper.insertSelective(tOrdersdetail);
			Thread.sleep(50);
		}
	 }
}
