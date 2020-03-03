package com.mahuahudong.mvvm.binding.viewadapter.looperexposeview;


import androidx.databinding.BindingAdapter;

import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.res.beans.AskLawDetailBean;
import com.mahuahudong.res.weiget.LooperExposeView;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by goldze on 2017/6/18.
 */
public final class ViewAdapter {
    @BindingAdapter(value = {"looperdatas"}, requireAll = false)
    public static void setLooperDatas(final LooperExposeView looperNewsView, CopyOnWriteArrayList<AskLawDetailBean.SafeguardRightInfoBean> looperdatas) {
      looperNewsView.setTipList(looperdatas);

    }

    @BindingAdapter(value = {"looperClickListener"}, requireAll = false)
    public static void setLooperClickListener(final LooperExposeView looperNewsView, final BindingCommand<AskLawDetailBean.SafeguardRightInfoBean> looperClick) {
        looperNewsView.setLoopClick(new LooperExposeView.LoopClickListener() {
            @Override
            public void clickLoop(AskLawDetailBean.SafeguardRightInfoBean classicNewsBean) {
                if (null!=looperClick){
                    looperClick.execute(classicNewsBean);
                }
            }
        });

    }
}

