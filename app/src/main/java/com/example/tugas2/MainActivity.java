package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button artikelButton;
    Button cvBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On Click Artikel Button
        artikelButton = findViewById(R.id.articelButton);
        artikelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toArtikel = new Intent(MainActivity.this, ArtikelActivity.class);
                startActivity(toArtikel);
            }
        });

        // On Click Biodata Button
        cvBtn = findViewById(R.id.cvButton);
        cvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCv = new Intent(MainActivity.this, CvActivity.class);
                startActivity(toCv);
            }
        });
    }
}