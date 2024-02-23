package com.example.projeto_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnCalcular;
    TextView labelImc;
    EditText edtPeso, edtAltura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelImc = findViewById(R.id.labelImc);
        edtPeso = findViewById(R.id.etdPeso);
        edtAltura = findViewById(R.id.edtAltura);
        btnCalcular = findViewById(R.id.btnCalcular);
    }

    public void calculaImc(View v) {
        double valorPeso, valorAltura, valorImc;

        String peso = edtPeso.getText().toString();
        String altura = edtAltura.getText().toString();

        valorPeso = Double.parseDouble(peso);
        valorAltura = Double.parseDouble(altura);

        valorImc = valorPeso / Math.pow(valorAltura, 2);

        labelImc.setText(String.format("%.2f", valorImc));
    }
}