package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.mvvm.utils.Utils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.MyFocusBean;
import com.mahuahudong.res.beans.UserFocusBean;
import com.mahuahudong.res.weiget.TipToast;

import io.reactivex.functions.Consumer;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class MyAttentionViewModel extends BaseViewModel<HomeModel> {
    private int page = 0;
    private int size = 10;
    public MyAttentionViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        getFocusList();
    }

    public ObservableList<MyAttentionItemViewModel> items = new ObservableArrayList<>();


    public ItemBinding<MyAttentionItemViewModel> itemBinding = ItemBinding.of(BR.itemViewModel,R.layout.layout_item_myattention);


    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            refreshFocusList();
        }
    });

    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {
            getFocusList();
        }
    });

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });

    private void refreshFocusList(){
        items.clear();
        page = 0;
        getFocusList();
    }

    @SuppressLint("CheckResult")
    private void getFocusList(){
        model.getFocusList(page+"",size+"","")
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(MyAttentionViewModel.this)
                .subscribe(new Consumer<MyFocusBean>() {
                    @Override
                    public void accept(MyFocusBean myFocusBean) {
                        if (myFocusBean.getCode().equals("200")){
                            if (null!=myFocusBean.getList()&&myFocusBean.getList().getRows().size()>0){
                                for (MyFocusBean.ListBean.RowsBean rowsBean:myFocusBean.getList().getRows()){
                                    items.add(new MyAttentionItemViewModel(MyAttentionViewModel.this,rowsBean));
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

    @SuppressLint("CheckResult")
    public void addFocus(String lid){
        model.addFocus(lid)
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(MyAttentionViewModel.this)
                .subscribe(new Consumer<UserFocusBean>() {
                    @Override
                    public void accept(UserFocusBean userFocusBean) {
                        if (userFocusBean.getCode().equals("200")){
                            refreshFocusList();
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
