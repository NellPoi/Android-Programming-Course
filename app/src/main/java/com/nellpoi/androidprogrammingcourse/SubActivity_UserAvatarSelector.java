package com.nellpoi.androidprogrammingcourse;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class SubActivity_UserAvatarSelector extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_user_avatar_selector);

        Toast.makeText(getApplicationContext(), "点击头像以更改头像", Toast.LENGTH_LONG).show();
        imageView = findViewById(R.id.avatar_img);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity_UserAvatarSelector_Gallery.class);
                startActivityForResult(intent, 0x01);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0x01 && resultCode == 0x02) {
            imageView = findViewById(R.id.avatar_img);
            imageView.setImageTintList(null);
            imageView.setPadding(0, 0, 0, 0);
            imageView.setImageResource(data.getIntExtra("avatar", 0));
        } else {
            Toast.makeText(getApplicationContext(), "请求码不正确，不做任何操作", Toast.LENGTH_SHORT).show();
        }
    }

    public void back(View view) {
        finish();
    }
}