package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMainActivity_LinearLayout(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_LinearLayout.class);
        startActivity(intent);
    }

    public void startMainActivity_TableLayout(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_TableLayout.class);
        startActivity(intent);
    }

    public void startMainActivity_RelativeLayout(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_RelativeLayout.class);
        startActivity(intent);
    }
}