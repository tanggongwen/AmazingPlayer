package com.mahuahudong.res.beans;

import java.io.Serializable;

public class AskLawHelperBean implements Serializable {

    /**
     * memberBrief : 13123123
     * memberId : 667062665054654464
     * memberLabel : 13123132
     * memberName : 12312312313
     * photoUrl : https://dev-cdn-oss-zhcs.csbtv.com/zhcs-uat/images/667062662038949888.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=1580804797&Signature=wMmr6iIADCs6s7V7rXiEQgqhHrM%3D
     */

    private String memberBrief;
    private String memberId;
    private String memberLabel;
    private String memberName;
    private String photoUrl;

    public String getMemberBrief() {
        return memberBrief;
    }

    public void setMemberBrief(String memberBrief) {
        this.memberBrief = memberBrief;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberLabel() {
        return memberLabel;
    }

    public void setMemberLabel(String memberLabel) {
        this.memberLabel = memberLabel;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
