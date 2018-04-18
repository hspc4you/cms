package com.jsz.peini.mapper;

import com.jsz.peini.bean.TZbbdWithBLOBs;

public interface TZbbdMapper {
    int insert(TZbbdWithBLOBs record);

    int insertSelective(TZbbdWithBLOBs record);
}