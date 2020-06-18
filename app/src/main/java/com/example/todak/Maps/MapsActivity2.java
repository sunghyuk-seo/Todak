package com.example.todak.Maps;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.R;

public class MapsActivity2 extends AppCompatActivity {


    private WebView webView2;

    private WebSettings webSettings2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);

        webView2 = (WebView) findViewById(R.id.webview2);
        webView2.setWebViewClient(new WebViewClient());


        webSettings2 = webView2.getSettings();


        webSettings2.setJavaScriptEnabled(true);


        webView2.loadUrl("https://www.google.co.kr/maps/search/%EC%9D%B4%EB%B9%84%EC%9D%B8%ED%9B%84%EA%B3%BC/@37.2354326,127.0368154,13z/data=!3m1!4b1?hl=ko");
    }


}