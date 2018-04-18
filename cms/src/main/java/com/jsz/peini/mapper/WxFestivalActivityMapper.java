package com.jsz.peini.mapper;

import com.jsz.peini.bean.WxFestivalActivity;

public interface WxFestivalActivityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WxFestivalActivity record);

    int insertSelective(WxFestivalActivity record);

    WxFestivalActivity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxFestivalActivity record);

    int updateByPrimaryKey(WxFestivalActivity record);
    
    /**
     * 根据当前时间匹配活动
     * @param currentTime
     * @return
     */
    WxFestivalActivity selectActivityByCurrentTime(String currentTime);
    /**
     * 查询活动时间段
     * @return
     */
    WxFestivalActivity selectMax_MinActivity();
    
    
    /**
     * 查询下一次活动时间
     * @param activityId
     * @return
     */
    WxFestivalActivity selectNextActivity(Integer activityId);
    
    /**
     * 明日活动
     * @param activityId
     * @return
     */
    WxFestivalActivity selectTomorrowActivity(String today);
}