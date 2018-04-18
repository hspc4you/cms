package com.jsz.peini.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jsz.peini.bean.UserSms;

public interface UserSmsMapper {
    int deleteByPrimaryKey(String smsid);

    int insert(UserSms record);

    int insertSelective(UserSms record);

    UserSms selectByPrimaryKey(String smsid);

    int updateByPrimaryKeySelective(UserSms record);

    int updateByPrimaryKeyWithBLOBs(UserSms record);

    int updateByPrimaryKey(UserSms record);
    
    String selectUserSmsCountMgr(String companyORseller);
    String selectUserSmsCount(String companyORseller);
    int updateByToId(String companyORseller);
    int updateBySmsId(String companyORseller);
    void updateUserSecretaryRead(@Param("userId")String userId);
}