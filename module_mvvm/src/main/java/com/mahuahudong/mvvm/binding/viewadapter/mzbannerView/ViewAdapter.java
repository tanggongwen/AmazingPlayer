package com.mahuahudong.mvvm.binding.viewadapter.mzbannerView;

import androidx.databinding.BindingAdapter;

import com.zhouwei.mzbanner.MZBannerView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;

import java.util.List;

/**
 * Created by goldze on 2017/6/16.
 */

public class ViewAdapter {
    /**
     */
    @SuppressWarnings("unchecked")
    @BindingAdapter(value = {"datas","mzHolderCreator"}, requireAll = false)
    public static void setPages(final MZBannerView mzBannerView, List datas, MZHolderCreator mzHolderCreator) {
       mzBannerView.setPages(datas,mzHolderCreator);
       mzBannerView.setIndicatorVisible(false);
       mzBannerView.start();
    }
}
