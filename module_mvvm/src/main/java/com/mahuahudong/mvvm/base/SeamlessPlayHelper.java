package com.mahuahudong.mvvm.base;

import android.app.Application;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


import com.lbs.apps.library.media.videoplayer.player.VideoView;
import com.mahuahudong.module_mvvm.R;


/**
 * 无缝播放
 */

public class SeamlessPlayHelper {

    private VideoView mVideoView;
    private static SeamlessPlayHelper instance;

    private static Application application;

    public static void init(Application context){
        application = context;
    }

    private SeamlessPlayHelper( ) {
        mVideoView = new VideoView(application);
        mVideoView.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mVideoView.setId(R.id.clip_vertical);
        mVideoView.setAutoRotate(false);
    }

    public static SeamlessPlayHelper getInstance() {
        if (instance == null) {
            synchronized (SeamlessPlayHelper.class) {
                if (instance == null) {
                    instance = new SeamlessPlayHelper();
                }
            }
        }
        return instance;
    }


    public VideoView getVideoView() {
        return mVideoView;
    }




}
