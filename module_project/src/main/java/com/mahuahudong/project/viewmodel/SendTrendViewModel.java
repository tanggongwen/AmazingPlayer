package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;

import androidx.annotation.NonNull;
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
import com.mahuahudong.res.beans.AddTrendbean;
import com.mahuahudong.res.weiget.TipToast;

import io.reactivex.functions.Consumer;

public class SendTrendViewModel extends BaseViewModel<HomeModel> {
    private String colorSelected = "#000000";
    private String colorUnSelected = "#f2f2f2";
    private String content = "";
    public SendTrendViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
                finish();
        }
    });


    public ObservableInt tvColorOb = new ObservableInt(Color.parseColor(colorUnSelected));


    public BindingCommand sendCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            sendMyTrend();
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
    private void sendMyTrend(){
        model.addTrend(content)
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(SendTrendViewModel.this)
                .subscribe(new Consumer<AddTrendRespBean>() {
                    @Override
                    public void accept(AddTrendRespBean addTrendRespBean) {
                        if (addTrendRespBean.getCode().equals("200")){
                            RxBus.getDefault().postSticky(addTrendRespBean);
                            finish();
                        }else {
                            TipToast.showTextToas(Utils.getContext(),addTrendRespBean.getMsg());
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
