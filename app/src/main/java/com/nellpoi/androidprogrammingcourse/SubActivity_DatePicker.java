package com.nellpoi.androidprogrammingcourse;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

public class SubActivity_DatePicker extends AppCompatActivity {
    DatePicker datePicker;
    String strTime;
    TextView textView;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_date_picker);

        textView = findViewById(R.id.textView1);
        datePicker = findViewById(R.id.date_picker_actions);
        strTime = datePicker.getYear() + "年" + (datePicker.getMonth() + 1) + "月" + datePicker.getDayOfMonth() + "日";
        textView.setText(strTime);
        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                strTime = i + "年" + (i1 + 1) + "月" + i2 + "日";
                textView.setText(strTime);
            }
        });
    }
}