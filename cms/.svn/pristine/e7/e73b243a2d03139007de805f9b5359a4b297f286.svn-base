package com.jsz.peini.mapper;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.jsz.peini.bean.UserInfo;

public interface UserInfoMapper {
	

    int deleteByPrimaryKey(String id);

    int insert(UserInfo record);
    
    int insertByRegister(UserInfo userInfo);
    int insertSelective(UserInfo record);



    UserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKeyWithBLOBs(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    UserInfo selectByUserLoginId(int userLoginId);
    
    UserInfo selectByUserId(String userId);
    
    HashMap<String,Object> selectMapByUserId(String userId);
    //插入用户信息
    int insertByUserLoginId(UserInfo userInfo);
    //更新用户信息
    int updateByUserId(UserInfo userInfo);
    //更新用户头像信息
    int updateImageByUserId(UserInfo userInfo);
    
    int updateUserInfoIsIdcardByUserId(String userId);
    
    int updateUserInfoTaskNumByPlusAndMinus(UserInfo userInfo);
    
    int selectTaskNumByUserId(String id);
    
    List<LinkedHashMap<String,Object>> getGoldRank(int dType);
    
    List<LinkedHashMap<String,Object>> getMoneyRank(int dType);
    
    List<LinkedHashMap<String,Object>> getReputationRank(int dType);
    
    HashMap<String,Object> getUserGoldRank(HashMap<String,Object> rankMap);
    
    HashMap<String,Object> getUserMoneyRank(HashMap<String,Object> rankMap);
    
    HashMap<String,Object> getUserReputationRank(HashMap<String,Object> rankMap);

    int updateSwitchRank(UserInfo userInfo);
    
    int updateCreditByUserId(UserInfo userInfo);
    
    int getSwitchRank(String id);

	void updateSelectiveByPrimaryKey(UserInfo userInfo);
	
	/**
	 * 获取用户的登录信息、基本信息及账户信息
	 * @param userId
	 * @return
	 */
	List<LinkedHashMap<String, Object>> getUserInfoAndLoginAccountInfo(HashMap<String,Object> userMap);

	List<UserInfo> getUserInfoByMobiles(List<String> list);
	/**
	 * 根据用户userId查询用户账号
	 * @param userId
	 * @return
	 */
	UserInfo selectByUserPhone(String userPhone);
	String selectUserAccCodeByUserId(String userId);
	/**
	 * 将基本用户信息放入redis
	 * @author Han Guohong
	 * @return
	 */
	List<HashMap<String, String>> getUserInfoForRedis();
}