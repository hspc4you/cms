package com.jsz.peini.mapper;

import java.util.List;

import com.jsz.peini.bean.TOrdersdetail;

public interface TOrdersdetailMapper {
    int deleteByPrimaryKey(Short id);

    int insert(TOrdersdetail record);

    int insertSelective(TOrdersdetail record);

    TOrdersdetail selectByPrimaryKey(Short id);

    int updateByPrimaryKeySelective(TOrdersdetail record);

    int updateByPrimaryKey(TOrdersdetail record);
    
    List<TOrdersdetail> selectTOrdersdetailListByOrderscode(String orderscode);
    
    int deleteByOrderscode(String orderscode);
    
    List<TOrdersdetail> selectPayBDByTbdwname(String tbdwname);
}