package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View v){
        EditText a = findViewById(R.id.valor1);
        EditText b = findViewById(R.id.valor2);

        int iA = Integer.parseInt(a.getText().toString());
        int iB = Integer.parseInt(b.getText().toString());

        int resultado = iA + iB;

        TextView saida = findViewById(R.id.saida);



        saida.setText(String.valueOf(resultado)  );
    }
    public void subtrair(View v){
        EditText a = findViewById(R.id.valor1);
        EditText b = findViewById(R.id.valor2);

        int iA = Integer.parseInt(a.getText().toString());
        int iB = Integer.parseInt(b.getText().toString());

        int resultado = iA - iB;

        TextView saida = findViewById(R.id.saida);
        saida.setText(String.valueOf(resultado)  );
    }

    public void multiplicar(View v){
        EditText a = findViewById(R.id.valor1);
        EditText b = findViewById(R.id.valor2);

        int iA = Integer.parseInt(a.getText().toString());
        int iB = Integer.parseInt(b.getText().toString());

        int resultado = iA * iB;

        TextView saida = findViewById(R.id.saida);

        String sR = String.valueOf(resultado);

        saida.setText( sR );
    }
}
