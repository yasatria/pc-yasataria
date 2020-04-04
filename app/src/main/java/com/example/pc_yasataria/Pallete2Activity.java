package com.example.pc_yasataria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pc_yasataria.adapter.DetailAdapter;
import com.example.pc_yasataria.model.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class Pallete2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pallete2);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("https://www.colorhexa.com/e6f8f9.png","#E6F8F9","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/b1e8ed.png","#B1E8ED","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/edb5f5.png","#EDB5F5","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/e86ed0.png","#E86ED0","#FFFFFF"));


        DetailAdapter adapter = new DetailAdapter(model,this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
