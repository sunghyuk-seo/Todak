package com.example.todak;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
import android.os.Bundle;

import com.example.todak.R;

<<<<<<< HEAD:app/src/main/java/com/example/todak/self_diagnosis_lung_result2.java
public class self_diagnosis_lung_result2 extends AppCompatActivity {
=======
public class doubt_Corona2 extends AppCompatActivity {
>>>>>>> 382d7f596a6b7fac2cdde1e5201594e20c93ad8c:app/src/main/java/com/example/todak/doubt_Corona2.java
=======
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class self_diagnosis_lung_result2 extends AppCompatActivity {
>>>>>>> 382d7f596a6b7fac2cdde1e5201594e20c93ad8c

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
<<<<<<< HEAD:app/src/main/java/com/example/todak/self_diagnosis_lung_result2.java
        setContentView(R.layout.activity_self_diagnosis_lung_result2);
=======
        setContentView(R.layout.activity_doubt__corona2);
>>>>>>> 382d7f596a6b7fac2cdde1e5201594e20c93ad8c:app/src/main/java/com/example/todak/doubt_Corona2.java
=======
        setContentView(R.layout.activity_self_diagnosis_lung_result2);
        Button home = (Button)findViewById(R.id.home_button);
        Button map = (Button)findViewById(R.id.path_button);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_lung_result2.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_lung_result2.this, MapsActivity1.class);
                startActivity(intent);
            }
        });
>>>>>>> 382d7f596a6b7fac2cdde1e5201594e20c93ad8c
    }
}
