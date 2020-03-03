package com.lbs.apps.library.media.audioplayer.service;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

import com.lbs.apps.library.media.audioplayer.beans.AudioInfo;
import com.lbs.apps.library.media.audioplayer.beans.AudioMessage;
import com.lbs.apps.library.media.audioplayer.manager.AudioPlayerManager;
import com.lbs.apps.library.media.audioplayer.manager.AudioStateManager;
import com.lbs.apps.library.media.audioplayer.receiver.AudioBroadcastReceiver;
import com.lbs.apps.library.media.audioplayer.utils.ToastUtil;
import com.lbs.apps.library.media.exo.ExoMediaPlayer;
import com.lbs.apps.library.media.exo.ExoMediaPlayerFactory;

import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

import static android.media.AudioManager.STREAM_MUSIC;

/**
 * @Description:播放服务
 * @Param:
 * @Return:
 * @Author: tanggongwen
 * @Date: 2019/10/17
 * @Throws:
 */
public class AudioPlayerService extends Service {
    public AudioPlayerService(){

    }

    /**
     * 播放器
     */
    private IjkMediaPlayer mMediaPlayer;

    /**
     * 播放线程
     */
    private Thread mPlayerThread = null;
    

    /**
     * 音频广播
     */
    private AudioBroadcastReceiver mAudioBroadcastReceiver;


    private LocalBinder localBinder = new LocalBinder();

    /**
     * 广播监听
     */
    private AudioBroadcastReceiver.AudioReceiverListener mAudioReceiverListener = new AudioBroadcastReceiver.AudioReceiverListener() {
        @Override
        public void onReceive(final Context context, final Intent intent) {
            doAudioReceive(context, intent);

        }
    };
    /**
     * 是否正在快进
     */
    private boolean isSeekTo = false;


    private OnPlayListener onPlayListener;

    @Override
    public void onCreate() {
        super.onCreate();

        //注册接收音频播放广播
        mAudioBroadcastReceiver = new AudioBroadcastReceiver(getApplicationContext());
        mAudioBroadcastReceiver.setAudioReceiverListener(mAudioReceiverListener);
        mAudioBroadcastReceiver.registerReceiver(getApplicationContext());




        Log.i("AudioPlayerService","音频播放服务启动");

        //初始化通知栏
    }

    public void setOnPlayListener(OnPlayListener onPlayListener) {
        this.onPlayListener = onPlayListener;
    }

