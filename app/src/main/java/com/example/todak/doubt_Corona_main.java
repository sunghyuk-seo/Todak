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
import android.widget.ListView;
import android.widget.TextView;

import com.example.todak.DoubtDiagnosis.CoronaQuestionItem;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class doubt_Corona_main extends AppCompatActivity {
    String[] questionNum = {
            "최근 발열이 있었습니까?","마른 기침을 합니까?","피로감을 느낍니까?","몸살이 있습니까?","인후통이 있습니까?"
            ,"설사를 했나요?","두통이 있습니까?","호흡곤란이나 숨가쁨이 있습니까?","가슴통증이나 압박감을 느낍니까?","언어 장애 혹은 운동장애가 생겼습니까?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.doubt_corona_main);

        //Generate List View
        GenerateList(questionNum);
        GenerateAdapter();





        ListView listView = (ListView)findViewById(R.id.listViewCorona);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }

    private void GenerateList(String[] strings)
    {
        //Question Item을 담을 리스트 생성
        ArrayList<CoronaQuestionItem> itemlist = new ArrayList<CoronaQuestionItem>();

        //String을 받아오기
        String[] values = strings;

        //String의 요소들을 하나씩 꺼내기
        for(int i=0; i<strings.length; i++)
        {
            //String element를 포함하는 item을 생성한 후, item을 리스트에 추가
            CoronaQuestionItem item = new CoronaQuestionItem(Integer.toString(i),strings[i],false);
            itemlist.add(item);
        }
        //String의 요소들을 ArrayList에 추가하기
    }

    private void GenerateAdapter()
    {
        //adapter 생성
        QuestionList adapter = new QuestionList(doubt_Corona_main.this,);

        //ListView 생성
        ListView listView = (ListView)findViewById(R.id.listView1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CoronaQuestionItem item = (CoronaQuestionItem) parent.getItemAtPosition(position);

            }
        });
    }



    //질병 체크리스트의 리스너 만들기

    //리스트 어댑터.
    private class QuestionList extends ArrayAdapter<CoronaQuestionItem>
    {
        private ArrayList<CoronaQuestionItem> itemArrayList;

        public QuestionList(Context context, int textViewResourceID,ArrayList<CoronaQuestionItem> arrlist)
        {
            //ArrayAdapter에 다음 데이터를 넣기
            super(context, textViewResourceID, arrlist);
            itemArrayList = new ArrayList<CoronaQuestionItem>();

            //arrlist의 데이터를 itemArray로 이동
            itemArrayList.addAll(arrlist);
        }


        private class ViewHolder {
            String QuestionNum;
            String Question;
            boolean selected;
        }

        public View getView(int position, View view, ViewGroup parent)
        {
            ViewHolder viewHolder = null;

            if(view == null)
            {
                LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.doubt_corona_list_item,null);
            }
        }
    }

    //코로나 질문지에 대한 리스트 레이아웃 구성
    class CheckableLayout extends ConstraintLayout implements Checkable
    {
        CheckBox yesbox;
        CheckBox nobox;

        public CheckableLayout(Context context) {
            super(context);

        }

        @Override
        public void setChecked(boolean checked) {

            yesbox.setChecked(checked);
            nobox.setChecked(!checked);
        }

        @Override
        public boolean isChecked() {
            yesbox = (CheckBox)findViewById(R.id.yes);
            nobox = (CheckBox)findViewById(R.id.no);

            //yesbox가 check되어 있고, nobox가 unchecked된 경우만 true return
            if (yesbox.isChecked() && !(nobox.isChecked()))
                return true;

            else
                return false;

        }

        @Override
        public void toggle() {
            setChecked(yesbox.isChecked() ? true : false);
            setChecked(nobox.isChecked() ? true : false);
            //삼항연산자 condition (true return) (false return)
        }
    }
}
