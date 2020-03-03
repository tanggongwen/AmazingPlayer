package com.mahuahudong.mvvm.binding.viewadapter.image;


import android.net.Uri;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

/**
 * Created by goldze on 2017/6/18.
 */
public final class ViewAdapter {
    @BindingAdapter(value = {"url", "placeholderRes"}, requireAll = false)
    public static void setImageUri(final ImageView imageView, String url, final int placeholderRes) {
      Glide.with(imageView.getContext()).load(url).error(placeholderRes).placeholder(placeholderRes).into(imageView);
    }

    @BindingAdapter(value = {"drawableRes","placeholderRes"}, requireAll = false)
    public static void setImageRes(final ImageView imageView, int drawableRes, final int placeholderRes) {
        Glide.with(imageView.getContext()).load(drawableRes).error(placeholderRes).placeholder(placeholderRes).into(imageView);
    }

    @BindingAdapter(value = {"uri","placeholderRes"}, requireAll = false)
    public static void setImageRes(final ImageView imageView, Uri uri, final int placeholderRes) {
        Glide.with(imageView.getContext()).load(uri).error(placeholderRes).placeholder(placeholderRes).into(imageView);
    }
}

