package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
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
        ColunmBean movie2 = new ColunmBean();
        movie2.setColumnId("2");
        movie2.setColumnName("美食直播");
        list.add(movie);
        imageitems.add(new LivePagerViewModel(LiveFrgViewModel.this));
        list.add(movie2);
        imageitems.add(new LivePagerViewModel(LiveFrgViewModel.this));
        colunList.setValue(list);

    }

    public SingleLiveEvent<List<ColunmBean>> colunList = new SingleLiveEvent<>();



    public ObservableList<LivePagerViewModel> imageitems = new ObservableArrayList<>();
    public ItemBinding<LivePagerViewModel> imageBinding = ItemBinding.of(BR.itemViewModel, R.layout.layout_live_pager);



    //给ViewPager添加Adpter，请使用自定义的Adapter继承BindingViewPagerAdapter，重写onBindBinding方法
    public BindingViewPagerAdapter<LivePagerViewModel> bindingViewPagerAdapter = new BindingViewPagerAdapter<>();
}
