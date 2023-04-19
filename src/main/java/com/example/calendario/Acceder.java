package com.example.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Acceder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceder);
    }
    public void irARecordatorio(View view) {
        Intent In = new Intent(this, MainActivity.class);
        startActivity(In);
       /* Toast textoMgs = Toast.makeText(this, "Ingreso Exitoso", Toast.LENGTH_SHORT);
        textoMgs.show();*/
    }

}