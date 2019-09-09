package com.example.geomats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AltezzaAActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altezza_at);

        final EditText areaaltezzaatt = findViewById(R.id.areaaltezzaatt);
        final EditText bcaltezzaatt = findViewById(R.id.bcaltezzaatt);
        Button inviabuttonbcareaaltezzaatriangolob = findViewById(R.id.inviabuttonbcareaaltezzaatriangolob);
        final TextView numtextbcareaaltezzaatriangolot = findViewById(R.id.numtextbcareaaltezzaatriangolot);

        inviabuttonbcareaaltezzaatriangolob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringa = areaaltezzaatt.getText().toString();
                String stringa1 = bcaltezzaatt.getText().toString();
                Double area = null;
                Double bc = null;
                try {
                    area = Double.parseDouble(stringa);
                }
                catch (Exception e){
                    numtextbcareaaltezzaatriangolot.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    area = null;
                }
                try {
                    bc = Double.parseDouble(stringa1);
                }
                catch (Exception e){
                    numtextbcareaaltezzaatriangolot.setText("Puoi inserire solo numeri, niente lettere o simboli, grazie");
                    bc = null;
                }
                if (area != null && bc != null){
                    Double risultato = null;
                    risultato = (2 * area) / bc;
                    String risult = Double.toString(risultato);
                    numtextbcareaaltezzaatriangolot.setText(risult);
                }
            }
        });
    }
}
