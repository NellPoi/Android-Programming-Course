package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    /*
     * 注册列表内容，行为为全局，方便调用，减少代码量
     * */
    private ListView myListview;
    private ArrayList<String> list = new ArrayList<String>();
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent();// 初始化意图，用于传递点击事件
        /*
         * 全部子窗体列表名称，用于打开
         * */
        String[] activitiesName = new String[]{
                "LinearLayout 布局（线性布局）",
                "TableLayout 布局（表格布局）",
                "RelativeLayout 布局（相对布局）",
                "ConstraintLayout 布局（约束布局）",
                "Guideline 基准线",
                "ListView 列表视图",
                "Spinner 下拉列表框",
                "Android 应用资源",
                "StateListDrawable 资源",
                "单击事件、Toast（提示信息框)",
                "单选按钮和复选按钮",
                "ProgressBar（进度条）、SeekBar（拖动条）"
        };
        /* 自启事件 */
        startActivity(intent.setClass(MainActivity.this, SubActivity_ProgressBarAndSeekBar.class));

        myListview = findViewById(R.id.demo_list);
        /*
         * 将全部activities注入ListView
         * */
        for (String i :
                activitiesName) {
            Log.e("NellPoi：", "创建了: " + i + " 窗体");
            list.add(i);
        }
        Toast.makeText(this, "加载完成，共加载" + Arrays.stream(activitiesName).count() + "个窗体", Toast.LENGTH_LONG).show();


        /*
         * 实例化适配器
         * */
        ArrayAdapter<String> myArrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, list);
        myListview.setAdapter(myArrayAdapter);
        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View arg1, int arg2, long arg3) {
                if (list.get(arg2).equals("LinearLayout 布局（线性布局）")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_LinearLayout.class));
                }

                if (list.get(arg2).equals("TableLayout 布局（表格布局）")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_TableLayout.class));
                }

                if (list.get(arg2).equals("RelativeLayout 布局（相对布局）")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_RelativeLayout.class));
                }

                if (list.get(arg2).equals("ConstraintLayout 布局（约束布局）")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_ConstraintLayout.class));
                }

                if (list.get(arg2).equals("Guideline 基准线")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_Guideline.class));
                }

                if (list.get(arg2).equals("ListView 列表视图")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_ListView.class));
                }

                if (list.get(arg2).equals("Spinner 下拉列表框")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_Spinner.class));
                }

                if (list.get(arg2).equals("Android 应用资源")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_Resources.class));
                }

                if (list.get(arg2).equals("StateListDrawable 资源")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_StateListDrawable.class));
                }

                if (list.get(arg2).equals("单击事件、Toast（提示信息框)")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_Toast.class));
                }

                if (list.get(arg2).equals("单选按钮和复选按钮")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_Radiobutton_And_CheckBox.class));
                }
                if (list.get(arg2).equals("ProgressBar（进度条）、SeekBar（拖动条）")) {
                    startActivity(intent.setClass(MainActivity.this, SubActivity_ProgressBarAndSeekBar.class));
                }
            }
        });
    }

}