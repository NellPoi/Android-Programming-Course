package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SubActivity_ArrayAdapter extends AppCompatActivity {
    ListView listView;
    String[] strings = new String[]{"values-mcc208-mnc10-fr", "values-mcc204", "values-mcc302-mnc370-am", "values-b+es+419", "values-mcc310-mnc530", "layout-sw600dp-v13", "values-mcc302-mnc370-am", "values-mcc208-mnc10-fr", "values-b+es+419", "values-mcc208-mnc10-fr"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_array_adapter);
        listView = findViewById(R.id.listview1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplication(), R.layout.activity_sub_array_adapter_item, strings);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplication(), "点击了第" + i + "个\n" + strings[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}