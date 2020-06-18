package com.example.todak.Doubt_Cold_Question;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.DoubtCorona.doubt_Corona_Result;
import com.example.todak.Main2Activity;
import com.example.todak.R;

public class doubt_Cold_Result extends AppCompatActivity {


    TextView Disease;
    TextView RateView;

    TextView OtherDisease;
    TextView OtherRateView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_result);

        Disease = (TextView)findViewById(R.id.Disease_Title);
        RateView = (TextView)findViewById(R.id.Rate_Title);

        OtherDisease = (TextView)findViewById(R.id.Disease_Title2);
        OtherRateView = (TextView)findViewById(R.id.Rate_Title2);

        Intent intent = getIntent();
        Disease.setText(intent.getStringExtra("Disease"));
        double d1 =intent.getDoubleExtra("Rate",0);
        String s1 = Double.toString(d1);
        RateView.setText(s1 +" %");

        OtherDisease.setText(intent.getStringExtra("Other Diseases"));
        double d2 = intent.getDoubleExtra("OtherRate",0);
        String s2 = Double.toString(d2);
        OtherRateView.setText(s2 + " %");

        Button button = (Button)findViewById(R.id.C_button_to_home);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(doubt_Cold_Result.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

}
