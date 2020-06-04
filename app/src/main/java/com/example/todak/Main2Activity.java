package com.example.todak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.self_diagnosis;
import com.example.todak.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton button1 = (ImageButton)findViewById(R.id.self);
        ImageButton button2 = (ImageButton)findViewById(R.id.doubt);
        ImageButton button3 = (ImageButton)findViewById(R.id.path);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, self_diagnosis.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Disease_search.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD:app/src/main/java/com/example/todak/Intro/Main2Activity.java
                Intent intent = new Intent(Main2Activity.this, MapsActivity.class);
=======
                Intent intent = new Intent(Main2Activity.this, pathActivity.class);
>>>>>>> 382d7f596a6b7fac2cdde1e5201594e20c93ad8c:app/src/main/java/com/example/todak/Main2Activity.java
                startActivity(intent);
            }
        });
    }
}
