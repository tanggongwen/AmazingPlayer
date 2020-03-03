package com.lbs.apps.library.media.audioplayer.manager;

import android.content.Context;

import com.lbs.apps.library.media.audioplayer.beans.AudioInfo;
import com.lbs.apps.library.media.audioplayer.beans.AudioMessage;
import com.lbs.apps.library.media.audioplayer.beans.RankListResult;
import com.lbs.apps.library.media.audioplayer.constants.PreferencesConstants;
import com.lbs.apps.library.media.audioplayer.utils.PreferencesUtil;

import java.util.List;

public class AudioStateManager {
    private static AudioStateManager audioStateManager = new AudioStateManager();
    public static AudioStateManager getInstance(){
        return audioStateManager;
    }

    /**
     * 播放服务是否被强迫回收
     */
    private boolean playServiceForceDestroy = false;
    /**
     * 应用关闭
     */
    private boolean appClose = false;
    /**
     * 应用是否是第一次启动
     */
    private boolean isFrist = true;

    /**
     * 是否开启问候音
     */
    private boolean isSayHello = false;

    /**
     * 应用是否在wifi下联网
     */
    private boolean isWifi = true;

    /**
     * 播放歌曲id
     */
    private String playIndexHashID = "";

    /**
     * 底部按钮是否打开
     */
    private boolean isBarMenuShow = false;

    /**
     * 歌曲播放模式
     */
    private int playModel = 2; // 0是 顺序播放 1是随机播放 2是循环播放 3是单曲播放

    /**
     * 播放歌曲状态
     */
    private int playStatus;

    /**
     * 当前播放列表
     */
    private List<AudioInfo> curAudioInfos;
    /**
     * 设置当前正在播放的歌曲
     */
    private AudioInfo curAudioInfo;

    /**
     * 当前歌曲
     */
    private AudioMessage curAudioMessage;

    /**
     * 排行数据
     */
    private RankListResult rankListResult;





    /**
     * 是否线控
     */
    private boolean isWire = true;

    /**
     * 是否显示锁屏
     */
    private boolean isShowLockScreen = false;



    
    private static Context mContext;

    public static void init(Context context){
        mContext = context;
    }





    public boolean isPlayServiceForceDestroy() {
        return playServiceForceDestroy;
    }

    public void setPlayServiceForceDestroy(boolean playServiceForceDestroy) {
        this.playServiceForceDestroy = playServiceForceDestroy;
    }

    public boolean isAppClose() {
        return appClose;
    }

    public void setAppClose(boolean appClose) {
        this.appClose = appClose;
    }

    public boolean isFrist() {
        return isFrist;
    }

    public void setFrist(boolean frist) {
        isFrist = frist;
        //
        PreferencesUtil.saveValue(mContext.getApplicationContext(), PreferencesConstants.isFrist_KEY, isFrist);
    }

    public boolean isSayHello() {
        return isSayHello;
    }

    public void setSayHello(boolean sayHello) {
        isSayHello = sayHello;
        PreferencesUtil.saveValue(mContext.getApplicationContext(), PreferencesConstants.isSayHello_KEY, isSayHello);
    }

    public boolean isWifi() {
        return (boolean) PreferencesUtil.getValue(mContext.getApplicationContext(), PreferencesConstants.isWifi_KEY, isWifi);
    }

    public void setWifi(boolean wifi) {
        PreferencesUtil.saveValue(mContext.getApplicationContext(), PreferencesConstants.isWifi_KEY, wifi);
    }

    public String getPlayIndexHashID() {
        return (String) PreferencesUtil.getValue(mContext.getApplicationContext(), PreferencesConstants.playIndexHashID_KEY, playIndexHashID);
    }

    public void setPlayIndexHashID(String playIndexHashID) {
        PreferencesUtil.saveValue(mContext.getApplicationContext(), PreferencesConstants.playIndexHashID_KEY, playIndexHashID);
    }

    public boolean isBarMenuShow() {
        return (boolean) PreferencesUtil.getValue(mContext.getApplicationContext(), PreferencesConstants.isBarMenuShow_KEY, isBarMenuShow);
    }

    public void setBarMenuShow(boolean barMenuShow) {

        PreferencesUtil.saveValue(mContext.getApplicationContext(), PreferencesConstants.isBarMenuShow_KEY, barMenuShow);
    }

    public int getPlayModel() {
        return (int) PreferencesUtil.getValue(mContext.getApplicationContext(), PreferencesConstants.playModel_KEY, playModel);
    }

    public void setPlayModel(int playModel) {
        PreferencesUtil.saveValue(mContext.getApplicationContext(), PreferencesConstants.playModel_KEY, playModel);
    }

    public int getPlayStatus() {
        return (int) PreferencesUtil.getValue(mContext.getApplicationContext(), PreferencesConstants.playStatus_KEY, AudioPlayerManager.STOP);
    }

    public void setPlayStatus(int playStatus) {
        PreferencesUtil.saveValue(mContext.getApplicationContext(), PreferencesConstants.playStatus_KEY, playStatus);
    }

    public List<AudioInfo> getCurAudioInfos() {
        return curAudioInfos;
    }

    public void setCurAudioInfos(final List<AudioInfo> curAudioInfos) {
        this.curAudioInfos = curAudioInfos;
    }

    public AudioInfo getCurAudioInfo() {

        return curAudioInfo;
    }

    public void setCurAudioInfo(final AudioInfo curAudioInfo) {
        this.curAudioInfo = curAudioInfo;


    }

    public AudioMessage getCurAudioMessage() {

        return curAudioMessage;
    }

    public void setCurAudioMessage(final AudioMessage curAudioMessage) {
        this.curAudioMessage = curAudioMessage;

    }

    public RankListResult getRankListResult() {

        return rankListResult;
    }

    public void setRankListResult(final RankListResult rankListResult) {
        this.rankListResult = rankListResult;

    }




    public void setDesktopLrcY(int desktopLrcY) {
        PreferencesUtil.saveValue(mContext.getApplicationContext(), PreferencesConstants.desktopLrcY_KEY, desktopLrcY);

    }

    public boolean isWire() {
        return isWire;
    }

    public void setWire(boolean wire) {
        isWire = wire;
        PreferencesUtil.saveValue(mContext.getApplicationContext(), PreferencesConstants.isWire_KEY, isWire);
    }

}
