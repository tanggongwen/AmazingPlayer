package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableList;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.bus.RxBus;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.UpdateUserRespBean;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.subscriptions.RefreshUserInfo;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class MineFrgViewModel extends BaseViewModel<HomeModel> {
    private Disposable refreshUserInfoEvent;
    public MineFrgViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        initDispoes();
        updateUser();
//        itemViewModels.add(new WatchHistoryItemViewModel(MineFrgViewModel.this));
//        itemViewModels.add(new WatchHistoryItemViewModel(MineFrgViewModel.this));
//        itemViewModels.add(new WatchHistoryItemViewModel(MineFrgViewModel.this));
//        itemViewModels.add(new WatchHistoryItemViewModel(MineFrgViewModel.this));
    }

    @SuppressLint("CheckResult")
    private void initDispoes(){
        //监听刷新页面
        refreshUserInfoEvent = RxBus.getDefault().toObservable(RefreshUserInfo.class).subscribe(new Consumer<RefreshUserInfo>() {
            @Override
            public void accept(RefreshUserInfo userInfo) throws Exception {
//                switchLoginStateView();
               updateUser();
            }
        });
        addSubscribe(refreshUserInfoEvent);
        RxBus.getDefault().toObservableSticky(UpdateUserRespBean.class).compose(RxUtils.schedulersTransformer()).subscribe(new Consumer() {
            @Override
            public void accept(Object o) throws Exception {
                updateUser();
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {

            }
        });
    }

    public SingleLiveEvent exitEvent = new SingleLiveEvent();


    public ObservableField<String> headUrl = new ObservableField<>();


    public ItemBinding itemBinding = ItemBinding.of(BR.itemViewModel,R.layout.layout_item_watchhistory);

    public ObservableList<WatchHistoryItemViewModel> itemViewModels = new ObservableArrayList<>();

    public BindingCommand openWatchHistoryListCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_WATCHHISTORYLIST).navigation();
        }
    });

    public BindingCommand openMyAttentionCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_MYATTENTION).navigation();
        }
    });


    public BindingCommand loginCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            if (null== PersonInfoManager.INSTANCE.getUserBean()) {
                ARouter.getInstance().build(RouterActivityPath.PAGER_LOGIN).navigation();
            }
        }
    });

    public BindingCommand exitCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            exitEvent.setValue("");
        }
    });

    public ObservableInt exitVisible = new ObservableInt(View.GONE);

    public BindingCommand openPersonInfoCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_PERSONINFO).navigation();
        }
    });


    public ObservableField<String> nickNameOb = new ObservableField<>("登录/注册");

    public ObservableField<String> userDesOb = new ObservableField<>("登录一下，内容很精彩");





    public ObservableInt headPlaceHoder = new ObservableInt(R.drawable.ic_account_circle_48px);

    public void updateUser(){
        if (null!= PersonInfoManager.INSTANCE.getUserBean()){
            nickNameOb.set(PersonInfoManager.INSTANCE.getUserBean().getInfo().getNickname());
            userDesOb.set(PersonInfoManager.INSTANCE.getUserBean().getInfo().getSignature());
            headUrl.set(PersonInfoManager.INSTANCE.getUserBean().getInfo().getPic());
            exitVisible.set(View.VISIBLE);
        }else {
            nickNameOb.set("登录/注册");
            userDesOb.set("登录一下，内容很精彩");
            exitVisible.set(View.GONE);
        }
    }
}
