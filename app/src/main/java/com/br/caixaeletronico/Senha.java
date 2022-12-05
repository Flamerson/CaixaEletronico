package com.br.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Senha extends AppCompatActivity {

    private EditText senha;
    private Button botaoConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senha);

        senha = findViewById(R.id.password);
        botaoConfirmar = findViewById(R.id.confirmar);

        getSupportActionBar().hide();

        botaoConfirmar.setOnClickListener(view -> {
            int senhaCadastrada = 686500;
            int senhaAtual;
            senhaAtual = Integer.parseInt(senha.getText().toString());

            if(senhaAtual == senhaCadastrada){
                new Handler().postDelayed(() -> {
                    Intent intent = new Intent(Senha.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                },0);
            }else{
                Toast.makeText(this, "Senha incorreta", Toast.LENGTH_SHORT).show();
            }

        });

    }
}