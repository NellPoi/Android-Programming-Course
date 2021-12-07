package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubActivity_UserAvatarSelector_Gallery extends AppCompatActivity {
    int currentImage = R.drawable.activity_sub_user_avatar_selector_test;
    GridView gridView;
    int[] ints = new int[]{
            R.drawable.activity_sub_user_avatar_selector_img1,
            R.drawable.activity_sub_user_avatar_selector_img2,
            R.drawable.activity_sub_user_avatar_selector_img3,
            R.drawable.activity_sub_user_avatar_selector_img4,
            R.drawable.activity_sub_user_avatar_selector_img5,
            R.drawable.activity_sub_user_avatar_selector_img6,
            R.drawable.activity_sub_user_avatar_selector_img7,
            R.drawable.activity_sub_user_avatar_selector_img8,
            R.drawable.activity_sub_user_avatar_selector_img9,
            R.drawable.activity_sub_user_avatar_selector_test
    };
    Intent intent;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_user_avatar_selector_gallery);

        gridView = findViewById(R.id.gridview);
        List<Map<String, Object>> mapList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("image", ints[i]);
            mapList.add(map);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(getApplication(), mapList, R.layout.activity_sub_user_avatar_selector_gallery_item, new String[]{"image"}, new int[]{R.id.item});
        gridView.setAdapter(simpleAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                builder = new AlertDialog.Builder(SubActivity_UserAvatarSelector_Gallery.this);
                currentImage = ints[i];
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setImageResource(currentImage);
                builder.setTitle("更换头像");
                builder.setView(imageView);
                builder.setPositiveButton("设为头像", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i1) {
                        ImageView imageView1;
                        imageView1 = findViewById(R.id.current_picture);
                        imageView1.setImageResource(currentImage);
                        intent = getIntent();
                        intent.putExtra("avatar", ints[i]);
                        setResult(0x02, intent);
                        Toast.makeText(getApplicationContext(), "设置成功", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });
    }

}