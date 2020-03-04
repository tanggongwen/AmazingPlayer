package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.project.R;

public class WatchHistorySerialItemViewModel extends ItemViewModel<WatchHistoryListViewModel> {
    public WatchHistorySerialItemViewModel(@NonNull WatchHistoryListViewModel viewModel) {
        super(viewModel);
    }

    public ObservableInt coverPlaceHoder = new ObservableInt(R.color.blue);

    public ObservableField<String> coverOb = new ObservableField<>();
}
