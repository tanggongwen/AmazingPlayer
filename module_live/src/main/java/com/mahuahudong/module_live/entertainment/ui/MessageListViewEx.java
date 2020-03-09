package com.mahuahudong.module_live.entertainment.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.mahuahudong.module_live.base.util.ScreenUtil;
import com.mahuahudong.module_live.im.ui.listview.MessageListView;

/**
 * Created by hzxuwen on 2016/3/31.
 */
public class MessageListViewEx extends MessageListView {
    private int maxHeight = ScreenUtil.dip2px(80);

    public MessageListViewEx(Context context) {
        super(context);
    }

    public MessageListViewEx(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MessageListViewEx(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (maxHeight > 0){
            int hSize = View.MeasureSpec.getSize(heightMeasureSpec);
            int hMode = View.MeasureSpec.getMode(heightMeasureSpec);

            switch (hMode){
                case View.MeasureSpec.AT_MOST:
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(hSize, maxHeight), View.MeasureSpec.AT_MOST);
                    break;
                case View.MeasureSpec.UNSPECIFIED:
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(maxHeight, View.MeasureSpec.UNSPECIFIED);
                    break;
                case View.MeasureSpec.EXACTLY:
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(hSize, maxHeight), View.MeasureSpec.EXACTLY);
                    break;
            }
        }

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
