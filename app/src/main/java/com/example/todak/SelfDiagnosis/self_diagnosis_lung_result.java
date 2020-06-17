package com.example.todak.SelfDiagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.todak.Main2Activity;
import com.example.todak.Maps.pathActivity;
import com.example.todak.R;

public class self_diagnosis_lung_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_diagnosis_lung_result);

        TextView cold = (TextView)findViewById(R.id.cold);
        TextView corona = (TextView)findViewById(R.id.corona);
        TextView pneumonia = (TextView)findViewById(R.id.pneumonia);
        TextView tuberculosis = (TextView)findViewById(R.id.tuberculosis);
        TextView asthma = (TextView)findViewById(R.id.asthma);
        TextView acute_bronchitis = (TextView)findViewById(R.id.acute_bronchitis);
        TextView pneumothorax = (TextView)findViewById(R.id.pneumothorax);
        TextView allergic_coryza  = (TextView)findViewById(R.id.allergic_coryza );
        TextView hyperventilation_syndrome = (TextView)findViewById(R.id.hyperventilation_syndrome);

        Intent intent = getIntent();

        String Cold = intent.getExtras().getString("감기"); /*String형*/
        cold.setText(Cold + "%");

        String Corona = intent.getExtras().getString("코로나"); /*String형*/
        corona.setText(Corona + "%");

        String Pneumonia = intent.getExtras().getString("폐렴"); /*String형*/
        pneumonia.setText(Pneumonia + "%");

        String Tuberculosis = intent.getExtras().getString("폐결핵"); /*String형*/
        tuberculosis.setText(Tuberculosis + "%");

        String Asthma = intent.getExtras().getString("천식"); /*String형*/
        asthma.setText(Asthma + "%");

        String Acute_Bronchitis = intent.getExtras().getString("급성기관지염"); /*String형*/
        acute_bronchitis.setText(Acute_Bronchitis + "%");

        String Pneumothorax = intent.getExtras().getString("기흉"); /*String형*/
        pneumothorax.setText(Pneumothorax + "%");

        String Allergic_Coryza = intent.getExtras().getString("알레르기성 비염"); /*String형*/
        allergic_coryza.setText(Allergic_Coryza + "%");

        String Hyperventilation = intent.getExtras().getString("과호흡증후군"); /*String형*/
        hyperventilation_syndrome.setText(Hyperventilation + "%");

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_lung_result.this, self_diagnosis_lung.class);
                startActivity(intent);
            }
        });

        Button path = (Button) findViewById(R.id.path);
        path.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_diagnosis_lung_result.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
