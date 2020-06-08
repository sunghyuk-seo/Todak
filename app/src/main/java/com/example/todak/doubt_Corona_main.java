package com.example.todak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.todak.DoubtDiagnosis.CoronaQuestionItem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class doubt_Corona_main extends AppCompatActivity {
    String[] questionNum = {
            "최근 발열이 있었습니까?", "마른 기침을 합니까?", "피로감을 느낍니까?", "몸살이 있습니까?", "인후통이 있습니까?"
            , "설사를 했나요?", "두통이 있습니까?", "호흡곤란이나 숨가쁨이 있습니까?", "가슴통증이나 압박감을 느낍니까?", "언어 장애 혹은 운동장애가 생겼습니까?"
    };

    //증상의 심각도를 3단계로 분할해 저장
    private double[] Value = {1,1,1,0.5,0.5,0.5,0.5,0.5,0.5,0.5,2,2,2};
    private int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.doubt_corona_main);

        //Generate List View
        GenerateList(questionNum);


    }

    private void GenerateList(String[] strings) {
        //Question Item을 담을 리스트 생성
        ArrayList<CoronaQuestionItem> itemlist = new ArrayList<CoronaQuestionItem>();


        //String의 요소들을 하나씩 꺼내기
        for (int i = 0; i < strings.length; i++) {
            //String element를 포함하는 item을 생성한 후, item을 리스트에 추가
            CoronaQuestionItem item = new CoronaQuestionItem(strings[i], Integer.toString(i), false);
            itemlist.add(item);
        }
        //String의 요소들을 ArrayList에 추가하기

        GenerateAdapter(itemlist);
    }

    private void GenerateAdapter(ArrayList<CoronaQuestionItem> itemlist) {
        //adapter 생성
        QuestionList adapter = new QuestionList(doubt_Corona_main.this, R.layout.doubt_corona_list_item, itemlist);

        //ListView 생성
        ListView listView = (ListView) findViewById(R.id.listView1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CoronaQuestionItem item = (CoronaQuestionItem) parent.getItemAtPosition(position);
                score += Value[position];

                Toast.makeText(getApplicationContext(),item.getQuestion(),Toast.LENGTH_LONG).show();
            }
        });

    }











    //질병 체크리스트의 리스너 만들기

    //리스트 어댑터.
    private class QuestionList extends ArrayAdapter<CoronaQuestionItem> {
        private ArrayList<CoronaQuestionItem> itemArrayList;

        public QuestionList(Context context, int textViewResourceID, ArrayList<CoronaQuestionItem> arrlist) {
            //ArrayAdapter에 다음 데이터를 넣기
            super(context, textViewResourceID, arrlist);
            itemArrayList = new ArrayList<CoronaQuestionItem>();

            //arrlist의 데이터를 itemArray로 이동
            itemArrayList.addAll(arrlist);


        }


        //Corona List Item Holder
        private class ViewHolder {
            TextView QuestionNum;
            TextView Question;
            CheckBox yes;

        }



        public View getView(final int position, View view, ViewGroup parent) {
            ViewHolder viewHolder = null;

            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.doubt_corona_list_item, null);


                //View Holder 생성후 안에 아이템 넣기.
                viewHolder = new ViewHolder();
                viewHolder.QuestionNum = (TextView) view.findViewById(R.id.QuestionNumber);
                viewHolder.Question = (TextView) view.findViewById(R.id.corona_question);
                viewHolder.yes = (CheckBox) view.findViewById(R.id.yes);


                view.setTag(viewHolder);


                viewHolder.yes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if(isChecked)
                        {
                            score += Value[position];
                        }

                        else if (!isChecked)
                        {
                            score -= Value[position];
                        }

                        Toast.makeText(getApplicationContext(), score, Toast.LENGTH_SHORT).show();
                    }
                });
            }
            return view;
        }
    }
}



