package com.example.hifz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class beranda extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        button = (Button) findViewById(R.id.ziyadah);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSurat();
            }
        });
    }

    public void openSurat(){
        Intent intent = new Intent(beranda.this, surat.class);
        startActivity(intent);
    }
}