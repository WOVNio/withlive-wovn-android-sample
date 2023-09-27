package com.example.wovnsample

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.RequiresApi
import io.wovn.wovnapp.Wovn
import io.wovn.wovnapp.WovnPermission


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Wovn.setPermission(WovnPermission.all, true)
        Wovn.changeToSystemLang()
        setContentView(R.layout.activity_main)
        Log.d("WOVN-DEBUG", "Wovn.SDK_VERSION: " + Wovn.SDK_VERSION)

        val japaneseButton = findViewById<Button>(R.id.ja)
        val englishButton = findViewById<Button>(R.id.en)

        japaneseButton.setOnClickListener {
            Wovn.changeLang("ja")
        }
        englishButton.setOnClickListener {
            Wovn.changeLang("en")
        }
    }
}