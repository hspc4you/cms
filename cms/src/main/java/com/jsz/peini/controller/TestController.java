package com.jsz.peini.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jdt.internal.compiler.batch.Main;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jsz.peini.bean.WxFestivalAward;
import com.jsz.peini.component.HttpClientComponent;
import com.jsz.peini.mapper.WxFestivalAwardMapper;
import com.jsz.peini.util.common.ResponseBean;
import com.jsz.peini.util.constant.RedisKey;

@Controller
@RequestMapping("test")
public class TestController {
	@Autowired
	private HttpClientComponent httpClientComponent;
	private Logger logger = LogManager.getLogger(TestController.class);
//	@Autowired
	private JmsTemplate jmsTemplateQueue;
	@ResponseBody
	@RequestMapping("json")
	public Object jsontest() {
		// System.out.println(user.getName());
		// System.out.println(user.getAge());
		logger.debug("这是一个logger");
		// User rt = new User();
		// rt.setAge(1);
		// rt.setName("何");
		// JSONObject jsonObject =(JSONObject)JSONObject.toJSON(rt);
		// System.out.println(jsonObject.toString());
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("a", "1");
		String result = httpClientComponent.getHttpGet("http", "hesipeng.free.ngrok.cc", "/wx/test/httpTest", hashMap);
		logger.debug(result);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("return", true);
		return jsonObject;

	}

	@ResponseBody
	@RequestMapping("httpTest")
	public Object httpTest(HttpServletRequest request) {
		logger.debug(request.getRequestURL());
		logger.debug(request.getRequestURI());
		logger.debug(request.getQueryString());
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nihao", "这是一个测试");
		return jsonObject;
	}

	

	private static void insertAward(ClassPathXmlApplicationContext classPathXmlApplicationContext) {
		SqlSessionTemplate sqlSessionTemplate = (SqlSessionTemplate) classPathXmlApplicationContext.getBean("sqlSessionTemplate");
		SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
		// 批量插入奖品
		WxFestivalAwardMapper wxFestivalAwardMapper = sqlSession.getMapper(WxFestivalAwardMapper.class);
		WxFestivalAward wxFestivalAward = new WxFestivalAward();
		for (int i = 1; i <= 10; i++) {
			// 批量插入奖品
			// wxFestivalAward.setId(i);
			wxFestivalAward.setAwardType(2);// 1:现金 2:金豆
			wxFestivalAward.setAwardContent(new BigDecimal("100"));// 数额
			wxFestivalAward.setActivityId(5);// 活动
//			wxFestivalAwardMapper.insertSelective(wxFestivalAward);
		}
		sqlSession.commit();
		sqlSession.clearCache();
		sqlSession.close();
	}

	private static void initialAwardSource(ClassPathXmlApplicationContext classPathXmlApplicationContext) throws Exception {
		StringRedisTemplate stringRedisTemplate = (StringRedisTemplate) classPathXmlApplicationContext.getBean("stringRedisTemplate");
		for (int i = 20021; i <= 24780; i++) {
//			stringRedisTemplate.opsForList().rightPush("testlist", String.valueOf(i));
//			stringRedisTemplate.opsForSet().add(RedisKey.wx_activity_id_award+5, String.valueOf(i));
		}
	}
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
//		 TestController.insertAward(classPathXmlApplicationContext);//批量插入奖品
//		 TestController.initialAwardSource(classPathXmlApplicationContext);//初始化奖品池
		classPathXmlApplicationContext.close();
	}
	@ResponseBody
	@RequestMapping("mqSend")
	public Object mqSend(String message) {
		logger.debug(message);
		jmsTemplateQueue.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
		ResponseBean<String> responseBean = new ResponseBean<String>();
		responseBean.setRespObj(message);
		return responseBean;
	}
	
	@ResponseBody
	@RequestMapping("mqReceive")
	public Object mqReceive() throws JMSException {
		TextMessage textMessage = (TextMessage)jmsTemplateQueue.receive();
		if (textMessage==null) {
			return null;
		}
		logger.debug(textMessage.getText());
		ResponseBean<String> responseBean = new ResponseBean<String>();
		responseBean.setRespObj(textMessage.getText());
		return responseBean;
	}
}
