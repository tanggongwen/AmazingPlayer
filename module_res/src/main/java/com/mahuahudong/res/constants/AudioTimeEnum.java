package com.mahuahudong.res.constants;

import java.io.Serializable;

public enum  AudioTimeEnum implements Serializable {
    TYPE_INFINITE(0,"不限",false),
    TYPE_10M(600,"10分钟",false),
    TYPE_30M(1800,"30分钟",false),
    TYPE_1H(3600,"1小时",false),
    TYPE_2H(7200,"2小时",false),
    TYPE_3H(10800,"3小时",false),
    TYPE_6H(21600,"6小时",false),
    TYPE_12H(43200,"12小时",false);
    private long time;
    private String timeType;
    private boolean seleted;
    AudioTimeEnum(long time,String timeType,boolean seleted){
        this.time = time;
        this.timeType = timeType;
        this.seleted = seleted;
    }

    public String getTimeType() {
        return timeType;
    }

    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isSeleted() {
        return seleted;
    }

    public void setSeleted(boolean seleted) {
        this.seleted = seleted;
    }
}
