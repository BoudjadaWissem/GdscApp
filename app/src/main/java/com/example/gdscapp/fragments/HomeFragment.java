package com.example.gdscapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gdscapp.MyAdapter;
import com.example.gdscapp.R;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    MyAdapter adapter;
    String DoucumentNames[]={" ●   Lette de Motivation"," ●   Education certificate","●   Relevés de notes",
            "●   Attestation d’abondant","●   Diplôme"," ●   Group change"," ●  Relevés de notes"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Inflate the layout for this fragment
        recyclerView = view.findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        adapter = new MyAdapter(requireContext(),DoucumentNames);
        recyclerView.setAdapter(adapter);
//        List<item> items = new ArrayList<item>();
//        items.add(new item("Lette de Motivation",R.drawable.point));
//        items.add(new item("Education certificate",R.drawable.point));
//        items.add(new item("Relevés de notes",R.drawable.point));
//        items.add(new item("Attestation d’abondant",R.drawable.point));
//        items.add(new item("Diplôme",R.drawable.point));
//        items.add(new item("Group change",R.drawable.point));
//        items.add(new item("Relevés de notes",R.drawable.point));








        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        //recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));


        return view;
    }
}