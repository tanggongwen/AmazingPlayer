package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class TrendsViewModel extends BaseViewModel<HomeModel> {
    public TrendsViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        items.add(new TrendsMessageItemViewModel(TrendsViewModel.this));
        items.add(new TrendsMessageItemViewModel(TrendsViewModel.this));
        items.add(new TrendsMessageItemViewModel(TrendsViewModel.this));
    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });


    public ObservableList<TrendsMessageItemViewModel> items = new ObservableArrayList<>();


    public ItemBinding<TrendsMessageItemViewModel> itemBinding = ItemBinding.of(BR.itemViewModel, R.layout.layout_item_trendsmessage);


    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

        }
    });

    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {

        }
    });


}
