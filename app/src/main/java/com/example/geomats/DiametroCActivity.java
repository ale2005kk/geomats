package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiametroCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diametro_c);

        Button raggiodcb = findViewById(R.id.raggiodcb);
        raggiodcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggiodcbstart();
            }
        });

        Button perimetrodcb = findViewById(R.id.perimetrodcb);
        perimetrodcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetrodcbstart();
            }
        });

        Button areadcb = findViewById(R.id.areadcb);
        areadcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areadcbstart();
            }
        });
    }
    public void raggiodcbstart(){
        Intent intent = new Intent(this, DiametroRaggioC.class);
        startActivity(intent);
    }
    public void perimetrodcbstart(){
        Intent intent = new Intent(this, DiametroPerimetroC.class);
        startActivity(intent);
    }
    public void areadcbstart(){
        Intent intent = new Intent(this, DiametroAreaC.class);
        startActivity(intent);
    }
}
