package com.example.gdscapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.ClipData;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
 Toolbar toolbar ;
 String DoucumentNames[]={" ●   Lette de Motivation"," ●   Education certificate","●   Relevés de notes",
         "●   Attestation d’abondant","●   Diplôme"," ●   Group change"," ●  Relevés de notes"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar =findViewById(R.id.toolbar);
        //toolbar.setTitleTextColor(getResources().getColor(android.R.color.#808080));

        setSupportActionBar(toolbar);

          recyclerView = findViewById(R.id.recycleview);
          recyclerView.setLayoutManager(new LinearLayoutManager(this));
          adapter = new MyAdapter(this,DoucumentNames);
          recyclerView.setAdapter(adapter);
//        List<item> items = new ArrayList<item>();
//        items.add(new item("Lette de Motivation",R.drawable.point));
//        items.add(new item("Education certificate",R.drawable.point));
//        items.add(new item("Relevés de notes",R.drawable.point));
//        items.add(new item("Attestation d’abondant",R.drawable.point));
//        items.add(new item("Diplôme",R.drawable.point));
//        items.add(new item("Group change",R.drawable.point));
//        items.add(new item("Relevés de notes",R.drawable.point));








        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));








    }
}