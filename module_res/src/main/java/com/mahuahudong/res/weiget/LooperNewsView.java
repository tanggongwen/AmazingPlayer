package com.mahuahudong.res.weiget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.mahuahudong.res.R;
import com.mahuahudong.res.Utils;
import com.mahuahudong.res.beans.NewsMapBean.NewsLsBean.ClassicNewsBean;
import com.mahuahudong.res.beans.NewsMapBean;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LooperNewsView extends FrameLayout {
    private CopyOnWriteArrayList<ClassicNewsBean> tipList;
    private int curTipIndex = 1;
    private long lastTimeMillis ;
    private static final int ANIM_DELAYED_MILLIONS = 3 * 1000;
    /**  动画持续时长  */
    private static final int ANIM_DURATION = 1* 1000;
    private View tv_tip_out,tv_tip_in;
    private Animation anim_out, anim_in;
    private TextView tvTitle,tvTime,tvFrom,tvViewCount;
    private boolean startAnim = false;
    private LoopClickListener loopClickListener;
    private int index;
    public LooperNewsView(Context context) {
        super(context);
        initTipFrame(context);
        initAnimation();
    }

    public LooperNewsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTipFrame(context);
        initAnimation();
    }

    public LooperNewsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTipFrame(context);
        initAnimation();
    }
    private void initTipFrame(Context context) {
        Log.d("tanggongwen","initTip childCount:"+getChildCount());
        tv_tip_in = LayoutInflater.from(context).inflate(R.layout.layout_looper_item,null);
        tv_tip_out = LayoutInflater.from(context).inflate(R.layout.layout_looper_item,null);
        addView(tv_tip_out);
        addView(tv_tip_in);
    }


    private void initAnimation() {
        anim_out = newAnimation(0, -1);
        anim_in = newAnimation(1, 0);
        anim_in.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                startAnim = true;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startAnim = false;
                updateTipAndPlayAnimationWithCheck();
            }



        });
    }
    private Animation newAnimation(float fromYValue, float toYValue) {
        Animation anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF,0,Animation.RELATIVE_TO_SELF,0,
                Animation.RELATIVE_TO_SELF,fromYValue,Animation.RELATIVE_TO_SELF, toYValue);
        anim.setDuration(ANIM_DURATION);
        anim.setStartOffset(ANIM_DELAYED_MILLIONS);
        anim.setInterpolator(new DecelerateInterpolator());
        return anim;
    }
    private void updateTipAndPlayAnimationWithCheck() {
        if (System.currentTimeMillis() - lastTimeMillis < 1000 ) {
            return ;
        }
        lastTimeMillis = System.currentTimeMillis();
        updateTipAndPlayAnimation();
    }
    public void updateTipAndPlayAnimation() {

        if (curTipIndex % 2 == 0) {
            tv_tip_out.setVisibility(View.VISIBLE);
            tv_tip_in.setVisibility(View.INVISIBLE);
            updateTip(tv_tip_out);
            tv_tip_in.startAnimation(anim_out);
            tv_tip_out.startAnimation(anim_in);

//            this.bringChildToFront(tv_tip_in);

        } else {
            tv_tip_out.setVisibility(View.INVISIBLE);
            tv_tip_in.setVisibility(View.VISIBLE);
            updateTip(tv_tip_in);
            tv_tip_out.startAnimation(anim_out);
            tv_tip_in.startAnimation(anim_in);
//            this.bringChildToFront(tv_tip_out);
        }
    }

    public void startAnim(){
        anim_in.cancel();
        anim_out.cancel();
        if (curTipIndex % 2 == 0) {

            tv_tip_in.startAnimation(anim_out);
            tv_tip_out.startAnimation(anim_in);

//            this.bringChildToFront(tv_tip_in);

        } else {
            tv_tip_out.startAnimation(anim_out);
            tv_tip_in.startAnimation(anim_in);
//            this.bringChildToFront(tv_tip_out);
        }
    }

    public void pauseAnim(){
            anim_in.cancel();
            anim_out.cancel();
    }


    private void updateTip(View tipView) {
        tvTitle = tipView.findViewById(R.id.tvTitle);
        tvFrom = tipView.findViewById(R.id.tvFrom);
        tvTime = tipView.findViewById(R.id.tvTime);
        tvViewCount = tipView.findViewById(R.id.tvViewCount);
        final ClassicNewsBean tip = getNextTip();
        if(null!=tip) {
            tvTime.setText(Utils.getTimeTip(tip.getTimeDif(),tip.getIssueTimeStamp()));
            tvViewCount.setText("点击量 "+Utils.getViewCountFormat(tip.getViewCount()));
            tvTitle.setText(tip.getNewsTitle());
            tvFrom.setText(tip.getNewsSrc());
        }
        tipView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null!=loopClickListener){
                    index = curTipIndex%tipList.size()-2;
                    if (index<0){
                        index = tipList.size()+index;
                    }
                    loopClickListener.clickLoop(tipList.get(index));
                }
            }
        });
    }
    /**
     *  获取下一条消息
     * @return
     */
    private NewsMapBean.NewsLsBean.ClassicNewsBean getNextTip() {
        if (isListEmpty(tipList)) return null;
        return tipList.get(curTipIndex++ % tipList.size());
    }
    public static boolean isListEmpty(List list) {
        return list == null || list.isEmpty();
    }
    public void setTipList(CopyOnWriteArrayList<ClassicNewsBean> tipList) {
        this.tipList = tipList;
        curTipIndex = 0;
        updateTip(tv_tip_out);
        updateTipAndPlayAnimation();
    }

    public void setLoopClick(LoopClickListener loopClick){
        this.loopClickListener = loopClick;
    }

  public boolean getAnimState(){
        return startAnim;
  }


    public interface LoopClickListener{
        void clickLoop(ClassicNewsBean classicNewsBean);
    }

}
