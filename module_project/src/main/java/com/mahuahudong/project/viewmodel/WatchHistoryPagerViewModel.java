package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class WatchHistoryPagerViewModel extends ItemViewModel<WatchHistoryListViewModel> {
    public WatchHistoryPagerViewModel(@NonNull WatchHistoryListViewModel viewModel) {
        super(viewModel);
    }

    public ObservableList<WatchHistoryPagerItemViewModel> items = new ObservableArrayList<>();


    public ItemBinding<WatchHistoryPagerItemViewModel> itemBinding = ItemBinding.of(BR.itemViewModel, R.layout.layout_item_watchpager);
}
