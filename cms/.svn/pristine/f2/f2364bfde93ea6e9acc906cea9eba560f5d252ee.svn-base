package com.jsz.peini.mapper;

import java.util.LinkedHashMap;
import java.util.List;

import com.jsz.peini.bean.GoldHistory;
import com.jsz.peini.bean.GoldHistoryCustom;
import com.jsz.peini.bean.GoldHistoryQueryVo;

public interface GoldHistoryMapper {
    int deleteByPrimaryKey(String hisId);

    int insert(GoldHistory record);

    int insertSelective(GoldHistory record);

    GoldHistory selectByPrimaryKey(String hisId);

    int updateByPrimaryKeySelective(GoldHistory record);

    int updateByPrimaryKey(GoldHistory record);
    
    /**
     * @描述:<金豆充值实现层>
     * @日期:2017年8月3日
     * @作者:hesipeng
     * @param goldHistoryQueryVo
     * @return 列表数据
     */
    List<GoldHistoryCustom> selectGoldHistoryListBySelective(GoldHistoryQueryVo goldHistoryQueryVo);
    
    /**
     * @描述:<金豆流水实现曾>
     * @日期:2017年8月3日
     * @作者:hesipeng
     * @param goldHistoryQueryVo
     * @return 列表数据
     */
    List<GoldHistoryCustom> selectGoldDetailListBySelective(GoldHistoryQueryVo goldHistoryQueryVo);
    
    /**
     * @描述:<金豆流水汇总>
     * @日期:2017年8月4日
     * @作者:hesipeng
     * @param goldHistoryQueryVo
     * @return 流水汇总
     */
    GoldHistoryCustom selectGoldDetailSumBySelective(GoldHistoryQueryVo goldHistoryQueryVo);
    
    GoldHistoryCustom selectGoldHistorySum(GoldHistoryQueryVo goldHistoryQueryVo);
    
    String selectOrderCount();
    
    String selectPayMoneySum();
    
    String selectRechargeSum();
    
    List<LinkedHashMap<String,Object>> selectgoldhistory(GoldHistoryQueryVo goldHistoryQueryVo);
    
    
    List<LinkedHashMap<String,Object>> getGoldErrorPrompt(GoldHistory goldHistory);
    
}