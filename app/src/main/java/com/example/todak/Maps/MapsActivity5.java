package com.example.todak.Maps;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.R;

public class MapsActivity5 extends AppCompatActivity {

    private WebView webView5;

    private WebSettings webSettings5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps5);


        webView5 = (WebView) findViewById(R.id.webview5);
        webView5.setWebViewClient(new WebViewClient());

        webSettings5 = webView5.getSettings();

        webSettings5.setJavaScriptEnabled(true);

        webView5.loadUrl("https://www.google.co.kr/maps/search/%EC%A0%95%ED%98%95%EC%99%B8%EA%B3%BC/@37.2354017,127.0368153,13z/data=!3m1!4b1?hl=ko");
    }


}
