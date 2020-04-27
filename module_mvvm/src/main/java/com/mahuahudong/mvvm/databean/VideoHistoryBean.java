package com.mahuahudong.mvvm.databean;

import org.greenrobot.greendao.annotation.Entity;

import java.io.Serializable;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class VideoHistoryBean{
    private String vid;
    private String pic;
    private String name;
    private long timeStamp;
    @Generated(hash = 892475195)
    public VideoHistoryBean(String vid, String pic, String name, long timeStamp) {
        this.vid = vid;
        this.pic = pic;
        this.name = name;
        this.timeStamp = timeStamp;
    }
    @Generated(hash = 1760939228)
    public VideoHistoryBean() {
    }
    public String getVid() {
        return this.vid;
    }
    public void setVid(String vid) {
        this.vid = vid;
    }
    public String getPic() {
        return this.pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getTimeStamp() {
        return this.timeStamp;
    }
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
