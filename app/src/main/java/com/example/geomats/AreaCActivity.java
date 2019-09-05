package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AreaCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_c);

        Button raggioacb = findViewById(R.id.raggioacb);
        raggioacb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggioacbstart();
            }
        });

        Button diametroacb = findViewById(R.id.diametroacb);
        diametroacb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diametroacbstart();
            }
        });

    }
    public void raggioacbstart(){
        Intent intent = new Intent(this, AreaRaggioC.class);
        startActivity(intent);
    }
    public void diametroacbstart(){
        Intent intent = new Intent(this, AreaDiametroC.class);
        startActivity(intent);
    }
}
