package com.mahuahudong.project.view.activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.baidu.location.BDLocation;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.mvvm.router.RouterFragmentPath;
import com.mahuahudong.mvvm.utils.LocationManager;
import com.mahuahudong.mvvm.utils.ToastUtils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.adapter.HomePagerAdapter;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityHomeBinding;
import com.mahuahudong.project.viewmodel.HomeViewModel;
import com.mahuahudong.project.weiget.NormalTab;
import com.mahuahudong.res.SPUtils;
import com.mahuahudong.res.ScreenUtils;
import com.mahuahudong.res.constants.Constants;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Consumer;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;




/**
 * Created by tanggongwen on 2019/9/17
 */
@Route(path = RouterActivityPath.PAGER_HOME)
public class HomeActivity extends BaseActivity<ActivityHomeBinding, HomeViewModel> {
    private List<Fragment> mFragments = new ArrayList<>();
    private long mExitTime;

    private ViewPager viewPager;


    private static final String[] perMissionGrop = new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.READ_PHONE_STATE};
    private static final String[] writePerMissionGrop = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE};

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_home;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {

        requestPerMission();
        initFragment();
        initBottomTab();

    }



    @Override
    public void initParam() {
        super.initParam();
        ScreenUtils.fullScreen(this,true);
    }

    @Override
    public HomeViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(HomeViewModel.class);
    }

    private void initFragment() {
        //ARouter拿到多Fragment(这里需要通过ARouter获取，不能直接new,因为在组件独立运行时，宿主app是没有依赖其他组件，所以new不到其他组件的Fragment)
        Fragment homeFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_HOME).navigation();
        Fragment playRoomFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_PLAYROOM).navigation();
        Fragment liveFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_LIVE).navigation();
        Fragment mineFragment = (Fragment) ARouter.getInstance().build(RouterFragmentPath.Home.PAGER_MINE).navigation();
        mFragments = new ArrayList<>();
        mFragments.add(homeFragment);
        mFragments.add(playRoomFragment);
        mFragments.add(liveFragment);
        mFragments.add(mineFragment);
    }

    private void initBottomTab() {
        PageNavigationView tab = findViewById(R.id.tab);

        NavigationController navigationController = tab.custom()
                .addItem(newItem(R.drawable.icon_news_normal,R.drawable.icon_news_press,"首页"))
                .addItem(newItem(R.drawable.icon_channel_normal,R.drawable.icon_channel_press,"放映厅"))
                .addItem(newItem(R.drawable.icon_live_normal,R.drawable.icon_live_press,"直播"))
                .addItem(newItem(R.drawable.icon_mine_normal,R.drawable.icon_mine_press,"我的"))
                .build();

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new HomePagerAdapter(getSupportFragmentManager(),mFragments));
        viewPager.setOffscreenPageLimit(4);
        //自动适配ViewPager页面切换
        navigationController.setupWithViewPager(viewPager);
        //底部按钮的点击事件监听
        navigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
                viewPager.setCurrentItem(index);
            }

            @Override
            public void onRepeat(int index) {
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    /**
     * 正常tab
     */
    private BaseTabItem newItem(int drawable, int checkedDrawable, String text){
        NormalTab mainTab = new NormalTab(this);
        mainTab.initialize(drawable,checkedDrawable,text);
        mainTab.setTextDefaultColor(0xFFb8b8b8);
        mainTab.setTextCheckedColor(0xFFe6012c);
        return mainTab;
    }

    @Override
    protected void onPause() {
        super.onPause();
    }




    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //判断用户是否点击了“返回键”
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //与上次点击返回键时刻作差
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                //大于2000ms则认为是误操作，使用Toast进行提示
                Toast.makeText(this,"再按一次退出应用",Toast.LENGTH_SHORT).show();
                //并记录下本次点击“返回键”的时刻，以便下次进行判断
                mExitTime = System.currentTimeMillis();
            } else {
                //小于2000ms则认为是用户确实希望退出程序-调用System.exit()方法进行退出
                finish();
//                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }



    @SuppressLint("CheckResult")
    private void requestPerMission(){
        new RxPermissions(this).requestEach(perMissionGrop).subscribe(new Consumer<Permission>() {
            @Override
            public void accept(Permission permission) throws Exception {
                if (permission.granted){
                    LocationManager.INSTANCE.startLocation(new LocationManager.LocationListener() {
                        @Override
                        public void onLocation(BDLocation location) {

                            if (!location.hasAddr()) {

                                LocationManager.INSTANCE.stopLocation();
                            } else {
                                SPUtils.getInstance().put(Constants.LOCATION,location.getLongitude()+","+location.getLatitude());
                                LocationManager.INSTANCE.stopLocation();
                            }
                        }
                    });
                }else if (permission.shouldShowRequestPermissionRationale){
                }else {
                    ToastUtils.showShort("请在设置开启权限，避免影响体验");
                }
            }
        });
    }






}
