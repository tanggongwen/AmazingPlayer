package com.mahuahudong.res.beans;

import java.io.Serializable;

public class GiftBean implements Serializable {

    /**
     * endTime : 2020-02-05T07:01:31.560Z
     * giftId : string
     * giftName : string
     * giftType : string
     * status : string
     * taskActiId : string
     * userId : string
     */

    private String endTime;
    private String myGiftId;
    private String giftName;
    private String giftType;
    private String status;
    private String taskActiId;
    private String userId;

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }



    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftType() {
        return giftType;
    }

    public void setGiftType(String giftType) {
        this.giftType = giftType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskActiId() {
        return taskActiId;
    }

    public void setTaskActiId(String taskActiId) {
        this.taskActiId = taskActiId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMyGiftId() {
        return myGiftId;
    }

    public void setMyGiftId(String myGiftId) {
        this.myGiftId = myGiftId;
    }
}
