package com.nellpoi.androidprogrammingcourse;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity_StartActivityForResult_Start extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_start_activity_for_result_start);
        button = findViewById(R.id.button_submit);
        editText = findViewById(R.id.edit_commit);
        textView = findViewById(R.id.commit_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(SubActivity_StartActivityForResult_Start.this);
                    builder.setTitle("评论要求1个字以上");
                    builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.setIcon(R.drawable.ic_baseline_error_outline_24);
                    builder.show();
                } else {
                    Intent intent = new Intent(getApplication(), SubActivity_StartActivityForResult_Finish.class);
                    intent.putExtra("第一界面的值", editText.getText().toString());
                    startActivityForResult(intent, 0x01);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        //判断请求码、结果码
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0x01 && resultCode == 0x02) {
            String result = data.getStringExtra("第二个界面的值");
            textView.setText(result);
        }
    }

}