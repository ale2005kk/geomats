package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TriangoloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangolo);

        Button perimetrotb = findViewById(R.id.perimetrotb);
        perimetrotb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetrotbstart();
            }
        });

        Button areatb = findViewById(R.id.areatb);
        areatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areatbstart();
            }
        });
    }
    public void perimetrotbstart(){
        Intent intent = new Intent(this, PerimetroTActivity.class);
        startActivity(intent);
    }
    public void areatbstart(){
        Intent intent = new Intent(this, AreaTActivity.class);
        startActivity(intent);
    }
}
