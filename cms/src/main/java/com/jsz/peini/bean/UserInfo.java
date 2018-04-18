package com.jsz.peini.bean;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
	private String id;

    private Integer userLoginId;
    
    private UserLogin userLogin;
    
    private String nickname;

    private String signWord;

    private String imageHead;

    private Integer sex;

    private String birthday;

    private Integer age;
    private Integer ageTop;

    private Integer height;
    private Integer heightTop;

    private Integer weight;
    private Integer weightTop;

    private Integer oldProvince;
    private String oldProvinceText;
    
    private Integer oldCity;
    private String oldCityText;

    private Integer oldCounty;
    private String oldCountyText;

    private Integer nowProvince;

    private Integer nowCity;
    //所在区县

    private Integer nowCounty;
    private String nowCountyText;

    private Integer constellation;
    private String constellationText;

    private Integer nation;
    private String nationText;

    private Integer smallIncome;

    private Integer bigIncome;

    private Integer degree;
    private String degreeText;

    private Integer industry;
    private String industryText;

    private Integer isHouse;
    private String isHouseText;

    private Integer isCar;
    private String isCarText;

    private Integer isPhone;

    private Integer isIdcard;
    private String birthdayTop;

    private Integer isVideo;

    private Integer emotion;
    private String emotionText;

    private Integer reputation;
    private Integer reputationTop;

    private Integer reputationMonth;
    
    private Integer reputationYear;

    private Integer reputationQuarter;

    private Integer goldList;
    private Integer goldListTop;

    private Integer buyList;
    private Integer buyListTop;

    private Integer integrityList;
    private Integer integrityListTop;

    private Integer userLife;

    private Integer userImage;

    private Integer userDate;

    private Integer userScore;

    private Integer selfNum;
    private Integer selfNumTop;

    private Integer idcardNum;
    private Integer idcardNumTop;

    private Integer taskNum;
    private Integer taskNumTop;

    private Integer isRank;

    private String accCode;

    private String regTime;

    private String updateTime;
    
    private String spaceBgImg;
    
    private String nowProvinceText;
    
    private String nowCityText;
    
    private Integer taskCancleCnt;
    
    private String activeTime;
    
    private String userPhone;
    
    private String blackList;
    
    private String idCardNo;//身份证号码
    
    private String realName;//真实姓名
    
    private Integer pageNow;
    
    private Integer pageSize;
    //剩余金豆数量
    private Integer gold;
    //充值金豆数量
    private Integer rechagegold;
    //用户身份
    private String acctype;
    
    //账号状态
    private String accStatus;
    
    //手机号
    private String userName;
    //注册时间
    private String regTimeTop;
    //最后登陆时间
    private String activeTimeTop;
    //任务取消次数
    private Integer taskCancleCntTop;
    //排序方式
    private Integer bytype;
    //排序方式
    private Integer bytype2;
    //开始时间
    private String startTime;
    //结束时间
    private String endTime;
    //年度信誉值
    private Integer reputationYearTop;
    //季度信誉值
    private Integer reputationQuarterTop;
    //月度信誉值
    private Integer reputationMonthTop;
    //生活品位评分
    private Integer userLifeTop;
    //形象评分
    private Integer userImageTop;
    //交往评分
    private Integer userDateTop;
    //综合评分
    private Integer userScoreTop;
    //个人空间背景图
    
    
    //非数据库

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(Integer userLoginId) {
		this.userLoginId = userLoginId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSignWord() {
		return signWord;
	}

	public void setSignWord(String signWord) {
		this.signWord = signWord;
	}

	public String getImageHead() {
		return imageHead;
	}

	public void setImageHead(String imageHead) {
		this.imageHead = imageHead;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getOldProvince() {
		return oldProvince;
	}

	public void setOldProvince(Integer oldProvince) {
		this.oldProvince = oldProvince;
	}

	public Integer getOldCity() {
		return oldCity;
	}

	public void setOldCity(Integer oldCity) {
		this.oldCity = oldCity;
	}

	public Integer getOldCounty() {
		return oldCounty;
	}

	public void setOldCounty(Integer oldCounty) {
		this.oldCounty = oldCounty;
	}

	public Integer getNowProvince() {
		return nowProvince;
	}

	public void setNowProvince(Integer nowProvince) {
		this.nowProvince = nowProvince;
	}

	public Integer getNowCity() {
		return nowCity;
	}

	public void setNowCity(Integer nowCity) {
		this.nowCity = nowCity;
	}

	public Integer getNowCounty() {
		return nowCounty;
	}

	public void setNowCounty(Integer nowCounty) {
		this.nowCounty = nowCounty;
	}

	public Integer getConstellation() {
		return constellation;
	}

	public void setConstellation(Integer constellation) {
		this.constellation = constellation;
	}

	public Integer getNation() {
		return nation;
	}

	public void setNation(Integer nation) {
		this.nation = nation;
	}

	public Integer getSmallIncome() {
		return smallIncome;
	}

	public void setSmallIncome(Integer smallIncome) {
		this.smallIncome = smallIncome;
	}

	public Integer getBigIncome() {
		return bigIncome;
	}

	public void setBigIncome(Integer bigIncome) {
		this.bigIncome = bigIncome;
	}

	public Integer getDegree() {
		return degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	public Integer getIndustry() {
		return industry;
	}

	public void setIndustry(Integer industry) {
		this.industry = industry;
	}

	public Integer getIsHouse() {
		return isHouse;
	}

	public void setIsHouse(Integer isHouse) {
		this.isHouse = isHouse;
	}

	public Integer getIsCar() {
		return isCar;
	}

	public void setIsCar(Integer isCar) {
		this.isCar = isCar;
	}

	public Integer getIsPhone() {
		return isPhone;
	}

	public void setIsPhone(Integer isPhone) {
		this.isPhone = isPhone;
	}

	public Integer getIsIdcard() {
		return isIdcard;
	}

	public void setIsIdcard(Integer isIdcard) {
		this.isIdcard = isIdcard;
	}

	public Integer getIsVideo() {
		return isVideo;
	}

	public void setIsVideo(Integer isVideo) {
		this.isVideo = isVideo;
	}

	public Integer getEmotion() {
		return emotion;
	}

	public void setEmotion(Integer emotion) {
		this.emotion = emotion;
	}

	public Integer getReputation() {
		return reputation;
	}

	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	public Integer getReputationMonth() {
		return reputationMonth;
	}

	public void setReputationMonth(Integer reputationMonth) {
		this.reputationMonth = reputationMonth;
	}

	public Integer getGoldList() {
		return goldList;
	}

	public void setGoldList(Integer goldList) {
		this.goldList = goldList;
	}

	public Integer getBuyList() {
		return buyList;
	}

	public void setBuyList(Integer buyList) {
		this.buyList = buyList;
	}

	public Integer getIntegrityList() {
		return integrityList;
	}

	public void setIntegrityList(Integer integrityList) {
		this.integrityList = integrityList;
	}

	public Integer getUserLife() {
		return userLife;
	}

	public void setUserLife(Integer userLife) {
		this.userLife = userLife;
	}

	public Integer getUserImage() {
		return userImage;
	}

	public void setUserImage(Integer userImage) {
		this.userImage = userImage;
	}

	public Integer getUserDate() {
		return userDate;
	}

	public void setUserDate(Integer userDate) {
		this.userDate = userDate;
	}

	public Integer getUserScore() {
		return userScore;
	}

	public void setUserScore(Integer userScore) {
		this.userScore = userScore;
	}

	public Integer getSelfNum() {
		return selfNum;
	}

	public void setSelfNum(Integer selfNum) {
		this.selfNum = selfNum;
	}

	public Integer getIdcardNum() {
		return idcardNum;
	}

	public void setIdcardNum(Integer idcardNum) {
		this.idcardNum = idcardNum;
	}

	public Integer getTaskNum() {
		return taskNum;
	}

	public void setTaskNum(Integer taskNum) {
		this.taskNum = taskNum;
	}

	public Integer getIsRank() {
		return isRank;
	}

	public void setIsRank(Integer isRank) {
		this.isRank = isRank;
	}

	public String getAccCode() {
		return accCode;
	}

	public void setAccCode(String accCode) {
		this.accCode = accCode;
	}

	public String getNowProvinceText() {
		return nowProvinceText;
	}

	public void setNowProvinceText(String nowProvinceText) {
		this.nowProvinceText = nowProvinceText;
	}

	public String getNowCityText() {
		return nowCityText;
	}

	public void setNowCityText(String nowCityText) {
		this.nowCityText = nowCityText;
	}

	public String getSpaceBgImg() {
		return spaceBgImg;
	}

	public void setSpaceBgImg(String spaceBgImg) {
		this.spaceBgImg = spaceBgImg;
	}

	public Integer getTaskCancleCnt() {
		return taskCancleCnt;
	}

	public void setTaskCancleCnt(Integer taskCancleCnt) {
		this.taskCancleCnt = taskCancleCnt;
	}

	public UserLogin getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLogin userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getBlackList() {
		return blackList;
	}

	public void setBlackList(String blackList) {
		this.blackList = blackList;
	}

	public Integer getReputationYear() {
		return reputationYear;
	}

	public void setReputationYear(Integer reputationYear) {
		this.reputationYear = reputationYear;
	}

	public Integer getReputationQuarter() {
		return reputationQuarter;
	}

	public void setReputationQuarter(Integer reputationQuarter) {
		this.reputationQuarter = reputationQuarter;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getAgeTop() {
		return ageTop;
	}

	public void setAgeTop(Integer ageTop) {
		this.ageTop = ageTop;
	}

	public Integer getHeightTop() {
		return heightTop;
	}

	public void setHeightTop(Integer heightTop) {
		this.heightTop = heightTop;
	}

	public Integer getWeightTop() {
		return weightTop;
	}

	public void setWeightTop(Integer weightTop) {
		this.weightTop = weightTop;
	}

	public String getOldProvinceText() {
		return oldProvinceText;
	}

	public void setOldProvinceText(String oldProvinceText) {
		this.oldProvinceText = oldProvinceText;
	}

	public String getOldCityText() {
		return oldCityText;
	}

	public void setOldCityText(String oldCityText) {
		this.oldCityText = oldCityText;
	}

	public String getOldCountyText() {
		return oldCountyText;
	}

	public void setOldCountyText(String oldCountyText) {
		this.oldCountyText = oldCountyText;
	}

	public String getNowCountyText() {
		return nowCountyText;
	}

	public void setNowCountyText(String nowCountyText) {
		this.nowCountyText = nowCountyText;
	}

	public String getConstellationText() {
		return constellationText;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public void setConstellationText(String constellationText) {
		this.constellationText = constellationText;
	}

	public String getNationText() {
		return nationText;
	}

	public void setNationText(String nationText) {
		this.nationText = nationText;
	}

	public String getDegreeText() {
		return degreeText;
	}

	public void setDegreeText(String degreeText) {
		this.degreeText = degreeText;
	}

	public String getIndustryText() {
		return industryText;
	}

	public void setIndustryText(String industryText) {
		this.industryText = industryText;
	}

	public String getIsHouseText() {
		return isHouseText;
	}

	public void setIsHouseText(String isHouseText) {
		this.isHouseText = isHouseText;
	}

	public String getIsCarText() {
		return isCarText;
	}

	public void setIsCarText(String isCarText) {
		this.isCarText = isCarText;
	}

	public String getBirthdayTop() {
		return birthdayTop;
	}

	public void setBirthdayTop(String birthdayTop) {
		this.birthdayTop = birthdayTop;
	}

	public String getEmotionText() {
		return emotionText;
	}

	public void setEmotionText(String emotionText) {
		this.emotionText = emotionText;
	}

	public Integer getReputationTop() {
		return reputationTop;
	}

	public void setReputationTop(Integer reputationTop) {
		this.reputationTop = reputationTop;
	}

	public Integer getGoldListTop() {
		return goldListTop;
	}

	public void setGoldListTop(Integer goldListTop) {
		this.goldListTop = goldListTop;
	}

	public Integer getBuyListTop() {
		return buyListTop;
	}

	public void setBuyListTop(Integer buyListTop) {
		this.buyListTop = buyListTop;
	}

	public Integer getIntegrityListTop() {
		return integrityListTop;
	}

	public void setIntegrityListTop(Integer integrityListTop) {
		this.integrityListTop = integrityListTop;
	}

	public Integer getSelfNumTop() {
		return selfNumTop;
	}

	public void setSelfNumTop(Integer selfNumTop) {
		this.selfNumTop = selfNumTop;
	}

	public Integer getIdcardNumTop() {
		return idcardNumTop;
	}

	public void setIdcardNumTop(Integer idcardNumTop) {
		this.idcardNumTop = idcardNumTop;
	}

	public Integer getTaskNumTop() {
		return taskNumTop;
	}

	public void setTaskNumTop(Integer taskNumTop) {
		this.taskNumTop = taskNumTop;
	}

	public Integer getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public Integer getRechagegold() {
		return rechagegold;
	}

	public void setRechagegold(Integer rechagegold) {
		this.rechagegold = rechagegold;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRegTimeTop() {
		return regTimeTop;
	}

	public void setRegTimeTop(String regTimeTop) {
		this.regTimeTop = regTimeTop;
	}

	public String getActiveTimeTop() {
		return activeTimeTop;
	}

	public void setActiveTimeTop(String activeTimeTop) {
		this.activeTimeTop = activeTimeTop;
	}

	public Integer getTaskCancleCntTop() {
		return taskCancleCntTop;
	}

	public void setTaskCancleCntTop(Integer taskCancleCntTop) {
		this.taskCancleCntTop = taskCancleCntTop;
	}

	public Integer getBytype() {
		return bytype;
	}

	public void setBytype(Integer bytype) {
		this.bytype = bytype;
	}

	public Integer getBytype2() {
		return bytype2;
	}

	public void setBytype2(Integer bytype2) {
		this.bytype2 = bytype2;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getReputationYearTop() {
		return reputationYearTop;
	}

	public void setReputationYearTop(Integer reputationYearTop) {
		this.reputationYearTop = reputationYearTop;
	}

	public Integer getReputationQuarterTop() {
		return reputationQuarterTop;
	}

	public void setReputationQuarterTop(Integer reputationQuarterTop) {
		this.reputationQuarterTop = reputationQuarterTop;
	}

	public Integer getReputationMonthTop() {
		return reputationMonthTop;
	}

	public void setReputationMonthTop(Integer reputationMonthTop) {
		this.reputationMonthTop = reputationMonthTop;
	}

	public Integer getUserLifeTop() {
		return userLifeTop;
	}

	public void setUserLifeTop(Integer userLifeTop) {
		this.userLifeTop = userLifeTop;
	}

	public Integer getUserImageTop() {
		return userImageTop;
	}

	public void setUserImageTop(Integer userImageTop) {
		this.userImageTop = userImageTop;
	}

	public Integer getUserDateTop() {
		return userDateTop;
	}

	public void setUserDateTop(Integer userDateTop) {
		this.userDateTop = userDateTop;
	}

	public Integer getUserScoreTop() {
		return userScoreTop;
	}

	public void setUserScoreTop(Integer userScoreTop) {
		this.userScoreTop = userScoreTop;
	}
}