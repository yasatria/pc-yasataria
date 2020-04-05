package com.example.pc_yasataria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.pc_yasataria.adapter.DetailAdapter;
import com.example.pc_yasataria.model.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class Pallete3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pallete3);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("https://www.colorhexa.com/512c96.png","#512C96","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/3c6f9c.png","#3C6F9C","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/dd6892.png","#DD6892","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/f9c6ba.png","#F9C6BA","#FFFFFF"));


        DetailAdapter adapter = new DetailAdapter(model,this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
