package com.example.wovnsample

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.RequiresApi
import io.wovn.wovnapp.Wovn


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0

        findViewById<Button>(R.id.updateText).setOnClickListener {
            ++count
            findViewById<TextView>(R.id.helloTextView).text = if(count % 2 == 0)  "こんにちは日本" else "こんにちはイングランド"
            findViewById<TextView>(R.id.helloTextView2).text = if(count % 2 == 0)  "こんにちは、WOVN" else "こんにちは、WithLive"
        }
        Log.d("WOVN-DEBUG", "Wovn.SDK_VERSION: " + Wovn.SDK_VERSION)
    }
}