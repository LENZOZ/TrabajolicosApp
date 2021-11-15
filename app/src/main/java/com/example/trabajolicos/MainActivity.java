package com.example.trabajolicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void login (View v){
        EditText campo1 = this.findViewById(R.id.numero);

        String numero = campo1.getText().toString();
        if (numero.equals("123")){
            Intent i = new Intent(this, Terminos.class);
            startActivity(i);
        }

    }
}