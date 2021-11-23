package com.nellpoi.androidprogrammingcourse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class SubActivity_CalendarView extends AppCompatActivity {
    CalendarView calendarView;
    Button button;
    String strTime;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_calendar_view);

        calendarView = findViewById(R.id.calendarView);
        SimpleDateFormat staticTime = new SimpleDateFormat("yyyy年MM月dd日");
        strTime = staticTime.format(calendarView.getDate());
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                strTime = i + "年" + (i1 + 1) + "月" + i2 + "日";
            }
        });
        textView = findViewById(R.id.textView6);
        textView.setText(strTime);
        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(strTime);
            }
        });
    }
}