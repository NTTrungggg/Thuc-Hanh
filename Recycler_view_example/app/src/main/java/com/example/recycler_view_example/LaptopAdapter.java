package com.example.recycler_view_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopAdapter.ViewHolder> {

    private List<Laptop> laptops;
    private Context context;

    public LaptopAdapter(Context context, List<Laptop> laptops) {
        this.context = context;
        this.laptops = laptops;
    }

    @NonNull @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Laptop lap = laptops.get(position);

        // Nếu ảnh nằm trong drawable:
//        holder.imgLaptop.setImageResource(lap.getImageUrl());
        // Hoặc nếu bạn dùng URL, dùng Picasso:
         Picasso.get().load(lap.getImageUrl()).into(holder.imgLaptop);

        holder.tvName.setText(lap.getName());
        holder.tvSpecs.setText(lap.getSpecs());
        holder.tvRating.setText(String.valueOf(lap.getRating()));
        holder.tvPrice.setText(String.format("%,.0f", lap.getPrice()));
    }

    @Override
    public int getItemCount() {
        return laptops.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLaptop;
        TextView tvName, tvSpecs, tvRating, tvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLaptop = itemView.findViewById(R.id.imgLaptop);
            tvName    = itemView.findViewById(R.id.tvName);
            tvSpecs   = itemView.findViewById(R.id.tvSpecs);
            tvRating  = itemView.findViewById(R.id.tvRating);
            tvPrice   = itemView.findViewById(R.id.tvPrice);
        }
    }
}

