package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerimetroCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perimetro_c);

        Button raggiopcb = findViewById(R.id.raggiopcb);
        raggiopcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggiopcbstart();
            }
        });

        Button diametropcb = findViewById(R.id.diametropcb);
        diametropcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diametropcbstart();
            }
        });

    }
    public void raggiopcbstart(){
        Intent intent = new Intent(this, PerimetroRaggioC.class);
        startActivity(intent);
    }
    public void diametropcbstart(){
        Intent intent = new Intent(this, PerimetroDiametroC.class);
        startActivity(intent);
    }
}
