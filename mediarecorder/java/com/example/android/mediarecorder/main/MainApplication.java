package com.example.android.mediarecorder;

import android.app.Application;
import android.util.Log;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("GREC_T", "main application running");
    }
}
