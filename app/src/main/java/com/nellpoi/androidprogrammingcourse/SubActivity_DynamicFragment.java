package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SubActivity_DynamicFragment extends AppCompatActivity {

    Button button;
    LinearLayout linearLayout;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_dynamic_fragment);

        button = findViewById(R.id.dynamicfragment_body_btn);
        linearLayout = findViewById(R.id.dynamicfragment_body);

        fragmentManager = getSupportFragmentManager();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Resources resources = getResources();
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(resources.getDisplayMetrics().widthPixels / 3, resources.getDisplayMetrics().heightPixels));

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.dynamicfragment_root, new SubActivity_DynamicFragment_Load());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });


    }
}