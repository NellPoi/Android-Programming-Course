package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SubActivity_Radiobutton_And_CheckBox extends AppCompatActivity {
    /*
     * 将设置为全局
     * */
    RadioGroup radioGroup;
    Button button;
    Button button1;

    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_radiobutton_and_check_box);

        /*
         * 初始化所引用的控件
         * */
        initView();
        /*
         * 为第一个按钮创建事件
         * 选择任意一性别并对单选框做出选择，再点击提交按钮向用户发送Toast告诉选择了什么。
         * */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "";// 声明一个字符串变量值为空，用来等会存储用户具体选择的内容
                for (int i = 0; i < radioGroup.getChildCount(); i++) {
                    /*
                     * 将父容器 RadioGroup 的所有子元素 RadioButton 取出来
                     * */
                    RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);// 为每一个单选按钮实例化
                    if (radioButton.isChecked()) {// 如果按钮为选中
                        str = radioButton.getText().toString();
                        break;
                    }
                }
                Toast.makeText(SubActivity_Radiobutton_And_CheckBox.this, str, Toast.LENGTH_SHORT).show();// 向用户发送Toast通知，内容为用户选中的内容
            }
        });
        /*
         * 为第二个按钮创建事件
         * */
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "";// 声明一个字符串变量值为空，用来等会存储用户具体选择的内容
                /*
                 * 定义一个数组，将全部 CheckBox 整合起来，目的是为了和上面第一个按钮一样能够遍历去找到被选中的按钮
                 * */
                CheckBox[] checkBoxes = new CheckBox[]{checkBox1, checkBox2, checkBox3, checkBox4};
                for (int i = 0; i < checkBoxes.length; i++) {
                    if (checkBoxes[i].isChecked()) {
                        str += checkBoxes[i].getText().toString();
                    }
                }
                Toast.makeText(SubActivity_Radiobutton_And_CheckBox.this, str, Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*
     * 因为引用的视图比较多，所以这里写一个方法，将所有的引用全部放在这个方法类
     * 且因为 CheckBox 没有 Group ，所以更需要都写在这里
     * */
    private void initView() {
        radioGroup = findViewById(R.id.radioGroup2);
        button = findViewById(R.id.btn_submit);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox1);
        checkBox3 = findViewById(R.id.checkBox2);
        checkBox4 = findViewById(R.id.checkBox3);
        button1 = findViewById(R.id.btn_submit2);
    }
}
