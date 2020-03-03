package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class WatchHistoryPagerItemViewModel extends ItemViewModel<WatchHistoryListViewModel> {
    public WatchHistoryPagerItemViewModel(@NonNull WatchHistoryListViewModel viewModel) {
        super(viewModel);
        items.add(new WatchHistoryMovieItemViewModel(viewModel));
        items.add(new WatchHistoryMovieItemViewModel(viewModel));
        items.add(new WatchHistorySerialItemViewModel(viewModel));

    }

    public ObservableList<Object> items = new ObservableArrayList();


    public OnItemBind<Object> onItemBind = new OnItemBind<Object>() {
        @Override
        public void onItemBind(@NonNull ItemBinding itemBinding, int position, Object item) {
            if (item.getClass().equals(WatchHistoryMovieItemViewModel.class)){
                itemBinding.set(BR.itemViewModel, R.layout.item_history_movie);
            }else if (item.getClass().equals(WatchHistorySerialItemViewModel.class)){
                itemBinding.set(BR.itemViewModel,R.layout.item_history_serial);
            }
        }
    };


}
