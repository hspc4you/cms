package com.jsz.peini.util.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MQQueueDemoListener implements MessageListener {
	Logger logger = LogManager.getLogger(MQQueueDemoListener.class);
	@Override
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage)message;
		try {
			logger.debug("消息队列监听器监听到了消息:==========>>"+textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
