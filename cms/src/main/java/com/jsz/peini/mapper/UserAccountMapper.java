package com.jsz.peini.mapper;

import java.util.List;

import com.jsz.peini.bean.UserAccount;

public interface UserAccountMapper {
	//更新用户金豆
    int updateGoldByUserId(UserAccount userAccount);
    //更新用户积分
    int updateScoreByUserId(UserAccount userAccount);
    //查询用户账户信息
    UserAccount selectByUserId(String userId);
    //更新支付密码
    int updatePayPwd(UserAccount userAccount);
    //创建用户账户信息
    int insert(String userId);
    int updateOldCustGoldByUserId(UserAccount userAccount);

    int deleteByPrimaryKey(Integer id);

    int insertAccount(UserAccount record);

    int insertSelective(UserAccount record);


    UserAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
}