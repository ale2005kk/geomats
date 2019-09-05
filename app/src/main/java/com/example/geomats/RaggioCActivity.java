package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RaggioCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_c);

        Button diametrorcb = findViewById(R.id.diametrorcb);
        diametrorcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diametrorcbstart();
            }
        });

        Button perimetrorcb = findViewById(R.id.perimetrorcb);
        perimetrorcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetrorcbstart();
            }
        });

        Button arearcb = findViewById(R.id.arearcb);
        arearcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arearcbstart();
            }
        });
    }
    public void diametrorcbstart(){
        Intent intent = new Intent(this, RaggioDiametroC.class);
        startActivity(intent);
    }
    public void perimetrorcbstart(){
        Intent intent = new Intent(this, RaggioPerimetroC.class);
        startActivity(intent);
    }
    public void arearcbstart(){
        Intent intent = new Intent(this, RaggioAreaC.class);
        startActivity(intent);
    }
}
