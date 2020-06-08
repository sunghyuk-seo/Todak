package com.example.todak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.todak.R;

import java.util.ArrayList;

public class doubt_Corona1 extends AppCompatActivity {
    String[] questionNum = {
            "최근 발열이 있었습니까?","마른 기침을 합니까?","피로감을 느낍니까?","몸살이 있습니까?","인후통이 있습니까?"
            ,"설사를 했나요?","두통이 있습니까?","호흡곤란이나 숨가쁨이 있습니까?","가슴통증이나 압박감을 느낍니까?","언어 장애 혹은 운동장애가 생겼습니까?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.doubt_corona1_2);

        QuestionList adapter = new QuestionList(doubt_Corona1.this);
        ListView listView = (ListView)findViewById(R.id.listViewCorona);
        listView.setAdapter(adapter);

        

    }

    public class QuestionList extends ArrayAdapter<String>
    {
        private final Activity context;

        public QuestionList(Activity context) {
            super(context,R.layout.doubt_corona_list_item, questionNum);
            this.context = context;
        }

        public View getView(int position, View view, ViewGroup parent)
        {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView= inflater.inflate(R.layout.doubt_corona_list_item,null,true);



            TextView text =  (TextView)rowView.findViewById(R.id.corona_question);
            text.setText(questionNum[position]);

            //Question Number set
            TextView QuestionNumber = (TextView)rowView.findViewById(R.id.QuestionNumber);
            QuestionNumber.setText("Q" + (position+1));


            return rowView;

        }
    }
}
