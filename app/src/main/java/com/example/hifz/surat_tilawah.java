package com.example.hifz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class surat_tilawah extends AppCompatActivity {

    TextView surattilawah1;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surat_tilawah);

        surattilawah1 = findViewById(R.id.surattilawah1);
        surattilawah1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAyatTilawah();
            }
        });
    }

    public void openAyatTilawah(){
        Intent intent = new Intent(surat_tilawah.this, ayat_tilawah.class);
        startActivity(intent);
    }
}
