package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity_Intent_Extra_Finish extends AppCompatActivity {
    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_intent_extra_finish);

        Intent intent = getIntent();
        String username = intent.getStringExtra("user");
        String pwd = intent.getStringExtra("pwd");
        textView1 = findViewById(R.id.info_user);
        textView2 = findViewById(R.id.info_pwd);
        textView1.setText(username);
        textView2.setText(pwd);
    }
}