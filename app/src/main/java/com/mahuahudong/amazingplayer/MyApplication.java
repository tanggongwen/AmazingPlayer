package com.mahuahudong.amazingplayer;




import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.BaseApplication;
import com.mahuahudong.mvvm.utils.LocationManager;
import com.mahuahudong.res.Utils;

import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //开启打印日志
//        KLog.init(true);
        LocationManager.INSTANCE.initLocationOption(getApplicationContext());
        //初始化阿里路由框架
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        Utils.init(getApplicationContext());
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
        initAutoSize();




    }




    /**
     * 初始化AutoSIize参数，使用MM
     */
    private void initAutoSize() {
        AutoSizeConfig.getInstance().getUnitsManager()
                .setSupportDP(false)
                .setSupportSP(false)
                .setSupportSubunits(Subunits.MM);
    }


}
