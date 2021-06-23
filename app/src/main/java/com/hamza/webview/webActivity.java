package com.hamza.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webActivity extends AppCompatActivity {

    WebView webViewOk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webViewOk = (WebView) findViewById(R.id.webView);

        Intent intent = getIntent();
        String webSite = intent.getStringExtra("links");
        webViewOk.setWebViewClient(new WebViewClient());
        webViewOk.loadUrl(webSite);

        WebSettings webSettings = webViewOk.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webViewOk.canGoBack()) {
            webViewOk.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
