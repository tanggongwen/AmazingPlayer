package com.mahuahudong.res.constants;

import java.io.Serializable;

/**
 * 1-左文右图（默认，如果正文有视频，图片上显示视频长度，多个视频，显示第一条视频）
 * 2-无图
 * 3-多图
 * 4-大图
 * 5.自动播放视频
 * 6.列表视频
 * 7.列表小视频
 */
public enum NewsFormEnum implements Serializable {
    TYPE_MEDIA("1"),//左文右图
    TYPE_TEXT("2"),
    TYPE_IMAGES("3"),
    TYPE_BIGIMAGE("4"),
    TYPE_AUTOVIDEO("5"),
    TYPE_VIDEO("6"),
    TYPE_SHORTVIDEO("7");
    private String formType;
    NewsFormEnum(String formType){
        this.formType = formType;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }


}
