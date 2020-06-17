package com.example.todak.SelfDiagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.todak.Main2Activity;
import com.example.todak.R;

public class self_diagnosis_heart_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_heart_result);

        TextView myocardial_infarction = (TextView)findViewById(R.id.myocardial_infarction);
        Intent intent = getIntent();

        String Myocardial_infarction = intent.getExtras().getString("심근경색증"); /*String형*/
        myocardial_infarction.setText(Myocardial_infarction + "%");

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_heart_result.this, self_diagnosis_heart.class);
                startActivity(intent);
            }
        });

        Button home = (Button) findViewById(R.id.path);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_heart_result.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
