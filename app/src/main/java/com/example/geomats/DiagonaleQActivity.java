package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiagonaleQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagonale_q);

        Button latodqb = findViewById(R.id.latodqb);
        latodqb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latodqbstart();
            }
        });

        Button areadqb = findViewById(R.id.areadqb);
        areadqb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areadqbstart();
            }
        });
    }
    public void latodqbstart(){
        Intent intent = new Intent(this, DiagonaleLatoQ.class);
        startActivity(intent);
    }
    public void areadqbstart(){
        Intent intent = new Intent(this, DiagonaleAreaQ.class);
        startActivity(intent);
    }
}
