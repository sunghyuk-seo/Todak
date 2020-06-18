package com.example.todak.SelfDiagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.todak.R;

public class self_diagnosis_large_intestine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_large_intestine);

        final CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
        final CheckBox cb5 = (CheckBox) findViewById(R.id.checkBox5);
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        cb5.setChecked(false);
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double enteritis = 0; // 장염

                if (cb1.isChecked()) {
                    enteritis += 1;
                }

                if (cb2.isChecked()) {
                    enteritis += 1;
                }

                if (cb3.isChecked()) {
                    enteritis += 1;
                }

                if (cb4.isChecked()) {
                    enteritis += 1;
                }

                if (cb5.isChecked()) {
                    enteritis += 1;
                }


                String[] array = {String.valueOf(Math.round(((enteritis / 5) * 100) * 100) / 100.0) };


                send(array);

                enteritis = 0; // 장염


            }

            void send(String[] array) {
                Intent intent = new Intent(getApplicationContext(), self_diagnosis_large_intestine_result.class);
                intent.putExtra("장염", array[0]);
                startActivity(intent);
            }


        });
    }
}
