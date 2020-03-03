package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class AddAskLawRespBean implements Serializable {

    /**
     * rpAddr : 湖南省长沙市雨花区圭塘
     * rpAttachVOList : [{"attachId":"680429604200124416","attachType":"2","attachUrl":"/storage/emulated/0/DCIM/Camera/VID_20200221_145530.mp4","rpId":"680429602514014208"}]
     * rpContent : 我要维权，黑心公司
     * rpId : 680429602518208512
     * rpTitle : 哈哈
     * rpUserId : 656127974722113536
     * rpUserName : 鸢丶
     * userTel : 17346989717
     */

    private String rpAddr;
    private String rpContent;
    private String rpId;
    private String rpTitle;
    private String rpUserId;
    private String rpUserName;
    private String userTel;
    private List<RpAttachVOListBean> rpAttachVOList;

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

    public String getRpId() {
        return rpId;
    }

    public void setRpId(String rpId) {
        this.rpId = rpId;
    }

    public String getRpTitle() {
        return rpTitle;
    }

    public void setRpTitle(String rpTitle) {
        this.rpTitle = rpTitle;
    }

    public String getRpUserId() {
        return rpUserId;
    }

    public void setRpUserId(String rpUserId) {
        this.rpUserId = rpUserId;
    }

    public String getRpUserName() {
        return rpUserName;
    }

    public void setRpUserName(String rpUserName) {
        this.rpUserName = rpUserName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public List<RpAttachVOListBean> getRpAttachVOList() {
        return rpAttachVOList;
    }

    public void setRpAttachVOList(List<RpAttachVOListBean> rpAttachVOList) {
        this.rpAttachVOList = rpAttachVOList;
    }

    public static class RpAttachVOListBean {
        /**
         * attachId : 680429604200124416
         * attachType : 2
         * attachUrl : /storage/emulated/0/DCIM/Camera/VID_20200221_145530.mp4
         * rpId : 680429602514014208
         */

        private String attachId;
        private String attachType;
        private String attachUrl;
        private String rpId;

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

        public String getRpId() {
            return rpId;
        }

        public void setRpId(String rpId) {
            this.rpId = rpId;
        }
    }
}
