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
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class PersonInfoViewModel extends BaseViewModel<HomeModel> {
    public PersonInfoViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        items.add(new PersonInfoItemViewModel(PersonInfoViewModel.this));
        items.add(new PersonStateItemViewModel(PersonInfoViewModel.this));
        items.add(new PersonStateItemViewModel(PersonInfoViewModel.this));
    }

    public ObservableList<Object> items = new ObservableArrayList<>();


    public OnItemBind<Object> itemBinding = new OnItemBind<Object>() {
        @Override
        public void onItemBind(@NonNull ItemBinding itemBinding, int position, Object item) {
            if (item.getClass().equals(PersonInfoItemViewModel.class)){
                itemBinding.set(BR.itemViewModel, R.layout.layout_item_personinfo);
            }else if (item.getClass().equals(PersonStateItemViewModel.class)){
                itemBinding.set(BR.itemViewModel, R.layout.layout_item_state);
            }
        }
    };


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

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });
}
