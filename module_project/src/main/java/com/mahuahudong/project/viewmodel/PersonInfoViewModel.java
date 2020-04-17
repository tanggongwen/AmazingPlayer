package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;

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
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.mvvm.utils.Utils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.AddTrendbean;
import com.mahuahudong.res.beans.MyFocusBean;
import com.mahuahudong.res.beans.MyTrendsBean;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.weiget.TipToast;

import io.reactivex.functions.Consumer;
import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class PersonInfoViewModel extends BaseViewModel<HomeModel> {
    private int page = 1;
    private int size = 10;
    @SuppressLint("CheckResult")
    public PersonInfoViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        if (null!= PersonInfoManager.INSTANCE.getUserBean()){
            nickNameOb.set(PersonInfoManager.INSTANCE.getUserBean().getInfo().getNickname());
        }
        items.add(new PersonInfoItemViewModel(PersonInfoViewModel.this));
//        items.add(new PersonStateItemViewModel(PersonInfoViewModel.this));
//        items.add(new PersonStateItemViewModel(PersonInfoViewModel.this));
        RxBus.getDefault().toObservableSticky(AddTrendbean.class).compose(RxUtils.schedulersTransformer()).subscribe(new Consumer() {
            @Override
            public void accept(Object o) throws Exception {
                page = 1;
                items.clear();
                items.add(new PersonInfoItemViewModel(PersonInfoViewModel.this));
                getTrendList();
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {

            }
        });
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


    public ObservableField<String> nickNameOb = new ObservableField<>("游客");

    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            page = 1;
            items.clear();
            items.add(new PersonInfoItemViewModel(PersonInfoViewModel.this));
            getTrendList();
        }
    });

    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {
            getTrendList();
        }
    });

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });

    @SuppressLint("CheckResult")
    private void getTrendList(){
        model.getMyTrends(page+"",size+"","")
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(PersonInfoViewModel.this)
                .subscribe(new Consumer<MyTrendsBean>() {
                    @Override
                    public void accept(MyTrendsBean myTrendsBean) {
                        if (myTrendsBean.getCode().equals("200")){
                            if (null!=myTrendsBean.getList()&&myTrendsBean.getList().getRows().size()>0){
                                for (MyTrendsBean.ListBean.RowsBean rowsBean:myTrendsBean.getList().getRows()){
                                    items.add(new PersonStateItemViewModel(PersonInfoViewModel.this,rowsBean));
                                }
                                page =page+1;
                            }
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {
                        TipToast.showTextToas(Utils.getContext(),throwable.toString());
                    }
                });

    }

    public BindingCommand sendCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_SENDTREND).navigation();
        }
    });
}
