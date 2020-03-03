package com.mahuahudong.res.controller;

import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.example.zhouwei.library.CustomPopWindow;
import com.mahuahudong.res.R;

public enum PopWindowManager {
    INSTANCE;
    private PopWindowClickListener popWindowClickListener;
    private CustomPopWindow clearWindow ;
    private View clearCacheView;
    private TextView tvTitle,tvContnet;


    public void showTipWindow(Activity activity, String title, String content,PopWindowClickListener clickListener){
        this.popWindowClickListener = clickListener;
            //创建并显示popWindow
        if (null==clearCacheView){
            clearCacheView = View.inflate(activity,R.layout.mine_layout_clearcachedialog,null);
            clearCacheView.findViewById(R.id.tvConfirmClear).setOnClickListener(onClickListener);
            clearCacheView.findViewById(R.id.tvDismissClear).setOnClickListener(onClickListener);
            tvTitle = clearCacheView.findViewById(R.id.tvTitle);
            tvContnet = clearCacheView.findViewById(R.id.tvContent);
        }
        tvTitle.setText(title);
        tvContnet.setText(content);
        if (null==clearWindow){
            clearWindow = new CustomPopWindow.PopupWindowBuilder(activity)
                    .setView(clearCacheView)
                    .enableBackgroundDark(true) //弹出popWindow时，背景是否变暗
                    .setBgDarkAlpha(0.7f) // 控制亮度
                    .size(activity.getResources().getDimensionPixelSize(R.dimen.mine_popwindow_width),activity.getResources().getDimensionPixelSize(R.dimen.mine_popwindow_heigt))
                    .create();
        }
        clearWindow.showAtLocation(activity.getWindow().getDecorView(), Gravity.CENTER, 0, 0);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId()==R.id.tvConfirmClear){
             if (null!=popWindowClickListener){
                 popWindowClickListener.onClickConfirm();
             }
                clearWindow.dissmiss();
            }else if (v.getId()==R.id.tvDismissClear){
                popWindowClickListener.onClickDismiss();
                clearWindow.dissmiss();
            }
        }
    };

    public interface  PopWindowClickListener{
        void onClickDismiss();
        void onClickConfirm();
    }

}
