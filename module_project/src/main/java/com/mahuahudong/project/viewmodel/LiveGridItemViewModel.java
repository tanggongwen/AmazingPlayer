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
import com.mahuahudong.res.beans.LiveListBean;

public class LiveGridItemViewModel<VM extends BaseViewModel> {

    private LiveListBean.ListBean.LiveRowBean liveBean;
    public BindingCommand itemClickCommand = new BindingCommand(new BindingAction() {

        @Override
        public void call() {
            ARouter.getInstance().build("/live/login").navigation();
        }
    });

    protected VM viewModel;
    public LiveGridItemViewModel(@NonNull VM viewModel, LiveListBean.ListBean.LiveRowBean liveBean) {
        this.viewModel = viewModel;
        this.liveBean = liveBean;
        titleOb.set(liveBean.getTitle());
        coverOb.set(liveBean.getPic());
        introduceOb.set(liveBean.getName());
        hotOb.set(liveBean.getPop());
    }

    public ObservableField<String> titleOb = new ObservableField<>();


    public ObservableField<String> introduceOb = new ObservableField<>();

    public ObservableField<String> hotOb = new ObservableField<>();


    public ObservableField<String> coverOb = new ObservableField<>();

    public ObservableInt coverPlaceHolder = new ObservableInt();
}

