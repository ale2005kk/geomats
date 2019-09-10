package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaBSemPT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_bsem_pt);

        final EditText absempaltezzabtt = findViewById(R.id.absempaltezzabtt);
        final EditText bcsempaltezzabtt = findViewById(R.id.bcsempaltezzabtt);
        final EditText casempaltezzabtt = findViewById(R.id.casempaltezzabtt);
        final EditText semperaltezzabtt = findViewById(R.id.semperaltezzabtt);
        Button inviabuttonaltezzabtb = findViewById(R.id.inviabuttonaltezzabtb);
        final TextView numtextaltezzabtt = findViewById(R.id.numtextaltezzabtt);

        inviabuttonaltezzabtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = absempaltezzabtt.getText().toString();
                String stringa1 = bcsempaltezzabtt.getText().toString();
                String stringa2 = casempaltezzabtt.getText().toString();
                String stringa3 = semperaltezzabtt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                Double semip = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextaltezzabtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextaltezzabtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextaltezzabtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                try {
                    semip = Double.parseDouble(stringa3);
                }
                catch (Exception e){
                    numtextaltezzabtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    semip = null;
                }
                if (ab != null && bc != null && ca != null && semip != null){
                    Double risultato = null;
                    risultato = (2 / ca) * Math.sqrt(semip * (semip - ab) * (semip - bc) * (semip * ca));
                    String risult = Double.toString(risultato);
                    numtextaltezzabtt.setText(risult);
                }
            }
        });
    }
}
