package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ayat extends AppCompatActivity {

    private TextView angka;
    private int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat2);

        angka = findViewById(R.id.angka);
        int a = 0;
    }

    public void tap(View view){
        a= a+1;
        angka.setText(a);
    }
}