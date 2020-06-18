package com.example.todak.DoubtCorona;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.Cerebral_Infarction.doubt_cerebral_infarction_Question;
import com.example.todak.Doubt_Cold_Question.doubt_Cold_Question;
import com.example.todak.R;
import com.example.todak.SearchAdapter;
import com.example.todak.Tuberculosis.doubt_Tuberculosis_Question;
import com.example.todak.bronchitis.doubt_bronchitis_Question;
import com.example.todak.diabetes.doubt_diabetes_Question;

import java.util.ArrayList;
import java.util.List;

public class Disease_search extends AppCompatActivity {

    private List<String> list;
    private ListView listView;
    private EditText editSearch;
    private SearchAdapter adapter;
    private ArrayList<String> arrayList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        editSearch = (EditText) findViewById(R.id.editSearch);
        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<String>();

        settingList();

        arrayList = new ArrayList<String>();
        arrayList.addAll(list);

        adapter = new SearchAdapter(list, this);

        listView.setAdapter(adapter);

        editSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                String text = editSearch.getText().toString();
                search(text);
            }
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }


        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position)
                {
                    case 0:
                    {
                        setContentView(R.layout.doubt_corona_intro);
                        Handler handle = new Handler();
                        handle.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(Disease_search.this, doubt_Corona_Question.class);
                                startActivity(intent);
                                finish();
                            }
                        }, 3000);
                        break;

                    }

                    case 1: {




                        Intent intent2 = new Intent(Disease_search.this, doubt_Cold_Question.class);
                        startActivity(intent2);


                        break;

                    }

                    case 2:
                    {
                        Intent intent = new Intent(Disease_search.this, doubt_Tuberculosis_Question.class);
                        startActivity(intent);

                        break;
                    }

                    case 3:
                    {
                        Intent intent = new Intent(Disease_search.this, doubt_bronchitis_Question.class);
                        startActivity(intent);

                        break;
                    }

                    case 4:
                    {
                        Intent intent = new Intent(Disease_search.this, doubt_cerebral_infarction_Question.class);
                        startActivity(intent);

                        break;

                    }

                    case 5:
                    {
                        Intent intent = new Intent(Disease_search.this, doubt_diabetes_Question.class);
                        startActivity(intent);

                        break;
                    }
                }
            }
        });
    }


    private void search(String charText) {
        list.clear();

        if(charText.length() == 0) {
            list.addAll(arrayList);
        } else {
            for(int i= 0;i < arrayList.size(); i++)
            {
                if (arrayList.get(i).toLowerCase().contains(charText))
                {
                    list.add(arrayList.get(i));
                }
            }
        }
        adapter.notifyDataSetChanged();
    }
    private void settingList() {
        list.add("코로나 바이러스");
        list.add("감기");
        list.add("결핵");
        list.add("기관지염");
        list.add("뇌경색");
        list.add("당뇨병");
        list.add("동맥경화");
        list.add("말라리아");
        list.add("변비");
        list.add("빈혈");
        list.add("백혈병");
        list.add("식도염");
        list.add("심근경색증");
        list.add("에이즈");
        list.add("위암");
        list.add("위염");
        list.add("장티푸스");
        list.add("콜레라");
        list.add("폐렴");
        list.add("폐암");
    }
}
