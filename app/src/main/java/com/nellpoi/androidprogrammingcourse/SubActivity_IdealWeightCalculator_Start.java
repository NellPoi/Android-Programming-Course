package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;


public class SubActivity_IdealWeightCalculator_Start extends AppCompatActivity {
    Button button;
    EditText editText;
    RadioButton radioButton1, radioButton2;
    String sex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_ideal_weight_calculator_start);

        editText = findViewById(R.id.edit1);
        radioButton1 = findViewById(R.id.radiobutton1);
        radioButton2 = findViewById(R.id.radiobutton2);
        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("") |
                        (radioButton1.isChecked() == false & radioButton2.isChecked() == false)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SubActivity_IdealWeightCalculator_Start.this);
                    builder.setTitle("你还没有选择你的信息哦");
                    builder.setMessage("请检查有没有选择性别，或者是否填入了您的身高");
                    builder.setIcon(R.drawable.ic_baseline_error_outline_24);
                    builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.show();
                } else {
                    Intent intent = new Intent(getApplication(), SubActivity_IdealWeightCalculator_Finish.class);
                    if (radioButton1.isChecked()) {
                        sex = "男";
                    } else {
                        sex = "女";
                    }
                    intent.putExtra("sex", sex);
                    intent.putExtra("height", Integer.parseInt(editText.getText().toString()));
                    startActivity(intent);
                }

            }
        });

    }
}