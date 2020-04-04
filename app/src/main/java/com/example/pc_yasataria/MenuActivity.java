package com.example.pc_yasataria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.pc_yasataria.adapter.DetailAdapter;
import com.example.pc_yasataria.model.ItemsModel;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {


//    private ArrayList<String> gambarWarna = new ArrayList<>();
//    private ArrayList<String> inspirasiWarna = new ArrayList<>();
//    private ArrayList<String> hexWarna = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_menu);

//        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//
//        List<ItemsModel> model = new ArrayList<>();
//        model.add(new ItemsModel("https://i.pinimg.com/564x/60/02/3c/60023c6c57359426b480e9600efcacd4.jpg","palette 1","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/fa/cc/59/facc5928086ca9bfc704ecac05fec2af.jpg","palette 2","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/cc/8a/61/cc8a61a34bbc4153c198c1e8899ac420.jpg","palette 3","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/49/be/30/49be30be9c967993d44168fb455bfc98.jpg","palette 4","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/f3/92/8e/f3928e7d617edf0135475c9e3de90469.jpg","palette 5","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/fa/da/7a/fada7a3f0af08d2aa07b18054f0bb2ad.jpg","palette 6","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/09/ba/a7/09baa7b1ad14168dac19aef0116cf4d5.jpg","palette 7","#FFFFFF"));
//        model.add(new ItemsModel("https://i.pinimg.com/564x/a7/91/bc/a791bc03b3c8e5f542dc5a157161b305.jpg","palette 8","#FFFFFF"));
//
//        DetailAdapter adapter = new DetailAdapter(model,this);
//        recyclerView.setAdapter(adapter);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
    }

    public void handlePallete1(View view) {
        Intent intent = new Intent(this,Pallete1Activity.class);
        startActivity(intent);
    }

//    private void prosesRecyclerViewAdapter(){
//        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//
//        DetailAdapter adapter = new DetailAdapter(gambarWarna, inspirasiWarna, hexWarna,this);
//
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//    }
//
//    private void getData() {
//
//        gambarWarna.add("@android:drawable/red.jpg");
//        inspirasiWarna.add("inspiration 1");
//        hexWarna.add("#FFFFFF");
//
//
//        gambarWarna.add("@android:drawable/red.jpg");
//        inspirasiWarna.add("inspiration 2");
//        hexWarna.add("#FFFFFF");
//
//
//        gambarWarna.add("@android:drawable/red.jpg");
//        inspirasiWarna.add("inspiration 3");
//        hexWarna.add("#FFFFFF");
//
//        prosesRecyclerViewAdapter();
//    }
}
