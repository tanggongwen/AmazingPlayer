package com.mahuahudong.res.weiget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;

import androidx.annotation.Nullable;

import com.lbs.apps.library.media.audioplayer.manager.AudioController;


public class DragImageView extends CircleImageView {
    private float mLastRawX;
    private float mLastRawY;
    private boolean isDrug = false;
    private int mRootMeasuredWidth = 0;
    private int mRootMeasuredHeight = 0;
    private int mRootTopY = 0;
    private boolean customIsAttach = true;
    private boolean customIsDrag = true;
    public OnDragListener onDragListener;

    private ObjectAnimator objectAnimator;

    public static final int STATE_PLAYING =1;//正在播放
    public static final int STATE_PAUSE =2;//暂停
    public static final int STATE_STOP =3;//停止
    public int state;

    private Context context;

    public DragImageView(Context context) {
        this(context, null);
        this.context = context;
    }

    public DragImageView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
        this.context = context;
    }

    public DragImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        super.dispatchTouchEvent(event);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        //判断是否需要滑动
        if (customIsDrag) {
            //当前手指的坐标
            float mRawX = ev.getRawX();
            float mRawY = ev.getRawY();
            switch (ev.getAction()) {
                case MotionEvent.ACTION_DOWN://手指按下
                    isDrug = false;
                    //记录按下的位置
                    mLastRawX = mRawX;
                    mLastRawY = mRawY;
                    ViewGroup mViewGroup = (ViewGroup) getParent();
                    if (mViewGroup != null) {
                        int[] location = new int[2];
                        mViewGroup.getLocationInWindow(location);
                        //获取父布局的高度
                        mRootMeasuredHeight = mViewGroup.getMeasuredHeight();
                        mRootMeasuredWidth = mViewGroup.getMeasuredWidth();
                        //获取父布局顶点的坐标
                        mRootTopY = location[1];
                    }
                    break;
                case MotionEvent.ACTION_MOVE://手指滑动
                    if (mRawX >= 0 && mRawX <= mRootMeasuredWidth && mRawY >= mRootTopY && mRawY <= (mRootMeasuredHeight + mRootTopY)) {
                        //手指X轴滑动距离
                        float differenceValueX = mRawX - mLastRawX;
                        //手指Y轴滑动距离
                        float differenceValueY = mRawY - mLastRawY;
                        //判断是否为拖动操作
                        if (!isDrug) {
                            if (Math.sqrt(differenceValueX * differenceValueX + differenceValueY * differenceValueY) < 2) {
                                isDrug = false;
                            } else {
                                isDrug = true;
                            }
                        }
                        //获取手指按下的距离与控件本身X轴的距离
                        float ownX = getX();
                        //获取手指按下的距离与控件本身Y轴的距离
                        float ownY = getY();
                        //理论中X轴拖动的距离
                        float endX = ownX + differenceValueX;
                        //理论中Y轴拖动的距离
                        float endY = ownY + differenceValueY;
                        //X轴可以拖动的最大距离
                        float maxX = mRootMeasuredWidth - getWidth();
                        //Y轴可以拖动的最大距离
                        float maxY = mRootMeasuredHeight - getHeight();
                        //X轴边界限制
                        endX = endX < 0 ? 0 : endX > maxX ? maxX : endX;
                        //Y轴边界限制
                        endY = endY < 0 ? 0 : endY > maxY ? maxY : endY;
                        //开始移动
                        setX(endX);
                        setY(endY);
                        //记录位置
                        mLastRawX = mRawX;
                        mLastRawY = mRawY;
                    }

                    break;
                case MotionEvent.ACTION_UP://手指离开
                    //根据自定义属性判断是否需要贴边
                    if (customIsAttach) {
                        //判断是否为点击事件
                        if (isDrug) {
                            float centerWidth = mRootMeasuredWidth / 2;
                            float offsetHeight = mRootMeasuredHeight/4;
                            //自动贴边
                            if (mLastRawY >= offsetHeight*3) {
                                DragImageView.this.animate()
                                        .setInterpolator(new BounceInterpolator())
                                        .setDuration(500)
                                        .x(centerWidth-getWidth()/2)
                                        .y(mRootMeasuredHeight-getHeight())
                                        .start();
                            }else {
                                AudioController.INSTANCE.playPause(context);
                                if (null!=onDragListener){
                                    onDragListener.onDrag();
                                }
                                Log.d("dragimageview","gone");
                            }
                        }
                    }
                    break;
            }
        }
        //是否拦截事件
        return isDrug ? isDrug : super.onTouchEvent(ev);
    }


    private void init(){
        state = STATE_STOP;
        objectAnimator = ObjectAnimator.ofFloat(this, "rotation", 0f, 360f);//添加旋转动画，旋转中心默认为控件中点
        objectAnimator.setDuration(3000);//设置动画时间
        objectAnimator.setInterpolator(new LinearInterpolator());//动画时间线性渐变
        objectAnimator.setRepeatCount(ObjectAnimator.INFINITE);
        objectAnimator.setRepeatMode(ObjectAnimator.RESTART);
    }

    public void startAnim(){
        resetPosition();
        if(state == STATE_STOP){
            objectAnimator.start();//动画开始
            state = STATE_PLAYING;
        }else if(state == STATE_PAUSE){
            objectAnimator.resume();//动画重新开始
            state = STATE_PLAYING;
        }
    }

    public void resetPosition(){
        DragImageView.this.animate()
                .setInterpolator(new BounceInterpolator())
                .setDuration(0)
                .x(mRootMeasuredWidth / 2-getWidth()/2)
                .y(mRootMeasuredHeight-getHeight())
                .start();
    }

    public void pauseAnim(){
        if(state == STATE_PLAYING){
            objectAnimator.pause();//动画暂停
            state = STATE_PAUSE;
        }
    }

    public void stopAnim(){
        objectAnimator.end();//动画结束
        state = STATE_STOP;
    }

    public interface  OnDragListener{
        void onDrag();
    }

    public void setOnDragListener(OnDragListener onDragListener) {
        this.onDragListener = onDragListener;
    }
}