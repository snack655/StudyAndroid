package com.example.problem08;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 100;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText_Id = findViewById(R.id.E_id);
        EditText editText_Pw = findViewById(R.id.E_password);

        Button Login_btn = findViewById(R.id.Login_Btn);
        Login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText_Id.getText().toString().equals("") || editText_Pw.getText().toString().equals("")) {
                    //Toast 만약 ID와 PW가 비었다면
                    Toast.makeText(MainActivity.this, "ID와 PW를 입력해주세요", Toast.LENGTH_SHORT).show();
                } else {
                    //둘 다 차있다면 MENU 화면으로 넘기기
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivityForResult(intent, REQUEST_CODE_MENU);
                }
            }
        });
    }
}