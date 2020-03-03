package com.lbs.apps.library.media.audioplayer.beans;

import java.io.Serializable;

/**
 * Created by tanggongwen on 2019/10/17.
 */
public class AudioInfo implements Serializable {
    /**
     * 类型
     */
    public static final int LOCAL = 0;
    public static final int NET = 2;

    public static final int AUDIO_TYPE = 0;

    private int type = 2;

    private String audioId="";
    /**
     * announcer :
     * audioBrief : 3123131
     * audioName : 1231231
     * audioTime :
     * audioType :
     * audioUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/audio/638835726636683264.mp3?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149151906&Signature=7oq6MNxCHTSrv9n6QH5uimuFszU%3D
     * issueTime : 2019-10-29 20:25:14
     * playCount : 0
     * thumUrl :
     * videoTime :
     * videoUrl :
     */

    private String announcer="";
    private String audioBrief="";
    private String audioName="";
    private String audioTime="0";
    private String audioType="";
    private String audioUrl="";
    private String issueTime="0";
    private int playCount;
    private String thumUrl="";
    private String videoTime="0";
    private String videoUrl="";
    private String shareTitle="";
    private String shareText="";
    private String shareImg="";
    private String shareH5="";

    public String getAnnouncer() {
        return announcer;
    }

    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }

    public String getAudioBrief() {
        return audioBrief;
    }

    public void setAudioBrief(String audioBrief) {
        this.audioBrief = audioBrief;
    }

    public String getAudioName() {
        return audioName;
    }

    public void setAudioName(String audioName) {
        this.audioName = audioName;
    }

    public String getAudioTime() {
        return audioTime;
    }

    public void setAudioTime(String audioTime) {
        this.audioTime = audioTime;
    }

    public String getAudioType() {
        return audioType;
    }

    public void setAudioType(String audioType) {
        this.audioType = audioType;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAudioId() {
        return audioId;
    }

    public void setAudioId(String audioId) {
        this.audioId = audioId;
    }

    public String getShareH5() {
        return shareH5;
    }

    public void setShareH5(String shareH5) {
        this.shareH5 = shareH5;
    }

    public String getShareImg() {
        return shareImg;
    }

    public void setShareImg(String shareImg) {
        this.shareImg = shareImg;
    }

    public String getShareText() {
        return shareText;
    }

    public void setShareText(String shareText) {
        this.shareText = shareText;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }
}
