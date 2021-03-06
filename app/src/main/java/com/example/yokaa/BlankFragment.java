package com.example.yokaa;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yokaa.integrantes.Integrantes;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

    TextView resumoPerfil;
    TextView idadePerfil;
    ImageView imagemPerfil;
    TextView nomePefil;
    int position;

    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        nomePefil = view.findViewById(R.id.nomePerfil);
        idadePerfil = view.findViewById(R.id.idadePerfil);
        imagemPerfil = view.findViewById(R.id.imagemPerfil);
        resumoPerfil = view.findViewById(R.id.resumoPerfil);

        Button mButton = view.findViewById(R.id.verMaisBtn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent Explícita enviando parâmetro de posição
                Intent intent = new Intent(getActivity(), Bio.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
        changeMsg(0);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    //Muda os dados ao clicar em um item da RecyclerView
    public void changeMsg(Integer position) {
        Integrantes integrantes = new Integrantes();
        integrantes.initInfo();

        imagemPerfil.setImageResource(integrantes.getmImage().get(position));
        nomePefil.setText(integrantes.getmNames().get(position));
        idadePerfil.setText(integrantes.getmIdade().get(position));
        resumoPerfil.setText(integrantes.getmResumo().get(position));
        this.position = position;
    }
}