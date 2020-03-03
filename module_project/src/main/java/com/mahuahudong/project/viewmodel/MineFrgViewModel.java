package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class MineFrgViewModel extends BaseViewModel<HomeModel> {
    public MineFrgViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }

    public ObservableField<String> headUrl = new ObservableField<>();

    public ObservableInt headPlaceHolder = new ObservableInt(R.drawable.head_defalut);

    public ItemBinding itemBinding = ItemBinding.of(BR.itemViewModel,R.layout.layout_item_watchhistory);

    public ObservableList<WatchHistoryItemViewModel> itemViewModels = new ObservableArrayList<>();
}
