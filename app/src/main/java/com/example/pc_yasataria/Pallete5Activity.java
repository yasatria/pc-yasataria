package com.example.pc_yasataria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.pc_yasataria.adapter.DetailAdapter;
import com.example.pc_yasataria.model.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class Pallete5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pallete5);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("https://www.colorhexa.com/08D9D6.png","#08D9D6","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/252A34.png","#252A34","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/fF2E63.png","#FF2E63","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/EAEAEA.png","#EAEAEA","#FFFFFF"));


        DetailAdapter adapter = new DetailAdapter(model,this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
