package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.project.R;

public class WatchHistoryItemViewModel extends ItemViewModel<MineFrgViewModel> {
    public WatchHistoryItemViewModel(@NonNull MineFrgViewModel viewModel) {
        super(viewModel);
    }

    public ObservableField<String> coverUrlOb = new ObservableField<>();


    public ObservableInt coverPlaceHolder = new ObservableInt(R.color.blue);

    public ObservableField<String> dateOb = new ObservableField<>();


    public ObservableField<String> introOb = new ObservableField<>();
}
