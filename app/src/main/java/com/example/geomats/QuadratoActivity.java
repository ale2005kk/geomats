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
    }
    public void perimetroqstart(){
        Intent intent = new Intent(this, PerimetroQActivity.class);
        startActivity(intent);
    }
}
