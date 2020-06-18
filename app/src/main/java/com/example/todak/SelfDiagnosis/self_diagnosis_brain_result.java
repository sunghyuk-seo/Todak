package com.example.todak.SelfDiagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.todak.Main2Activity;
import com.example.todak.R;

public class self_diagnosis_brain_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_brain_result);

        TextView cerebral_hemorrhage = (TextView)findViewById(R.id.cerebral_hemorrhage);
        Intent intent = getIntent();

        String Cerebral_hemorrhage = intent.getExtras().getString("뇌출혈"); /*String형*/
        cerebral_hemorrhage.setText(Cerebral_hemorrhage + "%");

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_brain_result.this, self_diagnosis_brain.class);
                startActivity(intent);
            }
        });

        Button home = (Button) findViewById(R.id.path);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_brain_result.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
