package com.example.ejercicio1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityResultado extends AppCompatActivity {

    EditText txtresultado;
    Button btnregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtresultado = (EditText) findViewById(R.id.txtresultado);

        btnregresar = (Button) findViewById(R.id.btnregresar);

        String dato = getIntent().getStringExtra("dato");
        txtresultado.setText(dato);

        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}