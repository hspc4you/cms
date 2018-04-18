package com.jsz.peini.bean;

public class WxFestivalActivity {
    private Integer id;

    private String activityName;

    private String activityTime;

    private String activityStartTime;

    private String activityEndTime;
    
    private String returnUrl;
    
    private String maxActivityTime;
    
    private String minActivityTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

	public String getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(String activityTime) {
		this.activityTime = activityTime;
	}

	public String getActivityStartTime() {
		return activityStartTime;
	}

	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public String getActivityEndTime() {
		return activityEndTime;
	}

	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getMaxActivityTime() {
		return maxActivityTime;
	}

	public void setMaxActivityTime(String maxActivityTime) {
		this.maxActivityTime = maxActivityTime;
	}

	public String getMinActivityTime() {
		return minActivityTime;
	}

	public void setMinActivityTime(String minActivityTime) {
		this.minActivityTime = minActivityTime;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}


}