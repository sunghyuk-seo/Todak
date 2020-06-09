package com.example.todak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapsActivity1 extends AppCompatActivity {

    private WebView webView1;


    private WebSettings webSettings1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);

        webView1 = (WebView) findViewById(R.id.webview1);
        webView1.setWebViewClient(new WebViewClient());


        webSettings1 = webView1.getSettings();


        webSettings1.setJavaScriptEnabled(true);


        webView1.loadUrl("https://www.google.co.kr/maps/search/%EC%86%8C%EC%95%84%EA%B3%BC/@37.6421049,127.0062608,13z/data=!3m1!4b1?hl=ko");
    }


}
