package com.mahuahudong.res.beans;

import java.io.Serializable;

public class MissionBean implements Serializable {

    /**
     * action :
     * finishedTime : 0
     * oneOpPoint : 1
     * ruleDesc :
     * skipType :
     * taskActiTitle : 阅读文章或视频
     * taskActiUrl :
     * totalTime : 5
     */

    private String action;
    private int finishedCount;
    private int oneOpPoint;
    private String ruleDesc;
    private String skipType;
    private String taskActiTitle;
    private String taskActiUrl;
    private int totalCount;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }



    public int getOneOpPoint() {
        return oneOpPoint;
    }

    public void setOneOpPoint(int oneOpPoint) {
        this.oneOpPoint = oneOpPoint;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public String getSkipType() {
        return skipType;
    }

    public void setSkipType(String skipType) {
        this.skipType = skipType;
    }

    public String getTaskActiTitle() {
        return taskActiTitle;
    }

    public void setTaskActiTitle(String taskActiTitle) {
        this.taskActiTitle = taskActiTitle;
    }

    public String getTaskActiUrl() {
        return taskActiUrl;
    }

    public void setTaskActiUrl(String taskActiUrl) {
        this.taskActiUrl = taskActiUrl;
    }

    public int getFinishedCount() {
        return finishedCount;
    }

    public void setFinishedCount(int finishedCount) {
        this.finishedCount = finishedCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
