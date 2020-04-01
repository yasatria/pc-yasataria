package com.example.pc_yasataria;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.example.pc_yasataria.model.ItemsModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder>{

    private List<ItemsModel> items;
    private Context context;

    public DetailAdapter(List<ItemsModel> items, Context context) {
        this.items = items;
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
        final ItemsModel item = items.get(position);
        holder.text_ins.setText(item.getInspirasi());
        holder.adapter_layout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("gambar_warna",item.getGambar());
                intent.putExtra("hex_warna",item.getHex());
                context.startActivity(intent);
            }
        });
        Picasso.get().load(item.getGambar()).into(holder.img_color);
//        Glide.with(context).asBitmap().load(gambarWarna.get(position)).into(holder.img_color);
//       holder.text_ins.setText(inspirasiWarna.get(position));
//
//        holder.adapter_layout.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                //menampilkan tulisan
//                //Toast.makeText(context, namaMakanan.get(position), Toast.LENGTH_LONG).show();
//
//                Intent intent = new Intent(context, DetailActivity.class);
//
//                intent.putExtra("gambar warna", gambarWarna.get(position));
//                intent.putExtra("hex warna", hexWarna.get(position));
//
//                context.startActivity(intent);
//
//            }
//        });

    }

    @Override
    public int getItemCount()  {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_color;
        TextView text_ins;
        CardView adapter_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_color = itemView.findViewById(R.id.img_color);
            text_ins = itemView.findViewById(R.id.text_ins);
            adapter_layout = itemView.findViewById(R.id.adapter_layout);
        }
    }
}