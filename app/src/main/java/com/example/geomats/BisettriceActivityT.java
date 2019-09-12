package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BisettriceActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisettrice_t);

        Button bisettriceatb = findViewById(R.id.bisettriceatb);
        bisettriceatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bisettriceatbstart();
            }
        });

        Button bisettricebtb = findViewById(R.id.bisettricebtb);
        bisettricebtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bisettricebtbstart();
            }
        });

        Button bisettricectb = findViewById(R.id.bisettricectb);
        bisettricectb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bisettricectbstart();
            }
        });
    }
    public void bisettriceatbstart(){
        Intent intent = new Intent(this, BisettriceAActivityT.class);
        startActivity(intent);
    }
    public void bisettricebtbstart(){
        Intent intent = new Intent(this, BisettriceBActivityT.class);
        startActivity(intent);
    }
    public void bisettricectbstart(){
        Intent intent = new Intent(this, BisettriceCActivityT.class);
        startActivity(intent);
    }
}
