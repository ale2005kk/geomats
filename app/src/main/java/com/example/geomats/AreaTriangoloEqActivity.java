package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AreaTriangoloEqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_triangolo_eq);

        Button altezzalatoate = findViewById(R.id.altezzalatoate);
        altezzalatoate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzalatoatestart();
            }
        });
    }
    public void altezzalatoatestart(){
        Intent intent = new Intent(this, AltezzaLatoAreaTE.class);
        startActivity(intent);
    }
}
