package com.mahuahudong.mvvm.binding.viewadapter.asklawlooperview;


import androidx.databinding.BindingAdapter;

import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.res.beans.LiveSceneBean;
import com.mahuahudong.res.weiget.AskLawLooperView;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by goldze on 2017/6/18.
 */
public final class ViewAdapter {
    @BindingAdapter(value = {"looperdatas"}, requireAll = false)
    public static void setLooperDatas(final AskLawLooperView looperNewsView, CopyOnWriteArrayList<LiveSceneBean> looperdatas) {
      looperNewsView.setTipList(looperdatas);

    }

    @BindingAdapter(value = {"looperClickListener"}, requireAll = false)
    public static void setLooperClickListener(final AskLawLooperView looperNewsView, final BindingCommand<LiveSceneBean> looperClick) {
        looperNewsView.setLoopClick(new AskLawLooperView.LoopClickListener() {
            @Override
            public void clickLoop(LiveSceneBean liveSceneBean) {
                if (null!=looperClick){
                    looperClick.execute(liveSceneBean);
                }
            }
        });

    }
}

