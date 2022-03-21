package com.example.yokaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.yokaa.adapter.RecyclerViewAdapter;

import java.util.ArrayList;

import kotlinx.coroutines.Job;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    RecyclerViewAdapter adapter;
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mJob = new ArrayList<>();
    private ArrayList<Integer> mImage = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInfos();
        Log.i("ConsoleS", "certo");
    }

    private void initInfos(){
        mNames.add("Vinícius Marques");
        mJob.add("3D Designer");
        mImage.add(R.drawable.foto);

        mNames.add("Enrico Budel");
        mJob.add("Mobile Developer");
        mImage.add(R.drawable.fotoo);

        mNames.add("Matheus Rogério");
        mJob.add("ADM");
        mImage.add(R.drawable.adm);


        initRecyclerView();
    }
    private void initRecyclerView() {
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(this, mNames, mJob, mImage);
        recyclerView.setAdapter(adapter);
    }


}