package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;

import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.VideoDetailBean;
import com.mahuahudong.res.beans.VideoRespBean;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class MovieDetailItemViewModel<VM extends BaseViewModel<HomeModel>>  {
    protected VM viewModel;

    private HomeModel videoModel;
    private List<VideoBean> videoBeanList = new ArrayList<>();
    public MovieDetailItemViewModel(@NonNull final VM viewModel, HomeModel videoModel, List<VideoRespBean.TabBean.RowsBean> list,String title) {
        this.viewModel = viewModel;
        this.videoModel = videoModel;
        typeTitle.set(title);
        if (null!=list&&list.size()>0){
            for (VideoRespBean.TabBean.RowsBean recBean:list){
                gridItems.add(new MovieGridItemViewModel<>(viewModel,recBean));
            }
        }
    }

    public ObservableList<MovieGridItemViewModel> gridItems = new ObservableArrayList();

    public ItemBinding<MovieGridItemViewModel> gridItemBinding = ItemBinding.of(BR.girdItemVideModel, R.layout.layout_item_movie_gridvideo);

    public ObservableField<String> typeTitle = new ObservableField<>("为你推荐");
}
