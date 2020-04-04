package com.example.pc_yasataria.adapter;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pc_yasataria.DetailActivity;
import com.example.pc_yasataria.R;
import com.example.pc_yasataria.model.ItemsModel;
import com.squareup.picasso.Picasso;

import java.util.List;

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
        Picasso.get().load(item.getGambar()).into(holder.img_color);


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