package com.jsz.peini.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.sql.ast.statement.SQLIfStatement.ElseIf;
import com.jsz.peini.bean.WxFestivalActivity;
import com.jsz.peini.bean.WxFestivalActivityUser;
import com.jsz.peini.mapper.WxFestivalActivityMapper;
import com.jsz.peini.mapper.WxFestivalActivityUserMapper;

@Service
public class WxFestivalActivityUserService {
	private Logger logger = LogManager.getLogger(WxFestivalActivityUserService.class);
	@Autowired
	private WxFestivalActivityUserMapper wxFestivalActivityUserMapper;
	@Autowired
	private WxFestivalActivityMapper wxFestivalActivityMapper;

	@Transactional
	public String activeAward(String userId, Integer activityId) {

		WxFestivalActivityUser ActivityUserStatistics = wxFestivalActivityUserMapper.selectQualificationByUserId(userId, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		if (ActivityUserStatistics.getTodayCount().intValue() == 1 && ActivityUserStatistics.getShareSum().intValue() == 0) {
			// 用户当日抽奖1次，没有第二次机会时
			return "将活动转发至朋友圈可获得1次机会哦~";
		}
		/*WxFestivalActivityUser wxFestivalActivityUser = wxFestivalActivityUserMapper.selectActivityUserByUserId(userId, activityId);
		if (wxFestivalActivityUser != null) {
			// 当用户当日抽奖1次，有2次机会
			WxFestivalActivity wxFestivalActivity = wxFestivalActivityMapper.selectNextActivity(activityId);
			if (wxFestivalActivity == null) {
				return "抽奖已经结束了,感谢您的参与";
			} else {
				return "本轮奖励抢空啦~下一轮" + wxFestivalActivity.getActivityName() + "将在" + (wxFestivalActivity.getActivityTime().equals(new SimpleDateFormat("yyyy-MM-dd").format(new Date())) ? "今天" : "明天") + wxFestivalActivity.getActivityStartTime() + "开启，记得来抢哦~";
			}
		}*/
		if (ActivityUserStatistics.getTodayCount().intValue() == 2) {
			// 当用户当日抽奖2次，点击抽奖提示
			WxFestivalActivity wxFestivalActivity = wxFestivalActivityMapper.selectTomorrowActivity(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			if (wxFestivalActivity == null) {
				return "您已没有抽奖次数,感谢您的参与";
			}else {
				return "您已没有抽奖次数，明日" + wxFestivalActivity.getActivityName() + "将在"+wxFestivalActivity.getActivityStartTime()+"开启，记得参加哦~";
			}
		}
		//判断完资格之后顺利报名
		WxFestivalActivityUser wxFestivalActivityUser = new WxFestivalActivityUser();
		wxFestivalActivityUser.setWxUserId(userId);
		wxFestivalActivityUser.setActivityId(activityId);
		wxFestivalActivityUser.setActivityTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		wxFestivalActivityUserMapper.insertSelective(wxFestivalActivityUser);
		return null;
	}
	@Transactional
	public void activityUserNoAward(String userId, Integer activityId,Integer isAward) {
		wxFestivalActivityUserMapper.updateActivityUserAwardResultByUserId(userId, activityId, isAward);
	}
	@Transactional
	public void shareToCircleOfFriends(String userId  ,String wxShareTime) {
		wxFestivalActivityUserMapper.updateActivityUserShareStatus(userId, wxShareTime);
	}
}
