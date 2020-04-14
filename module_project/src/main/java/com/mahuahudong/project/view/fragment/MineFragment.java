package com.mahuahudong.project.view.fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.zhouwei.library.CustomPopWindow;
import com.mahuahudong.mvvm.base.BaseFragment;
import com.mahuahudong.mvvm.router.RouterFragmentPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.FragmentMineBinding;
import com.mahuahudong.project.viewmodel.MineFrgViewModel;
import com.mahuahudong.res.controller.PersonInfoManager;

@Route(path = RouterFragmentPath.Home.PAGER_MINE)
public class MineFragment extends BaseFragment<FragmentMineBinding, MineFrgViewModel> {
    private View contentView;
    private CustomPopWindow popupWindow;
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_mine;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initParam() {
        contentView = View.inflate(getContext(),R.layout.layout_exitdialog,null);
        contentView.findViewById(R.id.tvDismiss).setOnClickListener(onClickListener);
        contentView.findViewById(R.id.tvConfirm).setOnClickListener(onClickListener);
    }

    @Override
    public MineFrgViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getActivity().getApplication());
        return ViewModelProviders.of(this,factory).get(MineFrgViewModel.class);
    }

    @Override
    public void initViewObservable() {
        viewModel.exitEvent.observe(this, new Observer() {
            @Override
            public void onChanged(Object o) {
                showPopWindow();
            }
        });
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.tvDismiss) {
                popupWindow.dissmiss();
            } else if (v.getId() == R.id.tvConfirm) {
                PersonInfoManager.INSTANCE.setUserBean(null);
                PersonInfoManager.INSTANCE.setToken(null);
                viewModel.updateUser();
                popupWindow.dissmiss();
            }
        }
    };

    private void showPopWindow(){
        //创建并显示popWindow
        popupWindow = new CustomPopWindow.PopupWindowBuilder(getActivity())
                .setView(contentView)
                .enableBackgroundDark(true) //弹出popWindow时，背景是否变暗
                .setBgDarkAlpha(0.7f) // 控制亮度
                .size(getResources().getDimensionPixelSize(R.dimen.mine_popwindow_width),getResources().getDimensionPixelSize(R.dimen.mine_popwindow_heigt))
                .create()
                .showAtLocation(getActivity().getWindow().getDecorView(), Gravity.CENTER, 0, 0);
    }
}
