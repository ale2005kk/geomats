package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AltezzaLatiSemipTB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_lati_semip_tb);

        Button altezzaasempb = findViewById(R.id.altezzaasempb);
        altezzaasempb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzaasempbstart();
            }
        });

        Button altezzabsempb = findViewById(R.id.altezzabsempb);
        altezzaasempb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzabsempbstart();
            }
        });

        Button altezzacsempb = findViewById(R.id.altezzacsempb);
        altezzacsempb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzacsempbstart();
            }
        });
    }
    public void altezzaasempbstart(){
        Intent intent = new Intent(this, AltezzaASemPT.class);
        startActivity(intent);
    }
    public void altezzabsempbstart(){
        Intent intent = new Intent(this, AltezzaBSemPT.class);
        startActivity(intent);
    }
    public void altezzacsempbstart(){
        Intent intent = new Intent(this, AltezzaCSemPT.class);
        startActivity(intent);
    }
}
