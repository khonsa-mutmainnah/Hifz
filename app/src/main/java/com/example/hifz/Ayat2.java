package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Ayat2 extends AppCompatActivity {

    private TextView angka;
    private int a;
    private ImageButton button;
    private Button btn;
    private Button reset;
    private ImageButton next;
    private ImageButton prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat2);

        angka = findViewById(R.id.angka);
        button = findViewById(R.id.klik);
        btn = findViewById(R.id.rekam);
        reset = findViewById(R.id.reset);

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
                toast();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
    }

    public void tap(){
        a++;
        angka.setText(Integer.toString(a));
    }

    public void reset(){
        a = 0;
        angka.setText(Integer.toString(a));
    }

    public void toast(){
        Toast.makeText(getApplicationContext(), "Good Job!", Toast.LENGTH_SHORT).show();
    }
}