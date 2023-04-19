package com.example.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }
    public void irAinicio(View view) {
        Intent In = new Intent(this, MainActivity.class);
        startActivity(In);
    }
    public void mostrarMensaje(View view){
        Toast textoMgs = Toast.makeText(this, "Datos Guardados", Toast.LENGTH_SHORT);
        textoMgs.show();
        Intent In = new Intent(this, Recordatorio.class);
        startActivity(In);
    }
}