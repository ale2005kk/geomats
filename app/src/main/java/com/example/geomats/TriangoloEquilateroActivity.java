package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TriangoloEquilateroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangolo_equilatero);

        Button perimetroteb = findViewById(R.id.perimetroteb);
        perimetroteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetrotebstart();
            }
        });

        Button areateb = findViewById(R.id.areateb);
        areateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areatebstart();
            }
        });

        Button apotemateb = findViewById(R.id.apotemateb);
        apotemateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apotematebstart();
            }
        });

        Button latoteb = findViewById(R.id.latoteb);
        latoteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latotebstart();
            }
        });

        Button altezzateb = findViewById(R.id.altezzateb);
        altezzateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzatebstart();
            }
        });

        Button raggiocircircteb = findViewById(R.id.raggiocircircteb);
        raggiocircircteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggiocircirctebstart();
            }
        });
    }
    public void perimetrotebstart(){
        Intent intent = new Intent(this, PerimetroTEActivity.class);
        startActivity(intent);
    }
    public void areatebstart(){
        Intent intent = new Intent(this, AreaTriangoloEqActivity.class);
        startActivity(intent);
    }
    public void apotematebstart(){
        Intent intent = new Intent(this, ApotemaTEActivity.class);
        startActivity(intent);
    }
    public void latotebstart(){
        Intent intent = new Intent(this, LatoTeActivity.class);
        startActivity(intent);
    }
    public void altezzatebstart(){
        Intent intent = new Intent(this, AltezzaTEActivity.class);
        startActivity(intent);
    }
    public void raggiocircirctebstart(){
        Intent intent = new Intent(this, RaggioCirCircTEActivity.class);
        startActivity(intent);
    }
}
