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
import com.mahuahudong.mvvm.bus.RxSubscriptions;
import com.mahuahudong.mvvm.bus.event.SingleLiveEvent;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.StringUtils;


import com.mahuahudong.res.beans.NewsCommontBean;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.subscriptions.VideoDetailEnd;

import java.util.List;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class MovieDetailViewModel extends BaseViewModel<HomeModel> {
    private Disposable finishSubscribe;
    private VideoBean videoBean;
    private int commontCount;
    private boolean canCommont;
    private MovieDetailProgsItemViewModel movieProgItemViewModel;

    public MovieDetailViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);

    }


    @Override
    public void onCreate() {
        super.onCreate();
        finishSubscribe = RxBus.getDefault().toObservable(VideoDetailEnd.class)
                .subscribe(new Consumer<VideoDetailEnd>() {
                    @Override
                    public void accept(VideoDetailEnd l) throws Exception {
                        finish();
                    }
                });
        RxSubscriptions.add(finishSubscribe);
    }

    @SuppressLint("CheckResult")
    public void initVideoData(VideoBean videoBean){
        items.clear();
        this.videoBean = videoBean;

        items.add(new MovieDetailRelatedViewModel<>(MovieDetailViewModel.this,model,videoBean));
        if (!videoBean.isAsMovie()){
            movieProgItemViewModel = new MovieDetailProgsItemViewModel(MovieDetailViewModel.this,model,videoBean);
            items.add(movieProgItemViewModel);
        }
        items.add(new MovieDetailItemViewModel<>(MovieDetailViewModel.this,model,videoBean));
        initVideoEvent.setValue(videoBean);
    }

    public ObservableField<String> commontCountOb = new ObservableField<>("0");

    public ObservableInt commontCountVisible = new ObservableInt(View.GONE);

    public SingleLiveEvent inputEvent = new SingleLiveEvent();

    public SingleLiveEvent commontEvent = new SingleLiveEvent();


    public SingleLiveEvent<com.mahuahudong.mvvm.databean.VideoBean> initVideoEvent = new SingleLiveEvent<>();


    public SingleLiveEvent<List<NewsCommontBean.UserCommontBean>> updateNewsCommontsEvent = new SingleLiveEvent<>();

    public void updataProg(String videoId){
        if (null!=movieProgItemViewModel){
            movieProgItemViewModel.updateSeletedProg(videoId);
        }
    }

    public BindingCommand inputCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            if (StringUtils.isEmpty(PersonInfoManager.INSTANCE.getUserToken())){
                ARouter.getInstance().build(RouterActivityPath.PAGER_LOGIN).navigation();
                return;
            }
            inputEvent.setValue("");
        }
    });

    public ObservableField<String> comontTipOb = new ObservableField<>("我来说两句");

    public BindingCommand bottomCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

        }
    });



    public BindingCommand commontCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

            commontEvent.setValue("");
        }
    });

    public BindingCommand backClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });


    public OnItemBind<Object> onItemBind = new OnItemBind<Object>() {
        @Override
        public void onItemBind(@NonNull ItemBinding itemBinding, int position, Object item) {
            if (item.getClass().equals(MovieDetailRelatedViewModel.class)){
                itemBinding.set(BR.itemViewModel, R.layout.layout_movie_item_detail);
            }else if (item.getClass().equals(MovieDetailItemViewModel.class)){
                itemBinding.set(BR.itemViewModel,R.layout.layout_movie_item_videos);
            }else if (item.getClass().equals(MovieDetailProgsItemViewModel.class)){
                itemBinding.set(BR.itemViewModel,R.layout.layout_movie_item_progs);
            }
        }
    };

    public ObservableList<Object> items = new ObservableArrayList<>();


    @SuppressLint("CheckResult")
    public void getVideoDetail(String newsId){
//        model.getVideoDetail(newsId)
//                .compose(RxUtils.schedulersTransformer())
//                .doOnSubscribe(MovieDetailViewModel.this)
//                .subscribe(new Consumer<BaseResponse<VideoBean>>() {
//                    @Override
//                    public void accept(BaseResponse<VideoBean> baseResponse) {
//                        if (baseResponse.getCode().equals("0")){
//                            canCommont = true;
//                            initVideoEvent.setValue(baseResponse.getResult());
//                            if (Integer.parseInt(baseResponse.getResult().getCommentCount())>0){
//                                commontCountVisible.set(View.VISIBLE);
//                                commontCountOb.set(baseResponse.getResult().getCommentCount());
//                            }else {
//                                commontCountVisible.set(View.GONE);
//                            }
//                        }
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(Throwable throwable) {
//                        TipToast.showTextToas(getApplication(),"获取视频详情失败");
//                    }
//                });
    }



    @SuppressLint("CheckResult")
    public void getNewsCommonts(String newsId){
//        model.getComments(newsId)
//                .compose(RxUtils.schedulersTransformer())
//                .doOnSubscribe(MovieDetailViewModel.this)
//                .subscribe(new Consumer<BaseResponse<List<NewsCommontBean.UserCommontBean>>>() {
//                    @Override
//                    public void accept(BaseResponse<List<NewsCommontBean.UserCommontBean>> baseResponse) {
//                        if (baseResponse.getCode().equals("0")){
//                            updateNewsCommontsEvent.setValue(baseResponse.getResult());
//                            commontCount = baseResponse.getResult().size();
//                        }
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(Throwable throwable) {
//                        TipToast.showTextToas(getApplication(),"获取评论列表失败");
//                    }
//                });
    }



    @SuppressLint("CheckResult")
    public void sendCommont(String newsId,String commont){
//        AddNewsCommontBean userCommontBean = new AddNewsCommontBean();
//        userCommontBean.setDiscussContent(commont);
//        model.addUserComment(newsId,userCommontBean)
//                .compose(RxUtils.schedulersTransformer())
//                .doOnSubscribe(MovieDetailViewModel.this)
//                .subscribe(new Consumer<BaseResponse<AddNewsCommontBean>>() {
//                    @Override
//                    public void accept(BaseResponse<AddNewsCommontBean> baseResponse) {
//                        if (baseResponse.getCode().equals("0")){
//                            TipToast.showTextToas(getApplication(),"发表评论成功");
//                            commontCountVisible.set(View.VISIBLE);
//                            commontCountOb.set(commontCount +1+"");
//                        }else {
//                            if (baseResponse.getCode().equals("5001")){
//                                TipToast.showTextToas(getApplication(),baseResponse.getResultMessage());
//                            }
//                        }
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(Throwable throwable) {
//
//                    }
//                });
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        RxSubscriptions.remove(finishSubscribe);
    }



}
