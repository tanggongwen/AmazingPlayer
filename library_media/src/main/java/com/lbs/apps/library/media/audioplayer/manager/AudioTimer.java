package com.lbs.apps.library.media.audioplayer.manager;

import android.content.Context;
import android.os.CountDownTimer;

public enum AudioTimer {
    INSTANCE;
    private boolean hasSet = false;
    private CountDownTimer countDownTimer;
    private OnAudioTimerTick timerTick;
    /**
     * RxJava 方式实现
     */
    public void startTimer(long totalTime,final Context context){
        /**
         * CountDownTimer 实现倒计时
         */
        hasSet = true;
        if (null!=countDownTimer){
            countDownTimer.cancel();
        }
        countDownTimer = new CountDownTimer(totalTime, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (null!=timerTick){
                    timerTick.onTick(millisUntilFinished);
                }
            }

            @Override
            public void onFinish() {
                if (AudioStateManager.getInstance().getPlayStatus()==AudioPlayerManager.PLAYING){
                    AudioController.INSTANCE.playPause(context);
                }
                if (null!=timerTick){
                    hasSet = false;
                    timerTick.onFinish();
                }
            }
        };
        countDownTimer.start();

    }

    public void startInfinity(){
        hasSet = true;
        if (null!=countDownTimer){
            countDownTimer.cancel();
        }
        if (null!=timerTick){
            timerTick.onFinish();
        }
    }



    public void setTimerTick(OnAudioTimerTick timerTick) {
        this.timerTick = timerTick;
    }

    public boolean isHasSet() {
        return hasSet;
    }

    public interface OnAudioTimerTick{
        void onTick(long unitiFinished);
        void onFinish();
    }

    }
