package com.lbs.apps.library.media.audioplayer.manager;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

import com.lbs.apps.library.media.audioplayer.beans.AudioInfo;
import com.lbs.apps.library.media.audioplayer.beans.AudioMessage;
import com.lbs.apps.library.media.audioplayer.receiver.AudioBroadcastReceiver;
import com.lbs.apps.library.media.audioplayer.receiver.MobliePhoneReceiver;
import com.lbs.apps.library.media.audioplayer.receiver.PhoneReceiver;
import com.lbs.apps.library.media.audioplayer.receiver.SystemReceiver;
import com.lbs.apps.library.media.audioplayer.service.AudioPlayerService;
import com.lbs.apps.library.media.audioplayer.utils.ToastUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 音频播放处理类
 * Created by zhangliangming on 2017/8/6.
 */
public class AudioPlayerManager {
    /**
     *
     */
    private Context mContext;
    /**
     * 正在播放
     */
    public static final int PLAYING = 0;
    /**
     * 暂停
     */
    public static final int PAUSE = 1;
    /**
     * 停止
     */
    public static final int STOP = 2;
    /**
     * 播放在线音乐
     */
    public static final int PLAYNET = 3;

    private AudioPlayerService service;

    private List<AudioPlayerListener> audioPlayerListenerList = new ArrayList<>();

    /**
     * 监听电话
     */
    private MobliePhoneReceiver mMobliePhoneReceiver;
    /**
     * 耳机广播
     */
    private PhoneReceiver mPhoneReceiver;


    /**
     * 系统广播
     */
    private SystemReceiver mSystemReceiver;
    private SystemReceiver.SystemReceiverListener mSystemReceiverListener = new SystemReceiver.SystemReceiverListener() {
        @Override
        public void onReceive(Context context, Intent intent) {
            doSystemReceive(intent);
        }
    };

    private static AudioPlayerManager _AudioPlayerManager;

    public AudioPlayerManager(Context context) {

        this.mContext = context;
    }

    /**
     * @param context
     * @return
     */
    public static AudioPlayerManager getAudioPlayerManager(Context context) {

        if (_AudioPlayerManager == null) {
            _AudioPlayerManager = new AudioPlayerManager(context);
        }
        return _AudioPlayerManager;
    }

    public void initCore(){
        ServiceConnection conn = new ServiceConnection() {
            //与服务交互的接口方法，绑定服务的时候被回调，在这个方法获取绑定Service传递过来的Ibinder对象
            @Override
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                //获取Binder
                AudioPlayerService.LocalBinder binder = (AudioPlayerService.LocalBinder) iBinder;
                service = binder.getService();
                service.setOnPlayListener(onPlayListener);

            }

            //取消绑定回调，一般不调用
            @Override
            public void onServiceDisconnected(ComponentName componentName) {
//                service = null;
            }
        };
        Intent intent = new Intent(mContext,AudioPlayerService.class);
        mContext.bindService(intent,conn, Service.BIND_AUTO_CREATE);
        //系统广播
        mSystemReceiver = new SystemReceiver(mContext);
        mSystemReceiver.setSystemReceiverListener(mSystemReceiverListener);
        mSystemReceiver.registerReceiver(mContext);

        //耳机广播
        mPhoneReceiver = new PhoneReceiver(mContext);
        if (AudioStateManager.getInstance().isWire()) {
            mPhoneReceiver.registerReceiver(mContext);
        }

