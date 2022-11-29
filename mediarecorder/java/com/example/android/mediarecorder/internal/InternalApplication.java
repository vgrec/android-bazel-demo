package com.example.android.mediarecorder.internal;

import android.app.Application;
import android.util.Log;

public class InternalApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("GREC_T", "debug application running");
    }
}
