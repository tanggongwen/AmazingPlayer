package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.databean.LiveBean;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.Utils;
import com.mahuahudong.res.beans.LiveListBean;
import com.mahuahudong.res.beans.VideoRespBean;
import com.mahuahudong.res.weiget.TipToast;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Consumer;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class LivePagerViewModel extends ItemViewModel<LiveFrgViewModel> {
    private int page =1;
    private int size=10;
    private HomeModel model;


    public ItemBinding<LiveGridItemViewModel> onItemBind = ItemBinding.of(BR.itemViewModel,R.layout.layout_item_live);

    public ObservableList<LiveGridItemViewModel> items = new ObservableArrayList<>();




    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            items.clear();
            page = 0;
            getLiveDatas();
        }
    });


    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {
            getLiveDatas();
        }
    });

    public LivePagerViewModel(@NonNull LiveFrgViewModel viewModel, HomeModel model) {
        super(viewModel);
        this.model = model;
        getLiveDatas();
    }

    @SuppressLint("CheckResult")
    private void getLiveDatas(){
        model.getLiveList(page+"",size+"")
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(viewModel)
                .subscribe(new Consumer<LiveListBean>() {
                    @Override
                    public void accept(LiveListBean liveListBean) {
                        if (liveListBean.getCode().equals("200")){
                            if (null!=liveListBean.getList().getRow()&&liveListBean.getList().getRow().size()>0){
                                    for (LiveListBean.ListBean.LiveRowBean liveRowBean:liveListBean.getList().getRow()){
                                        items.add(new LiveGridItemViewModel(viewModel,liveRowBean));
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


}
