package com.example.todak.SelfDiagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.todak.R;

public class self_diagnosis_brain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_brain);

        final CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cerebral_hemorrhage = 0; // 뇌출혈

                if (cb1.isChecked()) {
                    cerebral_hemorrhage += 1;
                }

                if (cb2.isChecked()) {
                    cerebral_hemorrhage += 1;
                }

                if (cb3.isChecked()) {
                    cerebral_hemorrhage += 1;
                }

                if (cb4.isChecked()) {
                    cerebral_hemorrhage += 1;
                }


                String[] array = {String.valueOf(Math.round(((cerebral_hemorrhage / 4) * 100) * 100) / 100.0) };


                send(array);

                cerebral_hemorrhage = 0; // 뇌출혈


            }

            void send(String[] array) {
                Intent intent = new Intent(getApplicationContext(), self_diagnosis_brain_result.class);
                intent.putExtra("뇌출혈", array[0]);
                startActivity(intent);
            }


        });
    }
}
