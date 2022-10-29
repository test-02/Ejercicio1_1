package com.example.ejercicio1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejercicio1_1.Operaciones.Transacciones;

public class MainActivity extends AppCompatActivity {

    EditText txtnumero1, txtnumero2;
    Button btnsuma, btnresta, btndivision, btnmultiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Transacciones operaciones = new Transacciones();

        txtnumero1 = (EditText) findViewById(R.id.txtnumero1);
        txtnumero2 = (EditText) findViewById(R.id.txtnumero2);

        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btndivision = (Button) findViewById(R.id.btndivision);
        btnmultiplicacion = (Button) findViewById(R.id.btnmultiplicacion);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operaciones.setDatos(Double.parseDouble(txtnumero1.getText().toString()), Double.parseDouble(txtnumero2.getText().toString()));

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("dato", "" + operaciones.getSuma());
                startActivity(intent);

            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operaciones.setDatos(Double.parseDouble(txtnumero1.getText().toString()), Double.parseDouble(txtnumero2.getText().toString()));

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("dato", "" + operaciones.getresta());
                startActivity(intent);
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Double.parseDouble(txtnumero2.getText().toString()) == 0) {
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                    intent.putExtra("dato", "No se puede dividir entre cero");
                    startActivity(intent);

                } else
                    operaciones.setDatos(Double.parseDouble(txtnumero1.getText().toString()), Double.parseDouble(txtnumero2.getText().toString()));
                    Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                    intent.putExtra("dato", "" + operaciones.getdivision());
                    startActivity(intent);
                }
        });

        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operaciones.setDatos(Double.parseDouble(txtnumero1.getText().toString()), Double.parseDouble(txtnumero2.getText().toString()));

                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
                intent.putExtra("dato", "" + operaciones.getmultiplicacion());
                startActivity(intent);
            }
        });

    }
}