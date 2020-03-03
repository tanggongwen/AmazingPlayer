package com.lbs.apps.library.media.audioplayer.manager;

import android.content.Context;
import android.content.Intent;

import com.lbs.apps.library.media.audioplayer.beans.AudioInfo;
import com.lbs.apps.library.media.audioplayer.beans.AudioMessage;
import com.lbs.apps.library.media.audioplayer.receiver.AudioBroadcastReceiver;

public enum AudioController {
    INSTANCE;
    public void play(Context context){
        if (null==AudioPlayerManager.getAudioPlayerManager(context).getService()){
            try {
                AudioPlayerManager.getAudioPlayerManager(context).initCore();
            }catch (Exception e){

            }
            return;
        }
        int playStatus = AudioStateManager.getInstance().getPlayStatus();
        if (playStatus == AudioPlayerManager.PLAYING) {
            AudioPlayerManager.getAudioPlayerManager(context).getService().pauseMusic();
//            Intent resumeIntent = new Intent(AudioBroadcastReceiver.ACTION_PAUSEMUSIC);
//            resumeIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//            context.sendBroadcast(resumeIntent);

        }else if (playStatus == AudioPlayerManager.PAUSE) {
            AudioInfo audioInfo = AudioStateManager.getInstance().getCurAudioInfo();
            if (audioInfo != null) {
                AudioMessage audioMessage = AudioStateManager.getInstance().getCurAudioMessage();
                AudioPlayerManager.getAudioPlayerManager(context).getService().resumeMusic();
//                Intent resumeIntent = new Intent(AudioBroadcastReceiver.ACTION_RESUMEMUSIC);
//                resumeIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//                context.sendBroadcast(resumeIntent);
            }
        } else {
            if (AudioStateManager.getInstance().getCurAudioMessage() != null) {
                AudioMessage audioMessage = AudioStateManager.getInstance().getCurAudioMessage();
                AudioInfo audioInfo = AudioStateManager.getInstance().getCurAudioInfo();
                if (audioInfo != null) {
                    audioMessage.setAudioInfo(audioInfo);
                    AudioPlayerManager.getAudioPlayerManager(context).getService().playMusic(audioMessage);
//                    Intent resumeIntent = new Intent(AudioBroadcastReceiver.ACTION_PLAYMUSIC);
//                    resumeIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//                    context.sendBroadcast(resumeIntent);
                }
            }
        }
    }

    public void playMusic(AudioMessage audioMessage,Context context){
        if (null==AudioPlayerManager.getAudioPlayerManager(context).getService()){
            try {
                AudioPlayerManager.getAudioPlayerManager(context).initCore();
            }catch (Exception e){

            }
            return;
        }
        AudioPlayerManager.getAudioPlayerManager(context).getService().playMusic(audioMessage);
    }

    public void playNext(Context context){
        if (null==AudioPlayerManager.getAudioPlayerManager(context).getService()){
            try {
                AudioPlayerManager.getAudioPlayerManager(context).initCore();
            }catch (Exception e){

            }
            return;
        }
        AudioPlayerManager.getAudioPlayerManager(context).getService().nextMusic();
//        Intent nextIntent = new Intent(AudioBroadcastReceiver.ACTION_NEXTMUSIC);
//        nextIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//        context.sendBroadcast(nextIntent);
    }

    public void playLast(Context context){
        if (null==AudioPlayerManager.getAudioPlayerManager(context).getService()){
            try {
                AudioPlayerManager.getAudioPlayerManager(context).initCore();
            }catch (Exception e){

            }
            return;
        }
        AudioPlayerManager.getAudioPlayerManager(context).getService().preMusic();
//        Intent preIntent = new Intent(AudioBroadcastReceiver.ACTION_PREMUSIC);
//        preIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//        context.sendBroadcast(preIntent);
    }

    public void playPause(Context context){
        if (null==AudioPlayerManager.getAudioPlayerManager(context).getService()){
            try {
                AudioPlayerManager.getAudioPlayerManager(context).initCore();
            }catch (Exception e){

            }
            return;
        }
        AudioPlayerManager.getAudioPlayerManager(context).getService().pauseMusic();

    }

    public void resume(Context context){
        if (null==AudioPlayerManager.getAudioPlayerManager(context).getService()){
            try {
                AudioPlayerManager.getAudioPlayerManager(context).initCore();
            }catch (Exception e){

            }
            return;
        }
        AudioPlayerManager.getAudioPlayerManager(context).getService().resumeMusic();
    }


    public void seekTo(Context context,long progress){
        if (null==AudioPlayerManager.getAudioPlayerManager(context).getService()){
            try {
                AudioPlayerManager.getAudioPlayerManager(context).initCore();
            }catch (Exception e){

            }
            return;
        }
        if (AudioStateManager.getInstance().getPlayStatus() == AudioPlayerManager.PLAYING) {
            //正在播放
            if (AudioStateManager.getInstance().getCurAudioMessage() != null) {
                AudioMessage audioMessage = AudioStateManager.getInstance().getCurAudioMessage();
                if (audioMessage != null) {
                    audioMessage.setPlayProgress(progress);
                    AudioPlayerManager.getAudioPlayerManager(context).getService().seekToMusic(audioMessage);
//                    Intent resumeIntent = new Intent(AudioBroadcastReceiver.ACTION_SEEKTOMUSIC);
//                    resumeIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//                    context.sendBroadcast(resumeIntent);
                }
            }
        }
    }

    public void stop(Context context){
        if (null==AudioPlayerManager.getAudioPlayerManager(context).getService()){
            try {
                AudioPlayerManager.getAudioPlayerManager(context).initCore();
            }catch (Exception e){

            }
            return;
        }
        AudioPlayerManager.getAudioPlayerManager(context).getService().stopMusic();

    }

}
