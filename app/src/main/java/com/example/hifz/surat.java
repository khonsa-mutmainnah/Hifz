package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class surat extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        button = (Button) findViewById(R.id.surat1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAyat();
            }
        });
    }

    public void openAyat(){
        Intent intent = new Intent(this, ayat.class);
        startActivity(intent);
    }
}