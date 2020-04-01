package com.example.pc_yasataria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {


    ImageView img_color;
    TextView text_hex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_detail);

        img_color = findViewById(R.id.img_color);
        text_hex = findViewById(R.id.text_hex);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        if (getIntent().hasExtra("gambar_warna") && getIntent().hasExtra("hex_warna")){

            String gambarWarna = getIntent().getStringExtra("gambar_warna");
            String hexWarna = getIntent().getStringExtra("hex_warna");

            setDataActivity(gambarWarna, hexWarna);
        }
    }

    private void setDataActivity(String gambarWarna, String hexWarna){
        Glide.with(this).asBitmap().load(gambarWarna).into(img_color);

        text_hex.setText(hexWarna);
    }
}
