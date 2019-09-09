package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaLatiPerimetroT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_lati_perimetro_t);

        final EditText abpatt = findViewById(R.id.abpatt);
        final EditText bcpatt = findViewById(R.id.bcpatt);
        final EditText capatt = findViewById(R.id.capatt);
        final EditText semperatb = findViewById(R.id.semperatb);
        Button inviabuttonlpatb = findViewById(R.id.inviabuttonlpatb);
        final TextView numtextlpatb = findViewById(R.id.numtextlpatb);

        inviabuttonlpatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abpatt.getText().toString();
                String stringa1 = bcpatt.getText().toString();
                String stringa2 = capatt.getText().toString();
                String stringa3 = semperatb.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                Double semper = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextlpatb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextlpatb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextlpatb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                try {
                    semper = Double.parseDouble(stringa3);
                }
                catch (Exception e){
                    numtextlpatb.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    semper = null;
                }
                if (ab != null && bc != null && ca != null && semper != null){
                    Double risultato = null;
                    risultato = Math.sqrt(semper * (semper - ab) * (semper - bc) * (semper - ca));
                    String risult = Double.toString(risultato);
                    numtextlpatb.setText(risult);
                }
            }
        });
    }
}
