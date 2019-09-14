package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerimetroTEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_te);

        Button latoperteb = findViewById(R.id.latoperteb);
        latoperteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latopertebstart();
            }
        });

        Button altezzaperteb = findViewById(R.id.altezzaperteb);
        altezzaperteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzapertebstart();
            }
        });

        Button apotemaperteb = findViewById(R.id.apotemaperteb);
        apotemaperteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apotemapertebstart();
            }
        });

        Button raggiocircircperteb = findViewById(R.id.raggiocircircperteb);
        raggiocircircperteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { raggiocircircpertebstart();
            }
        });
    }
    public void latopertebstart(){
        Intent intent = new Intent(this, PerimetroLatoTE.class);
        startActivity(intent);
    }
    public void altezzapertebstart(){
        Intent intent = new Intent(this, PerimetroAltezzaTE.class);
        startActivity(intent);
    }
    public void apotemapertebstart(){
        Intent intent = new Intent(this, PerimetroApotemaTE.class);
        startActivity(intent);
    }
    public void raggiocircircpertebstart(){
        Intent intent = new Intent(this, PerimetroRaggioTE.class);
        startActivity(intent);
    }
}
