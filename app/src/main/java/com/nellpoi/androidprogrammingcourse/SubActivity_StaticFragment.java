package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubActivity_StaticFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_static_fragment);

        ListView listView = findViewById(R.id.mylistview);
        FragmentManager fragmentManager;

        String[] strings_title = new String[]{"连接", "声音和震动", "通知", "显示", "壁纸", "主题", "主屏幕", "锁定屏幕"};
        String[] strings_content = new String[]{"WLAN", "声音模式", "通知弹出窗口风格", "黑暗模式设置", "特色壁纸和已下载壁纸", "推荐主题", "主屏幕布局", "锁定屏幕"};

        List<Map<String, Object>> mapList = new ArrayList<>();
        for (int i = 0; i < strings_title.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", strings_title[i]);
            mapList.add(map);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(
                getApplicationContext(),
                mapList,
                R.layout.activity_sub_static_fragment_item,
                new String[]{"name"},
                new int[]{R.id.item_text}
        );
        listView.setAdapter(simpleAdapter);

        fragmentManager = getSupportFragmentManager();
        SubActivity_StaticFragment_Load subActivity_staticFragment_load = (SubActivity_StaticFragment_Load) fragmentManager.findFragmentById(R.id.myfragment);
        TextView textView = subActivity_staticFragment_load.getView().findViewById(R.id.textView9);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(strings_content[i]);
            }
        });

    }
}