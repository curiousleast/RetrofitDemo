package com.tracyis.retrofitdemo;

import android.app.Application;

import com.tracyis.retrofitdemo.network.MyRetrofit;

/**
 * Created by Trasys on 2017/4/6.
 */
public class MyApp extends Application {
    private static final String TAG = "MyApp";

    @Override
    public void onCreate() {
        super.onCreate();

        MyRetrofit.getInstance().init(getApplicationContext());
    }
}
