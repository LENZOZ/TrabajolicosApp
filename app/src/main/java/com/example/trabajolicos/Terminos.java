package com.example.trabajolicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Terminos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terminos);

    }
    public void terminosAceptar(View v){

        Intent i = new Intent(this, Codigo.class);
        startActivity(i);

    }
}