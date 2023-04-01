package com.example.gdscapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
 Toolbar toolbar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =findViewById(R.id.toolbar);
        //toolbar.setTitleTextColor(getResources().getColor(android.R.color.#808080));

        setSupportActionBar(toolbar);

        RecyclerView recyclerView = findViewById(R.id.recycleview);
        List<item> items = new ArrayList<item>();
        items.add(new item("Lette de Motivation",R.drawable.point));
        items.add(new item("Education certificate",R.drawable.point));
        items.add(new item("Relevés de notes",R.drawable.point));
        items.add(new item("Attestation d’abondant",R.drawable.point));
        items.add(new item("Diplôme",R.drawable.point));
        items.add(new item("Group change",R.drawable.point));
        items.add(new item("Relevés de notes",R.drawable.point));








        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}