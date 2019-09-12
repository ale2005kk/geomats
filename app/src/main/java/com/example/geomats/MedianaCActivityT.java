package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MedianaCActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediana_ct);

        final EditText abmedianactt = findViewById(R.id.abmedianactt);
        final EditText bcmedianactt = findViewById(R.id.bcmedianactt);
        final EditText camedianactt = findViewById(R.id.camedianactt);
        Button inviabuttonmedianactb = findViewById(R.id.inviabuttonmedianactb);
        final TextView numtextmedianactt = findViewById(R.id.numtextmedianactt);

        inviabuttonmedianactb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = abmedianactt.getText().toString();
                String stringa1 = bcmedianactt.getText().toString();
                String stringa2 = camedianactt.getText().toString();
                Double ab = null;
                Double bc = null;
                Double ca = null;
                try {
                    ab = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextmedianactt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ab = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextmedianactt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                try {
                    ca = Double.parseDouble(stringa2);
                }
                catch (Exception e){
                    numtextmedianactt.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    ca = null;
                }
                if (ab != null && bc != null && ca != null){
                    Double risultato = null;
                    risultato = (1 / 2) * Math.sqrt(2 * ((ca * ca) + (bc * bc)) - (ab * ab));
                    String risult = Double.toString(risultato);
                    numtextmedianactt.setText(risult);
                }
            }
        });
    }
}
