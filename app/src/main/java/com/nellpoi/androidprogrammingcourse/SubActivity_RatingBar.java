package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class SubActivity_RatingBar extends AppCompatActivity {
    EditText editText;
    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_rating_bar);
        editText = findViewById(R.id.edit1);
        ratingBar = findViewById(R.id.ratingbar1);
        button = findViewById(R.id.btn_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "评价的内容:" + editText.getText().toString() + "\n评分：" + ratingBar.getRating();
                Toast.makeText(getApplication(), str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}