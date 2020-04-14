package com.mahuahudong.mvvm.router;

/**
 * 用于组件开发中，ARouter单Activity跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 */

public class RouterActivityPath {
//    /**

        private static final String HOME = "/home";
        private static final String MINE = "/mine";
        private static final String MOVIE = "/movie";
        private static final String PLAYROOM = "/playroom";
        /*主业务界面*/
        public static final String PAGER_HOME = HOME +"/Home";


        public static final String PAGER_WATCHHISTORYLIST = MINE +"/WatchHistoryList";

        public static final String PAGER_LOGIN = MINE +"/login";

        public static final String PAGER_REGISTER = MINE +"/register";

        public static final String PAGER_PERSONINFO = MINE+"/personinfo";

        public static final String PAGER_MYATTENTION= MINE+"/myattention";

        public static final String PAGER_TRENDS= MINE+"/trends";

        public static final String PAGER_ACCOUNTMANAGER= MINE+"/accountmanager";

        public static final String PAGER_MOVIEDETAIL= MOVIE+"/moviedetail";

        public static final String PAGER_MOVIESELECT= MOVIE+"/movieselect";

        public static final String PAGER_LIVELOGIN= "/live/login";

        public static final String PAGER_INDENTIFY= "/live/identify";

}
