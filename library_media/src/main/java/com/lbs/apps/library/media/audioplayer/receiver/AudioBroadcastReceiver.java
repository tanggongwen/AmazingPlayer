package com.lbs.apps.library.media.audioplayer.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.util.Log;


import com.lbs.apps.library.media.audioplayer.beans.AudioMessage;
import com.lbs.apps.library.media.audioplayer.manager.AudioPlayerManager;
import com.lbs.apps.library.media.audioplayer.manager.AudioStateManager;

import java.util.Date;

/**
 * 音频广播
 */
public class AudioBroadcastReceiver {
    /**
     *
     */
    /**
     * 是否注册成功
     */
    private boolean isRegisterSuccess = false;
    private Context mContext;
    /**
     * 注册成功广播
     */
    private String ACTION_MUSICSUCCESS = "com.com.lbs.apps.music.success_" + new Date().getTime();

    //重新启动广播
    //public static final String ACTION_MUSICRESTART = "com.com.lbs.apps.music.start";
    //空音乐
    public static final String ACTION_NULLMUSIC = "com.com.lbs.apps.null.music";
    //添加音乐
    public static final String ACTION_ADDMUSIC = "com.com.lbs.apps.add.music";
    //初始化音乐
    public static final String ACTION_INITMUSIC = "com.com.lbs.apps.init.music";
    //点击播放音乐
    public static final String ACTION_PLAYMUSIC = "com.com.lbs.apps.play.music";
    //继续播放
    public static final String ACTION_RESUMEMUSIC = "com.com.lbs.apps.resume.music";
    //点击暂停播放
    public static final String ACTION_PAUSEMUSIC = "com.com.lbs.apps.pause.music";
    //点击音乐快进
    public static final String ACTION_SEEKTOMUSIC = "com.com.lbs.apps.seekto.music";
    //点击上一首
    public static final String ACTION_PREMUSIC = "com.com.lbs.apps.pre.music";
    //点击下一首
    public static final String ACTION_NEXTMUSIC = "com.com.lbs.apps.next.music";

    //播放器开始播放
    public static final String ACTION_SERVICE_PLAYMUSIC = "com.com.lbs.apps.service.play.music";
    //播放器暂停
    public static final String ACTION_SERVICE_PAUSEMUSIC = "com.com.lbs.apps.service.pause.music";
    //播放器唤醒
    public static final String ACTION_SERVICE_RESUMEMUSIC = "com.com.lbs.apps.service.resume.music";

    //播放器快进
    public static final String ACTION_SERVICE_SEEKTOMUSIC = "com.com.lbs.apps.service.seekto.music";
    //播放器播放中
    public static final String ACTION_SERVICE_PLAYINGMUSIC = "com.com.lbs.apps.service.playing.music";
    //播放错误
    public static final String ACTION_SERVICE_PLAYERRORMUSIC = "com.com.lbs.apps.service.playerror.music";

    public static final String ACTION_SERVICE_START="com.com.lbs.apps.service.start.music";

    public static final String ACTION_SERVICE_INIT="com.com.lbs.apps.service.INIT.music";
    //
    public static final String ACTION_SINGERPICLOADED = "com.com.lbs.apps.singerpic.loaded";

    /**
     * 暂停播放时，如果进度条快进时，歌曲也快进
     */
    public static final String ACTION_LRCSEEKTO = "com.com.lbs.apps.lrc.seekto";
    //使用歌词
    public static final String ACTION_LRCUSE = "com.com.lbs.apps.lrc.use";
    //
    //本地歌曲更新
    public static final String ACTION_LOCALUPDATE = "com.com.lbs.apps.local.update.music";
    //最近歌曲更新
    public static final String ACTION_RECENTUPDATE = "com.com.lbs.apps.recent.update.music";
    //下载歌曲更新
    public static final String ACTION_DOWNLOADUPDATE = "com.com.lbs.apps.download.update.music";
    //喜欢歌曲更新
    public static final String ACTION_LIKEUPDATE = "com.com.lbs.apps.like.update.music";
    //添加喜欢歌曲
    public static final String ACTION_LIKEADD = "com.com.lbs.apps.like.add.music";
    public static final String ACTION_LIKEDELETE = "com.com.lbs.apps.like.delete.music";

    /**
     * 重新加载歌手写真
     */
    public static String ACTION_RELOADSINGERIMG = "com.com.lbs.apps.reload.singerimg";
    public static String ACTION_SINGERIMGLOADED = "com.com.lbs.apps.singerimg.loaded";

    /**
     * 通知栏桌面歌词加锁/解锁
     */
    public static String ACTION_DESLRC_LOCKORUNLOCK = "com.com.lbs.apps.des.lrc.lockorunlock";

    private BroadcastReceiver mAudioBroadcastReceiver;
    private IntentFilter mAudioIntentFilter;
    private AudioReceiverListener mAudioReceiverListener;

