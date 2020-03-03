package com.mahuahudong.res.beans;

import java.io.Serializable;

public class ShareBean implements Serializable {
    private String shareType;
    private int shareRes;
    private String shareTip;

    public String getShareTip() {
        return shareTip;
    }

    public void setShareTip(String shareTip) {
        this.shareTip = shareTip;
    }

    public int getShareRes() {
        return shareRes;
    }

    public void setShareRes(int shareRes) {
        this.shareRes = shareRes;
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }
}
