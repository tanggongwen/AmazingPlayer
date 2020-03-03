package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class AskLawExposeListBean implements Serializable {

    /**
     * crtDate : 2020-02-19 17:41:46
     * issueStamp : 1582105306000
     * prdSimpleVOList : []
     * repl : 给你五百万
     * replTimeDiff : 242
     * replyTime : 2020-02-20 14:06:33
     * replyTimeStamp : 1582178793000
     * rpAttachVOList : []
     * rpContent : 没钱
     * rpId : 679744449001164800
     * rpTitle : 钱的
     * rpUserId : 656127974722113536
     * rpUserName : 鸢丶
     * sgRUserVO : {"petName":"鸢丶","profilePhoto":"https://dev-cdn-oss-zhcs.csbtv.com/zhcs-dev/images/656888599870050304.gif?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=1582182512&Signature=bRnH5he%2FC0x%2BxO0OPyNApmob1ug%3D"}
     * timeDif : 73729
     */

    private String crtDate;
    private String issueStamp;
    private String repl;
    private String replTimeDiff;
    private String replyTime;
    private String replyTimeStamp;
    private String rpContent;
    private String rpId;
    private String rpTitle;
    private String rpUserId;
    private String rpUserName;
    private SgRUserVOBean sgRUserVO;
    private String timeDif;
    private List<?> prdSimpleVOList;
    private List<AskLawExposeBean.ReAttachVO> rpAttachVOList;

    public String getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(String crtDate) {
        this.crtDate = crtDate;
    }

    public String getIssueStamp() {
        return issueStamp;
    }

    public void setIssueStamp(String issueStamp) {
        this.issueStamp = issueStamp;
    }

    public String getRepl() {
        return repl;
    }

    public void setRepl(String repl) {
        this.repl = repl;
    }

    public String getReplTimeDiff() {
        return replTimeDiff;
    }

    public void setReplTimeDiff(String replTimeDiff) {
        this.replTimeDiff = replTimeDiff;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyTimeStamp() {
        return replyTimeStamp;
    }

    public void setReplyTimeStamp(String replyTimeStamp) {
        this.replyTimeStamp = replyTimeStamp;
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

    public SgRUserVOBean getSgRUserVO() {
        return sgRUserVO;
    }

    public void setSgRUserVO(SgRUserVOBean sgRUserVO) {
        this.sgRUserVO = sgRUserVO;
    }

    public String getTimeDif() {
        return timeDif;
    }

    public void setTimeDif(String timeDif) {
        this.timeDif = timeDif;
    }

    public List<?> getPrdSimpleVOList() {
        return prdSimpleVOList;
    }

    public void setPrdSimpleVOList(List<?> prdSimpleVOList) {
        this.prdSimpleVOList = prdSimpleVOList;
    }

    public List<AskLawExposeBean.ReAttachVO> getRpAttachVOList() {
        return rpAttachVOList;
    }

    public void setRpAttachVOList(List<AskLawExposeBean.ReAttachVO> rpAttachVOList) {
        this.rpAttachVOList = rpAttachVOList;
    }

    public static class SgRUserVOBean {
        /**
         * petName : 鸢丶
         * profilePhoto : https://dev-cdn-oss-zhcs.csbtv.com/zhcs-dev/images/656888599870050304.gif?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=1582182512&Signature=bRnH5he%2FC0x%2BxO0OPyNApmob1ug%3D
         */

        private String petName;
        private String profilePhoto;

        public String getPetName() {
            return petName;
        }

        public void setPetName(String petName) {
            this.petName = petName;
        }

        public String getProfilePhoto() {
            return profilePhoto;
        }

        public void setProfilePhoto(String profilePhoto) {
            this.profilePhoto = profilePhoto;
        }
    }
}
