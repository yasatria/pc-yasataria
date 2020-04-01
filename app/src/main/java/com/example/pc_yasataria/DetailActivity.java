package com.example.pc_yasataria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView img_color;
    TextView text_hex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img_color = findViewById(R.id.img_color);
        text_hex = findViewById(R.id.text_hex);

        getIncomingExtra();
    }

    private void getIncomingExtra() {
        if (getIntent().hasExtra("gambar warna") && getIntent().hasExtra("hex warna")){

            String gambarWarna = getIntent().getStringExtra("gambar warna");
            String hexWarna = getIntent().getStringExtra("hex warna");

            setDataActivity(gambarWarna, hexWarna);
        }
    }

    private void setDataActivity(String gambarWarna, String hexWarna){
     Glide.with(this).asBitmap().load(gambarWarna).into(img_color);

        text_hex.setText(hexWarna);
    }
}
