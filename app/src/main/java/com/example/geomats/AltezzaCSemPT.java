package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaCSemPT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_csem_pt);

        final EditText absempaltezzactt = findViewById(R.id.absempaltezzactt);
        final EditText bcsempaltezzactt = findViewById(R.id.bcsempaltezzactt);
        final EditText casempaltezzactt = findViewById(R.id.casempaltezzactt);
        final EditText semperaltezzactt = findViewById(R.id.semperaltezzactt);
        Button inviabuttonaltezzactb = findViewById(R.id.inviabuttonaltezzactb);
        final TextView numtextaltezzactt = findViewById(R.id.numtextaltezzactt);

        inviabuttonaltezzactb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = absempaltezzactt.getText().toString();
                String stringa1 = bcsempaltezzactt.getText().toString();
                String stringa2 = casempaltezzactt.getText().toString();
                String stringa3 = semperaltezzactt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                Double semip = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaltezzactt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextaltezzactt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextaltezzactt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                try {
                    semip = Double.parseDouble(stringa3);
                }
                catch (Exception e){
                    numtextaltezzactt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    semip = null;
                }
                if (ab != null && bc != null && ca != null && semip != null){
                    Double risultato = null;
                    risultato = (2 / ab) * Math.sqrt(semip * (semip - ab) * (semip - bc) * (semip - ca));
                    String risult = Double.toString(risultato);
                    numtextaltezzactt.setText(risult);
                }
            }
        });
    }
}
