package com.example.birthstones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "LOG" ;
    private RecyclerView rvBirthstone;
    private BirthstoneAdapter birthstoneAdapter;

    //Create ArrayList for Birthstone Objects
    ArrayList<Birthstone> birthstones = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "onCreate: In");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBirthstone = findViewById(R.id.rvBirthstones);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        rvBirthstone.setLayoutManager(manager);

        //Create the Birthstone list and set it in the adapter
        createBirthstoneList();
        birthstoneAdapter = new BirthstoneAdapter(birthstones);
        rvBirthstone.setAdapter(birthstoneAdapter);

    }

    public void createBirthstoneList() {
        birthstones.add(new Birthstone(R.drawable.jan_garnet, "Garnet", "This Birthstone is for the month of January"));
        birthstones.add(new Birthstone(R.drawable.feb_amethyst, "Amethyst", "Text"));
        birthstones.add(new Birthstone(R.drawable.march_aquamarine, "Aquamarine", "Text"));
        birthstones.add(new Birthstone(R.drawable.april_diamond, "Diamond", "Text"));
        birthstones.add(new Birthstone(R.drawable.may_emerald, "Emerald", "Text"));
        birthstones.add(new Birthstone(R.drawable.june_pearl, "Pearl", "Text"));
        birthstones.add(new Birthstone(R.drawable.july_ruby, "Ruby", "Text"));
        birthstones.add(new Birthstone(R.drawable.august_peridot, "Peridot", "Text"));
        birthstones.add(new Birthstone(R.drawable.september_sapphire, "Sapphire", "Text"));
        birthstones.add(new Birthstone(R.drawable.october_opal, "Opal", "Text"));
        birthstones.add(new Birthstone(R.drawable.november_topaz, "Topaz", "Text"));
        birthstones.add(new Birthstone(R.drawable.december_tanzanite, "Tanzanite", "Text"));
    }
}
