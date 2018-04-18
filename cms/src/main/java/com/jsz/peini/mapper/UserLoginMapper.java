package com.jsz.peini.mapper;


import java.util.List;

import com.jsz.peini.bean.UserLogin;




public interface UserLoginMapper {
	
    //int insert(UserLogin userLogin);
	
	//查询登录信息
    UserLogin selectByLogin(UserLogin userLogin);
    
    //更新登录时间
    int updateByUserLoginId(int userLoginId);
    
    //注册登录帐号是否被注册
    List<UserLogin> selectByUserName(String userName);
    
    //注册添加登录密码
    int insertByUserLogin(UserLogin userLogin);
    
  	//查询第三方登录信息
    UserLogin selectByThirdName(UserLogin userLogin);

    //第三方注册
    int registerThirdUserLogin(UserLogin userLogin);
    
    //更新密码
    int updatePwdByUserName(UserLogin userLogin);
    
    //更新绑定手机号
    int updatePhoneByUserLoginId(UserLogin userLogin);
    
    /**
     * 根据主键查询实体
     * @param id
     * @return
     */
    UserLogin selectByPrimaryKey(Integer id);
    
    
    /**
     * 根据userInfo的主键查询Login实体
     * @param userId
     * @return
     */
    UserLogin selectByUserId(String userId);
    
    void updateByPrimaryKeySelective(UserLogin userLogin);
}