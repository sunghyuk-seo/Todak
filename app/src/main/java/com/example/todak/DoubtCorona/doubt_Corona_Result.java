package com.example.todak.DoubtCorona;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.todak.R;

public class doubt_Corona_Result extends AppCompatActivity {

    static final int ResultOK = 1;
    TextView Disease;
    TextView RateView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doubt__corona_result);

        Disease = (TextView)findViewById(R.id.CoronaTextView);
        RateView = (TextView)findViewById(R.id.CoronaRateView);


        Intent intent = getIntent();
        Disease.setText(intent.getStringExtra("Disease"));
        double rate = intent.getDoubleExtra("Rate",0);
        String Rate = Double.toString(rate);
        RateView.setText(Rate);
    }





}
