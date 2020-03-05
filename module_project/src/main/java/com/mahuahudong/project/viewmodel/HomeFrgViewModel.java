package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
import com.mahuahudong.project.beans.ColunmBean;
import com.mahuahudong.project.model.HomeModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFrgViewModel extends BaseViewModel<HomeModel> {
    public HomeFrgViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        List<ColunmBean> list = new ArrayList<>();
        ColunmBean movie = new ColunmBean();
        movie.setColumnId("1");
        movie.setColumnName("好莱坞经典电影");
        ColunmBean movie2 = new ColunmBean();
        movie2.setColumnId("2");
        movie2.setColumnName("中国国产大片");
        ColunmBean movie3 = new ColunmBean();
        movie3.setColumnId("3");
        movie3.setColumnName("漫威系列电影");
        ColunmBean movie4 = new ColunmBean();
        movie4.setColumnId("3");
        movie4.setColumnName("经典香港电影");
        list.add(movie);
        list.add(movie2);
        list.add(movie3);
        list.add(movie4);
        colunList.setValue(list);
    }

    public SingleLiveEvent<List<ColunmBean>> colunList = new SingleLiveEvent<>();

}
