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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_menu);

    }


    public void handlePallete1(View view) {
        Intent intent = new Intent(this,Pallete1Activity.class);
        startActivity(intent);
    }

    public void handlePallete2(View view) {
        Intent intent = new Intent(this,Pallete2Activity.class);
        startActivity(intent);
    }

    public void handlePallete3(View view) {
        Intent intent = new Intent(this,Pallete3Activity.class);
        startActivity(intent);
    }

    public void handlePallete4(View view) {
        Intent intent = new Intent(this,Pallete4Activity.class);
        startActivity(intent);
    }

    public void handlePallete5(View view) {
        Intent intent = new Intent(this,Pallete5Activity.class);
        startActivity(intent);
    }


}
