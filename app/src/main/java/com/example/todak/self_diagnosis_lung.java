package com.example.todak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class self_diagnosis_lung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_lung);

        final CheckBox cb1 = (CheckBox)findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox)findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);
        final CheckBox cb5 = (CheckBox)findViewById(R.id.checkBox5);
        final CheckBox cb6 = (CheckBox)findViewById(R.id.checkBox6);
        final CheckBox cb7 = (CheckBox)findViewById(R.id.checkBox7);
        final CheckBox cb8 = (CheckBox)findViewById(R.id.checkBox8);
        final CheckBox cb9 = (CheckBox)findViewById(R.id.checkBox9);
        final CheckBox cb10 = (CheckBox)findViewById(R.id.checkBox10);
        final CheckBox cb11 = (CheckBox)findViewById(R.id.checkBox11);
        final CheckBox cb12 = (CheckBox)findViewById(R.id.checkBox12);
        final CheckBox cb13 = (CheckBox)findViewById(R.id.checkBox13);
        final CheckBox cb14 = (CheckBox)findViewById(R.id.checkBox14);
        final CheckBox cb15 = (CheckBox)findViewById(R.id.checkBox15);
        final CheckBox cb16 = (CheckBox)findViewById(R.id.checkBox16);
        final CheckBox cb17 = (CheckBox)findViewById(R.id.checkBox17);
        final CheckBox cb18 = (CheckBox)findViewById(R.id.checkBox18);
        final CheckBox cb19 = (CheckBox)findViewById(R.id.checkBox19);
        final CheckBox cb20 = (CheckBox)findViewById(R.id.checkBox20);
        final CheckBox cb21 = (CheckBox)findViewById(R.id.checkBox21);
        final CheckBox cb22 = (CheckBox)findViewById(R.id.checkBox22);
        final CheckBox cb23 = (CheckBox)findViewById(R.id.checkBox23);
        final CheckBox cb24 = (CheckBox)findViewById(R.id.checkBox24);


        Button b = (Button)findViewById(R.id.button1);




        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int corona = 0; // 코로나
                int cold = 0; // 감기
                int pneumonia = 0; //폐렴
                int tuberculosis = 0; // 폐결핵
                int asthma = 0; //천식
                int acute_bronchitis = 0; //급성기관지염
                int pneumothorax = 0; //기흉
                int allergic_coryza = 0; //알레르기성 비염
                int hyperventilation_syndrome = 0; // 과호흡증후군

                if(cb1.isChecked() == true)  {
                    corona += 1;
                    cold += 1;
                    pneumonia += 1;
                    tuberculosis += 1;
                }
                if(cb2.isChecked() == true) ;
                if(cb3.isChecked() == true) ;
                if(cb4.isChecked() == true) ;
                if(cb5.isChecked() == true) ;
                if(cb6.isChecked() == true) ;
                if(cb7.isChecked() == true) ;
                if(cb8.isChecked() == true) ;
                if(cb9.isChecked() == true)
                if(cb10.isChecked() == true)
                if(cb11.isChecked() == true)
                if(cb12.isChecked() == true)
                if(cb13.isChecked() == true)
                if(cb14.isChecked() == true)
                if(cb15.isChecked() == true)
                if(cb16.isChecked() == true)
                if(cb17.isChecked() == true)
                if(cb18.isChecked() == true)
                if(cb19.isChecked() == true)
                if(cb20.isChecked() == true)
                if(cb21.isChecked() == true)
                if(cb22.isChecked() == true)
                if(cb23.isChecked() == true)
                if(cb24.isChecked() == true);

            } // end onClick
        });


    }
}
