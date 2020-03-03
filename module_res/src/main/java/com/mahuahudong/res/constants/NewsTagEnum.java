package com.mahuahudong.res.constants;

import java.io.Serializable;

/**
 * 1置顶 2推荐 3图文直播 4直播 5回看 6专题 7广告
 * @return
 */
public enum NewsTagEnum implements Serializable {
    TYPE_TOP("1"),//左文右图
    TYPE_REC("2"),
    TYPE_IMAGELIVE("3"),
    TYPE_LIVE("4"),
    TYPE_REVIEW("5"),
    TYPE_SPECIAL("6"),
    TYPE_ADV("7");
    private String tagType;
    NewsTagEnum(String tagType){
        this.tagType = tagType;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }


}
