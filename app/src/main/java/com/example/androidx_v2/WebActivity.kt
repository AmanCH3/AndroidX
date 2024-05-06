package com.example.andriodx

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WebActivity : AppCompatActivity() {
    lateinit var webID: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_web)

        webID = findViewById(R.id.webID)
        webID.webViewClient = WebViewClient()
        webID.loadUrl("https://www.youtube.com/")
    }
}