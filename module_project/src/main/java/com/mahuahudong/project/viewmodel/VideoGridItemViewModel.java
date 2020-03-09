package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;


import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.mvvm.router.RouterActivityPath;

import com.mahuahudong.res.constants.RouterParames;

public class VideoGridItemViewModel<VM extends BaseViewModel> {

    private VideoBean videoBean;
        public BindingCommand itemClickCommand = new BindingCommand(new BindingAction() {

            @Override
            public void call() {
                ARouter.getInstance().build(RouterActivityPath.PAGER_MOVIEDETAIL).withSerializable(RouterParames.KEY_VIDEO_BEAN,videoBean).navigation();
            }
        });

        protected VM viewModel;
        public VideoGridItemViewModel(@NonNull VM viewModel, VideoBean videoBean) {
            this.viewModel = viewModel;
            this.videoBean = videoBean;
            titleOb.set(videoBean.getTitle());
            coverOb.set(videoBean.getCover());
            introduceOb.set(videoBean.getIntro());
        }

        public ObservableField<String> titleOb = new ObservableField<>();


        public ObservableField<String> introduceOb = new ObservableField<>();


        public ObservableField<String> coverOb = new ObservableField<>();

        public ObservableInt coverPlaceHolder = new ObservableInt();
    }

