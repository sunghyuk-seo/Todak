package com.example.todak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.Diary.HospitalDiary;
import com.example.todak.DoubtCorona.Disease_search;
import com.example.todak.Maps.pathActivity;
import com.example.todak.SelfDiagnosis.self_diagnosis;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button1 = (Button)findViewById(R.id.self);
        Button button2 = (Button)findViewById(R.id.doubt);
        Button button3 = (Button)findViewById(R.id.path);
        Button button4 = (Button)findViewById(R.id.diary);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, self_diagnosis.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Disease_search.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, pathActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, HospitalDiary.class);
                startActivity(intent);
            }
        });
    }
}
