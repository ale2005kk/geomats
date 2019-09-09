package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AreaTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_t);

        Button bcaltezzaaatb = findViewById(R.id.bcaltezzaaatb);
        bcaltezzaaatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bcaltezzaaatbstart();
            }
        });

        Button acaltezzabatb = findViewById(R.id.acaltezzabatb);
        acaltezzabatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acaltezzabatbstart();
            }
        });

        Button abaltezzacatb = findViewById(R.id.abaltezzacatb);
        abaltezzacatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abaltezzacatbstart();
            }
        });

        Button latiperimetroatb = findViewById(R.id.latiperimetroatb);
        latiperimetroatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latiperimetroatbstart();
            }
        });
    }
    public void bcaltezzaaatbstart(){
        Intent intent = new Intent(this, AreaBCAltezzaT.class);
        startActivity(intent);
    }
    public void acaltezzabatbstart(){
        Intent intent = new Intent(this, AreaACAltezzaBT.class);
        startActivity(intent);
    }
    public void abaltezzacatbstart(){
        Intent intent = new Intent(this, AreaABAltezzaCT.class);
        startActivity(intent);
    }
    public void latiperimetroatbstart(){
        Intent intent = new Intent(this, AreaLatiPerimetroT.class);
        startActivity(intent);
    }
}
