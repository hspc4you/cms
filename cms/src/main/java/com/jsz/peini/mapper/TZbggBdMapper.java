package com.jsz.peini.mapper;

import java.util.List;

import com.jsz.peini.bean.TZbggBd;

public interface TZbggBdMapper {
    int insert(TZbggBd record);

    int insertSelective(TZbggBd record);
    
    List<TZbggBd> selectZbbdByGgcode(String ggcode);
}