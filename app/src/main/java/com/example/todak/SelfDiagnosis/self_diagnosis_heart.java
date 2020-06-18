package com.example.todak.SelfDiagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.todak.R;

public class self_diagnosis_heart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_heart);

        final CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
        final CheckBox cb5 = (CheckBox) findViewById(R.id.checkBox5);
        final CheckBox cb6 = (CheckBox) findViewById(R.id.checkBox6);
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        cb5.setChecked(false);
        cb6.setChecked(false);
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myocardial_infarction = 0; // 심근경색증

                if (cb1.isChecked()) {
                    myocardial_infarction += 1;
                }

                if (cb2.isChecked()) {
                    myocardial_infarction += 1;
                }

                if (cb3.isChecked()) {
                    myocardial_infarction += 1;
                }

                if (cb4.isChecked()) {
                    myocardial_infarction += 1;
                }

                if (cb5.isChecked()) {
                    myocardial_infarction += 1;
                }

                if (cb6.isChecked()) {
                    myocardial_infarction += 1;
                }


                String[] array = {String.valueOf(Math.round(((myocardial_infarction / 6) * 100) * 100) / 100.0) };


                send(array);

                myocardial_infarction = 0; // 심근경색증


            }

            void send(String[] array) {
                Intent intent = new Intent(getApplicationContext(), self_diagnosis_heart_result.class);
                intent.putExtra("심근경색증", array[0]);
                startActivity(intent);
            }


        });
    }
}
