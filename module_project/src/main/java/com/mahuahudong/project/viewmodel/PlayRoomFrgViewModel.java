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

public class PlayRoomFrgViewModel extends BaseViewModel<HomeModel> {
    public PlayRoomFrgViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        List<ColunmBean> list = new ArrayList<>();
        ColunmBean movie = new ColunmBean();
        movie.setColumnId("1");
        movie.setColumnName("午间剧场");
        ColunmBean movie2 = new ColunmBean();
        movie2.setColumnId("2");
        movie2.setColumnName("晚间剧场");
        list.add(movie);
        imageitems.add(new PlayRoomVideoViewModel(PlayRoomFrgViewModel.this));
        list.add(movie2);
        imageitems.add(new PlayRoomVideoViewModel(PlayRoomFrgViewModel.this));
        colunList.setValue(list);

    }

    public SingleLiveEvent<List<ColunmBean>> colunList = new SingleLiveEvent<>();



    public ObservableList<PlayRoomVideoViewModel> imageitems = new ObservableArrayList<>();
    public ItemBinding<PlayRoomVideoViewModel> imageBinding = ItemBinding.of(BR.itemViewModel, R.layout.fragment_playroom_video);



    //给ViewPager添加Adpter，请使用自定义的Adapter继承BindingViewPagerAdapter，重写onBindBinding方法
    public BindingViewPagerAdapter<PlayRoomVideoViewModel> bindingViewPagerAdapter = new BindingViewPagerAdapter<>();

}
