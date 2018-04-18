package com.jsz.peini.mapper;

import com.jsz.peini.bean.WxUserInfo;

public interface WxUserInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(WxUserInfo record);

    int insertSelective(WxUserInfo record);

    WxUserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WxUserInfo record);

    int updateByPrimaryKey(WxUserInfo record);
    
    WxUserInfo selectWxUserInfoByOpenId(String openId);
}