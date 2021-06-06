package org.techtown.dandi_assignment;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BasketActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        AppCompatButton goBack = findViewById(R.id.go_Back);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        
        
        //리사이클러뷰 사용
        RecyclerView recyclerView2 = findViewById(R.id.recyclerView2);

        recyclerView2.setHasFixedSize(true);

        LinearLayoutManager B_layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(B_layoutManager);
        BasketAdapter basketadapter = new BasketAdapter();
        int basketcount = R.id.tvCount;
        basketadapter.addItem(new Basket("후라이드 치킨", "12000", getDrawable(R.drawable.chicken_h), basketcount));
        basketadapter.addItem(new Basket("양념 치킨", "13000", getDrawable(R.drawable.chicken_s), basketcount));
        basketadapter.addItem(new Basket("간장 치킨", "14000", getDrawable(R.drawable.chicken_g), basketcount));
        basketadapter.addItem(new Basket("감자 튀김", "1500", getDrawable(R.drawable.potato_chip), basketcount));
        basketadapter.addItem(new Basket("치즈볼", "2000", getDrawable(R.drawable.cheeze_ball), basketcount));

        recyclerView2.setAdapter(basketadapter);
        
    }
}