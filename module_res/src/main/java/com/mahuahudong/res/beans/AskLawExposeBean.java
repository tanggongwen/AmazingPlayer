package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class AskLawExposeBean implements Serializable {
    private String rpId;
    private String rpUserId;
    private String rpTitle;
    private String userTel;
    private String rpAddr;
    private String rpContent;
    private String rpUserName;
    private List<ReAttachVO> rpAttachVOList;

    public String getRpId() {
        return rpId;
    }

    public void setRpId(String rpId) {
        this.rpId = rpId;
    }

    public String getRpUserId() {
        return rpUserId;
    }

    public void setRpUserId(String rpUserId) {
        this.rpUserId = rpUserId;
    }

    public String getRpTitle() {
        return rpTitle;
    }

    public void setRpTitle(String rpTitle) {
        this.rpTitle = rpTitle;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getRpAddr() {
        return rpAddr;
    }

    public void setRpAddr(String rpAddr) {
        this.rpAddr = rpAddr;
    }

    public String getRpContent() {
        return rpContent;
    }

    public void setRpContent(String rpContent) {
        this.rpContent = rpContent;
    }

    public String getRpUserName() {
        return rpUserName;
    }

    public void setRpUserName(String rpUserName) {
        this.rpUserName = rpUserName;
    }

    public List<ReAttachVO> getRpAttachVOList() {
        return rpAttachVOList;
    }

    public void setRpAttachVOList(List<ReAttachVO> rpAttachVOList) {
        this.rpAttachVOList = rpAttachVOList;
    }


    public static class ReAttachVO {
        private String attachId;
        private String rpId;
        private String attachType;
        private String attachUrl;
        private String videoCover;

        public String getAttachId() {
            return attachId;
        }

        public void setAttachId(String attachId) {
            this.attachId = attachId;
        }

        public String getRpId() {
            return rpId;
        }

        public void setRpId(String rpId) {
            this.rpId = rpId;
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

        public String getVideoCover() {
            return videoCover;
        }

        public void setVideoCover(String videoCover) {
            this.videoCover = videoCover;
        }
    }
}
