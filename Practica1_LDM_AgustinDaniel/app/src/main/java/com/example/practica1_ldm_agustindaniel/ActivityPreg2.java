package com.example.practica1_ldm_agustindaniel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityPreg2 extends AppCompatActivity {

    private androidx.appcompat.widget.Toolbar miToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preg2);

        miToolbar = findViewById(R.id.miToolBar);
        setSupportActionBar(miToolbar);
    }
}