package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtikelActivity extends AppCompatActivity {
    Button back;
    Button toCvBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);

        // On Click Back Button
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBack = new Intent(ArtikelActivity.this, MainActivity.class);
                startActivity(toBack);
            }
        });

        // On Click Biodata Button
        toCvBtn = findViewById(R.id.cvButton);
        toCvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCv = new Intent(ArtikelActivity.this, CvActivity.class);
                startActivity(toCv);
            }
        });
    }
}