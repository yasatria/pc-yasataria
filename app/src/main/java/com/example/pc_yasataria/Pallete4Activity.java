package com.example.pc_yasataria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pc_yasataria.adapter.DetailAdapter;
import com.example.pc_yasataria.model.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class Pallete4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pallete4);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("https://www.colorhexa.com/f73f52.png","#F73F52","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/ffea85.png","#FFEA85","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/f6f6f6.png","#F6F6F6","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/7986c7.png","#7986C7","#FFFFFF"));


        DetailAdapter adapter = new DetailAdapter(model,this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
