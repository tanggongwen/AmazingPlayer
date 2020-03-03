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
        movie.setColumnName("喜剧电影");
        ColunmBean movie2 = new ColunmBean();
        movie2.setColumnId("2");
        movie2.setColumnName("恐怖电影");
        list.add(movie);
        list.add(movie2);
        colunList.setValue(list);
    }

    public SingleLiveEvent<List<ColunmBean>> colunList = new SingleLiveEvent<>();

}
