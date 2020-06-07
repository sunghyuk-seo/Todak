package com.example.todak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.ListView;
import android.widget.TextView;

import com.example.todak.DoubtDiagnosis.ListViewItem;
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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });




    }

    //질병 체크리스트의 리스너 만들기

    //리스트 어댑터.
    public class QuestionList extends BaseAdapter
    {
        private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();
        private final Activity context;
        private View rowView;
        public QuestionList(Activity context) {
            super(context,R.layout.doubt_corona_list_item, questionNum);
            this.context = context;
        }

        public View getView(int position, View view, ViewGroup parent)
        {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView= inflater.inflate(R.layout.doubt_corona_list_item,null,true);



            TextView text =  (TextView)rowView.findViewById(R.id.corona_question);
            text.setText(questionNum[position]);

            //Question Number set
            TextView QuestionNumber = (TextView)rowView.findViewById(R.id.QuestionNumber);
            QuestionNumber.setText("Q" + (position+1));

            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            return rowView;

        }

        public long getItemId(int position)
        {
            return position;
        }

        public Object getItem(int position)
        {
            return listViewItemList.get(position);
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
