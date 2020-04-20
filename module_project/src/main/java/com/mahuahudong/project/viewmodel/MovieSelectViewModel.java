
package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.mvvm.utils.Utils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;

import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.project.viewmodel.MovieGridItemViewModel;
import com.mahuahudong.res.beans.SelectedRespBean;
import com.mahuahudong.res.beans.SelectedVideoRespBean;
import com.mahuahudong.res.beans.VideoRespBean;
import com.mahuahudong.res.weiget.TipToast;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Consumer;
import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class MovieSelectViewModel extends BaseViewModel<HomeModel> {
    private List<VideoBean> videoBeanList = new ArrayList<>();
    private int page = 1;
    private int size = 10;
    private String type="";
    private String year="";
    private String state="";
    private String cate="";
    private String word="";
    public MovieSelectViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        videoBeanList.addAll(NetDateProvider.getVideoList());
    }

    public void setType(String type){
        this.type = type;
    }

    public void setYear(String year){
        this.year = year;
    }


    public void setState(String state){
        this.state = state;
    }


    public void setCate(String cate){
        this.cate = cate;
    }


    public void setWord(String word){
        this.word = word;
    }


    public void initDressSed(String pid){
        model.getSecendColumn(pid)
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(MovieSelectViewModel.this)
                .subscribe(new Consumer<SelectedRespBean>() {
                    @Override
                    public void accept(SelectedRespBean selectedRespBean) {
                        if (selectedRespBean.getCode().equals("200")){
                            upDateColumnEvent.setValue(selectedRespBean.getTab());
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {
                        TipToast.showTextToas(Utils.getContext(),"获取筛选列表失败");
                    }
                });
    }

    public SingleLiveEvent<SelectedRespBean.TabBean> upDateColumnEvent = new SingleLiveEvent<>();

    @SuppressLint("CheckResult")
    private void getSelectedVideoList(){
        model.getSelectedVideoList(page+"",size+"",type,cate,state,year,word,"score")
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(MovieSelectViewModel.this)
                .subscribe(new Consumer<SelectedVideoRespBean>() {
                    @Override
                    public void accept(SelectedVideoRespBean selectedVideoRespBean) {
                        if (selectedVideoRespBean.getCode().equals("200")){
                            if (selectedVideoRespBean.getList().getRows().size()>0){
                                for (VideoRespBean.TabBean.RowsBean rowsBean:selectedVideoRespBean.getList().getRows()){
                                    items.add(new MovieGridItemViewModel(MovieSelectViewModel.this,rowsBean));
                                }
                                page ++;
                            }

                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {
                        TipToast.showTextToas(Utils.getContext(),"获取视频列表失败");
                    }
                });
    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });


    public ItemBinding<MovieGridItemViewModel> itemBinding = ItemBinding.of(BR.girdItemVideModel,R.layout.layout_item_movie_gridvideo);

    public ObservableList<MovieGridItemViewModel> items = new ObservableArrayList<>();




    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            reloadVideos();
        }
    });


    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {
            getSelectedVideoList();
        }
    });

    public void reloadVideos(){
        items.clear();
        page =1;
        videoBeanList.clear();
        videoBeanList.addAll(NetDateProvider.getVideoList());
        getSelectedVideoList();
    }
}

