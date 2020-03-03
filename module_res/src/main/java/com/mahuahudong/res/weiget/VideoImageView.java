package com.mahuahudong.res.weiget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;


public class VideoImageView extends AppCompatImageView {


    public VideoImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //获取宽的可能值
        int width = MeasureSpec.getSize(widthMeasureSpec);
        //按照比例计算高度(高度=宽度 / 75 * 32)
        int newHeight = MeasureSpec.makeMeasureSpec(width / 16 * 9, MeasureSpec.EXACTLY);
        //设置新的高度给系统
        super.onMeasure(widthMeasureSpec, newHeight);

    }
}
