package com.example.todak.Cerebral_Infarction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.todak.Main2Activity;
import com.example.todak.R;

public class doubt_cerebral_infarction_Result extends AppCompatActivity {


    TextView Disease;
    TextView RateView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doubt_result);

        Disease = (TextView)findViewById(R.id.Disease_Title);
        RateView = (TextView)findViewById(R.id.Rate_Title);



        Intent intent = getIntent();
        Disease.setText(intent.getStringExtra("Disease"));
        double d1 =intent.getDoubleExtra("Rate",0);
        String s1 = Double.toString(d1);
        RateView.setText(s1 +" %");



        Button button = (Button)findViewById(R.id.C_button_to_home);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(doubt_cerebral_infarction_Result.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

}
