package org.techtown.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        PersonAdapter adapter = new PersonAdapter();

        adapter.addItem(new Person("김민수", "010-1000-1000"));
        adapter.addItem(new Person("김하늘", "010-2000-2000"));
        adapter.addItem(new Person("홍길동", "010-3000-3000"));
        adapter.addItem(new Person("최민재", "010-3000-3000"));
        adapter.addItem(new Person("우준성", "010-3000-3000"));
        adapter.addItem(new Person("우상범", "010-3000-3000"));
        adapter.addItem(new Person("이경태", "010-3000-3000"));
        adapter.addItem(new Person("이주훈", "010-3000-3000"));
        adapter.addItem(new Person("배진영", "010-3000-3000"));
        adapter.addItem(new Person("기준", "010-3000-3000"));
        adapter.addItem(new Person("금현호", "010-3000-3000"));

        recyclerView.setAdapter(adapter);
    }
}