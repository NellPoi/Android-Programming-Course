package com.nellpoi.androidprogrammingcourse;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationView;

public class SubActivity_NavigationView extends AppCompatActivity {
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_navigation_view);

        navigationView = findViewById(R.id.nav);
        navigationView.setItemIconTintList(null);

        View view = navigationView.getHeaderView(0);
        ImageView imageView = view.findViewById(R.id.imageView10);
        TextView textView = view.findViewById(R.id.textView11);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "你点击了" + textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SubActivity_NavigationView.this, "你点击了头部位置", Toast.LENGTH_SHORT).show();
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Toast.makeText(getApplicationContext(), "你点击了" + menuItem.getTitle().toString(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}