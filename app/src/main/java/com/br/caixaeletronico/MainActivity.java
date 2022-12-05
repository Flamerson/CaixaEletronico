package com.br.caixaeletronico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView saldoConta;
    private TextView sacarConta;
    private Button sacar;

    double saldoEmConta = 3000.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        saldoConta = findViewById(R.id.saldoView);
        sacarConta = findViewById(R.id.saldoInput);
        sacar = findViewById(R.id.sacar);

        saldoConta.setText("Saldo em Conta: " + saldoEmConta + "0");

        sacar.setOnClickListener(view -> {
            Double dinheiro;
            dinheiro = Double.parseDouble(sacarConta.getText().toString());

            if(dinheiro < 20){
                Toast.makeText(this, "Digite um valor maior", Toast.LENGTH_SHORT).show();
            }else if(dinheiro > saldoEmConta){
                Toast.makeText(this, "Valor Acima do seu limite", Toast.LENGTH_SHORT).show();
            }
            else{
                saldoEmConta -= dinheiro;
                saldoConta.setText("Saldo em Conta: " + saldoEmConta + "0");
                Toast.makeText(this, dinheiro + "0 Reais sacado", Toast.LENGTH_SHORT).show();
                sacarConta.setText("");
            }

        });


    }
}