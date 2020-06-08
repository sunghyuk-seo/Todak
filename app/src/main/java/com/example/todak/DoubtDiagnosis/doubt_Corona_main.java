package com.example.todak.DoubtDiagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.todak.R;

public class doubt_Corona_main extends AppCompatActivity {
    String[] questionNum = {
            "최근 발열이 있었습니까?", "마른 기침을 합니까?", "피로감을 느낍니까?", "몸살이 있습니까?", "인후통이 있습니까?"
            , "설사를 했나요?", "두통이 있습니까?", "호흡곤란이나 숨가쁨이 있습니까?", "가슴통증이나 압박감을 느낍니까?", "언어 장애 혹은 운동장애가 생겼습니까?"
    };

    //증상의 심각도를 3단계로 분할해 저장
    private double[] Value = {1, 1, 1, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 2, 2, 2};
    private int score = 0;
    private CustomAdapter customAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.doubt_corona_main);

    }
}



