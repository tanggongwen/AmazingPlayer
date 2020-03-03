package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class AskLawHelperMap implements Serializable {
    private String commentNum;
    private List<AskLawHelperBean> helperList;

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public List<AskLawHelperBean> getHelperList() {
        return helperList;
    }

    public void setHelperList(List<AskLawHelperBean> helperList) {
        this.helperList = helperList;
    }
}