    public AudioBroadcastReceiver(Context context) {
        this.mContext = context;
        mAudioIntentFilter = new IntentFilter();
        //
        mAudioIntentFilter.addAction(ACTION_MUSICSUCCESS);
        mAudioIntentFilter.addAction(ACTION_NULLMUSIC);
        // mAudioIntentFilter.addAction(ACTION_MUSICRESTART);
        mAudioIntentFilter.addAction(ACTION_ADDMUSIC);
        mAudioIntentFilter.addAction(ACTION_INITMUSIC);
        mAudioIntentFilter.addAction(ACTION_PLAYMUSIC);
        mAudioIntentFilter.addAction(ACTION_RESUMEMUSIC);
        mAudioIntentFilter.addAction(ACTION_PAUSEMUSIC);
        mAudioIntentFilter.addAction(ACTION_SEEKTOMUSIC);
        mAudioIntentFilter.addAction(ACTION_PREMUSIC);
        mAudioIntentFilter.addAction(ACTION_NEXTMUSIC);

        mAudioIntentFilter.addAction(ACTION_SERVICE_PLAYMUSIC);
        mAudioIntentFilter.addAction(ACTION_SERVICE_PAUSEMUSIC);
        mAudioIntentFilter.addAction(ACTION_SERVICE_SEEKTOMUSIC);
        mAudioIntentFilter.addAction(ACTION_SERVICE_RESUMEMUSIC);
        mAudioIntentFilter.addAction(ACTION_SERVICE_PLAYINGMUSIC);
        mAudioIntentFilter.addAction(ACTION_SERVICE_PLAYERRORMUSIC);


        //
        mAudioIntentFilter.addAction(ACTION_SINGERPICLOADED);

        //
        mAudioIntentFilter.addAction(ACTION_LOCALUPDATE);
        mAudioIntentFilter.addAction(ACTION_RECENTUPDATE);
        mAudioIntentFilter.addAction(ACTION_DOWNLOADUPDATE);
        mAudioIntentFilter.addAction(ACTION_LIKEUPDATE);
        mAudioIntentFilter.addAction(ACTION_LIKEADD);
        mAudioIntentFilter.addAction(ACTION_LIKEDELETE);
        //
        mAudioIntentFilter.addAction(ACTION_RELOADSINGERIMG);
        mAudioIntentFilter.addAction(ACTION_SINGERIMGLOADED);

        //
        mAudioIntentFilter.addAction(ACTION_DESLRC_LOCKORUNLOCK);

    }

    /**
     *
     */
    private Handler mAudioHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {

            if (mAudioReceiverListener != null) {
                Intent intent = (Intent) msg.obj;
                if (intent.getAction().equals(ACTION_MUSICSUCCESS)) {
                    isRegisterSuccess = true;

                    //
                    //服务被强迫回收
                    if (AudioStateManager.getInstance().isPlayServiceForceDestroy()) {
                        AudioStateManager.getInstance().setPlayServiceForceDestroy(false);
                        int playStatus = AudioStateManager.getInstance().getPlayStatus();
                        if (playStatus == AudioPlayerManager.PLAYING) {

                            //
                         Log.e("AudioBroadcastReceiver","发送重启后重新播放音频广播");
                            AudioMessage audioMessage = AudioStateManager.getInstance().getCurAudioMessage();
                            if (audioMessage != null) {
                                Intent resumeIntent = new Intent(AudioBroadcastReceiver.ACTION_PLAYMUSIC);
                                resumeIntent.putExtra(AudioMessage.KEY, audioMessage);
                                resumeIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                                mContext.sendBroadcast(resumeIntent);
                            }
                        } else {
                            //服务回收了，修改当前的播放状态
                            AudioStateManager.getInstance().setPlayStatus(AudioPlayerManager.STOP);
                        }
                    }

                } else {
                    mAudioReceiverListener.onReceive(mContext, intent);
                }

            }
        }
    };

    /**
     * 注册广播
     *
     * @param context
     */
    public void registerReceiver(Context context) {
        if (mAudioBroadcastReceiver == null) {
            //
            mAudioBroadcastReceiver = new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {

                    Message msg = new Message();
                    msg.obj = intent;
                    mAudioHandler.sendMessage(msg);


                }
            };

            mContext.registerReceiver(mAudioBroadcastReceiver, mAudioIntentFilter);
            //发送注册成功广播
            Intent successIntent = new Intent(ACTION_MUSICSUCCESS);
            successIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
            mContext.sendBroadcast(successIntent);

        }
    }

    /**
     * 取消注册广播
     */
    public void unregisterReceiver(Context context) {
        if (mAudioBroadcastReceiver != null && isRegisterSuccess) {

            mContext.unregisterReceiver(mAudioBroadcastReceiver);

        }

    }

    public void setAudioReceiverListener(AudioReceiverListener audioReceiverListener) {
        this.mAudioReceiverListener = audioReceiverListener;
    }

    ///////////////////////////////////
    public interface AudioReceiverListener {
        void onReceive(Context context, Intent intent);
    }
}
