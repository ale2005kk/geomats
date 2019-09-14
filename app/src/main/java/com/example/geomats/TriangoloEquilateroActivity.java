package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TriangoloEquilateroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangolo_equilatero);

        Button perimetroteb = findViewById(R.id.perimetroteb);
        perimetroteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetrotebstart();
            }
        });
    }
    public void perimetrotebstart(){
        Intent intent = new Intent(this, PerimetroTEActivity.class);
        startActivity(intent);
    }
}
