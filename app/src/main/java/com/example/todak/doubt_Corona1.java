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
            "최근 발열이 있었습니까?", "마른 기침을 합니까?", "피로감을 느낍니까?", "몸살이 있습니까?", "인후통이 있습니까?"
            , "설사를 했나요?", "두통이 있습니까?", "호흡곤란이나 숨가쁨이 있습니까?", "가슴통증이나 압박감을 느낍니까?", "언어 장애 혹은 운동장애가 생겼습니까?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ArrayList<String> items = new ArrayList<String>();
        final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice,items);

        final ListView listView = (ListView)findViewById(R.id.listViewCorona);
        listView.setAdapter(adapter);



    }
}