    public class LocalBinder extends Binder {
        public AudioPlayerService getService(){
            return AudioPlayerService.this;
        }
    }


    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return localBinder;
    }

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onDestroy() {
        mAudioBroadcastReceiver.unregisterReceiver(getApplicationContext());
        //关闭通知栏
        stopForeground(true);
        Log.i("AudioPlayerService","音频播放服务销毁");
        super.onDestroy();
    }

    /**
     * 广播处理
     *
     * @param context
     * @param intent
     */
    private void doAudioReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(AudioBroadcastReceiver.ACTION_NULLMUSIC)) {
            releasePlayer();
            resetPlayData();

        } else if (action.equals(AudioBroadcastReceiver.ACTION_PLAYMUSIC)) {
            //播放歌曲
            playMusic((AudioMessage) intent.getSerializableExtra(AudioMessage.KEY));

        } else if (action.equals(AudioBroadcastReceiver.ACTION_PAUSEMUSIC)) {
            //暂停歌曲
            pauseMusic();
        } else if (action.equals(AudioBroadcastReceiver.ACTION_RESUMEMUSIC)) {
            //唤醒歌曲
            resumeMusic();
        } else if (action.equals(AudioBroadcastReceiver.ACTION_SEEKTOMUSIC)) {
            //歌曲快进
            seekToMusic((AudioMessage) intent.getSerializableExtra(AudioMessage.KEY));
        } else if (action.equals(AudioBroadcastReceiver.ACTION_NEXTMUSIC)) {
            //下一首
            nextMusic();
        } else if (action.equals(AudioBroadcastReceiver.ACTION_PREMUSIC)) {
            //上一首
            preMusic();
        }

        if (action.equals(AudioBroadcastReceiver.ACTION_NULLMUSIC)
                || action.equals(AudioBroadcastReceiver.ACTION_INITMUSIC)
                || action.equals(AudioBroadcastReceiver.ACTION_SINGERPICLOADED)
                || action.equals(AudioBroadcastReceiver.ACTION_SERVICE_SEEKTOMUSIC)
                || action.equals(AudioBroadcastReceiver.ACTION_SERVICE_PLAYMUSIC)
                || action.equals(AudioBroadcastReceiver.ACTION_SERVICE_RESUMEMUSIC)
                || action.equals(AudioBroadcastReceiver.ACTION_SERVICE_PAUSEMUSIC)) {

        }

    }



    /**
     * 上一首
     */
    public void preMusic() {

        Log.e("AudioPlayerService","准备播放上一首");
        int playModel = AudioStateManager.getInstance().getPlayModel();
        AudioInfo audioInfo = AudioPlayerManager.getAudioPlayerManager(getApplicationContext()).preMusic(playModel);
        if (audioInfo == null) {
            releasePlayer();
            resetPlayData();

            //发送空数据广播
            Intent nullIntent = new Intent(AudioBroadcastReceiver.ACTION_NULLMUSIC);
            nullIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
            sendBroadcast(nullIntent);

            return;
        }

        Log.e("AudioPlayerService","上一首歌曲为：" + audioInfo.getAudioName());
        //
        AudioMessage audioMessage = new AudioMessage();
        audioMessage.setAudioInfo(audioInfo);
        playMusic(audioMessage);
    }

    /**
     * 下一首
     */
    public void nextMusic() {
        Log.e("AudioPlayerService","准备播放下一首");
        int playModel = AudioStateManager.getInstance().getPlayModel();
        AudioInfo audioInfo = AudioPlayerManager.getAudioPlayerManager(getApplicationContext()).nextMusic(playModel);
        if (audioInfo == null) {
            releasePlayer();
            resetPlayData();

            //发送空数据广播
            Intent nullIntent = new Intent(AudioBroadcastReceiver.ACTION_NULLMUSIC);
            nullIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
            sendBroadcast(nullIntent);

            return;
        }
        Log.e("AudioPlayerService","下一首歌曲为：" + audioInfo.getAudioName());
        //
        AudioMessage audioMessage = new AudioMessage();
        audioMessage.setAudioInfo(audioInfo);
        playMusic(audioMessage);
    }


    /**
     * 快进
     *
     * @param audioMessage
     */
    public void seekToMusic(AudioMessage audioMessage) {

        if (mMediaPlayer != null) {
            isSeekTo = true;
            mMediaPlayer.seekTo(audioMessage.getPlayProgress());
        }

    }

    /**
     * 唤醒播放
     */
    public void resumeMusic() {
            requestAudioFocus();
//        //如果是网络歌曲，先进行下载，再进行播放
//        if (AudioStateManager.getInstance().getCurAudioInfo() != null && AudioStateManager.getInstance().getCurAudioInfo().getType() == AudioInfo.NET) {
//
//            doNetMusic();
//        } else {
            if (mMediaPlayer != null) {
                mMediaPlayer.start();
            }
             onPlayListener.onResume();
            AudioStateManager.getInstance().setPlayStatus(AudioPlayerManager.PLAYING);


        Intent nextIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_RESUMEMUSIC);
        nextIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(nextIntent);
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    private final static String TAG = "智慧长沙";
    // 启动notification的id，两次启动应是同一个id
    private final static int NOTIFICATION_ID = android.os.Process.myPid();
    private AssistServiceConnection mServiceConnection;

    private void setForeground() {
        if (Build.VERSION.SDK_INT < 18)
        {
            startForeground(NOTIFICATION_ID, getNotification());
            return;
        }

        if (mServiceConnection == null)
        {
            mServiceConnection = new AssistServiceConnection();
        }
        // 绑定另外一条Service，目的是再启动一个通知，然后马上关闭。以达到通知栏没有相关通知
        // 的效果
        bindService(new Intent(this, AssistService.class), mServiceConnection,
                Service.BIND_AUTO_CREATE);
    }

    private class AssistServiceConnection implements ServiceConnection
    {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Service assistService = ((AssistService.LocalBinder)service)
                    .getService();
            assistService.startForeground(NOTIFICATION_ID, getNotification());
            assistService.startForeground(NOTIFICATION_ID, getNotification());
            assistService.stopForeground(true);

            assistService.unbindService(mServiceConnection);
            mServiceConnection = null;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    }

    private Notification getNotification()
    {
        Intent intent = new Intent(this, AudioPlayerService.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "")
                .setContentTitle("智慧长沙音频服务运行于前台")
                .setContentText("智慧长沙音频服务被设为前台进程")
                .setTicker("智慧长沙音频服务正在后台运行...")
                .setPriority(NotificationCompat.PRIORITY_MAX)
                .setWhen(System.currentTimeMillis())
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setContentIntent(pendingIntent);
        Notification notification = builder.build();
        notification.flags = Notification.FLAG_AUTO_CANCEL;
        return notification;
    }



    /**
     * 暂停播放
     */
    public void pauseMusic() {
        if (mMediaPlayer != null) {
            if (mMediaPlayer.isPlaying()) {
                mMediaPlayer.pause();
            }
        }
        onPlayListener.onPause();
        AudioStateManager.getInstance().setPlayStatus(AudioPlayerManager.PAUSE);
        Intent pauseIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_PAUSEMUSIC);
        pauseIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(pauseIntent);
    }

    public void stopMusic(){
        if (mMediaPlayer != null) {
            if (mMediaPlayer.isPlaying()) {
                mMediaPlayer.stop();
            }
        }
    }

    /**
     * 播放歌曲
     *
     * @param audioMessage
     */
    public void playMusic(AudioMessage audioMessage) {
        if (null==audioMessage){
            return;
        }
        if (null==audioMessage.getAudioInfo()){
            return;
        }
        releasePlayer();
        // resetPlayData();

        AudioInfo audioInfo = audioMessage.getAudioInfo();

        if (AudioStateManager.getInstance().getCurAudioInfo() != null) {
            if (!AudioStateManager.getInstance().getCurAudioInfo().getAudioId().equals(audioInfo.getAudioId())) {

                if (null!=onPlayListener){
                    onPlayListener.onInitAudio();
                }
                //设置当前播放数据
                AudioStateManager.getInstance().setCurAudioMessage(audioMessage);
                //设置当前正在播放的歌曲数据
                AudioStateManager.getInstance().setCurAudioInfo(audioInfo);
                //设置当前的播放索引
                AudioStateManager.getInstance().setPlayIndexHashID(audioInfo.getAudioId());

                //发送init的广播
                Intent initIntent = new Intent(AudioBroadcastReceiver.ACTION_INITMUSIC);

                //initIntent.putExtra(AudioMessage.KEY, audioMessage);
                initIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                sendBroadcast(initIntent);
            }

        } else {
            if (null!=onPlayListener){
                onPlayListener.onInitAudio();
            }
            //设置当前播放数据
            AudioStateManager.getInstance().setCurAudioMessage(audioMessage);
            //设置当前正在播放的歌曲数据
            AudioStateManager.getInstance().setCurAudioInfo(audioInfo);
            //设置当前的播放索引
            AudioStateManager.getInstance().setPlayIndexHashID(audioInfo.getAudioId());

            //发送init的广播
            Intent initIntent = new Intent(AudioBroadcastReceiver.ACTION_INITMUSIC);
            //initIntent.putExtra(AudioMessage.KEY, audioMessage);
            initIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
            sendBroadcast(initIntent);
        }


        if (audioInfo.getType() == AudioInfo.LOCAL) {
            //播放本地歌曲
            playLocalMusic(audioMessage);
        } else {
                //播放网络歌曲
                doNetMusic();
        }
        requestAudioFocus();
    }

    private void cannel(){

    }

    private void requestAudioFocus(){
        AudioManager am = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        if (am != null) {
            am.requestAudioFocus(mAudioFocusListener, STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
        }
    }

    public AudioManager.OnAudioFocusChangeListener mAudioFocusListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            switch(focusChange){
                case AudioManager.AUDIOFOCUS_LOSS:
                    pauseMusic();
                    //对应AUDIOFOCUS_GAIN
                    //表示音频焦点请求者需要长期占有焦点，这里一般需要stop播放和释放

                    break;
                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT:

                    //对应AUDIOFOCUS_GAIN_TRANSIENT
                    //表示音频焦点请求者需要短暂占有焦点，这里一般需要pause播放


                    break;
                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:

                    //对应AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK
                    //表示音频焦点请求者需要占有焦点，但是我也可以继续播放，只是需要降低音量或音量置为0


                    break;
                case AudioManager.AUDIOFOCUS_GAIN:

                    //获得焦点，这里可以进行恢复播放


                    break;
            }
        }
    };


    public void abandonAudioFocus(){
        AudioManager am = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        if (am != null) {
            am.abandonAudioFocus(mAudioFocusListener);
        }
    }


    /**
     * 播放网络歌曲
     */
    public void playNetMusic() {
        if (AudioStateManager.getInstance().getCurAudioMessage() != null && AudioStateManager.getInstance().getCurAudioInfo() != null) {
            final String audioUrl = AudioStateManager.getInstance().getCurAudioInfo().getAudioUrl();
            try {
                mMediaPlayer = new IjkMediaPlayer();
                mMediaPlayer.setAudioStreamType(STREAM_MUSIC);
                mMediaPlayer.setDataSource(audioUrl);
                mMediaPlayer.setOption(IjkMediaPlayer.OPT_CATEGORY_FORMAT, "dns_cache_clear", 1);
//                mMediaPlayer.reset();
                mMediaPlayer.prepareAsync();
                //
                mMediaPlayer.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener() {
                    @Override
                    public void onSeekComplete(IMediaPlayer mp) {
                        mMediaPlayer.start();

//                        AudioMessage audioMessage = AudioStateManager.getInstance().getCurAudioMessage();
//                        //设置当前播放的状态
//                        AudioStateManager.getInstance().setPlayStatus(AudioPlayerManager.PLAYING);
//                        audioMessage.setPlayProgress(mMediaPlayer.getCurrentPosition());
//                        Intent seekToIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_SEEKTOMUSIC);
//                        seekToIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//                        sendBroadcast(seekToIntent);
                        if (null!=onPlayListener){
                            onPlayListener.onSeekComplete(AudioPlayerManager.PLAYING,mMediaPlayer.getCurrentPosition());
                        }
                        isSeekTo = false;

                    }
                });
                mMediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(IMediaPlayer mp) {
                        if (null!=AudioStateManager.getInstance().getCurAudioInfo().getAudioTime()){
                            if (mMediaPlayer.getCurrentPosition() < (Integer.parseInt(AudioStateManager.getInstance().getCurAudioInfo().getAudioTime()) - 2 )) {
                                playNetMusic();
                            } else {
                                //播放完成，执行下一首操作
                                nextMusic();
                            }
                        }
                    }
                });
                mMediaPlayer.setOnErrorListener(new IMediaPlayer.OnErrorListener() {
                    @Override
                    public boolean onError(IMediaPlayer mp, int what, int extra) {
                        Log.d("tanggongwen","onError:"+audioUrl+what+extra);
                        //发送播放错误广播
                        Intent errorIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_PLAYERRORMUSIC);
                        errorIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                        sendBroadcast(errorIntent);

//                        ToastUtil.showTextToast(getApplicationContext(), "播放歌曲出错，1秒后播放下一首");


                        nextMusic();

                        return false;
                    }
                });
                mMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(IMediaPlayer mp) {
                        if (AudioStateManager.getInstance().getCurAudioMessage() != null) {
                            AudioMessage audioMessage = AudioStateManager.getInstance().getCurAudioMessage();
                                mMediaPlayer.start();
                                //设置当前播放的状态
                                AudioStateManager.getInstance().setPlayStatus(AudioPlayerManager.PLAYING);
                                audioMessage.setPlayProgress(mMediaPlayer.getCurrentPosition());
                                //发送play的广播
                                onPlayListener.onStart(audioMessage);
                                Intent playIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_PLAYMUSIC);
                                playIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                                sendBroadcast(playIntent);
                        }
                    }
                });

                if (mPlayerThread == null) {
                    mPlayerThread = new Thread(new PlayerRunable());
                    mPlayerThread.start();
                }

            } catch (Exception e) {
                e.printStackTrace();
                Log.e("AudioPlayerService",e.getMessage());

                //发送播放错误广播
                Intent errorIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_PLAYERRORMUSIC);
                AudioStateManager.getInstance().getCurAudioMessage().setErrorMsg(e.getMessage());
                errorIntent.putExtra(AudioMessage.KEY, AudioStateManager.getInstance().getCurAudioMessage());
                errorIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                sendBroadcast(errorIntent);

