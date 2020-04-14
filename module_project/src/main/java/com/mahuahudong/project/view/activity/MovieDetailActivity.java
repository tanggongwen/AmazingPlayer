package com.mahuahudong.project.view.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lbs.apps.library.media.videoplayer.listener.OnVideoViewStateChangeListener;
import com.lbs.apps.library.media.videoplayer.player.VideoView;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityMovieDetailBinding;
import com.mahuahudong.project.viewmodel.MovieDetailViewModel;
import com.mahuahudong.res.ScreenUtils;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.beans.NewsCommontBean;
import com.mahuahudong.res.beans.VideoDetailBean;
import com.mahuahudong.res.beans.VideoRespBean;
import com.mahuahudong.res.constants.RouterParames;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.controller.StandardVideoController;
import com.mahuahudong.res.weiget.CommontPopupWindow;
import com.mahuahudong.res.weiget.InputPopupWindow;
import com.mahuahudong.res.weiget.TipToast;

import java.util.List;

@Route(path = RouterActivityPath.PAGER_MOVIEDETAIL)
public class MovieDetailActivity extends BaseActivity<ActivityMovieDetailBinding, MovieDetailViewModel> {
    private View rootView;

    private VideoDetailBean videoDetailBean;
    private String videoId ="";
    private StandardVideoController controller;
    private boolean showCommontDialog = false;

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_movie_detail;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
        initVideoView();
        rootView = LayoutInflater.from(MovieDetailActivity.this).inflate(R.layout.activity_movie_detail, null);

    }

    @Override
    public MovieDetailViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(MovieDetailViewModel.class);
    }

    @Override
    public void initParam() {
        ScreenUtils.fullScreen(this,false);
        super.initParam();
    }


    @Override
    public void initViewObservable() {


        viewModel.initVideoEvent.observe(this, new Observer<VideoDetailBean>() {
            @Override
            public void onChanged(VideoDetailBean bean) {

                videoDetailBean = bean;
                resetVideoDetail();
            }
        });





        viewModel.getUC().getReloadEvent().observe(this, new Observer<VideoDetailBean.DetailBean.UrlBean>() {
            @Override
            public void onChanged(VideoDetailBean.DetailBean.UrlBean videoBean) {
                binding.videoPlayer.release();
                binding.videoPlayer.setUrl(videoBean.getUrl());
                binding.videoPlayer.start();
                viewModel.currentUrl = videoBean.getUrl();
                viewModel.updataProg(videoBean.getUrl());
            }
        });
    }

    private void initVideoView(){
        videoId = getIntent().getStringExtra(RouterParames.KEY_VIDEO_ID);
        controller = new StandardVideoController(this);
        showCommontDialog = getIntent().getBooleanExtra(RouterParames.SHOW_COMMONTDIALOG,false);
//        viewModel.getVideoDetail(videoId);
        viewModel.initVideoData(videoId);
    }

    private void resetVideoDetail(){
            binding.videoPlayer.setVisibility(View.VISIBLE);
            binding.videoPlayer.setVideoController(controller);
            viewModel.currentUrl = videoDetailBean.getDetail().getUrl().get(0).get(0).getUrl();
            binding.videoPlayer.setUrl(videoDetailBean.getDetail().getUrl().get(0).get(0).getUrl());
            binding.videoPlayer.setMute(false);
            //播放状态监听
            binding.videoPlayer.addOnVideoViewStateChangeListener(mOnVideoViewStateChangeListener);
            binding.videoPlayer.start();
//        viewModel.initVideoData(videoBean);
        binding.ryContent.scrollToPosition(0);

    }



    private OnVideoViewStateChangeListener mOnVideoViewStateChangeListener = new OnVideoViewStateChangeListener() {
        @Override
        public void onPlayerStateChanged(int playerState) {
            switch (playerState) {
                case VideoView.PLAYER_NORMAL://小屏

                    break;
                case VideoView.PLAYER_FULL_SCREEN://全屏

                    break;
            }
        }

        @Override
        public void onPlayStateChanged(int playState) {
            switch (playState) {
                case VideoView.STATE_IDLE:
                    break;
                case VideoView.STATE_PREPARING:
                    break;
                case VideoView.STATE_PREPARED:
                    break;
                case VideoView.STATE_PLAYING:
                    break;
                case VideoView.STATE_PAUSED:
                    break;
                case VideoView.STATE_BUFFERING:
                    break;
                case VideoView.STATE_BUFFERED:
                    break;
                case VideoView.STATE_PLAYBACK_COMPLETED:
                    break;
                case VideoView.STATE_ERROR:
                    break;
            }
        }
    };




    @Override
    protected void onPause() {
        super.onPause();
            binding.videoPlayer.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.videoPlayer.resume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding.videoPlayer.release();
    }


    @Override
    public void onBackPressed() {
        if (!binding.videoPlayer.onBackPressed()) {
            super.onBackPressed();
        }
    }



}
