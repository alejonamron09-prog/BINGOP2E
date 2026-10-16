package com.bingop2e.mobile

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.View

class MainActivity : Activity() {
    private lateinit var gameView: WebView

    @Suppress("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

        gameView = WebView(this)
        gameView.settings.javaScriptEnabled = true
        gameView.settings.domStorageEnabled = true
        gameView.settings.allowFileAccess = true
        gameView.settings.allowContentAccess = false
        gameView.webViewClient = WebViewClient()
        gameView.webChromeClient = WebChromeClient()
        setContentView(gameView)
        gameView.loadUrl("file:///android_asset/index.html")
    }

    @Deprecated("Deprecated in Android API; retained for broad compatibility")
    override fun onBackPressed() {
        if (::gameView.isInitialized && gameView.canGoBack()) gameView.goBack() else super.onBackPressed()
    }
}
