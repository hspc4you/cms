package com.jsz.peini.util.constant;

import java.util.ResourceBundle;

public class Config {
	public static final String weixin_serverno_authorize_url;
	public static final String weixin_serverno_appid;
	public static final String weixin_serverno_redirect_uri;
	public static final String weixin_serverno_scope;
	public static final String weixin_serverno_https_scheme;
	public static final String weixin_serverno_api_host;
	public static final String weixin_serverno_access_token_path;
	public static final String weixin_serverno_secret;
	public static final String weixin_serverno_access_token_grant_type = "authorization_code";
	public static final String weixin_serverno_access_token_errcode = "40029";
	public static final String weixin_serverno_access_token_usedcode = "40163";
	public static final String weixin_serverno_jsapi_ticket_type = "jsapi";
	public static final String weixin_serverno_jsapi_ticket_path;
	public static final String weixin_serverno_token_path;
	public static final String weixin_serverno_token_grant_type = "client_credential";
	public static final String weixin_payno_mch_id;
	public static final String weixin_payno_client_ip;
	public static final String weixin_payno_paykey;
	public static final String weixin_payno_api_host;
	public static final String weixin_payno_sendredpack_path;

	public static final String alipay_url;
	public static final String alipay_app_id;
	public static final String alipay_format;
	public static final String alipay_charset;
	public static final String alipay_sign_type;
	public static final String alipay_version;
	public static final String alipay_public_key;
	public static final String alipay_private_key;
	public static final String alipay_product_code;
	static {
		ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
		weixin_serverno_authorize_url = resourceBundle.getString("weixin_serverno_authorize_url");
		weixin_serverno_appid = resourceBundle.getString("weixin_serverno_appid");
		weixin_serverno_redirect_uri = resourceBundle.getString("weixin_serverno_redirect_uri");
		weixin_serverno_scope = resourceBundle.getString("weixin_serverno_scope");
		weixin_serverno_https_scheme = resourceBundle.getString("weixin_serverno_https_scheme");
		weixin_serverno_api_host = resourceBundle.getString("weixin_serverno_api_host");
		weixin_serverno_access_token_path = resourceBundle.getString("weixin_serverno_access_token_path");
		weixin_serverno_secret = resourceBundle.getString("weixin_serverno_secret");
		weixin_serverno_jsapi_ticket_path = resourceBundle.getString("weixin_serverno_jsapi_ticket_path");
		weixin_serverno_token_path = resourceBundle.getString("weixin_serverno_token_path");
		weixin_payno_mch_id = resourceBundle.getString("weixin_payno_mch_id");
		weixin_payno_client_ip = resourceBundle.getString("weixin_payno_client_ip");
		weixin_payno_paykey = resourceBundle.getString("weixin_payno_paykey");
		weixin_payno_api_host = resourceBundle.getString("weixin_payno_api_host");
		weixin_payno_sendredpack_path = resourceBundle.getString("weixin_payno_sendredpack_path");
		alipay_url = resourceBundle.getString("alipay_url");
		alipay_app_id = resourceBundle.getString("alipay_app_id");
		alipay_format = resourceBundle.getString("alipay_format");
		alipay_charset = resourceBundle.getString("alipay_charset");
		alipay_sign_type = resourceBundle.getString("alipay_sign_type");
		alipay_version = resourceBundle.getString("alipay_version");
		alipay_public_key = resourceBundle.getString("alipay_public_key");
		alipay_private_key = resourceBundle.getString("alipay_private_key");
		alipay_product_code = resourceBundle.getString("alipay_product_code");
	}
}
