package com.example.miprimeraaplicacionandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Encuentra el botón por su ID
        Button buttonToSecond = findViewById(R.id.btnCrearCuenta);
        // Configura un listener para manejar el clic
        buttonToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
            // Crear un intent para ir a SecondActivity
            Intent intent = new Intent(MainActivity.this, Registrar.class);
            startActivity(intent);  // Iniciar la nueva actividad
            }
        });
    }
}