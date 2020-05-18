package com.example.todak.Intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.todak.R;

public class self_diagnosis_lung5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_lung5);

        Button yes = (Button)findViewById(R.id.yes_button);
        Button no = (Button)findViewById(R.id.no_button);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_lung5.this, self_diagnosis_lung6.class);
                startActivity(intent);
            }
        });
    }
}
