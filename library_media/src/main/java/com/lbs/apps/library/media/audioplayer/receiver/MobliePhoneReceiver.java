package com.lbs.apps.library.media.audioplayer.receiver;

import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

import com.lbs.apps.library.media.audioplayer.manager.AudioPlayerManager;
import com.lbs.apps.library.media.audioplayer.manager.AudioStateManager;

/**
 * 电话监听
 */

public class MobliePhoneReceiver {



    private Context mContext;

    private MobliePhoneStateListener mMobliePhoneStateListener;


    /**
     * @author wwj 电话监听器类
     */
    private class MobliePhoneStateListener extends PhoneStateListener {
        @Override
        public void onCallStateChanged(int state, String incomingNumber) {
            switch (state) {
                case TelephonyManager.CALL_STATE_IDLE: // 挂机状态
                    break;
                case TelephonyManager.CALL_STATE_OFFHOOK: // 通话状态
                case TelephonyManager.CALL_STATE_RINGING: // 响铃状态


                    //暂停
                    int playStatus = AudioStateManager.getInstance().getPlayStatus();
                    if (playStatus == AudioPlayerManager.PLAYING) {

                        Intent resumeIntent = new Intent(AudioBroadcastReceiver.ACTION_PAUSEMUSIC);
                        resumeIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                        mContext.sendBroadcast(resumeIntent);

                    }


                    break;
                default:
                    break;
            }
        }
    }

    public MobliePhoneReceiver(Context context) {
        this.mContext = context;

        //
        mMobliePhoneStateListener = new MobliePhoneStateListener();
    }


    /**
     * 注册广播
     *
     * @param context
     */
    public void registerReceiver(Context context) {
// 添加来电监听事件
        TelephonyManager telManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE); // 获取系统服务
        telManager.listen(mMobliePhoneStateListener,
                PhoneStateListener.LISTEN_CALL_STATE);

    }

    /**
     * 取消注册广播
     */
    public void unregisterReceiver(Context context) {
        TelephonyManager telManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE); // 获取系统服务
        telManager.listen(mMobliePhoneStateListener, PhoneStateListener.LISTEN_NONE);
    }

}
