package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.bus.RxBus;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.mvvm.router.RouterActivityPath;

import com.mahuahudong.res.constants.RouterParames;
import com.mahuahudong.res.subscriptions.VideoDetailEnd;

public class MovieGridItemViewModel<VM extends BaseViewModel> {
        private VideoBean videoBean;
        public BindingCommand itemClickCommand = new BindingCommand(new BindingAction() {

            @Override
            public void call() {
                ARouter.getInstance().build(RouterActivityPath.PAGER_MOVIEDETAIL).withSerializable(RouterParames.KEY_VIDEO_BEAN,videoBean).navigation();
                RxBus.getDefault().post(new VideoDetailEnd());
            }
        });

        protected VM viewModel;
        public MovieGridItemViewModel(@NonNull VM viewModel, VideoBean videoBean) {
            this.viewModel = viewModel;
            this.videoBean = videoBean;
            titleOb.set(videoBean.getTitle());
                coverOb.set(videoBean.getCover());
        }

        public ObservableField<String> titleOb = new ObservableField<>();



        public ObservableField<String> coverOb = new ObservableField<>();


    }

