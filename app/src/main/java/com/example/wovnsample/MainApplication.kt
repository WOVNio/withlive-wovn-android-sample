package com.example.wovnsample

import android.app.Application
import io.wovn.wovnapp.WovnActivityLifecycleCallbacks

class MainApplication: Application() {
    override fun onCreate() {
        this.registerActivityLifecycleCallbacks(WovnActivityLifecycleCallbacks())
        super.onCreate()
    }
}
