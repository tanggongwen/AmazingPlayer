package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class ExposeBean implements Serializable {

    /**
     * attaches : [{"attachId":"224324324234234324","attachType":"1","attachUrl":"images/cover.png","tipoffId":"643400095240425472"}]
     * timeDif : 1385265
     * timeStamp : 1573468937
     * tipoffAddr :
     * tipoffId : 643400095240425472
     * tipoffTitle : 哈哈
     * tipoffUserId : 638679886042632192
     * tipoffUserName : jjh
     * userMobile : 17346989717
     */

    private String timeDif;
    private String timeStamp;
    private String tipoffAddr;
    private String tipoffId;
    private String tipoffTitle;
    private String tipoffUserId;
    private String tipoffUserName;
    private String userMobile;
    private String tipoffContent;
    private List<AttachesBean> attaches;

    public String getTimeDif() {
        return timeDif;
    }

    public void setTimeDif(String timeDif) {
        this.timeDif = timeDif;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTipoffAddr() {
        return tipoffAddr;
    }

    public void setTipoffAddr(String tipoffAddr) {
        this.tipoffAddr = tipoffAddr;
    }

    public String getTipoffId() {
        return tipoffId;
    }

    public void setTipoffId(String tipoffId) {
        this.tipoffId = tipoffId;
    }

    public String getTipoffTitle() {
        return tipoffTitle;
    }

    public void setTipoffTitle(String tipoffTitle) {
        this.tipoffTitle = tipoffTitle;
    }

    public String getTipoffUserId() {
        return tipoffUserId;
    }

    public void setTipoffUserId(String tipoffUserId) {
        this.tipoffUserId = tipoffUserId;
    }

    public String getTipoffUserName() {
        return tipoffUserName;
    }

    public void setTipoffUserName(String tipoffUserName) {
        this.tipoffUserName = tipoffUserName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public List<AttachesBean> getAttaches() {
        return attaches;
    }

    public void setAttaches(List<AttachesBean> attaches) {
        this.attaches = attaches;
    }

    public String getTipoffContent() {
        return tipoffContent;
    }

    public void setTipoffContent(String tipoffContent) {
        this.tipoffContent = tipoffContent;
    }

    public static class AttachesBean {
        /**
         * attachId : 224324324234234324
         * attachType : 1
         * attachUrl : images/cover.png
         * tipoffId : 643400095240425472
         */

        private String attachId;
        private String attachType;
        private String attachUrl;
        private String tipoffId;

        public String getAttachId() {
            return attachId;
        }

        public void setAttachId(String attachId) {
            this.attachId = attachId;
        }

        public String getAttachType() {
            return attachType;
        }

        public void setAttachType(String attachType) {
            this.attachType = attachType;
        }

        public String getAttachUrl() {
            return attachUrl;
        }

        public void setAttachUrl(String attachUrl) {
            this.attachUrl = attachUrl;
        }

        public String getTipoffId() {
            return tipoffId;
        }

        public void setTipoffId(String tipoffId) {
            this.tipoffId = tipoffId;
        }
    }
}
