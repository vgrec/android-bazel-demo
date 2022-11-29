package com.example.android.mediarecorder.app.debug;

import android.app.Application;
import android.util.Log;

public class DebugApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("GREC_T", "debug application running");
    }
}
