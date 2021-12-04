package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity_StartActivityForResult_Finish extends AppCompatActivity {
    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_start_activity_for_result_finish);

        textView1 = findViewById(R.id.commit_content);//评论内容
        final Intent intent = getIntent();
        textView1.setText(intent.getStringExtra("第一界面的值"));
        /*
         * 修改评论的点击事件
         * */
        textView2 = findViewById(R.id.sub_click);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                 * 构建一个提示框用来给用户修改评论
                 * */
                AlertDialog.Builder builder = new AlertDialog.Builder(SubActivity_StartActivityForResult_Finish.this);
                builder.setTitle("修改评论：");
                View dialogView = View.inflate(SubActivity_StartActivityForResult_Finish.this, R.layout.activity_sub_start_activity_for_result_finish_dialogview, null);
                builder.setView(dialogView);
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText = dialogView.findViewById(R.id.commit_change);
                        intent.putExtra("第二个界面的值", editText.getText().toString());
                        setResult(0x02, intent);
                        Toast.makeText(getApplication(), "提交成功!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
                builder.show();
            }
        });
    }

    public void back(View view) {
        finish();
    }
}