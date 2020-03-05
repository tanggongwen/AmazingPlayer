package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.project.model.HomeModel;

public class AccountManagerViewModel extends BaseViewModel<HomeModel> {
    public AccountManagerViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });
}
