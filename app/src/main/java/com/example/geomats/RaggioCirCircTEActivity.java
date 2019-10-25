package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RaggioCirCircTEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_cir_circ_te);

        Button latorteb = findViewById(R.id.latorteb);
        latorteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latortebstart();
            }
        });

        Button altezzarteb = findViewById(R.id.altezzarteb);
        altezzarteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzartebstart();
            }
        });
    }
    public void latortebstart(){
        Intent intent = new Intent(this, RaggioCirCircLatoTE.class);
        startActivity(intent);
    }
    public void altezzartebstart(){
        Intent intent = new Intent(this, RaggioCirCircAltezzaTE.class);
        startActivity(intent);
    }
}
