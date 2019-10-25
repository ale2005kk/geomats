package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ApotemaTEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apotema_te);

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
    }
    public void latotebstart(){
        Intent intent = new Intent(this, ApotemaLatoTE.class);
        startActivity(intent);
    }
    public void altezzatebstart(){
        Intent intent = new Intent(this, ApotemaAltezzaTE.class);
        startActivity(intent);
    }
}
