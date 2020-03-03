package com.mahuahudong.res.constants;

import java.io.Serializable;

/**
 * 栏目类型:1 新闻栏目 2 视频栏目，只关联视频新闻 3 电台 只关联节目 4 小视频栏目 只关联短视频
 * @return
 */
public enum ColumnTypeEnum implements Serializable {
    TYPE_NROMAL("1"),//左文右图
    TYPE_VIDEO("2"),
    TYPE_STATION("3"),
    TYPE_SHORTVIDEO("4");

    private String tagType;
    ColumnTypeEnum(String tagType){
        this.tagType = tagType;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }


}
