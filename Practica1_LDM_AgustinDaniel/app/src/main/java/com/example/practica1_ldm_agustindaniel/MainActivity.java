package com.example.practica1_ldm_agustindaniel;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;
import androidx.appcompat.*;
import androidx.appcompat.widget.ToolbarWidgetWrapper;


public class MainActivity extends AppCompatActivity {

    //private Toolbar miToolbar;
    private androidx.appcompat.widget.Toolbar miToolbar;
    ImageView foto;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FOTO LOGO INICIO
        foto = findViewById(R.id.foto);
        foto.setImageResource(R.drawable.logoapp);

        //CUSTOMIZANDO NUESTRA TOOLBAR
        miToolbar = findViewById(R.id.miToolBar);
        setSupportActionBar(miToolbar);
    }

    public void siguientePregunta(View view){
        Intent i = new Intent(this, ActivityPreg1.class);
        startActivity(i);
    }

}