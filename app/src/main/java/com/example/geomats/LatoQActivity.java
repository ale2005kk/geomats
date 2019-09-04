package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LatoQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lato_q);

        final Button perimetroqlb = findViewById(R.id.perimetroqlb);
        perimetroqlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetroqlbstart();
            }
        });

        Button areaqlb = findViewById(R.id.areaqlb);
        areaqlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areaqlbstart();
            }
        });

        Button diagonaleqlb = findViewById(R.id.diagonaleqlb);
        diagonaleqlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diagonaleqlbstart();
            }
        });


    }
    public void perimetroqlbstart(){
        Intent intent = new Intent(this, LatoPerimetroQ.class);
        startActivity(intent);
    }
    public void areaqlbstart(){
        Intent intent = new Intent(this, LatoAreaQ.class);
        startActivity(intent);
    }
    public void diagonaleqlbstart(){
        Intent intent = new Intent(this, LatoDiagonaleQ.class);
        startActivity(intent);
    }
}
