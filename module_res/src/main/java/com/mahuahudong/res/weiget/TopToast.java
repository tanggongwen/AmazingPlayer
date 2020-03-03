package com.mahuahudong.res.weiget;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mahuahudong.res.R;


/**
 *
 * 自定义Toast
 */
public class TopToast extends Toast {
    private static Toast mToast;

    public TopToast(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, CharSequence text, int duration) {
        if (mToast == null) {
            mToast = new Toast(context);
        } else {
            mToast.cancel();
            mToast = new Toast(context);
        }

        //获取LayoutInflater对象
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        //获得屏幕的宽度
        int width = wm.getDefaultDisplay().getWidth();

        //由layout文件创建一个View对象
        View view = inflater.inflate(R.layout.layout_clearcache_toast, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        TextView toastTextView = (TextView) view.findViewById(R.id.tvContent);
        //设置TextView的宽度为 屏幕宽度
        toastTextView.setLayoutParams(layoutParams);
        toastTextView.setText(text);

        mToast.setView(view);
        mToast.setGravity(Gravity.TOP, 0, 0);
        mToast.setDuration(duration);
//        try {
//            Object mTN = null;
//            mTN = getField(mToast, "mTN");
//            if (mTN != null) {
//                Object mParams = getField(mTN, "mParams");
//                if (mParams != null
//                        && mParams instanceof WindowManager.LayoutParams) {
//                    WindowManager.LayoutParams params = (WindowManager.LayoutParams) mParams;
//                    params.windowAnimations = R.style.Animtop;
//                }
//            }
//        } catch (Exception e) {
//            LogOut.printStackTrace(e);
//        }
        return mToast;
    }
}
