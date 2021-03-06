package com.jsz.peini.util.common;

import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.codec.digest.DigestUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.alibaba.fastjson.JSON;
import com.jsz.peini.util.constant.Config;

public class CodeUtil {

	public static String getSHA1Encode(String code) {
		return DigestUtils.sha1Hex(code);
	}

	public static String getMD5Encode(String code) {
		return DigestUtils.md5Hex(code);
	}
	/** 
	  * 创建指定数量的随机字符串 
	  * @param numberFlag 是否是数字 
	  * @param length 
	  * @return 
	  */  
	 public static String createRandom(boolean numberFlag, int length){  
		  String retStr = "";  
		  String strTable = numberFlag ? "1234567890" : "1234567890abcdefghijkmnpqrstuvwxyz";  
		  int len = strTable.length();  
		  boolean bDone = true;  
		  do {  
		   retStr = "";  
		   int count = 0;  
		   for (int i = 0; i < length; i++) {  
		    double dblR = Math.random() * len;  
		    int intR = (int) Math.floor(dblR);  
		    char c = strTable.charAt(intR);  
		    if (('0' <= c) && (c <= '9')) {  
		     count++;  
		    }  
		    retStr += strTable.charAt(intR);  
		   }  
		   if (count >= 2) {  
		    bDone = false;  
		   }  
		  } while (bDone);  
		  
		  return retStr;  
	 }
	public static void main(String[] args) throws Exception {
		// String code = "kgt8ON7yVITDhtdwci0qeXy6gxxF6qldz7DQBu2qQhAu7M_uzanlpXly69jTEHmmLm_xdlJZp76oibw205aQsg&09adf3f47b304173b2b13245f6b5f4e3&1517331994&http://hesipeng.free.ngrok.cc/wx/main/newYearMain?code=001yyR1d2mQpsD0NEI4d21qZ1d2yyR1Z&state=wx";
		// System.out.println(CodeUtil.getSHA1Encode(code));
		// Document document= DocumentHelper.parseText("<xml><a><c>11</c></a><b>22</b></xml>");
		// Element xml = document.getRootElement();
		// @SuppressWarnings("unchecked")
		// List<Element> elementList = xml.elements();
		// for (Element element : elementList) {
		// System.out.println(element.getName());
		// System.out.println(element.getText());
		// }
		// appid： wxd930ea5d5a258f4f
		// mch_id： 10000100
		// device_info： 1000
		// body： test
		// nonce_str： ibuaiVcKdpRxkhJA
		// TreeMap<String, String> treeMap = new TreeMap<String, String>();
		// treeMap.put("nonce_str", StringUtil.getUUID());
		//
		// treeMap.put("appid", "wxd930ea5d5a258f4f");
		// treeMap.put("mch_id", "10000100");
		// treeMap.put("device_info", "1000");
		// treeMap.put("body", "test");
		// treeMap.put("nonce_str", "ibuaiVcKdpRxkhJA");
		// String paramStr = "";
		// Iterator<String> iterator = treeMap.keySet().iterator();
		// while (iterator.hasNext()) {
		// String key = iterator.next();
		// paramStr += key+"="+treeMap.get(key)+"&";
		// }
		// System.out.println(paramStr);
//		Document document = DocumentHelper.createDocument();
//		Element xml = document.addElement("xml");
//		xml.addElement("aaa").setText("bbb");
//		System.out.println(xml.asXML());
//		System.out.println(document.asXML());
//		hesipeng.free.ngrok.cc
//		System.out.println(InetAddress.getByName(Config.weixin_payno_client_ip).getHostAddress());
		String code="123456";
		System.out.println(CodeUtil.getMD5Encode(code));
	}
}
