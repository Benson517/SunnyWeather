package com.sunnyweather.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
//    @SuppressLint("StaticFieldLeak")

    //重写父类的方法
    public static final String TOKEN_SECRET = "eDTcIijJ9JjchqT0";
    @SuppressLint("StaticFieldLeak")
    static public Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }



}
