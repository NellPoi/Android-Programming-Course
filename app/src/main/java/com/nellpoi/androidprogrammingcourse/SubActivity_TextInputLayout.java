package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SubActivity_TextInputLayout extends AppCompatActivity {
    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_text_input_layout);

        textInputLayout = findViewById(R.id.textinputlayout);
        textInputEditText = findViewById(R.id.textinputedittext);

        check();
    }

    private void check() {
        textInputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // todo 输入文本之前
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // todo 输入文本时
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // todo 输入文本后
                // 如果输入的文本长度大于10或者小于6 提示错误
                if (textInputEditText.getText().toString().length() > 10 || textInputEditText.getText().toString().length() < 6) {
                    textInputLayout.setError("密码应为6-10位");
                } else {
                    textInputLayout.setError("");
                }
            }
        });
    }
}