        //电话监听
        mMobliePhoneReceiver = new MobliePhoneReceiver(mContext);
        mMobliePhoneReceiver.registerReceiver(mContext);
    }



    /**
     * 上一首
     *
     * @param playModel
     */
    public AudioInfo preMusic(int playModel) {
        if (AudioStateManager.getInstance().getCurAudioInfo() == null || AudioStateManager.getInstance().getCurAudioMessage() == null || AudioStateManager.getInstance().getCurAudioInfos() == null) {
            return null;
        }
        //获取播放索引
        int playIndex = getCurPlayIndex();

        if (playIndex == -1) {
            return null;
        }

        switch (playModel) {
            case 0:
                // 顺序播放
                playIndex--;
                if (playIndex < 0) {
                    return null;
                }

                if (AudioStateManager.getInstance().getCurAudioInfos().size() > 0) {
                    return AudioStateManager.getInstance().getCurAudioInfos().get(playIndex);
                }

                break;
            case 1:
                // 随机播放

                playIndex = new Random().nextInt(AudioStateManager.getInstance().getCurAudioInfos().size());
                if (AudioStateManager.getInstance().getCurAudioInfos().size() > 0) {
                    return AudioStateManager.getInstance().getCurAudioInfos().get(playIndex);
                }
                break;
            case 2:
                // 循环播放
                playIndex--;
                if (playIndex < 0) {
                    playIndex = AudioStateManager.getInstance().getCurAudioInfos().size()-1;
                }

                if (AudioStateManager.getInstance().getCurAudioInfos().size() != 0) {
                    return AudioStateManager.getInstance().getCurAudioInfos().get(playIndex);
                }

                break;
            case 3:
                // 单曲播放
                return AudioStateManager.getInstance().getCurAudioInfos().get(playIndex);

        }
        return null;
    }


    /**
     * 下一首
     *
     * @param playModel 播放模式
     * @return
     */
    public AudioInfo nextMusic(int playModel) {
        if (AudioStateManager.getInstance().getCurAudioInfo() == null || AudioStateManager.getInstance().getCurAudioMessage() == null || AudioStateManager.getInstance().getCurAudioInfos() == null) {
            return null;
        }
        //获取播放索引
        int playIndex = getCurPlayIndex();

        if (playIndex == -1) {
            return null;
        }

        switch (playModel) {
            case 0:
                // 顺序播放
                playIndex++;
                if (playIndex >= AudioStateManager.getInstance().getCurAudioInfos().size()) {
                    return null;
                }
                if (AudioStateManager.getInstance().getCurAudioInfos().size() > 0) {
                    return AudioStateManager.getInstance().getCurAudioInfos().get(playIndex);
                }

                break;
            case 1:
                // 随机播放

                playIndex = new Random().nextInt(AudioStateManager.getInstance().getCurAudioInfos().size());
                if (AudioStateManager.getInstance().getCurAudioInfos().size() > 0) {
                    return AudioStateManager.getInstance().getCurAudioInfos().get(playIndex);
                }
                break;
            case 2:
                // 循环播放

                playIndex++;
                if (playIndex >= AudioStateManager.getInstance().getCurAudioInfos().size()) {
                    playIndex = 0;
                }

                if (AudioStateManager.getInstance().getCurAudioInfos().size() > 0) {
                    return AudioStateManager.getInstance().getCurAudioInfos().get(playIndex);
                }

                break;
            case 3:
                // 单曲播放
                return AudioStateManager.getInstance().getCurAudioInfos().get(playIndex);

        }
        return null;
    }

    /**
     * 获取当前的播放索引
     *
     * @return
     */
    private int getCurPlayIndex() {

        int index = -1;
        for (int i = 0; i < AudioStateManager.getInstance().getCurAudioInfos().size(); i++) {
            AudioInfo audioInfo = AudioStateManager.getInstance().getCurAudioInfos().get(i);
            if (audioInfo.getAudioId().equals(AudioStateManager.getInstance().getPlayIndexHashID())) {
                return i;
            }
        }
        return index;
    }

    private void doSystemReceive(Intent intent) {
        String action = intent.getAction();
        if (action.equals(SystemReceiver.ACTION_TOASTMESSAGE)) {
            //提示信息
            String message = intent.getStringExtra(ToastUtil.MESSAGEKEY);

        } else if (action.equals(SystemReceiver.ACTION_OPENWIREMESSAGE)) {
            //打开线控

        } else if (action.equals(SystemReceiver.ACTION_CLOSEWIREMESSAGE)) {
            //关闭线控

        } else if (action.equals("android.media.AUDIO_BECOMING_NOISY") || action.equals("android.provider.Telephony.SMS_RECEIVED")) {
// 耳机拔出  或者收到短信
            /**
             * 从硬件层面来看，直接监听耳机拔出事件不难，耳机的拔出和插入，会引起手机电平的变化，然后触发什么什么中断，
             *
             * 最终在stack overflow找到答案，监听Android的系统广播AudioManager.
             * ACTION_AUDIO_BECOMING_NOISY，
             * 但是这个广播只是针对有线耳机，或者无线耳机的手机断开连接的事件，监听不到有线耳机和蓝牙耳机的接入
             * ，但对于我的需求来说足够了，监听这个广播就没有延迟了，UI可以立即响应
             */
            int playStatus = AudioStateManager.getInstance().getPlayStatus();
            if (playStatus == AudioPlayerManager.PLAYING) {

                Intent resumeIntent = new Intent(AudioBroadcastReceiver.ACTION_PAUSEMUSIC);
                resumeIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                mContext.sendBroadcast(resumeIntent);

            }

        }
    }


    public AudioPlayerService getService() {

        return service;
    }

    private AudioPlayerService.OnPlayListener onPlayListener = new AudioPlayerService.OnPlayListener() {
        @Override
        public void onPrepared(int state, long progress) {
            for (AudioPlayerListener audioPlayerListener:audioPlayerListenerList){
                audioPlayerListener.onPrepared(state,progress);
            }
        }

        @Override
        public void onError() {
            for (AudioPlayerListener audioPlayerListener:audioPlayerListenerList){
                audioPlayerListener.onError();
            }
        }

        @Override
        public void onCompletion() {
            for (AudioPlayerListener audioPlayerListener:audioPlayerListenerList){
                audioPlayerListener.onCompletion();
            }
        }

        @Override
        public void onSeekComplete(int state, long progress) {
            for (AudioPlayerListener audioPlayerListener:audioPlayerListenerList){
                audioPlayerListener.onSeekComplete(state,progress);
            }
        }

        @Override
        public void onPlaying(long progress) {
            for (AudioPlayerListener audioPlayerListener:audioPlayerListenerList){
                audioPlayerListener.onPlaying(progress);
            }
        }

        @Override
        public void onInitAudio() {
            for (AudioPlayerListener audioPlayerListener:audioPlayerListenerList){
                audioPlayerListener.onInitAudio();
            }
        }

        @Override
        public void onStart(AudioMessage audioMessage) {
            for (AudioPlayerListener audioPlayerListener:audioPlayerListenerList){
                audioPlayerListener.onStart(audioMessage);
            }
        }

        @Override
        public void onPause() {
            for (AudioPlayerListener audioPlayerListener:audioPlayerListenerList){
                audioPlayerListener.onPause();
            }
        }

        @Override
        public void onResume() {
            for (AudioPlayerListener audioPlayerListener:audioPlayerListenerList){
                audioPlayerListener.onResume();
            }
        }
    };

    public interface AudioPlayerListener {
        void onPrepared(int state,long progress);
        void onError();
        void onCompletion();
        void onSeekComplete(int state,long progress);
        void onPlaying(long progress);
        void onInitAudio();
        void onStart(AudioMessage audioMessage);
        void onPause();
        void onResume();
    }

    public void addAudioListener(AudioPlayerListener audioPlayerListener){
        if (null!=audioPlayerListener){
            audioPlayerListenerList.add(audioPlayerListener);
        }
    }

    public void removeAudioListener(AudioPlayerListener audioPlayerListener){
        if (null!=audioPlayerListener){
            audioPlayerListenerList.remove(audioPlayerListener);
        }
    }
}
