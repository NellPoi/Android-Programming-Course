package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class SubActivity_Dialog1 extends AppCompatActivity {
    String[] strings = new String[]{"访达", "文件", "编辑", "显示", "前往", "窗口", "帮助"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_dialog1);

    }


    public void dialog1(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SubActivity_Dialog1.this);
        builder.setTitle("简单对话框");
        builder.setMessage("简单对话框的内容");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplication(), "你点击了确定事件", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplication(), "你点击了取消事件", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("帮助", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplication(), "你点击了帮助", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void dialog2(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SubActivity_Dialog1.this);
        builder.setTitle("列表项对话框");
//        builder.setMessage("列表项对话框内容");
        builder.setItems(strings, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplication(), "你点击了：" + strings[i], Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void dialog3(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(SubActivity_Dialog1.this);
        builder.setTitle("单选项对话框");
        builder.setSingleChoiceItems(strings, 1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplication(), "你点击了：" + i, Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton("帮助", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplication(), "你点击了帮助", Toast.LENGTH_SHORT);
            }
        });
        builder.show();
    }
}