//                ToastUtil.showTextToast(getApplicationContext(), "播放歌曲出错，1秒后播放下一首");
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1000);
                            //播放下一首
                            nextMusic();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }


        }
    }

    /**
     * 播放网络歌曲
     */
    public void doNetMusic() {
        //设置当前的播放状态
        AudioStateManager.getInstance().setPlayStatus(AudioPlayerManager.PLAYNET);
        if (AudioStateManager.getInstance().getPlayStatus() != AudioPlayerManager.PAUSE) {
            playNetMusic();
        }

    }

    /**
     * 播放本地歌曲
     *
     * @param audioMessage
     */
    public void playLocalMusic(AudioMessage audioMessage) {

        try {
            mMediaPlayer = new IjkMediaPlayer();
            mMediaPlayer.setAudioStreamType(STREAM_MUSIC);
            mMediaPlayer.setDataSource(audioMessage.getAudioInfo().getAudioUrl());
            mMediaPlayer.prepareAsync();
            //
            mMediaPlayer.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener() {
                @Override
                public void onSeekComplete(IMediaPlayer mp) {
                    mMediaPlayer.start();
                    if (null!=onPlayListener){
                        onPlayListener.onSeekComplete(AudioPlayerManager.PLAYING,mMediaPlayer.getCurrentPosition());
                    }

                    //设置当前播放的状态
                    AudioStateManager.getInstance().setPlayStatus(AudioPlayerManager.PLAYING);
                    Intent seekToIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_SEEKTOMUSIC);
                    seekToIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                    sendBroadcast(seekToIntent);
                    isSeekTo = false;

                }
            });
            mMediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(IMediaPlayer mp) {
                    if (null!=onPlayListener){
                        onPlayListener.onCompletion();
                    }
                    //播放完成，执行下一首操作
                    nextMusic();

                }
            });
            mMediaPlayer.setOnErrorListener(new IMediaPlayer.OnErrorListener() {
                @Override
                public boolean onError(IMediaPlayer mp, int what, int extra) {
                    if (null!=onPlayListener){
                        onPlayListener.onError();
                    }
                    //发送播放错误广播
                    Intent errorIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_PLAYERRORMUSIC);
                    errorIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                    sendBroadcast(errorIntent);

//                    ToastUtil.showTextToast(getApplicationContext(), "播放歌曲出错，1秒后播放下一首");


                    new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                //播放下一首
                                nextMusic();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }.start();

                    return false;
                }
            });
            mMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(IMediaPlayer mp) {

                    if (AudioStateManager.getInstance().getCurAudioMessage() != null) {
                        AudioMessage audioMessage = AudioStateManager.getInstance().getCurAudioMessage();

                        if (audioMessage.getPlayProgress() > 0) {
                            isSeekTo = true;
                            mMediaPlayer.seekTo(audioMessage.getPlayProgress());
                        } else {
                            mMediaPlayer.start();
                            if (null!=onPlayListener){
                                onPlayListener.onPrepared(AudioPlayerManager.PLAYING,mMediaPlayer.getCurrentPosition());
                            }
                            //设置当前播放的状态
                            AudioStateManager.getInstance().setPlayStatus(AudioPlayerManager.PLAYING);
                            audioMessage.setPlayProgress(mMediaPlayer.getCurrentPosition());
                            //发送play的广播
                            Intent playIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_PLAYMUSIC);
                            playIntent.putExtra(AudioMessage.KEY, audioMessage);
                            playIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                            sendBroadcast(playIntent);
                        }


                    }
                }
            });

            if (mPlayerThread == null) {
                mPlayerThread = new Thread(new PlayerRunable());
                mPlayerThread.start();
            }

        } catch (Exception e) {
            e.printStackTrace();

            //发送播放错误广播
            Intent errorIntent = new Intent(AudioBroadcastReceiver.ACTION_SERVICE_PLAYERRORMUSIC);
            audioMessage.setErrorMsg(e.getMessage());
            errorIntent.putExtra(AudioMessage.KEY, audioMessage);
            errorIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
            sendBroadcast(errorIntent);

//            ToastUtil.showTextToast(getApplicationContext(), "播放歌曲出错，1秒后播放下一首");
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                        //播放下一首
                        nextMusic();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

    /**
     * 播放线程
     */

    private class PlayerRunable implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {

                    if (!isSeekTo && mMediaPlayer != null && mMediaPlayer.isPlaying()) {

                        if (AudioStateManager.getInstance().getCurAudioMessage() != null) {
                            AudioStateManager.getInstance().getCurAudioMessage().setPlayProgress(mMediaPlayer.getCurrentPosition());
                            handler.sendEmptyMessage(0x10);
                        }
                    }

                    Thread.sleep(1000);//
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            if (msg.what==0x10){

                onPlayListener.onPlaying(mMediaPlayer.getCurrentPosition());
            }
            return false;
        }
    });

    /**
     * 释放播放器
     */
    private void releasePlayer() {
        AudioStateManager.getInstance().setPlayStatus(AudioPlayerManager.STOP);
        if (mPlayerThread != null) {
            mPlayerThread = null;
        }
        if (mMediaPlayer != null) {
            if (mMediaPlayer.isPlaying()) {
                mMediaPlayer.stop();
            }
            //mMediaPlayer.reset();
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
        System.gc();
    }

    /**
     * 重置播放数据
     */
    private void resetPlayData() {
        AudioStateManager.getInstance().setCurAudioMessage(null);
        //设置当前播放的状态
        AudioStateManager.getInstance().setCurAudioInfo(null);
        AudioStateManager.getInstance().setPlayIndexHashID("");
    }

    public interface OnPlayListener{
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
}
