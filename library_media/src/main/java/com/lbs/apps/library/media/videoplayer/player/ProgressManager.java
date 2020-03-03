package com.lbs.apps.library.media.videoplayer.player;

public abstract class ProgressManager {

    public abstract void saveProgress(String url, long progress);

    public abstract long getSavedProgress(String url);

}
