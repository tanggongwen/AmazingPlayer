package com.mahuahudong.res.beans;

import java.io.Serializable;

public class UserBean implements Serializable {

    /**
     * addr :
     * birthDate :
     * cardNo :
     * isSigned : 0
     * petName :
     * profilePhoto : http://dev-rgw.zhcs.csbtv.com/zhcs/images/7db3a6b5b2ff443faef15a6e506c924b.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=1572593492&Signature=lh6I3YQBjVzCXELfp8TNLTRXDdo%3D
     * sex :
     * userName : jjh
     */

    private String addr;
    private String birthDate;
    private String cardNo;
    private String isSigned;
    private String petName;
    private String profilePhoto;
    private String sex;
    private String userName;
    private String mobile;
    private String userId;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getIsSigned() {
        return isSigned;
    }

    public void setIsSigned(String isSigned) {
        this.isSigned = isSigned;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
