package com.example.practica1;

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
    public void btEnviar(View view){
        //Creamos el Intent
         Intent intent = new Intent(MainActivity.this, actBienvenida.class);
         EditText txtTable = (EditText)findViewById(R.id.txtTable);
         //Creamos la información a pasar entre actividades - Pares Key-Value
         Bundle b = new Bundle();
         b.putString("NOMBRE", txtTable.getText().toString());
        //Añadimos la información al intent
         intent.putExtras(b);
         // Iniciamos la nueva actividad
         startActivity(intent);
    }


    }