package com.jsz.peini.util.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MDUtil {
	
	public static String encodeMD(String userName) {
		Format format = new SimpleDateFormat("yyyyMMddHHmmss");
		String tokenName = format.format(new Date())+userName;
        try {  
            MessageDigest  digest = MessageDigest.getInstance("MD5");  
            byte[]  bytes = digest.digest(tokenName.getBytes());  
            StringBuffer sb = new  StringBuffer();  
            for(int i = 0;i<bytes.length;i++){  
                String s = Integer.toHexString(0xff&bytes[i]);  
                  
                if(s.length()==1){  
                    sb.append("0"+s);  
                }else{  
                    sb.append(s);  
                }  
            }  
              
            return sb.toString();  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
            throw new RuntimeException("NoSuchAlgorith");  
        }  
    }
	
	public static String encodePwd(String userPassword) {
        try {  
            MessageDigest  digest = MessageDigest.getInstance("MD5");  
            byte[]  bytes = digest.digest(userPassword.getBytes());  
            StringBuffer sb = new  StringBuffer();  
            for(int i = 0;i<bytes.length;i++){  
                String s = Integer.toHexString(0xff&bytes[i]);  
                  
                if(s.length()==1){  
                    sb.append("0"+s);  
                }else{  
                    sb.append(s);  
                }  
            }  
              
            return sb.toString();  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
            throw new RuntimeException("NoSuchAlgorith");  
        }
    }

}
