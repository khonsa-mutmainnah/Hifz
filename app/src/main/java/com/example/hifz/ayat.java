package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat2);

        angka = findViewById(R.id.angka);
        button = findViewById(R.id.klik);

        a = 0;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tap();
            }
        });
    }

<<<<<<< HEAD
    public void tap(){
        a++;
        angka.setText(Integer.toString(a));
=======
    public void tap(View view){
        a= a+1;
        angka.setText(a);
>>>>>>> 96c0f5a92342fe93729f1bc7894f4456c662652e
    }
}