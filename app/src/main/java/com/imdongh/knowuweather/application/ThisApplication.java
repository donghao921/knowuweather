package com.imdongh.knowuweather.application;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

public class ThisApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
    }

    public static Context getContext() {
        return context;
    }
}
