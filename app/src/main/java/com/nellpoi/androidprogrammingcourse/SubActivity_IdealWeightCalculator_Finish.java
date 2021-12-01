package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity_IdealWeightCalculator_Finish extends AppCompatActivity {
    TextView editText;
    Double aDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_ideal_weight_calculator_finish);

        Intent intent = getIntent();
        String sex = intent.getStringExtra("sex");
        int height = intent.getIntExtra("height", 170);
        if (sex.equals("男")) {
            aDouble = (height - 80) * 0.7;
        } else {
            aDouble = (height - 70) * 0.6;
        }
        String string = aDouble + "";
        if (string.length() >= 5) {
            string = string.substring(0, 5);
        }
        editText = findViewById(R.id.text_info);
        editText.setText("您的标准体重为：" + string + " Kg");
    }
}