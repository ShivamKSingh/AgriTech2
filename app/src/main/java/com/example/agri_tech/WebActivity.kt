package com.example.agri_tech

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("http://3.18.110.88/")
        myWebView.settings.javaScriptEnabled = true
    }


}
