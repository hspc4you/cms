package com.jsz.peini.mapper;

import com.jsz.peini.bean.TOrders;

public interface TOrdersMapper {
    int deleteByPrimaryKey(String orderscode);

    int insert(TOrders record);

    int insertSelective(TOrders record);

    TOrders selectByPrimaryKey(String orderscode);

    int updateByPrimaryKeySelective(TOrders record);

    int updateByPrimaryKey(TOrders record);
    
    TOrders selectTOrdersByTbdwname(String tbdwname) ;
    
    
}