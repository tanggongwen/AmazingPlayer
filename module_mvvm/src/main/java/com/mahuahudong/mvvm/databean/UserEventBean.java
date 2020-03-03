package com.mahuahudong.mvvm.databean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class UserEventBean {

    //"用户ID"
    private String userId;

    //"访问来源:1 APP 2 公众号 3 微信分享", required = true)
    private String accessSrc;

    //"终端ID", required = true)
    private String deviceId;

    // "终端类型:IOS,安卓", required = true)
    private String deviceType;

    // = "设备品牌", required = true)
    private String brand;

    //@ApiModelProperty(value = "操作系统: ios=1 安卓=2", required = true)
    private String deviceOs;

    //@ApiModelProperty(value = "操作系统版本号", required = true)
    private String osVer;

    //@ApiModelProperty(value = "app版本", required = true)
    private String appVer;

    //@ApiModelProperty(value = "运营商:中国移动 = 1 中国联通 = 2 中国电信 = 3", required = true)
    private String carrier;

    //@ApiModelProperty(value = "连接类型: WIFI = 1 2G = 2 3G = 3 4G = 4", required = true)
    private String connType;

    //@ApiModelProperty(value = "GPS地理位置", required = true)
    private String gpsXy;

    //@ApiModelProperty(value = "经纬度类型:0--undefined,1--GCJ02,2--BD09LL,4--WGS84", required = true)
    private String gpsType;

    //@ApiModelProperty(value = "IP地址", required = true)
    private String ipAddr;

    //事件段
    //@ApiModelProperty(value = "埋点类型:1-新闻 2-视频 3-直播 4-服务", required = true)
    private String contentType;

    //@ApiModelProperty(value = "栏目ID", required = true)
    private String columnId;

    //@ApiModelProperty(value = "内容ID", required = true)
    private String contentId;

    //@ApiModelProperty(value = "访问时间", required = true)
    private String accessTime;

   //@ApiModelProperty(value = "停留时间", required = true)
    private String stayTime;

    //@ApiModelProperty(value = "结束时间", required = true)
    private String endTime;

    //@ApiModelProperty(value = "扩展字段", required = true)
    private String extendField;

    @Generated(hash = 1041031817)
    public UserEventBean(String userId, String accessSrc, String deviceId, String deviceType,
            String brand, String deviceOs, String osVer, String appVer, String carrier, String connType,
            String gpsXy, String gpsType, String ipAddr, String contentType, String columnId,
            String contentId, String accessTime, String stayTime, String endTime, String extendField) {
        this.userId = userId;
        this.accessSrc = accessSrc;
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.brand = brand;
        this.deviceOs = deviceOs;
        this.osVer = osVer;
        this.appVer = appVer;
        this.carrier = carrier;
        this.connType = connType;
        this.gpsXy = gpsXy;
        this.gpsType = gpsType;
        this.ipAddr = ipAddr;
        this.contentType = contentType;
        this.columnId = columnId;
        this.contentId = contentId;
        this.accessTime = accessTime;
        this.stayTime = stayTime;
        this.endTime = endTime;
        this.extendField = extendField;
    }

    @Generated(hash = 1216884709)
    public UserEventBean() {
    }



    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessSrc() {
        return this.accessSrc;
    }

    public void setAccessSrc(String accessSrc) {
        this.accessSrc = accessSrc;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDeviceOs() {
        return this.deviceOs;
    }

    public void setDeviceOs(String deviceOs) {
        this.deviceOs = deviceOs;
    }

    public String getOsVer() {
        return this.osVer;
    }

    public void setOsVer(String osVer) {
        this.osVer = osVer;
    }

    public String getAppVer() {
        return this.appVer;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getConnType() {
        return this.connType;
    }

    public void setConnType(String connType) {
        this.connType = connType;
    }

    public String getGpsXy() {
        return this.gpsXy;
    }

    public void setGpsXy(String gpsXy) {
        this.gpsXy = gpsXy;
    }

    public String getGpsType() {
        return this.gpsType;
    }

    public void setGpsType(String gpsType) {
        this.gpsType = gpsType;
    }

    public String getIpAddr() {
        return this.ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getColumnId() {
        return this.columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public String getContentId() {
        return this.contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getAccessTime() {
        return this.accessTime;
    }

    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    public String getStayTime() {
        return this.stayTime;
    }

    public void setStayTime(String stayTime) {
        this.stayTime = stayTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getExtendField() {
        return this.extendField;
    }

    public void setExtendField(String extendField) {
        this.extendField = extendField;
    }
}
