package com.jsz.peini.util.common;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.jsz.peini.util.constant.Config;

public class StringUtil {

	private static Logger logger = LogManager.getLogger(StringUtil.class);

	public static String getUUID() {
		String uuid = UUID.randomUUID().toString();
		return uuid.replaceAll("-", "");
	}

	public static String getSignXml(SortedMap<String, String> sortedMap) {
		String sign = "";
		Iterator<String> iterator = sortedMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			sign += key + "=" + sortedMap.get(key) + "&";
		}
		sign += "key=" + Config.weixin_payno_paykey;
		logger.debug("微信签名串==>>" + sign);
		sign = CodeUtil.getMD5Encode(sign).toUpperCase();
		logger.debug("微信签名MD5==>>" + sign);
		sortedMap.put("sign", sign);
		String xml = StringUtil.formatMapToWxXml(sortedMap);
		return xml;
	}

	public static String formatMapToWxXml(Map<String, String> map) {
		Document document = DocumentHelper.createDocument();
		Element xml = document.addElement("xml");
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			xml.addElement(key).setText(map.get(key));
		}
		logger.info("微信请求报文==>>" + xml.asXML());
		return xml.asXML();
	}

	public static Map<String, String> formatWxXmlToMap(String code) throws Exception {
		Document document = DocumentHelper.parseText(code);
		Element xml = document.getRootElement();
		@SuppressWarnings("unchecked")
		List<Element> elementList = xml.elements();
		HashMap<String, String> hashMap = new HashMap<String, String>();
		for (Element element : elementList) {
			hashMap.put(element.getName(), element.getText());
		}
		return hashMap;
	}

	public static void main(String[] args) {
//		System.out.println(new Date().getTime());
//		System.out.println(new Timestamp(new Date().getTime()).getTime());
//		System.out.println(System.currentTimeMillis() / 1000);
//		System.out.println(StringUtil.getUUID());
		System.out.println(new BigDecimal("0.1").multiply(new BigDecimal("100")).longValue());
	}

}
