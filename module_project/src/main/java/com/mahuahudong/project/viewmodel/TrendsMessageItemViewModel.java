package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class TrendsMessageItemViewModel extends ItemViewModel<TrendsViewModel> {
    public TrendsMessageItemViewModel(@NonNull TrendsViewModel viewModel) {
        super(viewModel);
        items.add(new MessageItemViewModel(viewModel));
        items.add(new MessageItemViewModel(viewModel));
        items.add(new MessageItemViewModel(viewModel));
    }

    public ObservableList<MessageItemViewModel> items = new ObservableArrayList<>();


    public ItemBinding<MessageItemViewModel> itemBinding = ItemBinding.of(com.mahuahudong.project.BR.itemViewModel, R.layout.layout_message);
}
