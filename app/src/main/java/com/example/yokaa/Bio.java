package com.example.yokaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yokaa.integrantes.Integrantes;

public class Bio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        //Pega o parâmetro position da intent
        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        //Inicializa classe com os dados
        Integrantes integrantes = new Integrantes();
        integrantes.initInfo();

        //Muda a imagem, o nome, o texto da biografia e o link do GitHub
        ImageView imageBio = findViewById(R.id.imageBio);
        imageBio.setImageResource(integrantes.getmImage().get(position));

        TextView nomeBio = findViewById(R.id.nomeBio);
        nomeBio.setText(integrantes.getmNames().get(position));

        TextView textBio = findViewById(R.id.textBio);
        textBio.setText(integrantes.getmBio().get(position));

        ImageButton gitHubButton = findViewById(R.id.gitHubButton);
        gitHubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent implícita que leva ao perfil do GitHub
                Uri uri = Uri.parse(integrantes.getmGitHubLink().get(position));
                Intent gitIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(gitIntent);
            }
        });
    }
}