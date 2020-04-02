package com.example.pc_yasataria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pc_yasataria.adapter.DetailAdapter;
import com.example.pc_yasataria.model.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class Palette1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette1);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<ItemsModel> model = new ArrayList<>();
        model.add(new ItemsModel("https://www.colorhexa.com/283149.png","palette 1","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/404b69.png","palette 2","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/f73859.png","palette 3","#FFFFFF"));
        model.add(new ItemsModel("https://www.colorhexa.com/dbedf3.png","palette 4","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/49/be/30/49be30be9c967993d44168fb455bfc98.jpg","palette 4","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/f3/92/8e/f3928e7d617edf0135475c9e3de90469.jpg","palette 5","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/fa/da/7a/fada7a3f0af08d2aa07b18054f0bb2ad.jpg","palette 6","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/09/ba/a7/09baa7b1ad14168dac19aef0116cf4d5.jpg","palette 7","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/a7/91/bc/a791bc03b3c8e5f542dc5a157161b305.jpg","palette 8","#FFFFFF"));

        DetailAdapter adapter = new DetailAdapter(model,this);
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

}
