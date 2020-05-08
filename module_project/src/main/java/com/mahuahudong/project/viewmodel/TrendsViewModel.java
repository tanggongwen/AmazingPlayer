package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.beans.MyTrendsBean;
import com.mahuahudong.res.beans.ReplyRespBean;
import com.mahuahudong.res.beans.ThumbRespBean;
import com.mahuahudong.res.controller.PersonInfoManager;

import io.reactivex.functions.Consumer;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class TrendsViewModel extends BaseViewModel<HomeModel> {
    private String tid;
    public TrendsViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);


    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });

    public void initData(MyTrendsBean.ListBean.RowsBean rowsBean){
        this.tid = rowsBean.getId();
        contentOb.set(rowsBean.getContent());
        if (!StringUtils.isEmpty(rowsBean.getAvatar())){
            headUrlOb.set(rowsBean.getAvatar());
        }
        nameOb.set(rowsBean.getName());
        getReplys(tid);
    }


    public ObservableField<String> contentOb = new ObservableField<>();

    public ObservableField<String> headUrlOb = new ObservableField<>();

    public ObservableField<String> nameOb = new ObservableField<>();

    public ObservableList<TrendsMessageItemViewModel> items = new ObservableArrayList<>();


    public ItemBinding<TrendsMessageItemViewModel> itemBinding = ItemBinding.of(BR.itemViewModel, R.layout.layout_item_trendsmessage);


    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            items.clear();
            getReplys(tid);
        }
    });

    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {

        }
    });

    @SuppressLint("CheckResult")
    public void getReplys(String tid){
        model.getReplyList(tid).compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(TrendsViewModel.this)
                .subscribe(new Consumer<ReplyRespBean>() {
                    @Override
                    public void accept(ReplyRespBean replyRespBean) throws Exception {
                            if (replyRespBean.getCode().equals(200)){
                                    items.add(new TrendsMessageItemViewModel(TrendsViewModel.this,replyRespBean.getList().getRows()));
                            }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });
    }

}
