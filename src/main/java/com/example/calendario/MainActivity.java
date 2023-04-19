package com.example.calendario;

import static com.example.calendario.R.id.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irARegistrarse(View view){
        Intent In = new Intent(this, Registrarse.class);
        startActivity(In);
    }
    public void irAcceder(View view){
        Intent In = new Intent(this, Acceder.class);
        startActivity(In);
    }

}