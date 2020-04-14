package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.project.beans.ColunmBean;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.FirstColumnBean;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.weiget.TipToast;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Consumer;

public class HomeFrgViewModel extends BaseViewModel<HomeModel> {
    @SuppressLint("CheckResult")
    public HomeFrgViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);




        model.getFirstColumn()
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(HomeFrgViewModel.this)
                .subscribe(new Consumer<FirstColumnBean>() {
                    @Override
                    public void accept(FirstColumnBean firstColumnBean) {
                        if (firstColumnBean.getCode().equals("200")){
                            colunList.setValue( firstColumnBean.getTab());
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {

                        TipToast.showTextToas(getApplication(),"获取栏目失败");
                    }
                });
    }

    public SingleLiveEvent<ArrayList<FirstColumnBean.TabBean>> colunList = new SingleLiveEvent<>();




}
