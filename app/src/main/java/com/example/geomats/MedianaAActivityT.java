package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MedianaAActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediana_at);

        final EditText abmedianaatt = findViewById(R.id.abmedianaatt);
        final EditText bcmedianaatt = findViewById(R.id.bcmedianaatt);
        final EditText camedianaatt = findViewById(R.id.camedianaatt);
        Button inviabuttonmedianaatb = findViewById(R.id.inviabuttonmedianaatb);
        final TextView numtextmedianaatt = findViewById(R.id.numtextmedianaatt);

        inviabuttonmedianaatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abmedianaatt.getText().toString();
                String stringa1 = bcmedianaatt.getText().toString();
                String stringa2 = camedianaatt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextmedianaatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextmedianaatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextmedianaatt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                if (ab != null && bc != null && ca != null){
                    Double risultato = null;
                    risultato = (1 / 2) * Math.sqrt(2 * ((ca * ca) + (ab * ab)) - (bc * bc));
                    String risult = Double.toString(risultato);
                    numtextmedianaatt.setText(risult);
                }
            }
        });
    }
}
