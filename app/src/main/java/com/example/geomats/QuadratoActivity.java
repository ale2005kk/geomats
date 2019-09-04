package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuadratoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrato);

        Button perimetroqb = findViewById(R.id.perimetroqb);
        perimetroqb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetroqstart();
            }
        });

        Button latoqb = findViewById(R.id.latoqb);
        latoqb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latoqbstart();
            }
        });

        Button areaqb = findViewById(R.id.areaqb);
        areaqb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areaqbstart();
            }
        });

        Button diagonaleqb = findViewById(R.id.diagonaleqb);
        diagonaleqb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diagonaleqbstart();
            }
        });
    }
    public void perimetroqstart(){
        Intent intent = new Intent(this, PerimetroQActivity.class);
        startActivity(intent);
    }
    public void latoqbstart(){
        Intent intent = new Intent(this, LatoQActivity.class);
        startActivity(intent);
    }
    public void areaqbstart(){
        Intent intent = new Intent(this, AreaQActivity.class);
        startActivity(intent);
    }
    public void diagonaleqbstart(){
        Intent intent = new Intent(this, DiagonaleQActivity.class);
        startActivity(intent);
    }
}
