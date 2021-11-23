//package com.nellpoi.androidprogrammingcourse;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ListView;
//import android.widget.SimpleAdapter;
//import android.widget.Toast;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class SubActivity_SimpleAdapter extends AppCompatActivity {
//    ListView listView;
//    SimpleAdapter adapter;
//    String[] strings = new String[]{"保密设置", "安全", "系统设置", "网络", "我的文档", "导航服务", "我的音乐", "Email"};
//    int[] images = new int[]{R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24};
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sub_simple_adapter);
//        listView = findViewById(R.id.listview1);
//        List<Map<String, Object>> list = new ArrayList<>();
//        for (int i = 0; i < strings.length; i++) {
//            Map<String, Object> map = new HashMap<>();
//            map.put("name", strings[i]);
//            map.put("images", images[i]);
//            list.add(map);
//        }
//        adapter = new SimpleAdapter(getApplication(), list, R.layout.activity_sub_simple_adapter_item, new String[]{"name", "images"}, new int[]{R.id.text1, R.id.imageView1});
//        listView.setAdapter(adapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplication(), "点击了" + strings[i], Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}

package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubActivity_SimpleAdapter extends AppCompatActivity {
    ListView listView;
    SimpleAdapter simpleAdapter;
    String[] strings = new String[]{"保密设置", "安全", "系统设置", "网络", "我的文档", "导航服务", "我的音乐", "Email"};
    /* 声明一个整型数组，用于存放图片。因为安卓中会将图片转换为整型，所以需要声明整型的数组 */
    int[] ints = new int[]{R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24,
            R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_simple_adapter);
        listView = findViewById(R.id.listview1);
        List<Map<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            Map<String, Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("name", strings[i]);
            stringObjectMap.put("images", ints[i]);
            list.add(stringObjectMap);
        }
        simpleAdapter = new SimpleAdapter(getApplication(), list, R.layout.activity_sub_simple_adapter_item,
                new String[]{"name", "images"},
                new int[]{R.id.text1, R.id.imageView1});
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplication(), "选择了" + strings[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}