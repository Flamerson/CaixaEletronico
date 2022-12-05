package com.br.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        // aqui estamos andando entre activits, de uma tela para outra.
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Splash.this, Senha.class);
            startActivity(intent);
            finish();
        },3000);

    }
}