package com.example.yokaa.data;

import static androidx.room.OnConflictStrategy.REPLACE;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Insert(onConflict = REPLACE)
    void insert(User user);

    @Query("SELECT * FROM user_table")
    List<User> getAll();

    @Query("SELECT job FROM user_table WHERE nome LIKE :name")
    String getIdade(String name);
}
