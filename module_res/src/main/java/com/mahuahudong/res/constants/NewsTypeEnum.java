package com.mahuahudong.res.constants;

import java.io.Serializable;

public enum  NewsTypeEnum implements Serializable {
    TYPE_NORMAL("1"),//左文右图
    TYPE_VIDEO("2"),
    TYPE_LIVE("3"),
    TYPE_ADV("4"),
    TYPE_IMAGELIVE("5"),
    TYPE_SPECIAL("6"),
    TYPE_IMAGES("7");
    private String newsType;
    NewsTypeEnum(String newsType){
        this.newsType = newsType;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }


}
