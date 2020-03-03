package com.mahuahudong.mvvm.utils.constant;

import java.io.Serializable;

public enum NormalRouterEnum implements Serializable {
    TYPE_EXTRAURL("1"),//外部网页
    TYPE_NORMALNEWSDETAIL("2"),//普通新闻
    TYPE_IMAGENEWSDETAIL("3"),//图文新闻
    TYPE_LIVEDETAIL("4"),//直播新闻
    TYPE_SPECIALNEWSDETAIL("5"),//专题新闻
    TYPE_VIDEODETAIL("6"),//视频新闻
    TYPE_SHORTVIDEODETAIL("7"),//小视频
    TYPE_STATIONDETAIL("8"),//电台
    TYPE_AUDIOCOLUMNDETAIL("9"),//音频
    TYPE_IMAGELIVEDETAIL("10"),//图文直播
    TYPE_ADSDETAIL("11"),//广告新闻
    TYPE_SPECVIDEO("12");//视频专题
    private String actionType;
    NormalRouterEnum(String actionType){
        this.actionType = actionType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String newsType) {
        this.actionType = newsType;
    }
}
