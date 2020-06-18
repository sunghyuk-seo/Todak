package com.example.todak.SelfDiagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.todak.R;

public class self_diagnosis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis);
        ImageButton brain = (ImageButton)findViewById(R.id.brain);
        ImageButton bladder = (ImageButton)findViewById(R.id.bladder);
        ImageButton heart = (ImageButton)findViewById(R.id.heart);
        ImageButton bone = (ImageButton)findViewById(R.id.bone);
        ImageButton large_intestine = (ImageButton)findViewById(R.id.large_intestine);
        ImageButton liver = (ImageButton)findViewById(R.id.liver);
        ImageButton lung = (ImageButton)findViewById(R.id.lung);
        ImageButton stomach = (ImageButton)findViewById(R.id.stomach);

        lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis.this, self_diagnosis_lung.class);
                startActivity(intent);
            }
        });

        brain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis.this, self_diagnosis_brain.class);
                startActivity(intent);
            }
        });

        bladder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis.this, self_diagnosis_bladder.class);
                startActivity(intent);
            }
        });

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis.this, self_diagnosis_heart.class);
                startActivity(intent);
            }
        });

        bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis.this, self_diagnosis_bone.class);
                startActivity(intent);
            }
        });

        large_intestine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis.this, self_diagnosis_large_intestine.class);
                startActivity(intent);
            }
        });

        liver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis.this, self_diagnosis_liver.class);
                startActivity(intent);
            }
        });

        lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis.this, self_diagnosis_lung.class);
                startActivity(intent);
            }
        });

        stomach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis.this, self_diagnosis_stomach.class);
                startActivity(intent);
            }
        });


    }


}
