package com.lbs.apps.library.media.exo;

import android.content.Context;

import com.lbs.apps.library.media.videoplayer.player.AbstractPlayer;
import com.lbs.apps.library.media.videoplayer.player.PlayerFactory;

public class ExoMediaPlayerFactory extends PlayerFactory {

    private Context mContext;

    public ExoMediaPlayerFactory(Context context) {
        mContext = context.getApplicationContext();
    }

    public static ExoMediaPlayerFactory create(Context context) {
        return new ExoMediaPlayerFactory(context);
    }

    @Override
    public AbstractPlayer createPlayer() {
        return new ExoMediaPlayer(mContext);
    }
}
