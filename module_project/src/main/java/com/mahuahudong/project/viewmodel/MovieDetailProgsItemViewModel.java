package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.VideoBean;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.AskLawVideoMapBean;
import com.mahuahudong.res.beans.NewsMapBean;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class MovieDetailProgsItemViewModel<VM extends BaseViewModel<HomeModel>>  {
    protected VM viewModel;

    private HomeModel videoModel;
    private List<VideoBean> videoBeanList = new ArrayList<>();
    public MovieDetailProgsItemViewModel(@NonNull final VM viewModel, HomeModel videoModel, VideoBean videoBean) {
        this.viewModel = viewModel;
        this.videoModel = videoModel;
        if (null!=videoBean&&null!=videoBean.getVideoBeans()&&videoBean.getVideoBeans().size()>0){
            for (VideoBean moreVideo:videoBean.getVideoBeans()){
                gridItems.add(new MovieProgItemViewModel<>(viewModel,moreVideo));
            }
        }
    }

    public void updateSeletedProg(String url){
        for (MovieProgItemViewModel itemViewModel:gridItems){
            itemViewModel.updateTvColor(url);
        }
    }

    public ObservableList<MovieProgItemViewModel> gridItems = new ObservableArrayList();

    public ItemBinding<MovieProgItemViewModel> gridItemBinding = ItemBinding.of(BR.itemViewModel, R.layout.layout_item_progs);

    public ObservableField<String> typeTitle = new ObservableField<>("选集");
}
