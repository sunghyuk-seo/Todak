package com.example.todak.SelfDiagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.todak.Main2Activity;
import com.example.todak.R;

public class self_diagnosis_bone_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_bone_result);

        TextView fracture = (TextView)findViewById(R.id.fracture);
        Intent intent = getIntent();

        String Fracture = intent.getExtras().getString("골절"); /*String형*/
        fracture.setText(Fracture + "%");

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_bone_result.this, self_diagnosis_bone.class);
                startActivity(intent);
            }
        });

        Button home = (Button) findViewById(R.id.path);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_bone_result.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
