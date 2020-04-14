package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;

import com.mahuahudong.project.model.HomeModel;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class MovieSelectViewModel extends BaseViewModel<HomeModel> {
    private List<VideoBean> videoBeanList = new ArrayList<>();
    public MovieSelectViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        videoBeanList.addAll(NetDateProvider.getVideoList());
        refreshVideos();
    }

    private void refreshVideos(){
        for (VideoBean videoBean: videoBeanList){
//            items.add(new MovieGridItemViewModel(MovieSelectViewModel.this,videoBean));
        }
    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });


    public ItemBinding<MovieGridItemViewModel> itemBinding = ItemBinding.of(BR.girdItemVideModel,R.layout.layout_item_movie_gridvideo);

    public ObservableList<MovieGridItemViewModel> items = new ObservableArrayList<>();




    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            reloadVideos();
        }
    });


    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {
            List<VideoBean> moreVideos = new ArrayList<>();
            moreVideos.addAll(NetDateProvider.getVideoList());
            for (VideoBean videoBean:moreVideos){
//                items.add(new MovieGridItemViewModel(MovieSelectViewModel.this,videoBean));
                videoBeanList.add(videoBean);
            }
        }
    });

    public void reloadVideos(){
        items.clear();
        videoBeanList.clear();
        videoBeanList.addAll(NetDateProvider.getVideoList());
        refreshVideos();
    }
}
