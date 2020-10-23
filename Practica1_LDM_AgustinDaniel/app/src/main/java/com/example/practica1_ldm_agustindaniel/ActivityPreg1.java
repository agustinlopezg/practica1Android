package com.example.practica1_ldm_agustindaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityPreg1 extends AppCompatActivity {

    //array de los ids de las cuatro respuestas de la Primera Pregunta
    private int id_respuestas[]= {R.id.resp1preg1, R.id.resp2preg1, R.id.resp3preg1, R.id.resp4preg1};

    private androidx.appcompat.widget.Toolbar miToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preg1);

        //Generamos nuestra toolbar personalizada
        miToolbar = findViewById(R.id.miToolBar);
        setSupportActionBar(miToolbar);

        //Relacionamos la pregunta del archivo strings con el TextView de esta Activity
        TextView pregunta = (TextView) findViewById(R.id.pregunta1);
        pregunta.setText(R.string.pregunta1);

        //Relacionamos las respuestas de la pregunta 1 que aparecen en el strings con los RadioButton del RadioGroup
        String[] respuestas = getResources().getStringArray(R.array.respuestasPregunta1);
        final RadioGroup radiogroup = (RadioGroup) findViewById(R.id.grupoRespuestas1);
        for(int i=0; i<respuestas.length; i++){
            RadioButton prb = (RadioButton) findViewById(id_respuestas[i]);
            prb.setText(respuestas[i]);
        }

        final int respuestaCorrecta = getResources().getInteger(R.integer.respuestaCorrectaPregunta1);

        Button boton = (Button) findViewById(R.id.botonPreg1);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int id_respuestaMarcada = radiogroup.getCheckedRadioButtonId();
                int respuestaMarcada = -1;
                for(int i=0; i<id_respuestas.length; i++){
                    //Si marca la respuesta 4, coge la posicion 3 del array de los IDs
                    if(id_respuestaMarcada == id_respuestas[i]){
                        respuestaMarcada = i+1;
                    }
                }

                //Comprueba si ha acertado o no
                if(respuestaMarcada == respuestaCorrecta){
                    Toast.makeText(ActivityPreg1.this, R.string.mensajeAcierto, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ActivityPreg1.this, R.string.mensajeFallo, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void irAPreg2(View view){
        Intent intento = new Intent(this, ActivityPreg2.class);
        startActivity(intento);
    }
}