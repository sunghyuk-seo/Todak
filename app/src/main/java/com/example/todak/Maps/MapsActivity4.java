package com.example.todak.Maps;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.R;

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

        webView4.loadUrl("https://www.google.co.kr/maps/search/%EC%99%B8%EA%B3%BC/@37.235412,127.0368154,13z/data=!3m1!4b1?hl=ko");
    }


}
