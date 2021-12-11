package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SubActivity_Toolbar extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_toolbar);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.ic_baseline_android_24);
        toolbar.setTitle("智慧城市");
        toolbar.setSubtitle("Smart City");
        toolbar.setNavigationIcon(R.drawable.bar_back);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
//                return false;
                String string = "你还没有选择哦！";
                switch (item.getItemId()) {
                    case R.id.item1:
                        string = "你选择了" + item.getTitle();
                    case R.id.item2:
                        string = "你选择了" + item.getTitle();
                    case R.id.item3:
                        string = "你选择了" + item.getTitle();
                }
                Toast.makeText(getApplicationContext(), string, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.activity_sub_toolbar_menu, menu);
        return true;
    }
}