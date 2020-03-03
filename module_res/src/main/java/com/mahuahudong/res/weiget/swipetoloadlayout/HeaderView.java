package com.mahuahudong.res.weiget.swipetoloadlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mahuahudong.res.R;

public class HeaderView extends RelativeLayout implements SwipeRefreshTrigger ,SwipeTrigger{
    private TextView tvHead;
    private ImageView imgDefault;
    private ImageView imgShuaxin;
    public HeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    @Override
    public void onRefresh() {
        tvHead.setText("正在加载中");
        imgShuaxin.setVisibility(VISIBLE);
        imgDefault.setVisibility(GONE);
    }

    @Override
    public void onPrepare() {

    }

    @Override
    public void onMove(int y, boolean isComplete, boolean automatic) {
        tvHead.setText("释放刷新");
        imgShuaxin.setVisibility(GONE);
        imgDefault.setVisibility(VISIBLE);
    }

    @Override
    public void onRelease() {

    }


    @Override
    public void onComplete() {
        tvHead.setText("刷新成功");
        imgShuaxin.setVisibility(GONE);
        imgDefault.setVisibility(GONE);
    }

    @Override
    public void onReset() {

    }

    private void init(Context context) {

        //这里的原理就是简单的动态布局加入
        View view = View.inflate(context, R.layout.layout_load_head, this);


        tvHead = (TextView) view.findViewById(R.id.tvTip);
        imgDefault = view.findViewById(R.id.imgDefault);
        imgShuaxin = view.findViewById(R.id.imgShuaxin);
    }


}
