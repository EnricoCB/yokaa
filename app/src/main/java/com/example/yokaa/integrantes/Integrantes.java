package com.example.yokaa.integrantes;

import com.example.yokaa.R;

import java.util.ArrayList;

public class Integrantes {
    //Declara as ArrayList
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mJob = new ArrayList<>();
    private ArrayList<Integer> mImage = new ArrayList<>();
    private ArrayList<String> mIdade = new ArrayList<>();
    private ArrayList<String> mResumo = new ArrayList<>();
    private ArrayList<String> mBio = new ArrayList<>();
    private ArrayList<String> mGitHubLink = new ArrayList<>();

    //Cria apenas os métodos get
    public ArrayList<String> getmNames() {
        return mNames;
    }
    public ArrayList<String> getmJob() {
        return mJob;
    }

    public ArrayList<Integer> getmImage() {
        return mImage;
    }

    public ArrayList<String> getmIdade() {
        return mIdade;
    }

    public ArrayList<String> getmResumo() {
        return mResumo;
    }

    public ArrayList<String> getmBio() {
        return mBio;
    }

    public ArrayList<String> getmGitHubLink() {
        return mGitHubLink;
    }

    //Inicializa os dados de cada integrante
    public void initInfo() {
        mNames.add("Vinícius Marques");
        mJob.add("3D Designer");
        mIdade.add("17");
        mImage.add(R.drawable.foto);
        mResumo.add("Meu nome é Vinícius, mas muitos me chamam de Vica, estou cursando o curso técnico integrado em informática no");
        mBio.add("Olá, meu nome é Vinícius, mas muitos me chamam de Vica, atualmente estou cursando técnico integrado em informática no ifms campus Coxim.\nPretendo cursar Engenharia Aeroespacial e ir morar em outro país, isso se eu não acabar como motorista de Uber ao final do curso.\nNo momento estou criando um jogo que se passa dentro do if que está ficando muito interessante.\nManjo de Java, C#, JS, Python, HTML, CSS e Blender. Além disso, sei mexer com React, React Native, Vue e NodeJs.\nPor fim, sou mono Senna no lolzin.");
        mGitHubLink.add("https://github.com/Vicarillous");

        mNames.add("Enrico Budel");
        mJob.add("Mobile Developer");
        mIdade.add("17");
        mImage.add(R.drawable.fotoo);
        mResumo.add("Meu nome é Enrico, tenho 17 anos e faço curso técnico integrado em informática no ifms campus Coxim.");
        mBio.add("Olá, meu nome é Enrico, tenho 17 anos e faço curso tecnico integrado em informatica no ifms campus Coxim. Atualmente moro em Coxim e faço estágio como desenvolvedor mobile na Jera utilizando o Kotlin como linguagem de progamação.");
        mGitHubLink.add("https://github.com/EnricoCB");

        mNames.add("Matheus Rogério");
        mJob.add("ADM");
        mIdade.add("17");
        mImage.add(R.drawable.adm);
        mResumo.add("Meu nome é Matheus, mais conhecido como ADM (devido a minha alta capacidade de gerenciamento e administração de servers do discord).");
        mBio.add("Meu nome é Matheus, mais conhecido como ADM (devido a minha alta capacidade de gerenciamento e administração de servers do discord), tenho 17 anos e estou finalizando o curso técnico em informático do campus Coxim, nasci e sempre morei aqui, faço estágio na Rockcell, moro com meus pais.");
        mGitHubLink.add("https://www.instagram.com/matheusr_s_/");
    }
}
