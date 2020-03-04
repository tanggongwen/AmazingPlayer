package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.model.HomeModel;

public class LoginViewModel extends BaseViewModel<HomeModel> {
    public LoginViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }

    public BindingCommand registerCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_REGISTER).navigation();
        }
    });
}
