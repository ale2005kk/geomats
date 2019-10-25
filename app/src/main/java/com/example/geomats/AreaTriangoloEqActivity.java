package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AreaTriangoloEqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_triangolo_eq);

        Button altezzalatoate = findViewById(R.id.altezzalatoate);
        altezzalatoate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzalatoatestart();
            }
        });

        Button latoate = findViewById(R.id.latoate);
        latoate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latoatestart();
            }
        });

        Button altezzaate = findViewById(R.id.altezzaate);
        altezzaate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzaatestart();
            }
        });

        Button apotemaate = findViewById(R.id.apotemaate);
        apotemaate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apotemaatestart();
            }
        });

        Button raggiocircircate = findViewById(R.id.raggiocircircate);
        raggiocircircate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggiocircircatestart();
            }
        });
    }
    public void altezzalatoatestart(){
        Intent intent = new Intent(this, AltezzaLatoAreaTE.class);
        startActivity(intent);
    }
    public void latoatestart(){
        Intent intent = new Intent(this, AreaLatoTE.class);
        startActivity(intent);
    }
    public void altezzaatestart(){
        Intent intent = new Intent(this, AreaAltezzaTE.class);
        startActivity(intent);
    }
    public void apotemaatestart(){
        Intent intent = new Intent(this, AreaApotemaTe.class);
        startActivity(intent);
    }
    public void raggiocircircatestart(){
        Intent intent = new Intent(this, AreaRagCicCircTE.class);
        startActivity(intent);
    }
}
