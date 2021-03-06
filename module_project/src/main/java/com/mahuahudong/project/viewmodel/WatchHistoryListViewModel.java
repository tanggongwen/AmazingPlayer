package com.mahuahudong.project.viewmodel;

import android.app.Application;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.ColunmBean;
import com.mahuahudong.project.model.HomeModel;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class WatchHistoryListViewModel extends BaseViewModel<HomeModel> {


    public SingleLiveEvent<List<ColunmBean>> colunListEvent = new SingleLiveEvent<>();



    public ObservableList<WatchHistoryPagerViewModel> historyPagers = new ObservableArrayList<>();

    public ItemBinding<WatchHistoryPagerViewModel> imageBinding = ItemBinding.of(BR.pagerViewModel, R.layout.layout_pager_watchlist);



    //给ViewPager添加Adpter，请使用自定义的Adapter继承BindingViewPagerAdapter，重写onBindBinding方法
    public BindingViewPagerAdapter<WatchHistoryPagerViewModel> bindingViewPagerAdapter = new BindingViewPagerAdapter<>();

    public WatchHistoryListViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        historyPagers.add(new WatchHistoryPagerViewModel(WatchHistoryListViewModel.this));
        final List<ColunmBean> list = new ArrayList<>();
        ColunmBean movie = new ColunmBean();
        movie.setColumnId("1");
        movie.setColumnName("全部");
        list.add(movie);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                colunListEvent.setValue(list);
            }
        },300);

    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });
}
