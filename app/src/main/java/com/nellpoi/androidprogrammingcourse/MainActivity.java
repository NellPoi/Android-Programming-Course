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
        /**
         * 自动跳转到指定页面
         * */
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_StateListDrawable.class);
        startActivity(intent);
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

    public void startMainActivity_ConstraintLayout(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_ConstraintLayout.class);
        startActivity(intent);
    }

    public void startMainActivity_Guideline(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_Guideline.class);
        startActivity(intent);
    }

    public void startMainActivity_ListView(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_ListView.class);
        startActivity(intent);
    }

    public void startMainActivity_Spinner(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_Spinner.class);
        startActivity(intent);
    }

    public void startMainActivity_Resources(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_Resources.class);
        startActivity(intent);
    }

    public void startMainActivity_StateListDrawable(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SubActivity_StateListDrawable.class);
        startActivity(intent);
    }
}