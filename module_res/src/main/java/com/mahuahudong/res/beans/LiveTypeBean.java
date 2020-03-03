package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class LiveTypeBean implements Serializable {

    /**
     * classId : 0
     * className : 默认分类
     * newsList : []
     */

    private String classId;
    private String className;
    private List<?> newsList;

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<?> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<?> newsList) {
        this.newsList = newsList;
    }
}
