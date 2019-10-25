package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LatoRaggioCirCircTE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lato_raggio_cir_circ_te);

        final EditText raggioltet = findViewById(R.id.raggioltet);
        Button inviabuttonrlteb = findViewById(R.id.inviabuttonrlteb);
        final TextView numtextrltet = findViewById(R.id.numtextrltet);

        inviabuttonrlteb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = raggioltet.getText().toString();
                Double raggio = null;
                try {
                    raggio = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextrltet.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    raggio = null;
                }
                if (raggio != null){
                    Double risultato = null;
                    risultato = raggio * (Math.sqrt(3));
                    String risult = Double.toString(risultato);
                    numtextrltet.setText(risult);
                }
            }
        });
    }
}
