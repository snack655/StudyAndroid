package com.example.problem06;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressDialog dialog;
    SeekBar seekBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar progressBar = findViewById(R.id.progressBar);
        progressBar.setIndeterminate(false);
        // 불확정적(indeterminate) 상태 표시 모드는 단어 의미 그대로,
        // 작업의 진행 단계 결정 또는 완료 시점이
        // 확정되지 않은 경우 사용하는 모드입니다.
        // 즉, 작업 진행이 언제 완료될 것인지를 정확한 수치 또는 범위 값으로
        // 계산할 수 없는 경우를 말하는 것이죠.
        progressBar.setProgress(0);

        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textView = findViewById(R.id.textView);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar.setProgress(progress);
                textView.setText(""+progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}