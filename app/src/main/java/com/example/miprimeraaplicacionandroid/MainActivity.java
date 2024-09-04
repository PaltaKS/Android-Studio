package com.example.miprimeraaplicacionandroid;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;



//import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView txtTitulo = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        }); */
        btnEnviar = findViewById(R.id.btnBotonMain);
        txtTitulo = findViewById(R.id.txtTituloMain);
        txtIngresar = findViewById(R.id.txtIngresarMain);
    }
    public void accionBoton(View view)
    {
        Intent intent = new Intent(MainActivity:this, Secundario.class);
        startActivity(intent);
        finish();
    }
}