package com.example.zs.customview;

import android.app.Application;

/**
 * Description:Application
 * Created by zs on 2016/11/3.
 */

public class App extends Application {
    // App单例
    private static App mInstance;

    /**
     * 获取Application实例
     *
     * @return Application实例
     */
    public static App getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        init();
    }

    // 初始化配置信息
    private void init() {

    }

}
