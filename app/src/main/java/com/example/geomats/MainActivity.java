package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button quadratob = findViewById(R.id.quadratob);
        quadratob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openqactivity();
            }
        });

        Button cerchiob = findViewById(R.id.cerchiob);
        cerchiob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openceactivity();
            }
        });

        Button rettangolob = findViewById(R.id.rettangolob);
        rettangolob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rettangolobstart();
            }
        });
    }
    public void openqactivity(){
        Intent intent = new Intent(this, QuadratoActivity.class);
        startActivity(intent);
    }
    public void openceactivity(){
        Intent intent = new Intent(this, CerchioActivity.class);
        startActivity(intent);
    }
    public void rettangolobstart(){
        Intent intent = new Intent(this, RettangoloActivity.class);
        startActivity(intent);
    }
}
