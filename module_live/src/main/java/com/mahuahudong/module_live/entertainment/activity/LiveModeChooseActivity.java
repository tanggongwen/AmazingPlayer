package com.mahuahudong.module_live.entertainment.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.mahuahudong.module_live.R;
import com.mahuahudong.module_live.base.ui.TActivity;

import butterknife.ButterKnife;

/**
 * Created by hzxuwen on 2016/7/12.
 */
public class LiveModeChooseActivity extends TActivity {

    private static final String IS_ROOM_LIVE = "is_room_live";




    TextView tvPushHint;

    private boolean isRoomLive = false;

    public static void start(Activity activity, boolean isRoomPush) {
        Intent intent = new Intent(activity, LiveModeChooseActivity.class);
        intent.putExtra(IS_ROOM_LIVE, isRoomPush);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.live_mode_choose_activity);
        tvPushHint = findViewById(R.id.tv_push_hint);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setLogo(R.drawable.actionbar_logo_white);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.actionbar_white_back_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LiveModeChooseActivity.this.setResult(RESULT_OK);
                LiveModeChooseActivity.this.finish();
            }
        });

        ButterKnife.bind(this);
        isRoomLive = getIntent().getBooleanExtra(IS_ROOM_LIVE, false);
        tvPushHint.setText(isRoomLive ? "房间推流" : "主播推流");
        findView(R.id.video_live_layout).setOnClickListener(onClickListener);
        findView(R.id.audio_live_layout).setOnClickListener(onClickListener);
    }


    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            if (id == R.id.video_live_layout) {
                if (isRoomLive) {
                    RoomLiveActivity.start(LiveModeChooseActivity.this, true);
                } else {
                    LiveActivity.start(LiveModeChooseActivity.this, true, true);
                }
            } else if (id == R.id.audio_live_layout) {
                if (isRoomLive) {
                    RoomLiveActivity.start(LiveModeChooseActivity.this, false);
                } else {
                    LiveActivity.start(LiveModeChooseActivity.this, false, true);
                }
            }
        }
    };

    @Override
    public void onBackPressed() {
        setResult(RESULT_OK);
        super.onBackPressed();
    }
}
