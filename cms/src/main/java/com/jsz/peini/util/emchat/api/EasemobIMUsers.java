package com.jsz.peini.util.emchat.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.jsz.peini.util.emchat.comm.Constants;
import com.jsz.peini.util.emchat.comm.HTTPMethod;
import com.jsz.peini.util.emchat.comm.Roles;
import com.jsz.peini.util.emchat.utils.HTTPClientUtils;
import com.jsz.peini.util.emchat.vo.ClientSecretCredential;
import com.jsz.peini.util.emchat.vo.Credential;
import com.jsz.peini.util.emchat.vo.EndPoints;

/**
 * REST API Demo :用户体系集成 REST API HttpClient4.3实现
 * 
 * Doc URL: http://www.easemob.com/docs/rest/userapi
 * 
 * @author Lynch 2014-09-15
 * 
 */
public class EasemobIMUsers {

	private static Logger LOGGER = LoggerFactory.getLogger(EasemobIMUsers.class);

	// 通过app的client_id和client_secret来获取app管理员token
	private static Credential credential = new ClientSecretCredential(Constants.APP_CLIENT_ID, Constants.APP_CLIENT_SECRET, Roles.USER_ROLE_APPADMIN);

	public static void main(String[] args) {
		/**
		 * 注册IM用户[单个]
		 */
		JSONObject datanode = new JSONObject();
		datanode.put("username", "13315185682");
		datanode.put("password", "123456");
		datanode.put("nickname", "aaa");
		JSONObject createNewIMUserSingleNode = createNewIMUserSingle(datanode);
		if (null != createNewIMUserSingleNode) {
			LOGGER.info("注册IM用户[单个]: " + createNewIMUserSingleNode.toString());
			LOGGER.info("注册IM用户[单个]: " + createNewIMUserSingleNode.toString());
			JSONObject objectNode = JSON.parseObject(createNewIMUserSingleNode.toString());
			if ("200".equals(objectNode.get("statusCode").toString())) {
				LOGGER.info(objectNode.getJSONArray("entities").getJSONObject(0).get("uuid").toString());
			} else {
				LOGGER.info("false");
			}
			LOGGER.info("注册IM用户[单个]: " + createNewIMUserSingleNode.toString());
		}

		/**
		 * IM用户登录
		 */
		/*
		 * ObjectNode imUserLoginNode = imUserLogin(datanode.get("username").asText(), datanode.get("password").asText()); if (null != imUserLoginNode) { LOGGER.info("IM用户登录: " + imUserLoginNode.toString()); }
		 * 
		 *//**
			 * 注册IM用户[批量生成用户然后注册]
			 */
		/*
		 * String usernamePrefix = "miyi"; Long perNumber = 10l; Long totalNumber = 100l; ObjectNode createNewIMUserBatchGenNode = createNewIMUserBatchGen(usernamePrefix, perNumber, totalNumber); if (null != createNewIMUserBatchGenNode) { LOGGER.info("注册IM用户[批量]: " + createNewIMUserBatchGenNode.toString()); }
		 * 
		 *//**
			 * 获取IM用户[主键查询]
			 */
		/*
		 * String userPrimaryKey = "miyi"; ObjectNode getIMUsersByPrimaryKeyNode = getIMUsersByPrimaryKey(userPrimaryKey); if (null != getIMUsersByPrimaryKeyNode) { LOGGER.info("获取IM用户[主键查询]: " + getIMUsersByPrimaryKeyNode.toString()); }
		 * 
		 *//**
			 * 重置IM用户密码 提供管理员token
			 */
		/*
		 * String username = "miyi"; ObjectNode json2 = JsonNodeFactory.instance.objectNode(); json2.put("newpassword", Constants.DEFAULT_PASSWORD); ObjectNode modifyIMUserPasswordWithAdminTokenNode = modifyIMUserPasswordWithAdminToken(username, json2); if (null != modifyIMUserPasswordWithAdminTokenNode) { LOGGER.info("重置IM用户密码 提供管理员token: " + modifyIMUserPasswordWithAdminTokenNode.toString()); } ObjectNode imUserLoginNode2 = imUserLogin(username, json2.get("newpassword").asText()); if (null != imUserLoginNode2) { LOGGER.info("重置IM用户密码后,IM用户登录: " + imUserLoginNode2.toString()); }
		 *//**
			 * 重置IM用户昵称 提供管理员token
			 */
		/*
		 * username = "dx_18665478854"; json2 = JsonNodeFactory.instance.objectNode(); json2.put("nickname", "修改昵称"); ObjectNode updIMUserNicknameWithAdminToken = updIMUserNicknameWithAdminToken(username, json2); if (null != updIMUserNicknameWithAdminToken) { LOGGER.info("修改用户昵称 提供管理员token: " + updIMUserNicknameWithAdminToken.toString()); LOGGER.info(updIMUserNicknameWithAdminToken.toString()); }
		 * 
		 *//**
			 * 添加好友[单个]
			 */
		/*
		 * String ownerUserPrimaryKey = "daixin001"; String friendUserPrimaryKey = "dx_15982677350"; ObjectNode addFriendSingleNode = addFriendSingle(ownerUserPrimaryKey, friendUserPrimaryKey); if (null != addFriendSingleNode) { LOGGER.info("添加好友[单个]: " + addFriendSingleNode.toString()); LOGGER.info(addFriendSingleNode.toString()); }
		 * 
		 *//**
			 * 查看好友
			 */
		/*
		 * ObjectNode getFriendsNode = getFriends(ownerUserPrimaryKey); if (null != getFriendsNode) { LOGGER.info("查看好友: " + getFriendsNode.toString()); }
		 * 
		 *//**
			 * 解除好友关系
			 **/
		/*
		 * ObjectNode deleteFriendSingleNode = deleteFriendSingle(ownerUserPrimaryKey, friendUserPrimaryKey); if (null != deleteFriendSingleNode) { LOGGER.info("解除好友关系: " + deleteFriendSingleNode.toString()); }
		 * 
		 *//**
			 * 删除IM用户[单个]
			 */
		/*
		 * ObjectNode deleteIMUserByUserPrimaryKeyNode = deleteIMUserByUserPrimaryKey("daixin002"); if (null != deleteIMUserByUserPrimaryKeyNode) { LOGGER.info("删除IM用户[单个]: " + deleteIMUserByUserPrimaryKeyNode.toString()); }
		 * 
		 *//**
			 * 删除IM用户[批量]
			 *//*
				 * Long limit = 2l; ObjectNode deleteIMUserByUsernameBatchNode = deleteIMUserByUsernameBatch(limit, null); if (null != deleteIMUserByUsernameBatchNode) { LOGGER.info("删除IM用户[批量]: " + deleteIMUserByUsernameBatchNode.toString()); }
				 */
	}

