package com.mahuahudong.amazingplayer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

import com.mahuahudong.mvvm.router.RouterActivityPath;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARouter.getInstance().build(RouterActivityPath.PAGER_HOME).navigation();
        finish();
    }
}
