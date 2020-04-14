package com.mahuahudong.project.view.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.module_live.DemoCache;
import com.mahuahudong.module_live.base.util.string.MD5;
import com.mahuahudong.module_live.im.config.AuthPreferences;
import com.mahuahudong.module_live.im.config.UserPreferences;
import com.mahuahudong.module_live.im.ui.dialog.DialogMaker;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityLoginBinding;
import com.mahuahudong.project.viewmodel.LoginViewModel;
import com.mahuahudong.project.viewmodel.WatchHistoryListViewModel;
import com.netease.nimlib.sdk.AbortableFuture;
import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.RequestCallback;
import com.netease.nimlib.sdk.auth.AuthService;
import com.netease.nimlib.sdk.auth.LoginInfo;

import java.util.List;

@Route(path = RouterActivityPath.PAGER_LOGIN)
public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginViewModel> {
    private AbortableFuture<LoginInfo> loginRequest;
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_login;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public LoginViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(LoginViewModel.class);
    }

    @Override
    public void initViewObservable() {
        viewModel.loginLiveEvent.observe(this, new Observer<List<String>>() {
            @Override
            public void onChanged(List<String> strings) {
                login(strings.get(0),strings.get(1));
            }
        });
    }

    private void login(String userName,String password) {
        DialogMaker.showProgressDialog(this, null, "登录中", true, new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                if (loginRequest != null) {
                    loginRequest.abort();
                    onLoginDone();
                }
            }
        }).setCanceledOnTouchOutside(false);

        final String account = userName;
        final String token = password;
        // 登录
        loginRequest = NIMClient.getService(AuthService.class).login(new LoginInfo(account, token));
        loginRequest.setCallback(new RequestCallback<LoginInfo>() {
            @Override
            public void onSuccess(LoginInfo param) {
                Toast.makeText(getApplication().getApplicationContext(), "直播登录成功", Toast.LENGTH_SHORT).show();
                onLoginDone();
                DemoCache.setAccount(account);
                saveLoginInfo(account, token);

                // 初始化消息提醒
                NIMClient.toggleNotification(UserPreferences.getNotificationToggle());

                // 初始化免打扰
                NIMClient.updateStatusBarNotificationConfig(UserPreferences.getStatusConfig());

            }

            @Override
            public void onFailed(int code) {
                onLoginDone();
                if (code == 302 || code == 404) {
                    Toast.makeText(getApplication().getApplicationContext(), "直播账号或密码错误", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplication().getApplicationContext(), "直播登录失败: " + code, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onException(Throwable exception) {
                onLoginDone();
            }
        });
    }

    private String tokenFromPassword(String password) {
        return MD5.getStringMD5(password);
    }

    private void onLoginDone() {
        loginRequest = null;
        DialogMaker.dismissProgressDialog();
    }

    private void saveLoginInfo(final String account, final String token) {
        AuthPreferences.saveUserAccount(account);
        AuthPreferences.saveUserToken(token);
    }
}
