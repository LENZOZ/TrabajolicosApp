package com.example.trabajolicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Codigo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo);
    }
    public void codigoContinuar(View v){

        Intent i = new Intent(this, Registro.class);
        startActivity(i);

    }
}