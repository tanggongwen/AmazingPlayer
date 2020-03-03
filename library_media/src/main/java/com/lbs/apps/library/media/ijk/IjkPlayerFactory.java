package com.lbs.apps.library.media.ijk;

import android.content.Context;

import com.lbs.apps.library.media.videoplayer.player.AbstractPlayer;
import com.lbs.apps.library.media.videoplayer.player.PlayerFactory;

public class IjkPlayerFactory extends PlayerFactory {

    private Context mContext;

    public IjkPlayerFactory(Context context) {
        mContext = context.getApplicationContext();
    }

    public static IjkPlayerFactory create(Context context) {
        return new IjkPlayerFactory(context);
    }

    @Override
    public AbstractPlayer createPlayer() {
        return new IjkPlayer(mContext);
    }
}
