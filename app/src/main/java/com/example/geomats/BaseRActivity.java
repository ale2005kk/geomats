package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BaseRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_r2);

        Button perimetroaltezzabrb = findViewById(R.id.perimetroaltezzabrb);
        perimetroaltezzabrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { perimetroaltezzabrbstart();
            }
        });

        Button areaaltezzabrb = findViewById(R.id.areaaltezzabrb);
        areaaltezzabrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areaaltezzabrbstart();
            }
        });

        Button diagonalealtezzabrb = findViewById(R.id.diagonalealtezzabrb);
        diagonalealtezzabrb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { diagonalealtezzabrbstart();
            }
        });
    }
    public void perimetroaltezzabrbstart(){
        Intent intent = new Intent(this, BasePerAltR.class);
        startActivity(intent);
    }
    public void areaaltezzabrbstart(){
        Intent intent = new Intent(this, BaseArAltezR.class);
        startActivity(intent);
    }
    public void diagonalealtezzabrbstart(){
        Intent intent = new Intent(this, BaseDiagAltR.class);
        startActivity(intent);
    }
}
