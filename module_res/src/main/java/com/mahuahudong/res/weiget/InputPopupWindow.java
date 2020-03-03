package com.mahuahudong.res.weiget;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mahuahudong.res.R;
import com.mahuahudong.res.weiget.CommontPopupWindow.CommontPopupWindowClickListener;

public class InputPopupWindow extends PopupWindow implements View.OnClickListener {
    private RelativeLayout rlytInput;
    private View mPopView;
    private Context context;
    private EditText edtInput;
    private TextView tvSend;
    private CommontPopupWindowClickListener commontPopupWindowClickListener;
    public InputPopupWindow(Context context, CommontPopupWindowClickListener clickListener) {
        super(context);
        this.context = context;
        this.commontPopupWindowClickListener = clickListener;
        init(context);
        setPopupWindow();
    }


    private void init(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        mPopView = inflater.inflate(R.layout.layout_input_window, null);
        rlytInput = mPopView.findViewById(R.id.rlyt_input);
        edtInput = mPopView.findViewById(R.id.edtInput);
        tvSend = mPopView.findViewById(R.id.tvSend);
        rlytInput.setOnClickListener(this);
        tvSend.setOnClickListener(this);
    }

    /**
     * 设置窗口的相关属性
     */
    @SuppressLint("InlinedApi")
    private void setPopupWindow() {
        this.setContentView(mPopView);// 设置View
        this.setWidth(ActionBar.LayoutParams.MATCH_PARENT);// 设置弹出窗口的宽
        this.setHeight(context.getResources().getDimensionPixelSize(R.dimen.popinputwindowheight));// 设置弹出窗口的高
        this.setFocusable(true);
        //防止PopupWindow被软件盘挡住（可能只要下面一句，可能需要这两句）
        this.setInputMethodMode(PopupWindow.INPUT_METHOD_NEEDED);
        this.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        setAnimationStyle(R.style.mypopwindow_anim_style);
        this.setBackgroundDrawable(null);
        //是否具有获取焦点的能力
        this.setFocusable(true);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.rlyt_input){
                edtInput.requestFocus();
//                edtInput.setFocusable(true);
//                edtInput.setFocusableInTouchMode(true);
//                InputMethodManager inputMethodManager=(InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
//                inputMethodManager.showSoftInput(edtInput,0);
            InputMethodManager inputMethodManager=(InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
            }
        if (v.getId()==R.id.tvSend){
            commontPopupWindowClickListener.onSend(edtInput.getText().toString());
        }
    }


    public void showAtLocation(View rootView){
        showAtLocation(rootView, Gravity.BOTTOM,0,0);
        edtInput.requestFocus();
        edtInput.setFocusable(true);
        edtInput.setFocusableInTouchMode(true);
        InputMethodManager inputMethodManager=(InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
    }



}
