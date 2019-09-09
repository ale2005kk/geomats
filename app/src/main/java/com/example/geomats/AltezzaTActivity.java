package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AltezzaTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_t);

        Button arealatoatb = findViewById(R.id.arealatoatb);
        arealatoatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arealatoatbstart();
            }
        });

        Button latisemipatb = findViewById(R.id.latisemipatb);
        latisemipatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latisemipatbstart();
            }
        });
    }
    public void arealatoatbstart(){
        Intent intent = new Intent(this, AltezzaAreaLatoT.class);
        startActivity(intent);
    }
    public void latisemipatbstart(){
        Intent intent = new Intent(this, AltezzaLatiSemipTB.class);
        startActivity(intent);
    }
}
