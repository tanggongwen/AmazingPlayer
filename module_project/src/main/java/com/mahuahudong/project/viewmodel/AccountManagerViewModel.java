package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.module_live.base.util.StringUtil;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.bus.RxBus;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.mvvm.utils.Utils;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.UpdateUserRespBean;
import com.mahuahudong.res.beans.UploadHeadRespBean;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.res.constants.RouterParames;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.weiget.TipToast;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.engine.impl.GlideEngine;
import com.zhihu.matisse.internal.entity.CaptureStrategy;

import io.reactivex.functions.Consumer;

public class AccountManagerViewModel extends BaseViewModel<HomeModel> {
    private UserBean userBean;
    public AccountManagerViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        userBean = PersonInfoManager.INSTANCE.getUserBean();
        if (null!=userBean) {
            if (!StringUtil.isEmpty(userBean.getInfo().getPic())) {
                headUrl.set(userBean.getInfo().getPic());
            }
            nickNameOb.set(userBean.getInfo().getNickname());

            introOb.set(userBean.getInfo().getNickname());
        }
    }

    public SingleLiveEvent changeHeadEvent = new SingleLiveEvent();

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });

    public BindingCommand changeHeadCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
                 changeHeadEvent.setValue("");
        }
    });


    public BindingCommand changeNickNameCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_CHANGE_USER).withBoolean(RouterParames.KEY_CHANGE_NICK,true).navigation();
        }
    });

    public BindingCommand changeIntroCommmand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_CHANGE_USER).withBoolean(RouterParames.KEY_CHANGE_NICK,false).navigation();
        }
    });



    public ObservableField<String> headUrl = new ObservableField<>();

    public ObservableField<String> nickNameOb  = new ObservableField<>("游客");

    public ObservableField<String> introOb = new ObservableField<>("这个人很懒，上面多没留下");

    public ObservableInt headPlaceHolder = new ObservableInt(R.drawable.ic_person_48px);


    @SuppressLint("CheckResult")
    public void updateUserBean(){
        userBean.getInfo().setPic(headUrl.get());
        model.uploadHead(headUrl.get())
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(AccountManagerViewModel.this)
                .subscribe(new Consumer<UploadHeadRespBean>() {
                    @Override
                    public void accept(UploadHeadRespBean uploadHeadRespBean) {
                        if (uploadHeadRespBean.getCode().equals("200")){
                            model.updateUser("","",headUrl.get())
                                    .compose(RxUtils.schedulersTransformer())
                                    .doOnSubscribe(AccountManagerViewModel.this)
                                    .subscribe(new Consumer<UpdateUserRespBean>() {
                                        @Override
                                        public void accept(UpdateUserRespBean updateUserRespBean) {

                                        }
                                    }, new Consumer<Throwable>() {
                                        @Override
                                        public void accept(Throwable throwable) {

                                        }
                                    });
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {

                    }
                });
        PersonInfoManager.INSTANCE.setUserBean(userBean);
    }

}


