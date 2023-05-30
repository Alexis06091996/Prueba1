package com.example.prueba1calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Numero1, Numero2;
    Button OperacionSuma, OperacionResta, OperacionMultiplicar, OperacionDividir;

    TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Numero1 = findViewById(R.id.Numero1);
        Numero2 = findViewById(R.id.Numero2);
        OperacionSuma = findViewById(R.id.OperacionSuma);
        OperacionResta = findViewById(R.id.OperacionResta);
        OperacionMultiplicar = findViewById(R.id.OperacionMultiplicar);
        OperacionDividir = findViewById(R.id.OperacionDividir);
        Resultado = findViewById(R.id.Resultado);

        OperacionSuma.setOnClickListener(view -> {
            double num1 = Double.parseDouble(Numero1.getText().toString());
            double num2 = Double.parseDouble(Numero2.getText().toString());
            double result = num1 + num2;
            Resultado.setText(String.valueOf(result));
        });

        OperacionResta.setOnClickListener(view -> {
            double num1 = Double.parseDouble(Numero1.getText().toString());
            double num2 = Double.parseDouble(Numero2.getText().toString());
            double result = num1 - num2;
            Resultado.setText(String.valueOf(result));
        });

        OperacionMultiplicar.setOnClickListener(view -> {
            double num1 = Double.parseDouble(Numero1.getText().toString());
            double num2 = Double.parseDouble(Numero2.getText().toString());
            double result = num1 * num2;
            Resultado.setText(String.valueOf(result));
        });

        OperacionDividir.setOnClickListener(view -> {
            double num1 = Double.parseDouble(Numero1.getText().toString());
            double num2 = Double.parseDouble(Numero2.getText().toString());
            double result = num1 / num2;
            Resultado.setText(String.valueOf(result));
        });
    }
}


