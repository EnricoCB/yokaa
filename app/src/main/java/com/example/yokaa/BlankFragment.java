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

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mIdade = new ArrayList<>();
    private ArrayList<String> mResumo = new ArrayList<>();
    private ArrayList<Integer> mImage = new ArrayList<>();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        nomePefil = (TextView) view.findViewById(R.id.nomePerfil);
        idadePerfil = (TextView) view.findViewById(R.id.idadePerfil);
        imagemPerfil = (ImageView) view.findViewById(R.id.imagemPerfil);
        resumoPerfil = (TextView) view.findViewById(R.id.resumoPerfil);

        Button mButton = (Button) view.findViewById(R.id.verMaisBtn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Bio.class) ;
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

    public void changeMsg(Integer position) {
        Log.i("Console", String.valueOf(position));
        initInfo();
        imagemPerfil.setImageResource(mImage.get(position));
        nomePefil.setText(mNames.get(position));
        idadePerfil.setText(mIdade.get(position));
        resumoPerfil.setText(mResumo.get(position));
    }

    private void initInfo() {
        mNames.add("Vinicius Marques");
        mIdade.add("17");
        mResumo.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        mImage.add(R.drawable.foto);

        mNames.add("Enrico Budel");
        mIdade.add("17");
        mResumo.add("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        mImage.add(R.drawable.fotoo);

        mNames.add("Matheus Rogerio");
        mIdade.add("17");
        mResumo.add("Lorem Ipsum is simply dummy text of the printing and typesetting industry aaaaaaaaaaaaaaaaaaaaaaaa.");
        mImage.add(R.drawable.adm);
    }
}