package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaASemPT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_asem_pt);

        final EditText absempaltezzaatt = findViewById(R.id.absempaltezzaatt);
        final EditText bcsempaltezzaatt = findViewById(R.id.bcsempaltezzaatt);
        final EditText casempaltezzaatt = findViewById(R.id.casempaltezzaatt);
        final EditText semperaltezzaatt = findViewById(R.id.semperaltezzaatt);
        Button inviabuttonaltezzaatb = findViewById(R.id.inviabuttonaltezzaatb);
        final TextView numtextaltezzaatt = findViewById(R.id.numtextaltezzaatt);

        inviabuttonaltezzaatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = absempaltezzaatt.getText().toString();
                String stringa1 = bcsempaltezzaatt.getText().toString();
                String stringa2 = casempaltezzaatt.getText().toString();
                String stringa3 = semperaltezzaatt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                Double semiperimetro = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaltezzaatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextaltezzaatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextaltezzaatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                try {
                    semiperimetro = Double.parseDouble(stringa3);
                }
                catch (Exception e){
                    numtextaltezzaatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    semiperimetro = null;
                }
                if (ab != null && bc != null && ca != null && semiperimetro != null){
                    Double risultato = null;
                    risultato = (2/bc) * Math.sqrt(semiperimetro * (semiperimetro - ab) * (semiperimetro - bc) * (semiperimetro - ca));
                    String risult = Double.toString(risultato);
                    numtextaltezzaatt.setText(risult);
                }
            }
        });
    }
}
