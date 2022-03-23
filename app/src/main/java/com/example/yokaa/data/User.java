package com.example.yokaa.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "nome")
    public String nome;

    @ColumnInfo(name = "idade")
    public String idade;

    @ColumnInfo(name = "job")
    public String job;

    @ColumnInfo(name = "resumo")
    public String resumo;

    @ColumnInfo(name = "bio")
    public String bio;

    public User(int uid, String nome, String idade, String job, String resumo, String bio) {
        this.uid = uid;
        this.nome = nome;
        this.idade = idade;
        this.job = job;
        this.resumo = resumo;
        this.bio = bio;
    }

    @Ignore
    public User(String nome, String idade, String job, String resumo, String bio) {
        this.nome = nome;
        this.idade = idade;
        this.job = job;
        this.resumo = resumo;
        this.bio = bio;
    }
}
