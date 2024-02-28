package com.example.projeto_imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnCalcular;
    TextView labelImc, labelClassificacao;
    EditText edtPeso, edtAltura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelImc = findViewById(R.id.labelImc);
        edtPeso = findViewById(R.id.etdPeso);
        edtAltura = findViewById(R.id.edtAltura);
        btnCalcular = findViewById(R.id.btnCalcular);
        labelClassificacao = findViewById(R.id.txtClassificacao);
    }

    public void calculaImc(View v) {
        double valorPeso, valorAltura, valorImc;

        String peso = edtPeso.getText().toString();
        String altura = edtAltura.getText().toString();

        valorPeso = Double.parseDouble(peso);
        valorAltura = Double.parseDouble(altura);

        valorImc = valorPeso / Math.pow(valorAltura, 2);

        labelImc.setText(String.format("%.2f", valorImc));

        if (valorImc < 18.5) labelClassificacao.setText("Abaixo do peso normal");
        else if (valorImc >= 18.5 && valorImc < 25) labelClassificacao.setText("Peso Normal");
        else if (valorImc >= 25.0 && valorImc < 30) labelClassificacao.setText("Excesso de peso");
        else if (valorImc >= 30 && valorImc < 35) labelClassificacao.setText("Obesidade classe I");
        else if (valorImc >= 35 && valorImc < 40) labelClassificacao.setText("Obesidade classe II");
        else labelClassificacao.setText("Obesidade classe III");
    }
}