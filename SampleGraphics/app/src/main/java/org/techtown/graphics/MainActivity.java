package org.techtown.graphics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.techtown.graphics.custom.CustomView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomView view = new CustomView(this);
        setContentView(view);
    }
}