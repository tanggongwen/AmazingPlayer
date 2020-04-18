package com.mahuahudong.project.view.activity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.mvvm.utils.ToastUtils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityAccountmanagerBinding;
import com.mahuahudong.project.viewmodel.AccountManagerViewModel;
import com.mahuahudong.project.viewmodel.RegisterViewModel;
import com.mahuahudong.res.FileUtils;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.zhihu.matisse.Matisse;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.engine.impl.GlideEngine;
import com.zhihu.matisse.internal.entity.CaptureStrategy;

import java.util.List;

import io.reactivex.functions.Consumer;

@Route(path = RouterActivityPath.PAGER_ACCOUNTMANAGER)
public class AccountManagerActivity extends BaseActivity<ActivityAccountmanagerBinding, AccountManagerViewModel> {
    private static final String[] permissionsGroup=new String[]{Manifest.permission.CAMERA,Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE};
    private static final int REQUEST_CODE_CHOOSE = 0x1001;

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_accountmanager;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public AccountManagerViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(AccountManagerViewModel.class);
    }

    private void chooseHead(){
        new RxPermissions(this).request(permissionsGroup).subscribe(new Consumer<Boolean>() {
            @Override
            public void accept(Boolean aBoolean) throws Exception {
                if (aBoolean){
                    Matisse.from(AccountManagerActivity.this)
                            .choose(MimeType.ofAll())//图片类型
                            .countable(true)//true:选中后显示数字;false:选中后显示对号
                            .maxSelectable(1)//可选的最大数
                            .capture(true)//选择照片时，是否显示拍照
                            .captureStrategy(new CaptureStrategy(true, "com.mahuahudong.amazingplayer"))//参数1 true表示拍照存储在共有目录，false表示存储在私有目录；参数2与 AndroidManifest中authorities值相同，用于适配7.0系统 必须设置
                            .imageEngine(new GlideEngine())//图片加载引擎
                            .forResult(REQUEST_CODE_CHOOSE);//
                }else {
                    ToastUtils.showShort("获取权限失败，请在设置中打开相关权限");
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_CHOOSE && resultCode == RESULT_OK) {
            List<Uri> result = Matisse.obtainResult(data);
            String url = FileUtils.getRealPathFromURI(this,result.get(0));
            viewModel.headUrl.set(url);
            viewModel.updateUserBean();
        }
    }

    @Override
    public void initViewObservable() {
        viewModel.changeHeadEvent.observe(this, new Observer() {
            @Override
            public void onChanged(Object o) {
                chooseHead();
            }
        });
    }
}
