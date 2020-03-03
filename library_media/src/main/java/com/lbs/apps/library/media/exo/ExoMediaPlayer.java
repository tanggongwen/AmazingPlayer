package com.lbs.apps.library.media.exo;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ext.rtmp.RtmpDataSourceFactory;
import com.google.android.exoplayer2.source.ConcatenatingMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoListener;
import com.lbs.apps.library.media.videoplayer.player.AbstractPlayer;

import java.util.List;
import java.util.Map;


public class ExoMediaPlayer extends AbstractPlayer implements VideoListener, Player.EventListener {

    protected Context mAppContext;
    protected SimpleExoPlayer mInternalPlayer;
    protected MediaSource mMediaSource;
    protected Surface mSurface;
    protected PlaybackParameters mSpeedPlaybackParameters;
    protected DataSource.Factory mDataSourceFactory;
    protected String mUserAgent;
    protected DefaultHttpDataSourceFactory mHttpDataSourceFactory;

    protected int mLastReportedPlaybackState;
    protected boolean mLastReportedPlayWhenReady;
    protected boolean mIsPreparing;
    protected boolean mIsBuffering;

    public ExoMediaPlayer(Context context) {
        mAppContext = context.getApplicationContext();
        mLastReportedPlaybackState = Player.STATE_IDLE;
        mUserAgent = Util.getUserAgent(mAppContext, mAppContext.getApplicationInfo().name);
        mDataSourceFactory = getDataSourceFactory();
    }

    @Override
    public void initPlayer() {
        mInternalPlayer = ExoPlayerFactory.newSimpleInstance(mAppContext, getRenderersFactory(), getTrackSelector(), getLoadControl());
        setOptions();
        mInternalPlayer.addListener(this);
        mInternalPlayer.addVideoListener(this);
    }

    protected TrackSelector getTrackSelector() {
        return new DefaultTrackSelector();
    }

    /**
     * 渲染器
     */
    protected RenderersFactory getRenderersFactory() {
        return new DefaultRenderersFactory(mAppContext);
    }

    /**
     * 缓冲控制，比如缓冲时间
     */
    protected LoadControl getLoadControl() {
        return new DefaultLoadControl();
    }

    @Override
    public void setDataSource(String path, Map<String, String> headers) {
        mMediaSource = getMediaSource(path);

        if (headers != null && headers.size() > 0) {
            for (Map.Entry<String, String> header : headers.entrySet()) {
                mHttpDataSourceFactory.getDefaultRequestProperties().set(header.getKey(), header.getValue());
            }
        }
    }

    @Override
    public void setDataSource(AssetFileDescriptor fd) {
        //no support
    }

    @Override
    public void setDataSource(List<String> paths) {
        mMediaSource = new ConcatenatingMediaSource();
        for (String path : paths) {
            ((ConcatenatingMediaSource) mMediaSource).addMediaSource(getMediaSource(path));
        }
    }

    protected MediaSource getMediaSource(String uri) {
        Uri contentUri = Uri.parse(uri);
        if ("rtmp".equals(contentUri.getScheme())) {
            return new ProgressiveMediaSource.Factory(new RtmpDataSourceFactory(null))
                    .createMediaSource(contentUri);
        }
        int contentType = inferContentType(uri);
        switch (contentType) {
            case C.TYPE_DASH:
                return new DashMediaSource.Factory(mDataSourceFactory).createMediaSource(contentUri);
            case C.TYPE_SS:
                return new SsMediaSource.Factory(mDataSourceFactory).createMediaSource(contentUri);
            case C.TYPE_HLS:
                return new HlsMediaSource.Factory(mDataSourceFactory).createMediaSource(contentUri);
            default:
            case C.TYPE_OTHER:
                return new ProgressiveMediaSource.Factory(mDataSourceFactory).createMediaSource(contentUri);
        }
    }

    private int inferContentType(String fileName) {
        fileName = Util.toLowerInvariant(fileName);
        if (fileName.contains(".mpd")) {
            return C.TYPE_DASH;
        } else if (fileName.contains(".m3u8")) {
            return C.TYPE_HLS;
        } else if (fileName.matches(".*\\.ism(l)?(/manifest(\\(.+\\))?)?")) {
            return C.TYPE_SS;
        } else {
            return C.TYPE_OTHER;
        }
    }

    /**
     * Returns a new DataSource factory.
     *
     * @return A new DataSource factory.
     */
    private DataSource.Factory getDataSourceFactory() {
        return new DefaultDataSourceFactory(mAppContext, getHttpDataSourceFactory());
    }

    /**
     * Returns a new HttpDataSource factory.
     *
     * @return A new HttpDataSource factory.
     */
    private DataSource.Factory getHttpDataSourceFactory() {
        mHttpDataSourceFactory = new DefaultHttpDataSourceFactory(
                mUserAgent,
                null,
                DefaultHttpDataSource.DEFAULT_CONNECT_TIMEOUT_MILLIS,
                DefaultHttpDataSource.DEFAULT_READ_TIMEOUT_MILLIS,
                //http->https重定向支持
                true);
        return mHttpDataSourceFactory;
    }

    @Override
    public void start() {
        if (mInternalPlayer == null)
            return;
        mInternalPlayer.setPlayWhenReady(true);
    }

    @Override
    public void pause() {
        if (mInternalPlayer == null)
            return;
        mInternalPlayer.setPlayWhenReady(false);
    }

    @Override
    public void stop() {
        if (mInternalPlayer == null)
            return;
        mInternalPlayer.stop();
    }

