package com.mahuahudong.mvvm.binding.viewadapter.videoview;


import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.lbs.apps.library.media.videoplayer.player.VideoView;
import com.mahuahudong.res.controller.StandardVideoController;

/**
 * Created by tanggongwen on 2019/10/18.
 */
public final class ViewAdapter {
    @BindingAdapter(value = {"url","cover","autoRotate","hideFullSize","hideController","autoPlay"}, requireAll = false)
    public static void setVideoParam(VideoView videoView,String url,String cover,boolean autoRotate,boolean hideFullSize,boolean hideController,boolean autoPlay) {
        if (!hideController){
            StandardVideoController controller = new StandardVideoController(videoView.getContext());
            if (hideFullSize){
                controller.hideFullScreen();
            }
            videoView.setVideoController(controller);
            Glide.with(videoView.getContext()).load(cover).into(controller.getThumb());
        }
        videoView.setAutoRotate(autoRotate);
        videoView.setUrl(url);
        if (autoPlay){
            videoView.start();
        }
    }
}

