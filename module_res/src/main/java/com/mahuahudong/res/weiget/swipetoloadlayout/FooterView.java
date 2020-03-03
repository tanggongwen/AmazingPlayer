package com.mahuahudong.res.weiget.swipetoloadlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mahuahudong.res.R;

public class FooterView extends RelativeLayout implements SwipeLoadMoreTrigger ,SwipeTrigger{
    private TextView tvHead;
    private ImageView imgDefault,imgShuaxin;
    public FooterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }



    @Override
    public void onPrepare() {

    }

    @Override
    public void onMove(int y, boolean isComplete, boolean automatic) {
        tvHead.setText("释放加载");
        imgShuaxin.setVisibility(GONE);
        imgDefault.setVisibility(VISIBLE);
    }

    @Override
    public void onRelease() {

    }


    @Override
    public void onComplete() {
        tvHead.setText("加载成功");
        imgShuaxin.setVisibility(GONE);
        imgDefault.setVisibility(GONE);
    }

    @Override
    public void onReset() {

    }

    private void init(Context context) {

        //这里的原理就是简单的动态布局加入
        View view = View.inflate(context, R.layout.layout_load_more, this);

        imgDefault = view.findViewById(R.id.imgDefault);
        imgShuaxin = view.findViewById(R.id.imgShuaxin);
        tvHead = (TextView) view.findViewById(R.id.tvTip);
    }


    @Override
    public void onLoadMore() {
        tvHead.setText("正在加载更多");
        imgShuaxin.setVisibility(VISIBLE);
        imgDefault.setVisibility(GONE);
    }
}
