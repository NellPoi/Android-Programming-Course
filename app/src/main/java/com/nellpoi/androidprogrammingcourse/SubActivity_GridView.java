package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubActivity_GridView extends AppCompatActivity {
    GridView gridView;
    SimpleAdapter simpleAdapter;
    String[] strings = new String[]{"File", "Edit", "View", "Navigate", "Code", "Refactor", "Build", "Run", "Tools", "Git", "Window", "Help"};
    int[] ints = new int[]{R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_grid_view);
        gridView = findViewById(R.id.gridview);
        List<Map<String, Object>> mapList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", strings[i]);
            map.put("image", ints[i]);
            mapList.add(map);
        }
        simpleAdapter = new SimpleAdapter(getApplication(), mapList, R.layout.activity_sub_grid_view_item, new String[]{"name", "image"}, new int[]{R.id.text1, R.id.imageView1});
        gridView.setAdapter(simpleAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplication(), "点击了：" + strings[i], Toast.LENGTH_SHORT).show();
                TextView textView = findViewById(R.id.text);
                textView.setText(strings[i]);
            }
        });
    }
}