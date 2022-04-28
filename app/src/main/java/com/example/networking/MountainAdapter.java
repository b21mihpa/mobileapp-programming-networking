package com.example.networking;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MountainAdapter extends RecyclerView.Adapter<MountainAdapter.MountainViewHolder> {
    private ArrayList<Mountain> mountains;

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
        holder.mountain_name.setText(mountains.get(position).name);
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public class MountainViewHolder extends RecyclerView.ViewHolder {
        private TextView mountain_name;

        public MountainViewHolder(@NonNull View itemView) {
            super(itemView);

            mountain_name = itemView.findViewById(R.id.mountain_name);
        }
    }
}
