package com.mahuahudong.res.constants;

import java.io.Serializable;

public enum FeedBackTypeEnum implements Serializable {
    TOUSU(0,"投诉"),
    JIANYI(1,"建议"),
    BUG(2,"BUG反馈"),
    LOGIN(3,"登录遇到问题"),
    OTHER(4,"其它");
    private int  feedbackCode;
    private String feedbackType;
    FeedBackTypeEnum(int feedbackCode,String feedbackType){
        this.feedbackCode = feedbackCode;
        this.feedbackType = feedbackType;
    }

    public String getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    public int getFeedbackCode() {
        return feedbackCode;
    }

    public void setFeedbackCode(int feedbackCode) {
        this.feedbackCode = feedbackCode;
    }
}
