package com.mahuahudong.mvvm.binding.viewadapter.loopernewsview;


import androidx.databinding.BindingAdapter;

import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.res.beans.NewsMapBean;
import com.mahuahudong.res.weiget.LooperNewsView;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by goldze on 2017/6/18.
 */
public final class ViewAdapter {
    @BindingAdapter(value = {"looperdatas"}, requireAll = false)
    public static void setLooperDatas(final LooperNewsView looperNewsView, CopyOnWriteArrayList<NewsMapBean.NewsLsBean.ClassicNewsBean> looperdatas) {
      looperNewsView.setTipList(looperdatas);

    }

    @BindingAdapter(value = {"looperClickListener"}, requireAll = false)
    public static void setLooperClickListener(final LooperNewsView looperNewsView, final BindingCommand<NewsMapBean.NewsLsBean.ClassicNewsBean> looperClick) {
        looperNewsView.setLoopClick(new LooperNewsView.LoopClickListener() {
            @Override
            public void clickLoop(NewsMapBean.NewsLsBean.ClassicNewsBean classicNewsBean) {
                if (null!=looperClick){
                    looperClick.execute(classicNewsBean);
                }
            }
        });

    }
}

