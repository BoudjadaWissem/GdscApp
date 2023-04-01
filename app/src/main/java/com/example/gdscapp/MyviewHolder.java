package com.example.gdscapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyviewHolder extends RecyclerView.ViewHolder {

    TextView name;
    public MyviewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
    }
}
