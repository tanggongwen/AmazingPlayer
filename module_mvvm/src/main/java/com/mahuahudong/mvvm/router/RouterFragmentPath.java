package com.mahuahudong.mvvm.router;

/**
 * 用于组件开发中，ARouter多Fragment跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 */

public class RouterFragmentPath {

        /**
         * 主页组件
         */
        public static class Home {
            private static final String HOME = "/home";
            /*主业务界面*/
            public static final String PAGER_HOME = HOME +"/home";
            public static final String PAGER_SEARCHRESULT = HOME +"/searchresult";
            public static final String PAGER_PLAYROOM = HOME+"/playerhome";
            public static final String PAGER_LIVE = HOME+"/live";
            public static final String PAGER_MINE = HOME+"/mine";

            public static final String PAGER_HOME_VIDEO = HOME+"/homevideo";

            public static final String PAGER_PLAYROOM_VIDEO = HOME+"/playroomvideo";
        }



}
