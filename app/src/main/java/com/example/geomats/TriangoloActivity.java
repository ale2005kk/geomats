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

        Button altezzatb = findViewById(R.id.altezzatb);
        altezzatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                altezzatbstart();
            }
        });

        Button raggiocirinsctb = findViewById(R.id.raggiocirinsctb);
        raggiocirinsctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggiocirinsctbstart();
            }
        });

        Button raggiocircirctb = findViewById(R.id.raggiocircirctb);
        raggiocircirctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                raggiocircirctbstart();
            }
        });

        Button raggiocirexinscrtb = findViewById(R.id.raggiocirexinscrtb);
        raggiocirexinscrtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { raggiocirexinscrtbstart();
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
    public void altezzatbstart(){
        Intent intent = new Intent(this, AltezzaTActivity.class);
        startActivity(intent);
    }
    public void raggiocirinsctbstart(){
        Intent intent = new Intent(this, RaggioCirInscActivityT.class);
        startActivity(intent);
    }
    public void raggiocircirctbstart(){
        Intent intent = new Intent(this, RaggioCirCircosT.class);
        startActivity(intent);
    }
    public void raggiocirexinscrtbstart(){
        Intent intent = new Intent(this, RaggioCirExinscT.class);
        startActivity(intent);
    }
}
