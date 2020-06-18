package com.example.todak.Doubt_Cold_Question;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.DoubtCorona.doubt_Corona_Result;
import com.example.todak.R;

public class doubt_Cold_Question extends AppCompatActivity {
    double score =0;
    double num_of_q = 8;
    double rate = 0;
    double otherscore = 0;
    double others = 6;
    double otherrate = 0;

    boolean previous = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //만약 이미 검사를 했다면 score와 checkbox의 데이터를 초기화 하기 위해 재실행
        if(previous)
        {
            Intent intent = new Intent(doubt_Cold_Question.this,doubt_Cold_Question.class);
            startActivity(intent);
        }
        setContentView(R.layout.doubt_cold_question);

        previous = true;





        //결과보기 버튼을 눌렀을 때 결과보기 액티비티로 넘어가기.
        Button resultButton = (Button)findViewById(R.id.Q1_resultbutton);
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(doubt_Cold_Question.this, doubt_Cold_Result.class);
                rate = Math.round(100.0*(score/(num_of_q)*100/100.0));
                otherrate = Math.round(100.0*(otherscore/others)*100/100.0);



                intent.putExtra("Disease" , "감기");
                intent.putExtra("Rate",rate);

                intent.putExtra("Other Diseases","감기 이외 질병");
                intent.putExtra("OtherRate",otherrate);

                startActivity(intent);

            }
        });







    }
    public void onCheckButtonListener(View view)
    {


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

        score =0;

        if(q1.isChecked())  score+=1;


        if (q2.isChecked()) score +=1;

        if (q3.isChecked()) score +=1;

        if (q4.isChecked()) score +=1;

        if (q5.isChecked()) score +=1;

        if (q6.isChecked()) score +=1;

        if (q7.isChecked()) score +=1;

        if (q8.isChecked()) score +=1;

        if (q9.isChecked()) otherscore +=1;

        if (q10.isChecked()) otherscore +=1;

        if (q11.isChecked()) otherscore +=1;

        if (q12.isChecked()) otherscore +=1;

        if (q13.isChecked()) otherscore +=1;

        if (q14.isChecked()) otherscore +=1;




    }



}
