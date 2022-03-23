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
        mResumo.add("Olá, este é o resumo do vica");
        mBio.add("Olá, esta é a bio do vica");
        mGitHubLink.add("https://github.com/Vicarillous");


        mNames.add("Enrico Budel");
        mJob.add("Mobile Developer");
        mIdade.add("17");
        mImage.add(R.drawable.fotoo);
        mResumo.add("Olá, este é o resumo do enrico");
        mBio.add("Olá, esta é a bio do enrico");
        mGitHubLink.add("https://github.com/EnricoCB");

        mNames.add("Matheus Rogério");
        mJob.add("ADM");
        mIdade.add("17");
        mImage.add(R.drawable.adm);
        mResumo.add("Olá, este é o resumo do adm");
        mBio.add("Olá, esta é a bio do adm");
        mGitHubLink.add("https://www.instagram.com/matheusr_s_/");
    }
}
