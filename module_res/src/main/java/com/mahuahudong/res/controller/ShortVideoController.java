package com.mahuahudong.res.controller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.lbs.apps.library.media.videoplayer.controller.BaseVideoController;
import com.lbs.apps.library.media.videoplayer.player.VideoView;
import com.mahuahudong.res.R;

/**
 * 抖音
 * Created by xinyu on 2018/1/6.
 */

public class ShortVideoController extends BaseVideoController implements View.OnClickListener {

    private ImageView thumb;
    private ImageView imgPause;
    private RelativeLayout rlytVideoRoot;
    public ShortVideoController(@NonNull Context context) {
        super(context);
    }

    public ShortVideoController(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ShortVideoController(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.video_layout_shortvideo_controller;
    }

    @Override
    protected void initView() {
        super.initView();
        thumb = mControllerView.findViewById(R.id.iv_thumb);
        rlytVideoRoot = mControllerView.findViewById(R.id.rlytVideoRoot);
        imgPause = mControllerView.findViewById(R.id.pause);
        rlytVideoRoot.setOnClickListener(this);
        imgPause.setOnClickListener(this);
    }

    @Override
    public void setPlayState(int playState) {
        super.setPlayState(playState);

        switch (playState) {
            case VideoView.STATE_IDLE:
                imgPause.setVisibility(GONE);
                thumb.setVisibility(View.VISIBLE);
                break;
            case VideoView.STATE_PLAYING:
                imgPause.setVisibility(GONE);
                thumb.setVisibility(View.GONE);
                break;
            case VideoView.STATE_PREPARED:
                break;
        }
    }

    public ImageView getThumb() {
        return thumb;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.rlytVideoRoot){
            if (mMediaPlayer.isPlaying()){
                mMediaPlayer.pause();
                imgPause.setVisibility(View.VISIBLE);
            }
        }
        if (v.getId()==R.id.pause){
            if (!mMediaPlayer.isPlaying()){
                mMediaPlayer.start();
                imgPause.setVisibility(View.GONE);
            }
        }
    }
}