	/**
	 * 注册IM用户[单个]
	 * 
	 * 给指定Constants.APPKEY创建一个新的用户
	 * 
	 * @param dataNode
	 * @return
	 */
	public static JSONObject createNewIMUserSingle(JSONObject dataNode) {

		JSONObject objectNode = new JSONObject();

		// check Constants.APPKEY format
		if (!HTTPClientUtils.match("^(?!-)[0-9a-zA-Z\\-]+#[0-9a-zA-Z]+", Constants.APPKEY)) {
			LOGGER.error("Bad format of Constants.APPKEY: " + Constants.APPKEY);

			objectNode.put("message", "Bad format of Constants.APPKEY");
			objectNode.put("statusCode", "400");

			return objectNode;
		}

		objectNode = new JSONObject();

		// check properties that must be provided
		if (null != dataNode && !dataNode.containsKey("username")) {
			LOGGER.error("Property that named username must be provided .");

			objectNode.put("message", "Property that named username must be provided .");
			objectNode.put("statusCode", "400");

			return objectNode;
		}
		if (null != dataNode && !dataNode.containsKey("password")) {
			LOGGER.error("Property that named password must be provided .");

			objectNode.put("message", "Property that named password must be provided .");
			objectNode.put("statusCode", "400");

			return objectNode;
		}
		if (null != dataNode && !dataNode.containsKey("password")) {
			LOGGER.error("Property that named nickname must be provided .");

			objectNode.put("message", "Property that named nickname must be provided .");
			objectNode.put("statusCode", "400");

			return objectNode;
		}

		try {

			objectNode = HTTPClientUtils.sendHTTPRequest(EndPoints.USERS_URL, credential, dataNode, HTTPMethod.METHOD_POST);

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

		return objectNode;
	}


}
