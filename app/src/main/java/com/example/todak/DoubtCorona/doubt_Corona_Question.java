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
    int score =0;
    int num_of_q = 0;
    double rate = 0;


    //Corona 의심진단 질병에 대한 리스트뷰와 체크박스 리스너를 구현하는 곳.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.doubt_corona_question_page_1);


        //스크롤 뷰의 Linear layout 개수를 받아오려고 한다.
        ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView_Corona);

        //ScrollView의 바 사이즈를 질문 개수라고 생각한다.
        num_of_q = scrollView.getScrollBarSize();


        //결과보기 버튼을 눌렀을 때 결과보기 액티비티로 넘어가기.
        Button resultButton = (Button)findViewById(R.id.Q1_resultbutton);
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(doubt_Corona_Question.this,doubt_Corona_Result.class);
                rate = score/num_of_q;

                intent.putExtra("Disease" , "코로나 바이러스");
                intent.putExtra("Rate",rate);

                startActivity(intent);

            }
        });







    }

    public void onCheckButtonListener(View view)
    {
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId())
        {
            case R.id.Q1_1c:
            {
                score +=1;
            }
            case R.id.Q1_2c:
            {
                score +=1;
            }

            case R.id.Q1_3c:
            {
                score +=1;
            }

            case R.id.Q1_4c:
            {
                score +=1;
            }

            case R.id.Q1_5c:
            {
                score +=1;
            }

            case R.id.Q1_6c:
            {
                score +=1;
            }

            case R.id.Q1_7c:
            {
                score +=1;
            }

            case R.id.Q1_8c:
            {
                score +=1;
            }

            case R.id.Q1_9c:
            {
                score +=1;
            }

            case R.id.Q1_10c:
            {
                score +=1;
            }

            case R.id.Q1_11c:
            {
                score +=1;
            }

            case R.id.Q1_12c:
            {
                score +=2;
            }

            case R.id.Q1_13c:
            {
                score +=2;
            }

            case R.id.Q1_14c:
            {
                score +=2;
            }

            case R.id.Q1_15c:
            {
                score +=2;
            }

            case R.id.Q1_16c:
            {
                score +=2;
            }
        }
    }



}
