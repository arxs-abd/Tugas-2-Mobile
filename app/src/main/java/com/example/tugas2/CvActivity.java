package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CvActivity extends AppCompatActivity {
    Button back;
    Button toArtikelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);

        // On Click Back Button
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBack = new Intent(CvActivity.this, MainActivity.class);
                startActivity(toBack);
            }
        });

        // On Click Artikel Button
        toArtikelButton = findViewById(R.id.artikelButton);
        toArtikelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toArtikel = new Intent(CvActivity.this, ArtikelActivity.class);
                startActivity(toArtikel);
            }
        });
    }
}