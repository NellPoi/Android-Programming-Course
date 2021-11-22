package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class SubActivity_AutoCompleteTextView extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    String[] strings = new String[]{"android", "androidx", "androidprogrammingcourse", "android strings"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_auto_complete_text_view);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        /*
         * 设置文本框的提示内容，通过数组适配器来实现
         * */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplication(), R.layout.activity_sub_auto_complete_text_view_item, strings);
        // 设置用于输入提示的数据列表
        autoCompleteTextView.setAdapter(adapter);


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplication(), R.layout.activity_sub_auto_complete_text_view_item, strings);
        autoCompleteTextView.setAdapter(adapter);
    }
}