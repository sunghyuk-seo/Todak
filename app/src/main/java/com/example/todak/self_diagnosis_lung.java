package com.example.todak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class self_diagnosis_lung extends AppCompatActivity {

    public static Boolean var;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_lung);

        var = false;

        final CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
        final CheckBox cb5 = (CheckBox) findViewById(R.id.checkBox5);
        final CheckBox cb6 = (CheckBox) findViewById(R.id.checkBox6);
        final CheckBox cb7 = (CheckBox) findViewById(R.id.checkBox7);
        final CheckBox cb8 = (CheckBox) findViewById(R.id.checkBox8);
        final CheckBox cb9 = (CheckBox) findViewById(R.id.checkBox9);
        final CheckBox cb10 = (CheckBox) findViewById(R.id.checkBox10);
        final CheckBox cb11 = (CheckBox) findViewById(R.id.checkBox11);
        final CheckBox cb12 = (CheckBox) findViewById(R.id.checkBox12);
        final CheckBox cb13 = (CheckBox) findViewById(R.id.checkBox13);
        final CheckBox cb14 = (CheckBox) findViewById(R.id.checkBox14);
        final CheckBox cb15 = (CheckBox) findViewById(R.id.checkBox15);
        final CheckBox cb16 = (CheckBox) findViewById(R.id.checkBox16);
        final CheckBox cb17 = (CheckBox) findViewById(R.id.checkBox17);
        final CheckBox cb18 = (CheckBox) findViewById(R.id.checkBox18);
        final CheckBox cb19 = (CheckBox) findViewById(R.id.checkBox19);
        final CheckBox cb20 = (CheckBox) findViewById(R.id.checkBox20);
        final CheckBox cb21 = (CheckBox) findViewById(R.id.checkBox21);
        final CheckBox cb22 = (CheckBox) findViewById(R.id.checkBox22);
        final CheckBox cb23 = (CheckBox) findViewById(R.id.checkBox23);

        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        cb5.setChecked(false);
        cb6.setChecked(false);
        cb7.setChecked(false);
        cb8.setChecked(false);
        cb9.setChecked(false);
        cb10.setChecked(false);
        cb11.setChecked(false);
        cb12.setChecked(false);
        cb13.setChecked(false);
        cb14.setChecked(false);
        cb15.setChecked(false);
        cb16.setChecked(false);
        cb17.setChecked(false);
        cb18.setChecked(false);
        cb19.setChecked(false);
        cb20.setChecked(false);
        cb21.setChecked(false);
        cb22.setChecked(false);
        cb23.setChecked(false);

        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cold = 0; // 감기
                double corona = 0; // 코로나
                double pneumonia = 0; //폐렴
                double tuberculosis = 0; // 폐결핵
                double asthma = 0; //천식
                double acute_bronchitis = 0; //급성기관지염
                double pneumothorax = 0; //기흉
                double allergic_coryza = 0; //알레르기성 비염
                double hyperventilation_syndrome = 0; // 과호흡증후군


                if (cb1.isChecked()) {
                    corona += 1;
                    cold += 1;
                    pneumonia += 1;
                    tuberculosis += 1;
                }
                if (cb2.isChecked()) {
                    cold += 1;
                    pneumonia += 1;
                }
                if (cb3.isChecked()) {
                    corona += 1;
                    cold += 1;
                    tuberculosis += 1;
                    asthma += 1;
                    acute_bronchitis += 1;
                    pneumothorax += 1;
                    allergic_coryza += 1;
                }
                if (cb4.isChecked()) {
                    corona += 1;
                    cold += 1;
                    tuberculosis += 1;
                    pneumothorax += 1;
                }
                if (cb5.isChecked()) {
                    corona += 1;
                    cold += 1;
                }
                if (cb6.isChecked()) {
                    corona += 1;
                    cold += 1;
                    tuberculosis += 1;
                }
                if (cb7.isChecked()) {
                    corona += 1;
                    asthma += 1;
                    tuberculosis += 1;
                    pneumonia += 1;
                    pneumothorax += 1;
                    allergic_coryza += 1;
                }
                if (cb8.isChecked()) {
                    pneumothorax += 1;
                }
                if (cb9.isChecked()) {
                    cold += 1;
                    tuberculosis += 1;
                }
                if (cb10.isChecked()) {
                    corona += 1;
                    pneumonia += 1;
                    asthma += 1;
                    acute_bronchitis += 1;
                    pneumothorax += 1;
                    hyperventilation_syndrome += 1;
                }
                if (cb11.isChecked()) {
                    cold += 1;
                    pneumonia += 1;
                    acute_bronchitis += 1;
                    asthma += 1;
                }
                if (cb12.isChecked()) {
                    corona += 1;
                    cold += 1;
                }
                if (cb13.isChecked()) {
                    corona += 1;
                    cold += 1;
                }
                if (cb14.isChecked()) {
                    cold += 1;
                    allergic_coryza += 1;
                }
                if (cb15.isChecked()) {
                    cold += 1;
                    allergic_coryza += 1;
                }
                if (cb16.isChecked()) {
                    cold += 1;
                    allergic_coryza += 1;
                }
                if (cb17.isChecked()) {
                    tuberculosis += 1;
                }
                if (cb18.isChecked()) {
                    cold += 1;
                    pneumonia += 1;
                }
                if (cb19.isChecked()) {
                    acute_bronchitis += 1;
                    asthma += 1;
                }
                if (cb20.isChecked()) {
                    hyperventilation_syndrome += 1;
                }
                if (cb21.isChecked()) {
                    hyperventilation_syndrome += 1;
                }
                if (cb22.isChecked()) {
                    hyperventilation_syndrome += 1;
                }

                if (cb23.isChecked()) {
                    hyperventilation_syndrome += 1;
                }

                String[] array = {String.valueOf(Math.round(((cold / 13) * 100)* 100)/100.0), String.valueOf(Math.round(((corona / 9) * 100)* 100)/100.0),
                        String.valueOf(Math.round(((pneumonia / 5) * 100)* 100)/100.0), String.valueOf(Math.round(((tuberculosis / 8) * 100)* 100)/100.0),
                        String.valueOf(Math.round(((asthma / 5) * 100)* 100)/100.0), String.valueOf(Math.round(((acute_bronchitis / 4) * 100)* 100)/100.0),
                        String.valueOf(Math.round(((pneumothorax / 5) * 100)* 100)/100.0), String.valueOf(Math.round(((allergic_coryza / 6) * 100)* 100)/100.0),
                        String.valueOf(Math.round(((hyperventilation_syndrome / 5) * 100)* 100)/100.0)};
                
                
                send(array);

                cold = 0; // 감기
                corona = 0; // 코로나
                pneumonia = 0; //폐렴
                tuberculosis = 0; // 폐결핵
                asthma = 0; //천식
                acute_bronchitis = 0; //급성기관지염
                pneumothorax = 0; //기흉
                allergic_coryza = 0;
                hyperventilation_syndrome = 0;

            }

            void send(String[] array) {
                Intent intent = new Intent(getApplicationContext(), self_diagnosis_lung_result.class);

                intent.putExtra("감기", array[0]);
                intent.putExtra("코로나", array[1]);
                intent.putExtra("폐렴", array[2]);
                intent.putExtra("폐결핵", array[3]);
                intent.putExtra("천식", array[4]);
                intent.putExtra("급성기관지염", array[5]);
                intent.putExtra("기흉", array[6]);
                intent.putExtra("알레르기성 비염", array[7]);
                intent.putExtra("과호흡증후군", array[8]);


                startActivity(intent);
            }


        });

    }
}
