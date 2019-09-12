package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MedianaBActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediana_bt);

        final EditText abmedianabtt = findViewById(R.id.abmedianabtt);
        final EditText bcmedianabtt = findViewById(R.id.bcmedianabtt);
        final EditText camedianabtt = findViewById(R.id.camedianabtt);
        Button inviabuttonmedianabtb = findViewById(R.id.inviabuttonmedianabtb);
        final TextView numtextmedianabtt = findViewById(R.id.numtextmedianabtt);

        inviabuttonmedianabtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abmedianabtt.getText().toString();
                String stringa1 = bcmedianabtt.getText().toString();
                String stringa2 = camedianabtt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextmedianabtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextmedianabtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextmedianabtt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                if (ab != null && bc != null && ca != null){
                    Double risultato = null;
                    risultato = (1 / 2) * Math.sqrt(2 * ((bc * bc) + (ab * ab)) - (ca * ca));
                    String risult = Double.toString(risultato);
                    numtextmedianabtt.setText(risult);
                }
            }
        });
    }
}
