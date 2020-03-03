package com.mahuahudong.res.beans;

import com.lbs.apps.library.media.audioplayer.beans.AudioInfo;

import java.io.Serializable;
import java.util.List;

public class LiveAudioBean implements Serializable {
    private List<AudioInfo> audioLs;

    private int totalCount;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<AudioInfo> getAudioLs() {
        return audioLs;
    }

    public void setAudioLs(List<AudioInfo> audioLs) {
        this.audioLs = audioLs;
    }
}
