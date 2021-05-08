package com.example.problem08;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_MAIN_MENU = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button client_btn = findViewById(R.id.Client_Btn);
        Button sales_btn = findViewById(R.id.Sales_Btn);
        Button item_btn = findViewById(R.id.Item_Btn);

        client_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ClientActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MAIN_MENU);
            }
        });

        sales_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SalesActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MAIN_MENU);
            }
        });

        item_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ItemActivity.class);
                startActivityForResult(intent, REQUEST_CODE_MAIN_MENU);
            }
        });
        Intent intent = getIntent();
        processintent(intent);
    }
    private processintent(intent) {

    }
}