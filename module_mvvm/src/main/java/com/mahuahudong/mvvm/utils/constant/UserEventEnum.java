package com.mahuahudong.mvvm.utils.constant;

import java.io.Serializable;

public enum UserEventEnum implements Serializable {
    TYPE_LOGIN("301"),
    TYPE_LOGOUT("302"),//退出
    TYPE_SERVICE("303"),
    TYPE_NEWS("201"),//普通新闻
    TYPE_IMAGESDETAIL("204"),//图文直播
    TYPE_SPECIALNEWSDETAIL("203"),//专题新闻
    TYPE_VIDEODETAIL("205"),//视频新闻
    TYPE_SHORTVIDEODETAIL("206"),//小视频
    TYPE_STATIONDETAIL("207"),//电台
    TYPE_AUDIOLIST("208"),//音频
    TYPE_AUDIOCOLUMNDETAIL("209"),//音频
    TYPE_IMAGELIVEDETAIL("202"),//图文直播
    TYPE_ADSDETAIL("广告新闻"),//广告新闻
    TYPE_SPECVIDEO("210"),//视频专题
    TYPE_ENTERAPP("101"),
    TYPE_LIVE("直播新闻");//直播

    private String actionType;
    UserEventEnum(String actionType){
        this.actionType = actionType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String newsType) {
        this.actionType = newsType;
    }
}
