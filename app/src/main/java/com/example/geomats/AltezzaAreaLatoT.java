package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AltezzaAreaLatoT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_area_lato_t);

        Button altezzaaab = findViewById(R.id.altezzaaab);
        altezzaaab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzaaabstart();
            }
        });

        Button altezzabab = findViewById(R.id.altezzabab);
        altezzabab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzababstart();
            }
        });

        Button altezzacab = findViewById(R.id.altezzacab);
        altezzacab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzacabstart();
            }
        });
    }
    public void altezzaaabstart(){
        Intent intent = new Intent(this, AltezzaAActivityT.class);
        startActivity(intent);
    }
    public void altezzababstart(){
        Intent intent = new Intent(this, AltezzaBActivityT.class);
        startActivity(intent);
    }
    public void altezzacabstart(){
        Intent intent = new Intent(this, AltezzaCActivityT.class);
        startActivity(intent);
    }
}
