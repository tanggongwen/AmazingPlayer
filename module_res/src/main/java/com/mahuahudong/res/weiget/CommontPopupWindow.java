package com.mahuahudong.res.weiget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mahuahudong.res.R;
import com.mahuahudong.res.adapter.CommontItemAdapter;
import com.mahuahudong.res.beans.NewsCommontBean.UserCommontBean;

import java.util.List;

public class CommontPopupWindow extends PopupWindow implements View.OnClickListener {
    private View mPopView;
    private TextView tvInput;
    private RecyclerView ryCommont;
    private ImageView imgClose;
    private Context context;
    private CommontItemAdapter itemAdapter;
    private CommontPopupWindowClickListener clickListener;
    private LinearLayout llytEmpty;

    public CommontPopupWindow(Context context) {
        super(context);
        this.context = context;
        init(context);
        setPopupWindow();
    }



    private void init(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        mPopView = inflater.inflate(R.layout.layout_commont_window, null);
        tvInput = mPopView.findViewById(R.id.tvInput);
        imgClose = mPopView.findViewById(R.id.imgClose);
        ryCommont = mPopView.findViewById(R.id.ryContent);
        llytEmpty = mPopView.findViewById(R.id.llytEmpty);
        itemAdapter = new CommontItemAdapter(context,clickListener);
        ryCommont.setAdapter(itemAdapter);
        ryCommont.setLayoutManager(new LinearLayoutManager(context,RecyclerView.VERTICAL,false));
        tvInput.setOnClickListener(this);
        imgClose.setOnClickListener(this);
    }

    private void setPopupWindow() {
      setContentView(mPopView);// 设置View
        setWidth(ViewGroup.LayoutParams.MATCH_PARENT);// 设置弹出窗口的宽
        setHeight(context.getResources().getDimensionPixelSize(R.dimen.popwindowheight));// 设置弹出窗口的高

        setFocusable(true);// 取得焦点
        //注意  要是点击外部空白处弹框消息  那么必须给弹框设置一个背景色  不然是不起作用的
        setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);
//        mPopCommontInputWindow.setInputMethodMode(PopupWindow.INPUT_METHOD_NEEDED);
        setBackgroundDrawable(new BitmapDrawable());
        //点击外部消失
       setOutsideTouchable(true);

        //设置可以点击
        setTouchable(true);
        //进入退出的动画，指定刚才定义的style
        setAnimationStyle(R.style.mypopwindow_anim_style);
    }

    @Override
    public void onClick(View v) {
       if (v.getId()==R.id.imgClose){
            if (null!=clickListener){
                clickListener.onClickClose();
            }
       }else if (v.getId()==R.id.tvInput){
            if (null!=clickListener){
                clickListener.onInputClick();
            }
       }
    }



    public void setCommontList(List<UserCommontBean> commontList){
        if (commontList.size()>0){
            ryCommont.setVisibility(View.VISIBLE);
            llytEmpty.setVisibility(View.GONE);
            itemAdapter.addDatas(commontList);
        }else {
            ryCommont.setVisibility(View.GONE);
            llytEmpty.setVisibility(View.VISIBLE);
        }
    }

    public void addCommont(UserCommontBean commontBean){
        itemAdapter.addCommont(commontBean);
    }

    public void setCommontPopupClickListener(CommontPopupWindowClickListener clickListener) {
        this.clickListener = clickListener;
        itemAdapter.setCommontClickListener(clickListener);
    }


    public interface CommontPopupWindowClickListener{
        void onShowDialog();
        void onClickClose();
        void onInputClick();
        void onSend(String content);
        void onClickLike(String commontId);
    }

    public void showAtLocation(View rootView){
        clickListener.onShowDialog();
        showAtLocation(rootView, Gravity.BOTTOM,0,0);
    }



}
