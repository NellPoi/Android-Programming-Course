package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubActivity_Intent_ACTION_DIAL extends AppCompatActivity {
    GridView gridView;
    SimpleAdapter simpleAdapter;
    String[] strings = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
    String[] strings2 = new String[]{"∞", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "", "+", ""};
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_intent_action_dial);
        gridView = findViewById(R.id.gridview);

        editText = findViewById(R.id.edit);
        List<Map<String, String>> mapList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            Map<String, String> map = new HashMap<>();
            map.put("num", strings[i]);
            map.put("b", strings2[i]);
            mapList.add(map);
        }
        simpleAdapter = new SimpleAdapter(getApplicationContext(), mapList, R.layout.activity_sub_intent_action_dial_simple_adapter_item, new String[]{"num", "b"}, new int[]{R.id.text1, R.id.text2});
        gridView.setAdapter(simpleAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editText.setText(editText.getText().append(strings[i]));
            }
        });
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                Toast.makeText(getApplication(), "🆑", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void call(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + editText.getText().toString()));
        startActivity(intent);
    }
}