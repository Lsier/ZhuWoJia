package com.weizhu.zhuwojia;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import com.zhy.autolayout.config.AutoLayoutConifg;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/19.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        mainTid = android.os.Process.myTid();
        handler=new Handler();
        application=this;
        mainMap = new HashMap();
        AutoLayoutConifg.getInstance().useDeviceSize().init(this);

        super.onCreate();
    }

    private static App application;
    private static int mainTid;
    private static Handler handler;
    private static Map mainMap;
    public static Map getMap() {
        return mainMap;
    }
    public static Context getApplication() {
        return application;
    }
    public static Handler getHandler() {
        return handler;
    }
    public static int getMainThreadId() {
        return mainTid;
    }


}
