package com.example.todak;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MapsActivity4 extends AppCompatActivity {

    private WebView webView4;

    private WebSettings webSettings4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps4);


        webView4 = (WebView) findViewById(R.id.webview4);
        webView4.setWebViewClient(new WebViewClient());

        webSettings4 = webView4.getSettings();

        webSettings4.setJavaScriptEnabled(true);

        webView4.loadUrl("https://www.google.co.kr/maps/search/%EC%99%B8%EA%B3%BC/@37.2782852,127.0420172,16z/data=!3m1!4b1?hl=ko");
    }


}
