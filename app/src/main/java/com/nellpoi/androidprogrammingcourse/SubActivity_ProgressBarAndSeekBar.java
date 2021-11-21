package com.nellpoi.androidprogrammingcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class SubActivity_ProgressBarAndSeekBar extends AppCompatActivity {
    ImageView imageView;
    SeekBar seekBar, seekBar2;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_progress_bar_and_seek_bar);

        imageView = findViewById(R.id.imageView5);
        seekBar = findViewById(R.id.seekBar);
        seekBar2 = findViewById(R.id.seekBar2);
        progressBar = findViewById(R.id.progressBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                /* 进度值改变 */
                Log.e("NellPoi：", "[S1] onProgressChanged: " + i);
                progressBar.setProgress(i);
                imageView.setImageAlpha(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                /* 按下 */
                Log.e("NellPoi：", "[S1] onStartTrackingTouch: ");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                /* 松开 */
                Log.e("NellPoi：", "[S1] onStopTrackingTouch: ");

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                /* 进度值改变 */
                Log.e("NellPoi：", "[S2] onProgressChanged: " + i);
                progressBar.setProgress((int) (i * 25.5));
                imageView.setImageAlpha((int) (i * 25.5));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                /* 按下 */
                Log.e("NellPoi：", "[S2] onStartTrackingTouch: ");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                /* 松开 */
                Log.e("NellPoi：", "[S2] onStopTrackingTouch: ");
            }
        });
    }
}