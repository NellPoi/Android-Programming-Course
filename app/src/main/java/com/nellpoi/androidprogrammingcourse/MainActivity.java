package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView myListview;
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListview = findViewById(R.id.demo_list);
        list.add("LinearLayout 布局（线性布局）");
        list.add("TableLayout 布局（表格布局）");
        list.add("RelativeLayout 布局（相对布局）");
        list.add("ConstraintLayout 布局（约束布局）");
        list.add("Guideline 基准线");
        list.add("ListView 列表视图");
        list.add("Spinner 下拉列表框");
        list.add("Android 应用资源");
        list.add("StateListDrawable 资源");
        list.add("单击事件、Toast（提示信息框)");
        list.add("单选按钮和复选按钮");
        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, list);
        myListview.setAdapter(myArrayAdapter);
        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
                if (list.get(arg2).equals("LinearLayout 布局（线性布局）")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_LinearLayout.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("TableLayout 布局（表格布局）")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_TableLayout.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("RelativeLayout 布局（相对布局）")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_RelativeLayout.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("ConstraintLayout 布局（约束布局）")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_ConstraintLayout.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("Guideline 基准线")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_Guideline.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("ListView 列表视图")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_ListView.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("Spinner 下拉列表框")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_Spinner.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("Android 应用资源")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_Resources.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("StateListDrawable 资源")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_StateListDrawable.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("单击事件、Toast（提示信息框)")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_Toast.class);
                    startActivity(intent);
                }

                if (list.get(arg2).equals("单选按钮和复选按钮")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, SubActivity_Radiobutton_And_CheckBox.class);
                    startActivity(intent);
                }
            }
        });
    }

}