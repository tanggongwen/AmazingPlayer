package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.binding.command.BindingConsumer;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.Utils;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.weiget.TipToast;

import io.reactivex.functions.Consumer;

public class RegisterViewModel extends BaseViewModel<HomeModel> {
    private String psWord="";
    private String cpsWord="";
    private String account="";
    public RegisterViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });

    public BindingCommand registerCommand = new BindingCommand(new BindingAction() {
        @SuppressLint("CheckResult")
        @Override
        public void call() {
            if (StringUtils.isEmpty(account)){
                TipToast.showImageToas(Utils.getContext(),"账号不能为空");
                return;
            }
            if (StringUtils.isEmpty(psWord)){
                TipToast.showImageToas(Utils.getContext(),"密码不能为空");
                return;
            }
            if (!psWord.equals(cpsWord)){
                TipToast.showImageToas(Utils.getContext(),"两次密码输入不一致");
                return;
            }
            model.register(account,psWord)
                    .compose(RxUtils.schedulersTransformer())
                    .doOnSubscribe(RegisterViewModel.this)
                    .subscribe(new Consumer<UserBean>() {
                        @Override
                        public void accept(UserBean userBean) {
                            if (userBean.getCode().equals("200")){
                                TipToast.showTextToas(getApplication(),"注册成功");
                                finish();
                            }else {
                                TipToast.showTextToas(getApplication(),"注册失败");
                            }
                        }
                    }, new Consumer<Throwable>() {
                        @Override
                        public void accept(Throwable throwable) {

                            TipToast.showTextToas(getApplication(),"注册失败");
                        }
                    });
        }
    });

    public BindingCommand<String> pwChange = new BindingCommand<String>(new BindingConsumer<String>() {
        @Override
        public void call(String s) {
            psWord = s;
        }
    });

    public BindingCommand<String> cpwChange = new BindingCommand<String>(new BindingConsumer<String>() {
        @Override
        public void call(String s) {
            cpsWord = s;
        }
    });

    public BindingCommand<String> accountChange = new BindingCommand<String>(new BindingConsumer<String>() {
        @Override
        public void call(String s) {
            account = s;
        }
    });
}
