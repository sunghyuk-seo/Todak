package com.example.todak.Intro;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.R;

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
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String text = editSearch.getText().toString();
                search(text);
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
        list.add("간염");
        list.add("감기");
        list.add("결핵");
        list.add("고지혈증");
        list.add("고혈압");
        list.add("골다공증");
        list.add("기관지염");
        list.add("뇌경색");
        list.add("뇌졸중");
        list.add("뇌출혈");
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
