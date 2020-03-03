package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.ItemViewModel;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class WatchHistoryPagerItemViewModel extends ItemViewModel<WatchHistoryListViewModel> {
    public WatchHistoryPagerItemViewModel(@NonNull WatchHistoryListViewModel viewModel) {
        super(viewModel);
    }

    public ObservableList<Object> items = new ObservableArrayList();


    public OnItemBind<Object> onItemBind = new OnItemBind<Object>() {
        @Override
        public void onItemBind(@NonNull ItemBinding itemBinding, int position, Object item) {

        }
    };


}
