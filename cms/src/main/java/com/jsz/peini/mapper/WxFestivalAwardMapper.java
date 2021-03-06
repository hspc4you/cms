package com.jsz.peini.mapper;

import com.jsz.peini.bean.WxFestivalAward;

public interface WxFestivalAwardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WxFestivalAward record);

    int insertSelective(WxFestivalAward record);

    WxFestivalAward selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxFestivalAward record);

    WxFestivalAward selectByPrimaryKeyForUpdate(Integer id);
    int updateByPrimaryKey(WxFestivalAward record);
}