package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;


import java.util.List;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class VideoGridViewModel<VM extends BaseViewModel>{

    protected VM viewModel;

    public VideoGridViewModel(@NonNull VM viewModel, String title, List<VideoBean> list) {
        this.viewModel = viewModel;
        titleOb.set(title);
        addItems(list);
    }



    public void addItems(List<VideoBean> list){
        for (VideoBean videoBean:list){
            gridItems.add(new VideoGridItemViewModel(viewModel,videoBean));
        }
    }

    public void clearItems(){
       gridItems.clear();
    }

    public ObservableList<VideoGridItemViewModel> gridItems = new ObservableArrayList();

    public ItemBinding<VideoGridItemViewModel> gridItemBinding = ItemBinding.of(BR.itemViewModel, R.layout.layout_item_gridvideo);

    public ObservableField<String> titleOb = new ObservableField<>();
}
