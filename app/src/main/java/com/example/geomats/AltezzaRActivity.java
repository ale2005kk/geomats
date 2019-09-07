package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AltezzaRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_r);

        Button perimetrobaserb = findViewById(R.id.perimetrobaserb);
        perimetrobaserb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetrobaserbstart();
            }
        });

        Button areabaserb = findViewById(R.id.areabaserb);
        areabaserb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areabaserbstart();
            }
        });

        Button diagonalebaserb = findViewById(R.id.diagonalebaserb);
        diagonalebaserb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diagonalebaserbstart();
            }
        });
    }
    public void perimetrobaserbstart(){
        Intent intent = new Intent(this, AltezzaPerBaseR.class);
        startActivity(intent);
    }
    public void areabaserbstart(){
        Intent intent = new Intent(this, AltezzaAreaBaseR.class);
        startActivity(intent);
    }
    public void diagonalebaserbstart(){
        Intent intent = new Intent(this, AltezzaDiagBaseR.class);
        startActivity(intent);
    }
}
