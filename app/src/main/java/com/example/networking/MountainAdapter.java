package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.MountainViewHolder> {
    private ArrayList<Mountain> mountains;

    private Context context;

    public MountainAdapter(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public MountainAdapter.MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MountainViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mountain, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MountainAdapter.MountainViewHolder holder, int position) {
        Glide.with(context).load(mountains.get(position).auxdata.img).into(holder.mountain_image);

        holder.mountain_name.setText(mountains.get(position).name);
        holder.mountain_height_meters.setText((mountains.get(position)).meters + "m");
        holder.mountain_height_feet.setText((mountains.get(position)).feet + "ft");
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public class MountainViewHolder extends RecyclerView.ViewHolder {
        private ImageView mountain_image;
        private TextView mountain_name;
        private TextView mountain_height_meters;
        private TextView mountain_height_feet;

        public MountainViewHolder(@NonNull View itemView) {
            super(itemView);

            context = itemView.getContext();

            mountain_name = itemView.findViewById(R.id.mountain_name);
            mountain_image = itemView.findViewById(R.id.mountain_image);
            mountain_height_meters = itemView.findViewById(R.id.mountain_height_meters);
            mountain_height_feet = itemView.findViewById(R.id.mountain_height_feet);
        }
    }
}
