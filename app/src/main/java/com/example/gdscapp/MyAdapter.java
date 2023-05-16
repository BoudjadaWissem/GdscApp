package com.example.gdscapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    String data[];
    Context context;



    public MyAdapter(Context context,String[] data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view  = layoutInflater.inflate(R.layout.item_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        holder.textView.setText(data[position]);




       holder.textView.setOnClickListener(view ->
               Toast.makeText(context, "clicked", Toast.LENGTH_SHORT).show());

       holder.image.setOnClickListener(v -> {

           PopupMenu popup = new PopupMenu(context, holder.image);
           //inflating menu from xml resource
           popup.inflate(R.menu.option_menu);
           //adding click listener
           popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
               @Override
               public boolean onMenuItemClick(MenuItem item) {
                   switch (item.getItemId()) {
                       case R.id.mnu_item_Preview:
                           //handle menu1 click
                           return true;
                       case R.id.mnu_item_Favorite:
                           //handle menu2 click
                           return true;
                       case R.id.mnu_item_Download:
                           //handle menu3 click
                           return true;
                       default:
                           return false;
                   }
               }
           });
           //displaying the popup
           popup.show();


       });


    }



    @Override
    public int getItemCount() {
        return data.length;

    }



    public class ViewHolder extends RecyclerView.ViewHolder  {
        private static final String TAG = "ViewHolder";

        TextView textView;
        ImageView image;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textname);
            image=itemView.findViewById(R.id.image_view_more);

        }


        }



    }


