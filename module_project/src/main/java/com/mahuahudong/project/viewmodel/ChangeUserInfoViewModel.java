package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.binding.command.BindingConsumer;
import com.mahuahudong.mvvm.bus.RxBus;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.mvvm.utils.Utils;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.AddTrendRespBean;
import com.mahuahudong.res.beans.UpdateUserRespBean;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.weiget.TipToast;

import io.reactivex.functions.Consumer;

public class ChangeUserInfoViewModel extends BaseViewModel<HomeModel> {
    private String colorSelected = "#000000";
    private String colorUnSelected = "#f2f2f2";
    private String content = "";
    private boolean changeNick ;
    public ChangeUserInfoViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });

    public void initData(boolean changeNick){
        this.changeNick = changeNick;
        if (changeNick){
            titleOb.set("修改昵称");
        }else {
            titleOb.set("修改签名");
        }
    }

    public ObservableField<String> titleOb = new ObservableField<>("修改签名");


    public ObservableInt tvColorOb = new ObservableInt(Color.parseColor(colorUnSelected));


    public BindingCommand sendCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            updateUserInfo();
        }
    });


    public BindingCommand<String> edtChanged = new BindingCommand<String>(new BindingConsumer<String>() {
        @Override
        public void call(String s) {
            content = s;
            if (s.length()>0){
                tvColorOb.set(Color.parseColor(colorSelected));
            }else {
                tvColorOb.set(Color.parseColor(colorUnSelected));
            }
        }
    });

    @SuppressLint("CheckResult")
    private void updateUserInfo(){
        if (changeNick){
            model.updateUser("",content,"")
                    .compose(RxUtils.schedulersTransformer())
                    .doOnSubscribe(ChangeUserInfoViewModel.this)
                    .subscribe(new Consumer<UpdateUserRespBean>() {
                        @Override
                        public void accept(UpdateUserRespBean updateUserRespBean) {
                            if (updateUserRespBean.getCode().equals("200")){
                                TipToast.showTextToas(Utils.getContext(),updateUserRespBean.getMsg());
                                UserBean userBean = PersonInfoManager.INSTANCE.getUserBean();
                                userBean.getInfo().setNickname(content);
                                PersonInfoManager.INSTANCE.setUserBean(userBean);
                                RxBus.getDefault().postSticky(updateUserRespBean);
                                finish();
                            }else {
                                TipToast.showTextToas(Utils.getContext(),updateUserRespBean.getMsg());
                            }
                        }
                    }, new Consumer<Throwable>() {
                        @Override
                        public void accept(Throwable throwable) {
                            TipToast.showTextToas(Utils.getContext(),throwable.toString());
                        }
                    });
        }else {
            model.updateUser(content,"","")
                    .compose(RxUtils.schedulersTransformer())
                    .doOnSubscribe(ChangeUserInfoViewModel.this)
                    .subscribe(new Consumer<UpdateUserRespBean>() {
                        @Override
                        public void accept(UpdateUserRespBean updateUserRespBean) {
                            if (updateUserRespBean.getCode().equals("200")){
                                TipToast.showTextToas(Utils.getContext(),updateUserRespBean.getMsg());
                                UserBean userBean = PersonInfoManager.INSTANCE.getUserBean();
                                userBean.getInfo().setSignature(content);
                                PersonInfoManager.INSTANCE.setUserBean(userBean);
                                finish();
                            }else {
                                TipToast.showTextToas(Utils.getContext(),updateUserRespBean.getMsg());
                            }
                        }
                    }, new Consumer<Throwable>() {
                        @Override
                        public void accept(Throwable throwable) {
                            TipToast.showTextToas(Utils.getContext(),throwable.toString());
                        }
                    });
        }

    }
}
