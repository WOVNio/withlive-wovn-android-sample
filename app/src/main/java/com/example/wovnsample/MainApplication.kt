package com.example.wovnsample

import android.app.Application
import io.wovn.wovnapp.Wovn
import io.wovn.wovnapp.WovnActivityLifecycleCallbacks
import io.wovn.wovnapp.WovnPermission

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Register WovnActivityLifecycleCallbacks
        this.registerActivityLifecycleCallbacks(WovnActivityLifecycleCallbacks());
        // Test allow report data. Do not hard code this in production
        Wovn.setPermission(WovnPermission.all, true)
    }
}
