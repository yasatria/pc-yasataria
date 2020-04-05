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

public class Pallete1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pallete1);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("https://www.colorhexa.com/283149.png","#283149","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/404b69.png","#404B69","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/f73859.png","#F73859","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/dbedf3.png","#DBEDF3","#FFFFFF"));


        DetailAdapter adapter = new DetailAdapter(model,this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
