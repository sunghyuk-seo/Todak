package com.example.todak.DoubtCorona;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.todak.R;

public class doubt_Corona_Question extends AppCompatActivity {
    double score =0;
    double num_of_q = 21;
    double rate = 0;

    boolean previous = false;


    //Corona 의심진단 질병에 대한 리스트뷰와 체크박스 리스너를 구현하는 곳.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(previous)
        {
            Intent intent = new Intent(doubt_Corona_Question.this,doubt_Corona_Question.class);
            startActivity(intent);
        }
        setContentView(R.layout.doubt_corona_question_page_1);

        previous = true;





        //결과보기 버튼을 눌렀을 때 결과보기 액티비티로 넘어가기.
        Button resultButton = (Button)findViewById(R.id.Q1_resultbutton);
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(doubt_Corona_Question.this,doubt_Corona_Result.class);
                rate = (score/(num_of_q));

                Toast.makeText(getApplicationContext(),num_of_q +" " +score ,Toast.LENGTH_LONG).show();

                intent.putExtra("Disease" , "코로나 바이러스");
                intent.putExtra("Rate",rate);

                startActivity(intent);

            }
        });







    }
    public void onCheckButtonListener(View view)
    {
        boolean checked = ((CheckBox)view).isChecked();

        CheckBox q1 = findViewById(R.id.Q1_1c);
        CheckBox q2 = findViewById(R.id.Q1_2c);
        CheckBox q3 = findViewById(R.id.Q1_3c);
        CheckBox q4 = findViewById(R.id.Q1_4c);
        CheckBox q5 = findViewById(R.id.Q1_5c);
        CheckBox q6 = findViewById(R.id.Q1_6c);
        CheckBox q7 = findViewById(R.id.Q1_7c);
        CheckBox q8 = findViewById(R.id.Q1_8c);
        CheckBox q9 = findViewById(R.id.Q1_9c);
        CheckBox q10 = findViewById(R.id.Q1_10c);
        CheckBox q11 = findViewById(R.id.Q1_11c);
        CheckBox q12 = findViewById(R.id.Q1_12c);
        CheckBox q13 = findViewById(R.id.Q1_13c);
        CheckBox q14 = findViewById(R.id.Q1_14c);
        CheckBox q15 = findViewById(R.id.Q1_15c);
        CheckBox q16 = findViewById(R.id.Q1_16c);
        score =0;

        if(q1.isChecked())  score+=1;


        if (q2.isChecked()) score +=1;

        if (q3.isChecked()) score +=1;

        if (q4.isChecked()) score +=1;

        if (q5.isChecked()) score +=1;

        if (q6.isChecked()) score +=1;

        if (q7.isChecked()) score +=1;

        if (q8.isChecked()) score +=1;

        if (q9.isChecked()) score +=1;

        if (q10.isChecked()) score +=1;

        if (q11.isChecked()) score +=1;

        if (q12.isChecked()) score +=2;

        if (q13.isChecked()) score +=2;

        if (q14.isChecked()) score +=2;

        if (q15.isChecked()) score +=2;

        if (q16.isChecked()) score +=2;


    }



}
