package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RettangoloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rettangolo);

        Button perimetrorb = findViewById(R.id.perimetrorb);
        perimetrorb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetrorbstart();
            }
        });

        Button arearb = findViewById(R.id.arearb);
        arearb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arearbsstart();
            }
        });

        Button baserb = findViewById(R.id.baserb);
        baserb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baserbstart();
            }
        });

        Button altezzarb = findViewById(R.id.altezzarb);
        altezzarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzarbstart();
            }
        });

        Button diagonalerb = findViewById(R.id.diagonalerb);
        diagonalerb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diagonalerbstart();
            }
        });
    }
    public void perimetrorbstart(){
        Intent intent = new Intent(this, PerimetroRActivity.class);
        startActivity(intent);
    }
    public void arearbsstart(){
        Intent intent = new Intent(this, AreaRActivity.class);
        startActivity(intent);
    }
    public void baserbstart(){
        Intent intent = new Intent(this, BaseRActivity.class);
        startActivity(intent);
    }
    public void altezzarbstart(){
        Intent intent = new Intent(this, AltezzaRActivity.class);
        startActivity(intent);
    }
    public void diagonalerbstart(){
        Intent intent = new Intent(this, DiagonaleRActivity.class);
        startActivity(intent);
    }
}
