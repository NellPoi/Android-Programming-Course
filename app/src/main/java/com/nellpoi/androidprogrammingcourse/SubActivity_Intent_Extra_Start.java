package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity_Intent_Extra_Start extends AppCompatActivity {
    EditText editText_User, editText_Pwd;
    Button button_login;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_intent_extra_start);

        editText_User = findViewById(R.id.input_user);
        editText_Pwd = findViewById(R.id.input_password);
        button_login = findViewById(R.id.btn_login);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity_Intent_Extra_Finish.class);
                intent.putExtra("user", editText_User.getText().toString());
                intent.putExtra("pwd", editText_Pwd.getText().toString());
                startActivity(intent);
            }
        });
        textView = findViewById(R.id.link_signup);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText_User.setText("test01");
                editText_Pwd.setText("123456");
                Toast.makeText(getApplicationContext(), "ok，帮你创建好了！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}