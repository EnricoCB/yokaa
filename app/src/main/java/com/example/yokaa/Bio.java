package com.example.yokaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import com.example.yokaa.data.UserDao;
import com.example.yokaa.data.UserDatabase;

public class Bio extends AppCompatActivity {
    UserDatabase userDatabase;
    UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        userDatabase = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "userDatabase").allowMainThreadQueries().build();
        userDao = userDatabase.userDao();
        String name = userDao.getIdade("Enrico");
        Log.i("Databse", String.valueOf(name));
    }
}