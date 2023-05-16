package com.example.gdscapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.ClipData;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.MenuItem;
import android.widget.Button;

import com.example.gdscapp.fragments.ContactFragment;
import com.example.gdscapp.fragments.HistoriqueFragment;
import com.example.gdscapp.fragments.HomeFragment;
import com.example.gdscapp.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


 Toolbar toolbar ;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager manager = getSupportFragmentManager();
            switch (item.getItemId()) {
                case R.id.home:
                    manager.beginTransaction().replace(R.id.host_fragment, new HomeFragment()).commit();
                    break;

                case R.id.profile:

                    manager.beginTransaction().replace(R.id.host_fragment, new ProfileFragment()).commit();
                    break;
                case R.id.historique:

                    manager.beginTransaction().replace(R.id.host_fragment, new HistoriqueFragment()).commit();
                    break;
                case R.id.contact:

                    manager.beginTransaction().replace(R.id.host_fragment, new ContactFragment()).commit();
                    break;
            }
            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar =findViewById(R.id.toolbar);
        //toolbar.setTitleTextColor(getResources().getColor(android.R.color.#808080));

        setSupportActionBar(toolbar);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }
}