    @Override
    public void prepareAsync() {
        if (mMediaSource == null) return;
        if (mSpeedPlaybackParameters != null) {
            mInternalPlayer.setPlaybackParameters(mSpeedPlaybackParameters);
        }
        if (mSurface != null) {
            mInternalPlayer.setVideoSurface(mSurface);
        }
        mIsPreparing = true;
        mInternalPlayer.prepare(mMediaSource);
        mInternalPlayer.setPlayWhenReady(true);
    }

    @Override
    public void reset() {
        if (mInternalPlayer != null) {
            mInternalPlayer.stop(true);
        }
    }

    @Override
    public boolean isPlaying() {
        if (mInternalPlayer == null)
            return false;
        int state = mInternalPlayer.getPlaybackState();
        switch (state) {
            case Player.STATE_BUFFERING:
            case Player.STATE_READY:
                return mInternalPlayer.getPlayWhenReady();
            case Player.STATE_IDLE:
            case Player.STATE_ENDED:
            default:
                return false;
        }
    }

    @Override
    public void seekTo(long time) {
        if (mInternalPlayer == null)
            return;
        mInternalPlayer.seekTo(time);
    }

    @Override
    public void release() {
        if (mInternalPlayer != null) {
            mInternalPlayer.removeListener(this);
            mInternalPlayer.removeVideoListener(this);
            mInternalPlayer.release();
            mInternalPlayer = null;
        }

        mSurface = null;
        mIsPreparing = false;
        mIsBuffering = false;
        mLastReportedPlaybackState = Player.STATE_IDLE;
        mLastReportedPlayWhenReady = false;
        mSpeedPlaybackParameters = null;
    }

    @Override
    public long getCurrentPosition() {
        if (mInternalPlayer == null)
            return 0;
        return mInternalPlayer.getCurrentPosition();
    }

    @Override
    public long getDuration() {
        if (mInternalPlayer == null)
            return 0;
        return mInternalPlayer.getDuration();
    }

    @Override
    public int getBufferedPercentage() {
        return mInternalPlayer == null ? 0 : mInternalPlayer.getBufferedPercentage();
    }

    @Override
    public void setSurface(Surface surface) {
        mSurface = surface;
        if (mInternalPlayer != null) {
            mInternalPlayer.setVideoSurface(surface);
        }
    }

    @Override
    public void setDisplay(SurfaceHolder holder) {
        if (holder == null)
            setSurface(null);
        else
            setSurface(holder.getSurface());
    }

    @Override
    public void setVolume(float leftVolume, float rightVolume) {
        if (mInternalPlayer != null)
            mInternalPlayer.setVolume((leftVolume + rightVolume) / 2);
    }

    @Override
    public void setLooping(boolean isLooping) {
        if (mInternalPlayer != null)
            mInternalPlayer.setRepeatMode(isLooping ? Player.REPEAT_MODE_ALL : Player.REPEAT_MODE_OFF);
    }

    @Override
    public void setEnableMediaCodec(boolean isEnable) {
        // exo player is based on MediaCodec, no need to enable
    }

    @Override
    public void setOptions() {
    }

    @Override
    public void setSpeed(float speed) {
        PlaybackParameters playbackParameters = new PlaybackParameters(speed);
        mSpeedPlaybackParameters = playbackParameters;
        if (mInternalPlayer != null) {
            mInternalPlayer.setPlaybackParameters(playbackParameters);
        }
    }

    @Override
    public long getTcpSpeed() {
        // no support
        return 0;
    }

    @Override
    public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
        if (mLastReportedPlayWhenReady != playWhenReady || mLastReportedPlaybackState != playbackState) {
            switch (playbackState) {
                case Player.STATE_READY:
                    if (mIsPreparing) {
                        if (mPlayerEventListener != null) {
                            mPlayerEventListener.onPrepared();
                            mPlayerEventListener.onInfo(MEDIA_INFO_VIDEO_RENDERING_START, 0);
                        }
                        mIsPreparing = false;
                    } else if (mIsBuffering) {
                        if (mPlayerEventListener != null) {
                            mPlayerEventListener.onInfo(MEDIA_INFO_BUFFERING_END, getBufferedPercentage());
                        }
                        mIsBuffering = false;
                    }
                    break;
                case Player.STATE_BUFFERING:
                    if (!mIsPreparing) {
                        if (mPlayerEventListener != null) {
                            mPlayerEventListener.onInfo(MEDIA_INFO_BUFFERING_START, getBufferedPercentage());
                        }
                        mIsBuffering = true;
                    }
                    break;
                case Player.STATE_ENDED:
                    if (mPlayerEventListener != null) {
                        mPlayerEventListener.onCompletion();
                    }
                    break;
            }
        }
        mLastReportedPlayWhenReady = playWhenReady;
        mLastReportedPlaybackState = playbackState;
    }

    @Override
    public void onPlayerError(ExoPlaybackException error) {
        if (mPlayerEventListener != null) {
            mPlayerEventListener.onError();
        }
    }

    @Override
    public void onVideoSizeChanged(int width, int height, int unappliedRotationDegrees, float pixelWidthHeightRatio) {
        if (mPlayerEventListener != null) {
            mPlayerEventListener.onVideoSizeChanged(width, height);
            if (unappliedRotationDegrees > 0) {
                mPlayerEventListener.onInfo(MEDIA_INFO_VIDEO_ROTATION_CHANGED, unappliedRotationDegrees);
            }
        }
    }

    @Override
    public void onPositionDiscontinuity(int reason) {
        if (reason == Player.DISCONTINUITY_REASON_PERIOD_TRANSITION) {

        }
    }
}
