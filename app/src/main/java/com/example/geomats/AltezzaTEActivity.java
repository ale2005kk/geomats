package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AltezzaTEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_te);

        Button latoaltezzateb = findViewById(R.id.latoaltezzateb);
        latoaltezzateb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latoaltezzatebtart();
            }
        });

        Button perimetroaltezzab = findViewById(R.id.perimetroaltezzab);
        perimetroaltezzab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetroaltezzabstart();
            }
        });

        Button apotemaaltezzab = findViewById(R.id.apotemaaltezzab);
        apotemaaltezzab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apotemaaltezzabstart();
            }
        });

        Button raggioaltezzab = findViewById(R.id.raggioaltezzab);
        raggioaltezzab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggioaltezzabstart();
            }
        });
    }
    public void latoaltezzatebtart(){
        Intent intent = new Intent(this, AltezzaLatoTE.class);
        startActivity(intent);
    }
    public void perimetroaltezzabstart(){
        Intent intent = new Intent(this, AltezzaPerimetroTE.class);
        startActivity(intent);
    }
    public void apotemaaltezzabstart(){
        Intent intent = new Intent(this, AltezzaApotemaTE.class);
        startActivity(intent);
    }
    public void raggioaltezzabstart(){
        Intent intent = new Intent(this, AltezzaRaggioCirCircTE.class);
        startActivity(intent);
    }
}

