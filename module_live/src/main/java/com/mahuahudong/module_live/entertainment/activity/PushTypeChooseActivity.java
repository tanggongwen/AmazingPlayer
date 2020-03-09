package com.mahuahudong.module_live.entertainment.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import com.mahuahudong.module_live.R;
import com.mahuahudong.module_live.base.ui.TActivity;

public class PushTypeChooseActivity extends TActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.push_type_choose_activity);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setLogo(R.drawable.actionbar_logo_white);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.actionbar_white_back_icon);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PushTypeChooseActivity.this.setResult(RESULT_OK);
                PushTypeChooseActivity.this.finish();
            }
        });

        findView(R.id.ll_room_push).setOnClickListener(onClickListener);
        findView(R.id.ll_anchor_push).setOnClickListener(onClickListener);
    }


    public View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();
            if (id == R.id.ll_room_push) {
                LiveModeChooseActivity.start(PushTypeChooseActivity.this, true);
            } else if (id == R.id.ll_anchor_push) {
                LiveModeChooseActivity.start(PushTypeChooseActivity.this, false);
            }
        }
    };


    @Override
    public void onBackPressed() {
        setResult(RESULT_OK);
        super.onBackPressed();
    }
}
