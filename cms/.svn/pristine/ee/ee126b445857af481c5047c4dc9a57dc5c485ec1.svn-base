package com.jsz.peini.component;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;

import org.apache.http.ssl.SSLContextBuilder;
import org.apache.ibatis.javassist.expr.NewArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.ResourceUtils;

import com.jsz.peini.util.constant.Config;

public class SSLContextBuilderFactory {

	private static Logger logger = LogManager.getLogger(SSLContextBuilderFactory.class);
	private SSLContextBuilder httpSSLContextBuilder;
	private static FileInputStream fileInputStream;
	private static KeyStore keyStore;
	static{
		try {
			keyStore = KeyStore.getInstance("PKCS12");
			fileInputStream = new FileInputStream(ResourceUtils.getFile("classpath:apiclient_cert.p12"));
			keyStore.load(fileInputStream, Config.weixin_payno_mch_id.toCharArray());
		} catch (Exception e) {
			logger.error(e.getMessage());
		}finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		}
	}
	public static SSLContextBuilderFactory create() {
		return new SSLContextBuilderFactory();
	}
	public SSLContext build() throws UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
		SSLContext sslContext = httpSSLContextBuilder.loadKeyMaterial(SSLContextBuilderFactory.keyStore, Config.weixin_payno_mch_id.toCharArray()).build();
		return sslContext;
	}
	public SSLContextBuilder getHttpSSLContextBuilder() {
		return httpSSLContextBuilder;
	}
	public void setHttpSSLContextBuilder(SSLContextBuilder httpSSLContextBuilder) {
		this.httpSSLContextBuilder = httpSSLContextBuilder;
	}
}
