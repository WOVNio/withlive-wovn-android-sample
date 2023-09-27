package com.example.wovnsample

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.wovnsample.ui.theme.WovnSampleTheme
import io.wovn.wovnapp.Wovn
import io.wovn.wovnapp.WovnPermission

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Wovn.changeToSystemLang { _: String? ->
//            show()
//        }
        Wovn.changeLang("en") { _: String? ->
            show()
        }
        Log.d("WOVN-DEBUG", "Wovn.SDK_VERSION: " + Wovn.SDK_VERSION)
        Wovn.setPermission(WovnPermission.all, true)
    }
    private fun show(){
        this.setContent {
            WovnSampleTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = Wovn.translateInMainThread("こんにちは！ ${name}!", "ScreenName"),
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WovnSampleTheme {
        Greeting("アンドロイド")
    }
}