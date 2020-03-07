package com.mahuahudong.project.view.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lbs.apps.library.media.audioplayer.manager.AudioController;
import com.lbs.apps.library.media.videoplayer.listener.OnVideoViewStateChangeListener;
import com.lbs.apps.library.media.videoplayer.player.VideoView;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.VideoBean;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityMovieDetailBinding;
import com.mahuahudong.project.viewmodel.MovieDetailViewModel;
import com.mahuahudong.res.ScreenUtils;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.beans.AskLawVideoMapBean;
import com.mahuahudong.res.beans.NewsCommontBean;
import com.mahuahudong.res.constants.RouterParames;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.controller.StandardVideoController;
import com.mahuahudong.res.weiget.CommontPopupWindow;
import com.mahuahudong.res.weiget.InputPopupWindow;
import com.mahuahudong.res.weiget.TipToast;

import java.util.List;

@Route(path = RouterActivityPath.PAGER_MOVIEDETAIL)
public class MovieDetailActivity extends BaseActivity<ActivityMovieDetailBinding, MovieDetailViewModel> {
    private InputPopupWindow inputPopupWindow;
    private CommontPopupWindow commontPopupWindow;
    private View rootView;

    private VideoBean videoBean;
    private String newsId="";
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
        inputPopupWindow = new InputPopupWindow(this,commontPopupWindowClickListener);
        commontPopupWindow = new CommontPopupWindow(this);
        commontPopupWindow.setCommontPopupClickListener(commontPopupWindowClickListener);
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
        viewModel.inputEvent.observe(this, new Observer() {
            @Override
            public void onChanged(Object o) {
                inputPopupWindow.showAtLocation(rootView);
            }
        });

        viewModel.commontEvent.observe(this, new Observer() {
            @Override
            public void onChanged(Object o) {
                commontPopupWindow.showAtLocation(rootView);
            }
        });

        viewModel.initVideoEvent.observe(this, new Observer<VideoBean>() {
            @Override
            public void onChanged(VideoBean bean) {

                videoBean = bean;
                resetVideoDetail();
            }
        });




        viewModel.updateNewsCommontsEvent.observe(this, new Observer<List<NewsCommontBean.UserCommontBean>>() {
            @Override
            public void onChanged(List<NewsCommontBean.UserCommontBean> newsCommontBean) {
                commontPopupWindow.setCommontList(newsCommontBean);
            }
        });
        viewModel.getUC().getReloadEvent().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String url) {
                binding.videoPlayer.setUrl(url);
                viewModel.updataProg(url);
            }
        });
    }

    private void initVideoView(){
        videoBean = (VideoBean) getIntent().getSerializableExtra(RouterParames.KEY_VIDEO_BEAN);
        newsId = getIntent().getStringExtra(RouterParames.KEY_NEWS_ID);
        controller = new StandardVideoController(this);
        showCommontDialog = getIntent().getBooleanExtra(RouterParames.SHOW_COMMONTDIALOG,false);
//        viewModel.getVideoDetail(newsId);
        viewModel.initVideoData(videoBean);
    }

    private void resetVideoDetail(){
            binding.videoPlayer.setVisibility(View.VISIBLE);
            binding.videoPlayer.setVideoController(controller);
            binding.videoPlayer.setUrl(videoBean.getVideoUrl());
            binding.videoPlayer.setMute(false);
            //播放状态监听
            binding.videoPlayer.addOnVideoViewStateChangeListener(mOnVideoViewStateChangeListener);
            binding.videoPlayer.start();
//        viewModel.initVideoData(videoBean);
        binding.ryContent.scrollToPosition(0);
        if (showCommontDialog){
            commontPopupWindow.showAtLocation(rootView);
        }
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


    private CommontPopupWindow.CommontPopupWindowClickListener commontPopupWindowClickListener = new CommontPopupWindow.CommontPopupWindowClickListener() {
        @Override
        public void onShowDialog() {
            viewModel.getNewsCommonts(newsId);
        }

        @Override
        public void onClickClose() {
            commontPopupWindow.dismiss();
        }

        @Override
        public void onInputClick() {
            if (StringUtils.isEmpty(PersonInfoManager.INSTANCE.getUserToken())){
                ARouter.getInstance().build(RouterActivityPath.PAGER_LOGIN).navigation();
                return;
            }
            inputPopupWindow.showAtLocation(binding.rlytRoot);
        }

        @Override
        public void onSend(String content) {
            if (StringUtils.isEmpty(content)){
                TipToast.showTextToas(MovieDetailActivity.this,"内容不能为空");
                return;
            }
            viewModel.sendCommont(newsId,content);
            if (commontPopupWindow.isShowing()){
                commontPopupWindow.dismiss();
            }
            if (inputPopupWindow.isShowing()){
                inputPopupWindow.dismiss();
            }
        }

        @Override
        public void onClickLike(String commontId) {
            if (StringUtils.isEmpty(PersonInfoManager.INSTANCE.getUserToken())){
                ARouter.getInstance().build(RouterActivityPath.PAGER_LOGIN).navigation();
                return;
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
        hidePopWindow();
        if (!binding.videoPlayer.onBackPressed()) {
            super.onBackPressed();
        }
    }

    private void hidePopWindow(){
        if (null!=commontPopupWindow&&commontPopupWindow.isShowing()){
            commontPopupWindow.dismiss();
        }
        if (null!=inputPopupWindow&&inputPopupWindow.isShowing()){
            inputPopupWindow.dismiss();
        }
    }


}
