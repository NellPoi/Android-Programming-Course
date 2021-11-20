package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SubActivity_Toast extends AppCompatActivity {
    /*
     * 定义为全局变量
     * */
    EditText userName;
    Button login, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_toast);

        /*
          查找指定视图：
          用户名输入框，登陆按钮，取消按钮
          */
        userName = findViewById(R.id.edit);
        login = findViewById(R.id.btn1);
        cancel = findViewById(R.id.btn2);

        /*
         * 为按钮设置点击事件
         * 并使按钮发出Toast通知，
         * 登陆按钮点击事件为用户名输入框输入的内容，取消按钮点击事件为显示普通信息
         * */
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                 * 发送Toast通知，通知内容为用户名输入框输入的内容，显示持续时间为短
                 * */
                Toast.makeText(SubActivity_Toast.this, userName.getText().toString(), Toast.LENGTH_LONG).show();

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                 * 发送Toast通知，通知内容为退出登录，显示持续时间为长
                 * */
                Toast.makeText(SubActivity_Toast.this, "退出登录", Toast.LENGTH_SHORT).show();
            }
        });
    }
}