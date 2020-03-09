package com.mahuahudong.module_live.entertainment.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.module_live.R;
import com.mahuahudong.module_live.base.ui.TActivity;
import com.mahuahudong.module_live.im.business.LogoutHelper;
import com.mahuahudong.module_live.im.ui.widget.ClearableEditTextWithIcon;
import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.Observer;
import com.netease.nimlib.sdk.StatusCode;
import com.netease.nimlib.sdk.auth.AuthServiceObserver;

/**
 * 观众输入房间号activity
 * Created by hzxuwen on 2016/3/25.
 */
@Route(path = "/live/enterroom")
public class EnterRoomActivity extends TActivity implements View.OnClickListener {
    private ClearableEditTextWithIcon roomIdEdit;
    private Button joinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_room_activity);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setLogo(R.drawable.actionbar_logo_white);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.actionbar_white_back_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK);
                finish();
            }
        });

        findViews();
        registerObservers(true);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        registerObservers(false);
    }

    private void registerObservers(boolean register) {
        NIMClient.getService(AuthServiceObserver.class).observeOnlineStatus(userStatusObserver, register);
    }

    /**
     * 用户状态变化
     */
    Observer<StatusCode> userStatusObserver = new Observer<StatusCode>() {

        @Override
        public void onEvent(StatusCode code) {
            if (code.wontAutoLogin()) {
                LogoutHelper.logout(EnterRoomActivity.this, true);
            }
        }
    };

    private void findViews() {
        roomIdEdit = findViewById(R.id.room_id_edit);
        roomIdEdit.setDeleteImage(R.drawable.nim_grey_delete_icon);
        joinBtn = findViewById(R.id.join_btn);
        joinBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.join_btn) {
            joinRoom();
        }
    }

    private void joinRoom() {
        if (TextUtils.isEmpty(roomIdEdit.getText().toString())) {
            Toast.makeText(EnterRoomActivity.this, "房间号不能为空！", Toast.LENGTH_SHORT).show();
            return;
        }
        AudienceActivity.start(EnterRoomActivity.this, roomIdEdit.getText().toString());
        finish();

    }

    @Override
    public void onBackPressed() {
        setResult(RESULT_OK);
        super.onBackPressed();
    }
}
