package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.databean.LiveBean;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.mvvm.router.RouterActivityPath;

public class LiveGridItemViewModel<VM extends BaseViewModel> {

    private LiveBean liveBean;
    public BindingCommand itemClickCommand = new BindingCommand(new BindingAction() {

        @Override
        public void call() {
            ARouter.getInstance().build("/live/login").navigation();
        }
    });

    protected VM viewModel;
    public LiveGridItemViewModel(@NonNull VM viewModel, LiveBean liveBean) {
        this.viewModel = viewModel;
        this.liveBean = liveBean;
        titleOb.set(liveBean.getLiveOwner());
        coverOb.set(liveBean.getCover());
        introduceOb.set(liveBean.getLiveIntro());
        hotOb.set(liveBean.getLiveHot());
    }

    public ObservableField<String> titleOb = new ObservableField<>();


    public ObservableField<String> introduceOb = new ObservableField<>();

    public ObservableField<String> hotOb = new ObservableField<>();


    public ObservableField<String> coverOb = new ObservableField<>();

    public ObservableInt coverPlaceHolder = new ObservableInt();
}

