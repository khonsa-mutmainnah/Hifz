package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ayat extends AppCompatActivity {

    private TextView angka;
    private int a;
    private ImageButton button;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat2);

        angka = findViewById(R.id.angka);
        button = findViewById(R.id.klik);
        btn = findViewById(R.id.rekam);

        a = 0;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rekam();
            }
        });
    }

    public void tap(){
        a++;
        angka.setText(Integer.toString(a));
    }

    public void rekam(){
        Intent intent = new Intent(this, AudioRecorderActivity.class);
        startActivity(intent);
    }
}