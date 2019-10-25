package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LatoTeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lato_te);

        Button perimetrolteb = findViewById(R.id.perimetrolteb);
        perimetrolteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetroltebstart();
            }
        });

        Button altezzalteb = findViewById(R.id.altezzalteb);
        altezzalteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzaltebstart();
            }
        });

        Button apotemalteb = findViewById(R.id.apotemalteb);
        apotemalteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                apotemaltebtart();
            }
        });

        Button raggiolteb = findViewById(R.id.raggiolteb);
        raggiolteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggioltebstart();
            }
        });
    }
    public void perimetroltebstart(){
        Intent intent = new Intent(this, LatoPerimetroTE.class);
        startActivity(intent);
    }
    public void altezzaltebstart(){
        Intent intent = new Intent(this, LatoAltezzaTE.class);
        startActivity(intent);
    }
    public void apotemaltebtart(){
        Intent intent = new Intent(this, LatoApotemaTE.class);
        startActivity(intent);
    }
    public void raggioltebstart(){
        Intent intent = new Intent(this, LatoRaggioCirCircTE.class);
        startActivity(intent);
    }
}
