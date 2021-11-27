package com.nellpoi.androidprogrammingcourse;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity_Notification extends AppCompatActivity {
    EditText editText1, editText2;
    Button button1, button2;
    //通知管理器
    NotificationManager notificationManager;
    //通知的通道
    String channelID_Default = "ID_1";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_notification);
        button1 = findViewById(R.id.btn_submit);
        button2 = findViewById(R.id.btn_cancel);
        editText1 = findViewById(R.id.edit_title);
        editText2 = findViewById(R.id.edit_content);

        //获取通知管理器
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        //创建通知的通道
        NotificationChannel notificationChannel = new NotificationChannel(channelID_Default, "channel_default", NotificationManager.IMPORTANCE_HIGH);
        //为通知管理器添加通道
        notificationManager.createNotificationChannel(notificationChannel);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //定义 Notification.Builder
                Notification.Builder builder = new Notification.Builder(SubActivity_Notification.this, channelID_Default);
                builder.setContentTitle(editText1.getText().toString());
                builder.setContentText(editText2.getText().toString());
                builder.setSmallIcon(R.drawable.ic_baseline_android_24);
                //管理器启动通知
                notificationManager.notify(0x01, builder.build());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationManager.cancelAll();
            }
        });

    }
}