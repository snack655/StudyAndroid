package org.techtown.dandi_assignment;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton goBasket;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goBasket = findViewById(R.id.Go_basket);
        goBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BasketActivity.class);
                startActivity(intent);
            }
        });


        // 리싸이클러 뷰 기본 설정
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        MenuAdapter adapter = new MenuAdapter();
        adapter.addItem(new Menu("후라이드 치킨", "12000", getDrawable(R.drawable.chicken_h)));
        adapter.addItem(new Menu("양념 치킨", "13000", getDrawable(R.drawable.chicken_s)));
        adapter.addItem(new Menu("간장 치킨", "14000", getDrawable(R.drawable.chicken_g)));
        adapter.addItem(new Menu("감자 튀김", "1500", getDrawable(R.drawable.potato_chip)));
        adapter.addItem(new Menu("치즈볼", "2000", getDrawable(R.drawable.cheeze_ball)));

        recyclerView.setAdapter(adapter);



    }
}