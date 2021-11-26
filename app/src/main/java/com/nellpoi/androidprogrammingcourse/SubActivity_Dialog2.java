package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubActivity_Dialog2 extends AppCompatActivity {
    String[] strings = new String[]{"Chrome", "文件", "编辑", "视图", "历史记录", "书签", "个人资料", "标签页", "窗口", "帮助"};
    boolean[] booleans = new boolean[]{true, false, true, false, true, false, true, false, true, false};
    String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_dialog2);
    }

    public void dialog1(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SubActivity_Dialog2.this);
        builder.setTitle("标题");
        builder.setMultiChoiceItems(strings, booleans, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                booleans[i] = b;
            }
        });
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                for (int j = 0; j < booleans.length; j++) {
                    if (booleans[j] == true) {
                        string += "\n" + strings[j];
                    }
                }
                Toast.makeText(getApplication(), "你点击了：" + string, Toast.LENGTH_SHORT).show();
                string = "";
            }
        });
        builder.show();
    }

    public void dialog2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SubActivity_Dialog2.this);
        builder.setTitle("自定义对话框");
        final String[] strings = new String[]{"1", "2", "3"};
        int[] ints = new int[]{R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24, R.drawable.ic_baseline_android_24};
        SimpleAdapter simpleAdapter;
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
        builder.setAdapter(simpleAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplication(), "点击了" + strings[i], Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
}