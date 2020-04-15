package com.mahuahudong.project.viewmodel;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.module_live.entertainment.activity.LiveActivity;
import com.mahuahudong.module_live.entertainment.activity.LiveModeChooseActivity;
import com.mahuahudong.module_live.im.activity.LoginActivity;
import com.mahuahudong.module_live.inject.FlavorDependent;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.ColunmBean;
import com.mahuahudong.project.model.HomeModel;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class LiveFrgViewModel extends BaseViewModel<HomeModel> {
    public LiveFrgViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        List<ColunmBean> list = new ArrayList<>();
        ColunmBean movie = new ColunmBean();
        movie.setColumnId("1");
        movie.setColumnName("热门直播");
        list.add(movie);
        imageitems.add(new LivePagerViewModel(LiveFrgViewModel.this,model));
        colunList.setValue(list);

    }

    public SingleLiveEvent<List<ColunmBean>> colunList = new SingleLiveEvent<>();

    public SingleLiveEvent startLiveEvent = new SingleLiveEvent();

    public ObservableList<LivePagerViewModel> imageitems = new ObservableArrayList<>();
    public ItemBinding<LivePagerViewModel> imageBinding = ItemBinding.of(BR.itemViewModel, R.layout.layout_live_pager);



    //给ViewPager添加Adpter，请使用自定义的Adapter继承BindingViewPagerAdapter，重写onBindBinding方法
    public BindingViewPagerAdapter<LivePagerViewModel> bindingViewPagerAdapter = new BindingViewPagerAdapter<>();

    public BindingCommand startLiveCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            startLiveEvent.setValue("");
        }
    });
}
