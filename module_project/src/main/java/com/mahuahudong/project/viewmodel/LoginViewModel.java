package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.module_live.DemoCache;
import com.mahuahudong.module_live.base.util.string.MD5;
import com.mahuahudong.module_live.im.activity.LoginActivity;
import com.mahuahudong.module_live.im.config.AuthPreferences;
import com.mahuahudong.module_live.im.config.UserPreferences;
import com.mahuahudong.module_live.im.ui.dialog.DialogMaker;
import com.mahuahudong.module_live.inject.FlavorDependent;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.binding.command.BindingConsumer;
import com.mahuahudong.mvvm.bus.RxBus;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.subscriptions.RefreshUserInfo;
import com.mahuahudong.res.weiget.TipToast;
import com.netease.nimlib.sdk.AbortableFuture;
import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.RequestCallback;
import com.netease.nimlib.sdk.auth.AuthService;
import com.netease.nimlib.sdk.auth.LoginInfo;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Consumer;

public class LoginViewModel extends BaseViewModel<HomeModel> {

    private String userName="";
    private String password = "";
    public LoginViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }

    public BindingCommand registerCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_REGISTER).navigation();
        }
    });

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });

    public SingleLiveEvent<List<String>> loginLiveEvent = new SingleLiveEvent();

    public BindingCommand<String> cpwChange = new BindingCommand<String>(new BindingConsumer<String>() {
        @Override
        public void call(String s) {
            password = s;
        }
    });

    public BindingCommand<String> accountChange = new BindingCommand<String>(new BindingConsumer<String>() {
        @Override
        public void call(String s) {
            userName = s;
        }
    });

    public BindingCommand loginCommand = new BindingCommand(new BindingAction() {
        @SuppressLint("CheckResult")
        @Override
        public void call() {

            model.login(userName,password)
                    .compose(RxUtils.schedulersTransformer())
                    .doOnSubscribe(LoginViewModel.this)
                    .subscribe(new Consumer<UserBean>() {
                        @Override
                        public void accept(UserBean userBean) {
                            if (userBean.getCode().equals("200")){
                                PersonInfoManager.INSTANCE.setUserBean(userBean);
                                PersonInfoManager.INSTANCE.setToken(userBean.getToken());
                                RxBus.getDefault().postSticky(new RefreshUserInfo());
                                TipToast.showTextToas(getApplication(),"登录成功");
                                List<String> list = new ArrayList<>();
                                list.add(userBean.getInfo().getUserid());
                                list.add(userBean.getToken());
                                loginLiveEvent.setValue(list);
                                finish();
                            }
                        }
                    }, new Consumer<Throwable>() {
                        @Override
                        public void accept(Throwable throwable) {

                            TipToast.showTextToas(getApplication(),"登录失败");
                        }
                    });
        }
    });




}
