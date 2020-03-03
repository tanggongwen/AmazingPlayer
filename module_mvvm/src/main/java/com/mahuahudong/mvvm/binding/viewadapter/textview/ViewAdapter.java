package com.mahuahudong.mvvm.binding.viewadapter.textview;


import android.widget.TextView;

import androidx.databinding.BindingAdapter;

/**
 * Created by goldze on 2017/6/18.
 */
public final class ViewAdapter {
    @BindingAdapter(value = {"bgResId",}, requireAll = false)
    public static void setBackgroundResource(TextView textView, int resId) {
      textView.setBackgroundResource(resId);
    }

    @BindingAdapter(value = {"textColor","backgroundRes"}, requireAll = false)
    public static void setTextColor(TextView textView, int textColor,int backgroundRes) {
        textView.setTextColor(textColor);
        textView.setBackgroundResource(backgroundRes);
    }
}

