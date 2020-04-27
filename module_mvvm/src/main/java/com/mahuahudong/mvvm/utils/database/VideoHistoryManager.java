package com.mahuahudong.mvvm.utils.database;

import com.mahuahudong.mvvm.databean.VideoHistoryBean;
import com.mahuahudong.mvvm.utils.Utils;

import java.util.List;

public enum VideoHistoryManager {
    INSTANCE;
    private VideoHistoryDaoUtils videoDaoUtils = new VideoHistoryDaoUtils(Utils.getContext());
    public void insert(VideoHistoryBean videoHistoryBean){
        videoDaoUtils.insertVideoHistory(videoHistoryBean);
    }


    public List<VideoHistoryBean> getAllHistory(){
        return videoDaoUtils.queryAllVideoHistoryBean();
    }
}
