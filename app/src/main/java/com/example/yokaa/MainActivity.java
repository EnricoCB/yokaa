package com.example.yokaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.yokaa.adapter.RecyclerViewAdapter;
import com.example.yokaa.integrantes.Integrantes;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        Integrantes integrantes = new Integrantes();
        integrantes.initInfo();

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(this, integrantes.getmNames(), integrantes.getmJob(), integrantes.getmImage());
        recyclerView.setAdapter(adapter);
    }
}