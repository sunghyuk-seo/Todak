package com.example.todak;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

public class HospitalDiary extends AppCompatActivity {

    DatePicker datePicker;
    TextView viewDatePick;
    EditText edtDiary;
    Button btnSave;
    String fileName;
    Button btnDelete;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
        viewDatePick = (TextView) findViewById(R.id.viewDatePick);
        edtDiary = (EditText) findViewById(R.id.edtDiary);
        btnSave = (Button) findViewById(R.id.btnSave);
        btnDelete = (Button) findViewById(R.id.btnDelete);

        Calendar c = Calendar.getInstance();
        int cYear = c.get(Calendar.YEAR);
        int cMonth = c.get(Calendar.MONTH);
        int cDay = c.get(Calendar.DAY_OF_MONTH);

        checkedDay(cYear, cMonth, cDay);

        datePicker.init(datePicker.getYear(), datePicker.getMonth(),
                datePicker.getDayOfMonth(), new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        checkedDay(year, monthOfYear, dayOfMonth);
                    }
                });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveDiary(fileName);
            }


            @SuppressLint("WrongConstant")
            private void saveDiary(String readDay) {

                FileOutputStream fos = null;

<<<<<<< HEAD
                try {
                    fos = openFileOutput(readDay, MODE_NO_LOCALIZED_COLLATORS);
                    String content = edtDiary.getText().toString();

                    fos.write(content.getBytes());

=======
                try{
                    fos = openFileOutput(readDay, MODE_NO_LOCALIZED_COLLATORS);
                    String content = edtDiary.getText().toString();
                    fos.write(content.getBytes());
>>>>>>> 926ce667a2c0359e9ee7c6bce063002fd75d04cb
                    fos.close();

                    Toast.makeText(getApplicationContext(), "일기 저장됨", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "오류", Toast.LENGTH_SHORT).show();
<<<<<<< HEAD
                }
=======
                }

            }

        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteDiary(fileName);
            }


            @SuppressLint("WrongConstant")
            private void deleteDiary(String readDay) {

                FileOutputStream fos = null;

                try{
                    fos = openFileOutput(readDay, MODE_NO_LOCALIZED_COLLATORS); //MODE_WORLD_WRITEABLE
                    EditText text = findViewById(R.id.edtDiary);
                    text.setText("");
                    Toast.makeText(getApplicationContext(), "일기 삭제됨", Toast.LENGTH_SHORT).show();

                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "오류", Toast.LENGTH_SHORT).show();
                }

            }

        });

>>>>>>> 926ce667a2c0359e9ee7c6bce063002fd75d04cb

                }
            });
    }

    private void checkedDay(int year, int monthOfYear, int dayOfMonth) {
        viewDatePick.setText(year + " - " + monthOfYear + " - " + dayOfMonth);

        fileName = year + "" + monthOfYear + "" + dayOfMonth + ".txt";

        FileInputStream fis = null;
        try {
            fis = openFileInput(fileName);
            byte[] fileData = new byte[fis.available()];
            fis.read(fileData);
            fis.close();
<<<<<<< HEAD

            String str = new String(fileData, "UTF-8");
            // 읽어서 토스트 메시지로 보여줌
            Toast.makeText(getApplicationContext(), "일기 써둔 날", Toast.LENGTH_SHORT).show();
=======
            String str = new String(fileData, "UTF-8");
            Toast.makeText(getApplicationContext(), "병원 갔던 날", Toast.LENGTH_SHORT).show();
>>>>>>> 926ce667a2c0359e9ee7c6bce063002fd75d04cb
            edtDiary.setText(str);
            btnSave.setText("일기 저장");
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "병원 안 갔던 날", Toast.LENGTH_SHORT).show();
            edtDiary.setText("");
            btnSave.setText("일기 저장");
            e.printStackTrace();
        }


    }


}
