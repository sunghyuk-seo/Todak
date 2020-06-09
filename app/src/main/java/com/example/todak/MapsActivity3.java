package com.example.todak;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MapsActivity3 extends AppCompatActivity {

    private WebView webView3;

    private WebSettings webSettings3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps3);


        webView3 = (WebView) findViewById(R.id.webview3);
        webView3.setWebViewClient(new WebViewClient());


        webSettings3 = webView3.getSettings();
        webSettings3.setJavaScriptEnabled(true);
        webView3.loadUrl("https://www.google.co.kr/maps/search/%EB%82%B4%EA%B3%BC/@37.2782969,127.0436199,16.5z?hl=ko");
    }


}
