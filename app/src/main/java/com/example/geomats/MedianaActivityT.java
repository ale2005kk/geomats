package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MedianaActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediana_t);

        Button medianaatb = findViewById(R.id.medianaatb);
        medianaatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medianaatbstart();
            }
        });

        Button medianabtb = findViewById(R.id.medianabtb);
        medianabtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medianabtbstart();
            }
        });

        Button medianactb = findViewById(R.id.medianactb);
        medianactb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medianactbstart();
            }
        });
    }
    public void medianaatbstart(){
        Intent intent = new Intent(this, MedianaAActivityT.class);
        startActivity(intent);
    }
    public void medianabtbstart(){
        Intent intent = new Intent(this, MedianaBActivityT.class);
        startActivity(intent);
    }
    public void medianactbstart(){
        Intent intent = new Intent(this, MedianaCActivityT.class);
        startActivity(intent);
    }
}
