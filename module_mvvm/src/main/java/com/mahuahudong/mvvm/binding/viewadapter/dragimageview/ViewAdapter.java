package com.mahuahudong.mvvm.binding.viewadapter.dragimageview;

import androidx.databinding.BindingAdapter;

import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.res.weiget.DragImageView;

/**
 * Created by goldze on 2017/6/16.
 */

public class ViewAdapter {


    @BindingAdapter(value = {"onDragListener"}, requireAll = false)
    public static void setOnDragListener(DragImageView dragImageView, final BindingCommand onDragListener){
        dragImageView.setOnDragListener(new DragImageView.OnDragListener() {
            @Override
            public void onDrag() {
                onDragListener.execute();
            }
        });

}}
