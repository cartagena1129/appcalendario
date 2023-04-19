package com.example.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Recordatorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recordatorio);
    }
    public void irAinicio(View view) {
        Intent In = new Intent(this, MainActivity.class);
        startActivity(In);
    }
    public void mostrarMensaje(View view){
        Toast textoMgs = Toast.makeText(this, "Recordatorio Guardado", Toast.LENGTH_SHORT);
        textoMgs.show();
    }
}