package com.example.pc_yasataria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder>{

    private ArrayList<String> gambarWarna = new ArrayList<>();
    private ArrayList<String> inspirasiWarna = new ArrayList<>();
    private ArrayList<String> hexWarna = new ArrayList<>();
    private Context context;

    public DetailAdapter(ArrayList<String> gambarWarna, ArrayList<String> inspirasiWarna, ArrayList<String> hexWarna, Context context) {
        this.gambarWarna = gambarWarna;
        this.inspirasiWarna = inspirasiWarna;
        this.hexWarna = hexWarna;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).asBitmap().load(gambarWarna.get(position)).into(holder.img_color);
       holder.text_ins.setText(inspirasiWarna.get(position));

        holder.adapter_layout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //menampilkan tulisan
                //Toast.makeText(context, namaMakanan.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("gambar warna", gambarWarna.get(position));
                intent.putExtra("hex warna", hexWarna.get(position));

                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount()  {
        return inspirasiWarna.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView img_color;
        TextView text_ins;
        ConstraintLayout adapter_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_color = itemView.findViewById(R.id.img_color);
            text_ins = itemView.findViewById(R.id.text_ins);
            adapter_layout = itemView.findViewById(R.id.adapter_layout);
        }
    }
}