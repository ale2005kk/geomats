package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AngoloEsternoActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angolo_esterno_t);

        Button angoloesternoatb = findViewById(R.id.angoloesternoatb);
        angoloesternoatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angoloesternoatbstart();
            }
        });

        Button angoloesternobtb = findViewById(R.id.angoloesternobtb);
        angoloesternobtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angoloesternobtbstart();
            }
        });

        Button angoloesternoctb = findViewById(R.id.angoloesternoctb);
        angoloesternoctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angoloesternoctbstart();
            }
        });
    }
    public void angoloesternoatbstart(){
        Intent intent = new Intent(this, AngoloEsternoAT.class);
        startActivity(intent);
    }
    public void angoloesternobtbstart(){
        Intent intent = new Intent(this, AngoloEsternoBT.class);
        startActivity(intent);
    }
    public void angoloesternoctbstart(){
        Intent intent = new Intent(this, AngoloEsternoCT.class);
        startActivity(intent);
    }
}
