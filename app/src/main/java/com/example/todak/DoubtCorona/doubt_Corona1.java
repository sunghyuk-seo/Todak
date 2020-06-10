package com.example.todak.DoubtCorona;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.todak.R;

public class doubt_Corona1 extends AppCompatActivity {
    private int score =0;
    private int num_of_q = 0;

    //Corona 의심진단 질병에 대한 리스트뷰와 체크박스 리스너를 구현하는 곳.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.doubt_corona_question_page_1);


        //스크롤 뷰의 Linear layout 개수를 받아오려고 한다.
        ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView_Corona);

        //ScrollView의 바 사이즈를 질문 개수라고 생각한다.
        num_of_q = scrollView.getScrollBarSize();



    }

    public void onCheckButtonListener(View view)
    {
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId())
        {
            case R.id.Q1_1c:
                {
                    if (checked)
                    {
                        Toast.makeText(this, "score + 1", Toast.LENGTH_LONG).show();
                        score +=1;
                    }

                    else
                    {
                        Toast.makeText(this, "score - 1", Toast.LENGTH_LONG).show();
                        score -=1;
                    }
                }
            case R.id.Q1_2c:
            {

            }

            case R.id.Q1_3c:
            {

            }

            case R.id.Q1_4c:
            {

            }

            case R.id.Q1_5c:
            {

            }

            case R.id.Q1_6c:
            {

            }


        }
    }



}
