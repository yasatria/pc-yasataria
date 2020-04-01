package com.example.pc_yasataria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    private ArrayList<String> gambarWarna = new ArrayList<>();
    private ArrayList<String> inspirasiWarna = new ArrayList<>();
    private ArrayList<String> hexWarna = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getData();

    }

    private void getData() {

        gambarWarna.add("@andoid:drawable/red.jpg");
        inspirasiWarna.add("inspiration 1");


        gambarWarna.add("@andoid:drawable/red.jpg");
        inspirasiWarna.add("inspiration 2");


        gambarWarna.add("@andoid:drawable/red.jpg");
        inspirasiWarna.add("inspiration 3");

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.rv_ins);
        DetailAdapter adapter = new DetailAdapter(gambarWarna, inspirasiWarna, hexWarna,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
