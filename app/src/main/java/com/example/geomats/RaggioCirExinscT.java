package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RaggioCirExinscT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raggio_cir_exinsc_t);

        final EditText abragcirexinsctt = findViewById(R.id.abragcirexinsctt);
        final EditText bcragcirexinsctt = findViewById(R.id.bcragcirexinsctt);
        final EditText caragcirexinsctt = findViewById(R.id.caragcirexinsctt);
        final EditText semperragcirexinsctt = findViewById(R.id.semperragcirexinsctt);
        Button inviabuttonragcirexinsctb = findViewById(R.id.inviabuttonragcirexinsctb);
        final TextView numtextragcirexinsctt = findViewById(R.id.numtextragcirexinsctt);

        inviabuttonragcirexinsctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abragcirexinsctt.getText().toString();
                String stringa1 = bcragcirexinsctt.getText().toString();
                String stringa2 = caragcirexinsctt.getText().toString();
                String stringa3 = semperragcirexinsctt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                Double semip = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextragcirexinsctt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextragcirexinsctt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextragcirexinsctt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                try {
                    semip = Double.parseDouble(stringa3);
                }
                catch (Exception e){
                    numtextragcirexinsctt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    semip = null;
                }
                if (ab != null && bc != null && ca != null && semip != null){
                    Double risultato = null;
                    risultato = Math.sqrt((semip * (semip - ab) * (semip - ca)) / (semip - bc));
                    String risult = Double.toString(risultato);
                    numtextragcirexinsctt.setText(risult);
                }
            }
        });
    }
}
