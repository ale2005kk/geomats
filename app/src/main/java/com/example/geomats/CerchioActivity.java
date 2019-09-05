package com.example.geomats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class CerchioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerchio);

        Button perimetrocb = findViewById(R.id.perimetrocb);
        perimetrocb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perimetrocbstart();
            }
        });

        Button areacb = findViewById(R.id.areacb);
        areacb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areacbstart();
            }
        });

        Button raggiocb = findViewById(R.id.raggiocb);
        raggiocb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggiocbstart();
            }
        });

        Button diametrocb = findViewById(R.id.diametrocb);
        diametrocb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diametrocbstart();
            }
        });
    }
    public void perimetrocbstart(){
        Intent intent = new Intent(this, PerimetroCActivity.class);
        startActivity(intent);
    }
    public void areacbstart(){
        Intent intent = new Intent(this, AreaCActivity.class);
        startActivity(intent);
    }
    public void raggiocbstart(){
        Intent intent = new Intent(this, RaggioCActivity.class);
        startActivity(intent);
    }
    public void diametrocbstart(){
        Intent intent = new Intent(this, DiametroCActivity.class);
        startActivity(intent);
    }
}
